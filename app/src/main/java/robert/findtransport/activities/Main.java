package robert.findtransport.activities;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.transition.Explode;
import android.transition.Slide;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

import com.kobakei.ratethisapp.RateThisApp;

import java.util.ArrayList;
import java.util.List;

import robert.findtransport.adapters.DatabaseAdapter;
import robert.findtransport.adapters.TransportResultsAdapter;
import robert.findtransport.listeners.DatabaseLoadListener;
import robert.findtransport.models.Transport;
import robert.findtransport.utils.GPSTracker;
import robert.findtransport.utils.MyApplication;
import robert.findtransport.R;

public class Main extends AppCompatActivity implements DatabaseLoadListener {

    private LinearLayout findMyLocation;
    private Spinner fromWhence;
    private Spinner toWhere;
    private GPSTracker gps;
    private double lattitude;
    private double longitude;
    private DatabaseAdapter databaseAdapter;
    private Context thisContext;
    private ProgressDialog progressDialog;
    private String allRoutes;
    private String searchResult;
    private Snackbar snackbar;
    private boolean reseted;

    private RecyclerView mainRecycler;

    private String[] res;

    private SharedPreferences sharedPreferences;

    @Override
    protected void onStart() {
        super.onStart();
        RateThisApp.onStart(thisContext);
        RateThisApp.showRateDialogIfNeeded(thisContext);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        initRate();

        /** Declarations */
        thisContext = Main.this;
        progressDialog = new ProgressDialog(this);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //findMyLocation = (LinearLayout) findViewById(R.id.find_my_location);
        fromWhence = (Spinner) findViewById(R.id.from_whence);
        toWhere = (Spinner) findViewById(R.id.to_where);

        searchResult = new String();
        mainRecycler = (RecyclerView) findViewById(R.id.main_content_recycler);

        sharedPreferences = thisContext.getSharedPreferences("Transport", MODE_PRIVATE);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setEnterTransition(/*TransitionInflater.from(thisContext).inflateTransition(R.transition.enter_transition)*/new Explode());
            getWindow().setExitTransition(/*TransitionInflater.from(thisContext).inflateTransition(R.transition.exit_transition)*/new Slide());
        }

        /** Search Button */
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        FloatingActionButton fabReset = (FloatingActionButton) findViewById(R.id.fab_reset);

        if (fab != null) {
            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    int count = 0;

                    String from = fromWhence.getSelectedItem().toString();
                    String to = toWhere.getSelectedItem().toString();

                    String[] allRoutesSplitted = allRoutes.split("\n");
                    String[] searchSplitted;
                    searchResult = "";
                    if (from.equals(to)) {
                        snackbar = Snackbar.make(view, getString(R.string.change), Snackbar.LENGTH_LONG)
                                .setAction("Լավ", new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        snackbar.dismiss();
                                    }
                                });
                        snackbar.show();
                    } else {
                        mainRecycler.getLayoutManager().removeAllViews();

                        for (int i = 0; i < allRoutesSplitted.length; i++) {
                            if (allRoutesSplitted[i].contains(from.substring(0, from.length() - 2)) && allRoutesSplitted[i].contains(to.substring(0, to.length() - 2))) {
                                searchResult += allRoutesSplitted[i] + "\n";
                            } else {
                                count++;
                            }
                        }

                        searchSplitted = searchResult.split("\n");

                        if (count == allRoutesSplitted.length) {
                            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(thisContext);
                            alertDialogBuilder.setTitle(getString(R.string.no_routes_title));
                            alertDialogBuilder.setMessage(getString(R.string.no_routes_body));
                            alertDialogBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    new GetTransport(Main.this).execute(null, null, null);
                                }
                            });
                            AlertDialog alertDialog = alertDialogBuilder.create();
                            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.resultLightText)));
                            alertDialog.show();
                            reseted = true;
                        } else {
                            performSearch(searchSplitted);
                            reseted = false;
                        }
                    }
                }
            });
        }

        /** Reset Button */
        if (fabReset != null) {
            fabReset.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (!reseted) {
                        performSearch(res);
                        reseted = true;
                    } else {
                        snackbar = Snackbar.make(v, getString(R.string.reseted), Snackbar.LENGTH_LONG)
                                .setAction("Լավ", new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        snackbar.dismiss();
                                    }
                                });
                        snackbar.show();
                    }
                }
            });
        }

//        findMyLocation.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                gps = new GPSTracker(Main.this);
//                if (gps.CanGetLocation()) {
//                    lattitude = gps.getLattitude();
//                    longitude = gps.getLongitude();
//                    Snackbar.make(view, "Your location is " + String.valueOf(lattitude) +
//                            ", " + String.valueOf(longitude), Snackbar.LENGTH_LONG)
//                            .setAction("Action", null).show();
//                } else {
//                    gps.showSettingsAlert();
//                    Snackbar.make(view, "Please turn GPS on", Snackbar.LENGTH_LONG)
//                            .setAction("Action", null).show();
//                }
//            }
//        });

        /** Getting Database*/
        new GetTransport(this).execute(null, null, null);
        new GetStops().execute(null, null, null);
        reseted = true;

        /** Google Analytics */
        ((MyApplication) getApplication()).getTracker();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return false;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
//        if (keyCode == KeyEvent.KEYCODE_BACK && !reseted) {
//            mainContent.removeAllViews();
//            new GetTransport().execute(null, null, null);
//            reseted = true;
//            return true;
//        }

        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void onLoadFinished() {
        performSearch(res);
    }

    private class GetTransport extends AsyncTask<String, Void, String> {

        private DatabaseLoadListener listener;

        public GetTransport(DatabaseLoadListener listener) {
            this.listener = listener;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            progressDialog.setMessage("Ցանկի բեռնում...");
            progressDialog.getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.resultLightText)));
            progressDialog.show();
        }

        @Override
        protected String doInBackground(String... params) {

            databaseAdapter = new DatabaseAdapter(thisContext);
            String transports = databaseAdapter.getTransport();
            return transports;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            allRoutes = s;
            String[] stops = s.split("\n");
            res = stops;
            listener.onLoadFinished();
            databaseAdapter.closeDatabase();
            progressDialog.dismiss();
        }
    }

    /**
     * Get Stops
     */
    private class GetStops extends AsyncTask<String, Void, String> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            //progressDialog = new ProgressDialog(getBaseContext());
            progressDialog.setMessage("Ցանկի բեռնում...");
            progressDialog.getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.resultLightText)));
            progressDialog.show();
        }

        @Override
        protected String doInBackground(String... params) {

            databaseAdapter = new DatabaseAdapter(thisContext);
            //transports = databaseAdapter.getTransport();
            String stops = databaseAdapter.getStops();
            return stops;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
//            Snackbar.make(null, "Please turn GPS on", Snackbar.LENGTH_LONG)
//                    .setAction("Action", null).show();

            //Toast.makeText(thisContext, "Ready to work", Toast.LENGTH_SHORT).show();

            //text.setText(s);

            ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<String>(Main.this, R.layout.spinner_item, s.split("\n"));
            spinnerAdapter.setDropDownViewResource(R.layout.spinner_item_dropdown);
            fromWhence.setAdapter(spinnerAdapter);
            toWhere.setAdapter(spinnerAdapter);

            progressDialog.dismiss();
        }
    }

    /**
     * Get Transport List
     */
    private List<Transport> getTransports(Context context, String[] results, int spanCount) {
        List<Transport> transports = new ArrayList<>();

        int textColor;
        int bgColor;

        if (spanCount == 1) {
            for (int i = 0; i < results.length; i++) {
                Transport transport = new Transport();
                if (i % 2 == 0) {
                    textColor = getResources().getColor(R.color.resultDarkText);
                    bgColor = getResources().getColor(R.color.resultLight);
                } else {
                    textColor = getResources().getColor(R.color.resultLightText);
                    bgColor = getResources().getColor(R.color.resultDark);
                }

                transport.setBackgroundColor(bgColor);
                transport.setTextColor(textColor);
                transport.setTransportIcon(R.mipmap.ic_launcher);
                transport.setTransportType("");
                transport.setRoute(results[i]);
                transport.setTransportNumber("");


                transports.add(transport);
            }
        } else if (spanCount == 2) {
            int c = 0;
            for (int i = 0; i < results.length; i++) {
                Transport transport = new Transport();
                if (i % 2 == 0) {
                    c++;
                }
                if (c == 2 || c == 0) {
                    c = 0;
                    if (i % 2 == 0) {
                        textColor = getResources().getColor(R.color.resultDarkText);
                        bgColor = getResources().getColor(R.color.resultLight);
                    } else {
                        textColor = getResources().getColor(R.color.resultLightText);
                        bgColor = getResources().getColor(R.color.resultDark);
                    }
                } else {
                    if (i % 2 == 0) {
                        textColor = getResources().getColor(R.color.resultLightText);
                        bgColor = getResources().getColor(R.color.resultDark);
                    } else {
                        textColor = getResources().getColor(R.color.resultDarkText);
                        bgColor = getResources().getColor(R.color.resultLight);
                    }
                }

                transport.setBackgroundColor(bgColor);
                transport.setTextColor(textColor);
                transport.setTransportIcon(R.mipmap.ic_launcher);
                transport.setTransportType("");
                transport.setRoute(results[i]);
                transport.setTransportNumber("");


                transports.add(transport);
            }
        }

        return transports;
    }

    private void performSearch(String[] results) {
        GridLayoutManager manager;
        TransportResultsAdapter adapter;
        if ((getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK) == Configuration.SCREENLAYOUT_SIZE_LARGE) {
            manager = new GridLayoutManager(thisContext, 1, GridLayoutManager.VERTICAL, false);
            adapter = new TransportResultsAdapter(thisContext, getTransports(thisContext, results, 1));
        } else if ((getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK) == Configuration.SCREENLAYOUT_SIZE_XLARGE) {
            manager = new GridLayoutManager(thisContext, 1, GridLayoutManager.VERTICAL, false);
            adapter = new TransportResultsAdapter(thisContext, getTransports(thisContext, results, 1));
        }
        else {
            manager = new GridLayoutManager(thisContext, 1, GridLayoutManager.VERTICAL, false);
            adapter = new TransportResultsAdapter(thisContext, getTransports(thisContext, results, 1));
        }
        adapter.notifyDataSetChanged();

        mainRecycler.setAdapter(adapter);
        mainRecycler.setLayoutManager(manager);
    }

    private void initRate() {
        RateThisApp.Config rateConfig = new RateThisApp.Config(3, 5);
        rateConfig.setTitle(R.string.rate_title);
        rateConfig.setMessage(R.string.rate_message);
        rateConfig.setRateButton(R.string.rate_rate);
        rateConfig.setCancelButton(R.string.rate_cancel);
        rateConfig.setThanksButton(R.string.rate_thanks);
        RateThisApp.init(rateConfig);
        RateThisApp.setCallback(new RateThisApp.Callback() {
            @Override
            public void onYesClicked() {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=robert.findtransport")));
            }

            @Override
            public void onNoClicked() {
                RateThisApp.stopRateDialog(thisContext);
            }

            @Override
            public void onCancelClicked() {
            }
        });
    }

}