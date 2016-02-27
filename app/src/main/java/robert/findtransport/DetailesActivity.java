package robert.findtransport;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

public class DetailesActivity extends AppCompatActivity {

    private static final String MAP_TAG = "Show map";

    private String[] stopsGet;
    private List<String> stopsFinal;
    private LinearLayout stopsTable;
    private TextView transportNumber;
    private String transportType;
    private ImageView transportIcon;
    private int transportIcons[];
    private TextView transportTypeView;
    private TextView transportRoutes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailes);

        init();
        getExtraData(savedInstanceState);
        buildUI();

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_detailes, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home) {
            finish();
            overridePendingTransition(0, 0);
            return true;
        }
        if (id == R.id.open_map) {
            startActivity(new Intent(DetailesActivity.this, DetailedMapActivity.class));
        }

        return super.onOptionsItemSelected(item);
    }

    private void init() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        stopsTable = (LinearLayout) findViewById(R.id.stops_table);
        transportNumber = (TextView) findViewById(R.id.trasport_number);
        transportIcon = (ImageView) findViewById(R.id.transport_icon);
        transportTypeView = (TextView) findViewById(R.id.transport_type);
        transportRoutes = (TextView) findViewById(R.id.transport_routes);
        transportIcons = new int[] {
                R.drawable.bus,
                R.drawable.mbus,
                R.drawable.tbus
        };
    }

    private void getExtraData(Bundle savedInstanceState) {
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                transportType = "";
                transportNumber.setText("");
                stopsGet = new String[]{};
            } else {
                transportType = extras.getString("Details_type");
                transportNumber.setText(extras.getString("Details_number"));
                stopsGet = extras.getString("Details_stops").split("\t");
            }
        } else {
            transportType = (String) savedInstanceState.getSerializable("Details_type");
            transportNumber.setText((String) savedInstanceState.getSerializable("Details_number"));
            stopsGet = ((String) savedInstanceState.getSerializable("Details_type")).split("\t");
        }
        stopsFinal = Arrays.asList(Arrays.copyOfRange(stopsGet, 2, stopsGet.length));
    }

    private void buildUI() {
        transportTypeView.setText(transportType);
        transportRoutes.setText(String.format("%s - %s", stopsFinal.get(0), stopsFinal.get(stopsFinal.size() - 1)));

        getSupportActionBar().setTitle(transportType + " " + transportNumber.getText());

        for (int i = 0; i < stopsFinal.size(); i++) {
            View first = getLayoutInflater().inflate(R.layout.details_first_stop, null, false);
            View stop = getLayoutInflater().inflate(R.layout.details_stops, null, false);
            View last = getLayoutInflater().inflate(R.layout.details_last_stop, null, false);

            TextView firstStopTitle = (TextView) first.findViewById(R.id.stop_first_title);
            TextView stopTitle = (TextView) stop.findViewById(R.id.stop_title);
            TextView lastStopTitle = (TextView) last.findViewById(R.id.stop_last_title);

            if (i == 0) {
                firstStopTitle.setText(stopsFinal.get(i));
                stopsTable.addView(first);
            } else if (i == stopsFinal.size() - 1) {
                lastStopTitle.setText(stopsFinal.get(i));
                stopsTable.addView(last);
            } else {
                stopTitle.setText(stopsFinal.get(i));
                stopsTable.addView(stop);
            }
        }

        if (transportType.equals(getResources().getString(R.string.bus))) {
            transportIcon.setBackground(getResources().getDrawable(transportIcons[0]));
        } else if (transportType.equals(getResources().getString(R.string.microbus))) {
            transportIcon.setBackground(getResources().getDrawable(transportIcons[1]));
        } else if (transportType.equals(getResources().getString(R.string.trolleybus))) {
            transportIcon.setBackground(getResources().getDrawable(transportIcons[2]));
        }
    }

}