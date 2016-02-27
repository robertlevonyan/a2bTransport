package robert.findtransport;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Main extends AppCompatActivity {

    private LinearLayout findMyLocation;
    private Spinner fromWhence;
    private Spinner toWhere;
    private TextView text;
    private GPSTracker gps;
    private double lattitude;
    private double longitude;
    private DatabaseAdapter databaseAdapter;
    private ArrayAdapter<String> spinnerAdapter;
    private Context thisContext;
    private String transports, stops;
    private ProgressDialog progressDialog;
    private LinearLayout mainContent;
    private String allRoutes;
    private String searchResult;
    private int[] transportIcons;
    private Snackbar snackbar;
    private FloatingActionButton fab;
    private FloatingActionButton fabReset;
    private boolean reseted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        /** Declarations */

        thisContext = Main.this;
        progressDialog = new ProgressDialog(this);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //findMyLocation = (LinearLayout) findViewById(R.id.find_my_location);
        fromWhence = (Spinner) findViewById(R.id.from_whence);
        toWhere = (Spinner) findViewById(R.id.to_where);

        text = (TextView) findViewById(R.id.text);

        mainContent = (LinearLayout) findViewById(R.id.main_content);
        searchResult = new String();
        transportIcons = new int[]{
                R.drawable.tbus,
                R.drawable.mbus,
                R.drawable.bus,
        };

//        for (int i = 0; i < 15; i++) {
//            View view = getLayoutInflater().inflate(R.layout.result, mainContent, false);
//            if (i % 2 != 0) {
//                view.setBackgroundColor(getResources().getColor(R.color.resultLight));
//
//                TextView transportNumber = (TextView) view.findViewById(R.id.trasport_number);
//                TextView transportType = (TextView) view.findViewById(R.id.transport_type);
//                TextView transportRoutes = (TextView) view.findViewById(R.id.transport_routes);
//
//                transportNumber.setTextColor(getResources().getColor(R.color.resultDarkText));
//                transportType.setTextColor(getResources().getColor(R.color.resultDarkText));
//                transportRoutes.setTextColor(getResources().getColor(R.color.resultDarkText));
//                view.invalidate();
//            } else {
//                view.setBackgroundColor(getResources().getColor(R.color.resultDark));
//                TextView transportNumber = (TextView) view.findViewById(R.id.trasport_number);
//                TextView transportType = (TextView) view.findViewById(R.id.transport_type);
//                TextView transportRoutes = (TextView) view.findViewById(R.id.transport_routes);
//
//                transportNumber.setTextColor(getResources().getColor(R.color.resultLightText));
//                transportType.setTextColor(getResources().getColor(R.color.resultLightText));
//                transportRoutes.setTextColor(getResources().getColor(R.color.resultLightText));
//                view.invalidate();
//            }
//            mainContent.addView(view);
//        }

        /** Search Button */

        fab = (FloatingActionButton) findViewById(R.id.fab);
        fabReset = (FloatingActionButton) findViewById(R.id.fab_reset);

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
                    mainContent.removeAllViews();

                    for (int i = 0; i < allRoutesSplitted.length; i++) {
                        if (allRoutesSplitted[i].contains(from.substring(0, from.length() - 2)) && allRoutesSplitted[i].contains(to.substring(0, to.length() - 2))) {
                            //Toast.makeText(Main.this, "YES", Toast.LENGTH_SHORT).show();
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
                                new GetTransport().execute(null, null, null);
                            }
                        });
                        AlertDialog alertDialog = alertDialogBuilder.create();
                        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.resultLightText)));
                        alertDialog.show();
                        reseted = true;
                    } else {
                        getResultList(searchSplitted);
                        reseted = false;
                    }
                }
            }
        });

        fabReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!reseted) {
                    mainContent.removeAllViews();
                    new GetTransport().execute(null, null, null);
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

        new GetTransport().execute(null, null, null);
        new GetStops().execute(null, null, null);
        reseted = true;

        /** Google Analytics */

        ((MyApplication) getApplication()).getTracker();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return false;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify transports parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * Get Result Method
     */
    private void getResult(final String route, int backgroundColor, int textColor) {
        View view = getLayoutInflater().inflate(R.layout.result, mainContent, false);

        final TextView transportNumber = (TextView) view.findViewById(R.id.trasport_number);
        final TextView transportType = (TextView) view.findViewById(R.id.transport_type);
        TextView transportRoutes = (TextView) view.findViewById(R.id.transport_routes);
        ImageView transportIcon = (ImageView) view.findViewById(R.id.transport_icon);

        view.setBackgroundColor(backgroundColor);
        transportNumber.setTextColor(textColor);
        transportType.setTextColor(textColor);
        transportRoutes.setTextColor(textColor);

        char[] current = route.toCharArray();

        if (Character.isDigit(current[0]) && !Character.isDigit(current[1])) {
            switch (current[2]) {
                case 'T':
                    transportType.setText(R.string.trolleybus);
                    break;
                case 'M':
                    transportType.setText(R.string.microbus);
                    break;
                case 'A':
                    transportType.setText(R.string.bus);
                    break;
                default:
                    transportType.setText(R.string.na);
                    break;
            }
        } else if (Character.isDigit(current[0]) && Character.isDigit(current[1]) && Character.isDigit(current[2])) {
            switch (current[4]) {
                case 'T':
                    transportType.setText(R.string.trolleybus);
                    break;
                case 'M':
                    transportType.setText(R.string.microbus);
                    break;
                case 'A':
                    transportType.setText(R.string.bus);
                    break;
                default:
                    transportType.setText(R.string.na);
                    break;
            }
        } else if (Character.isDigit(current[0]) && Character.isDigit(current[1])) {
            if (current[2] == 'ա') {
                switch (current[4]) {
                    case 'T':
                        transportType.setText(R.string.trolleybus);
                        break;
                    case 'M':
                        transportType.setText(R.string.microbus);
                        break;
                    case 'A':
                        transportType.setText(R.string.bus);
                        break;
                    default:
                        transportType.setText(R.string.na);
                        break;
                }
            } else {
                switch (current[3]) {
                    case 'T':
                        transportType.setText(R.string.trolleybus);
                        break;
                    case 'M':
                        transportType.setText(R.string.microbus);
                        break;
                    case 'A':
                        transportType.setText(R.string.bus);
                        break;
                    default:
                        transportType.setText(R.string.na);
                        break;
                }
            }
        }

        if (Character.isDigit(current[2])) {
            transportNumber.setText(current, 0, 3);
            transportNumber.setTextSize(30f);
        } else if (current[2] == 'ա') {
            transportNumber.setText(current, 0, 3);
            transportNumber.setTextSize(30f);
        } else {
            transportNumber.setText(current, 0, 2);
        }

        String[] firstAndLastStop = route.split("\t");

//        transportRoutes.setText(current, 4, route.length() - 4);
        transportRoutes.setText(String.format("%s - %s", firstAndLastStop[2], firstAndLastStop[firstAndLastStop.length - 1]));


        if (transportType.getText().equals(getResources().getString(R.string.trolleybus))) {
            transportIcon.setBackground(getResources().getDrawable(transportIcons[0]));
        } else if (transportType.getText().equals(getResources().getString(R.string.microbus))) {
            transportIcon.setBackground(getResources().getDrawable(transportIcons[1]));
        } else if (transportType.getText().equals(getResources().getString(R.string.bus))) {
            transportIcon.setBackground(getResources().getDrawable(transportIcons[2]));
        }

        view.invalidate();
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(thisContext, DetailesActivity.class);
                intent.putExtra("Details_number", transportNumber.getText());
                intent.putExtra("Details_type", transportType.getText());
                intent.putExtra("Details_stops", route);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });
        mainContent.addView(view);
    }

    private void getResultList(String[] results) {
        for (int i = 0; i < results.length; i++) {
            if (i % 2 == 0) {
                getResult(results[i], getResources().getColor(R.color.resultLight), getResources().getColor(R.color.resultDarkText));
            } else {
                getResult(results[i], getResources().getColor(R.color.resultDark), getResources().getColor(R.color.resultLightText));
            }
        }
    }

    /**
     * Get All Transort
     */
    private class GetTransport extends AsyncTask<String, Void, String> {

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
            transports = databaseAdapter.getTransport();
            //stops = databaseAdapter.getStops();
            return transports;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            allRoutes = s;
            String[] stops = s.split("\n");
            getResultList(stops);

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
            stops = databaseAdapter.getStops();
            return stops;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
//            Snackbar.make(null, "Please turn GPS on", Snackbar.LENGTH_LONG)
//                    .setAction("Action", null).show();

            //Toast.makeText(thisContext, "Ready to work", Toast.LENGTH_SHORT).show();

            //text.setText(s);

            spinnerAdapter = new ArrayAdapter<String>(Main.this, R.layout.spinner_item, s.split("\n"));
            spinnerAdapter.setDropDownViewResource(R.layout.spinner_item_dropdown);
            fromWhence.setAdapter(spinnerAdapter);
            toWhere.setAdapter(spinnerAdapter);

            progressDialog.dismiss();
        }
    }
}