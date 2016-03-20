package robert.findtransport.utils;

import android.app.Application;

import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Logger;
import com.google.android.gms.analytics.Tracker;

import robert.findtransport.R;

/**
 * Created by robert on 1/20/16.
 */
public class MyApplication extends Application {


    public Tracker tracker;

    public void startTracking() {

        if (tracker == null) {
            GoogleAnalytics ga = GoogleAnalytics.getInstance(this);

            tracker = ga.newTracker(R.xml.tracker_app);

            ga.enableAutoActivityReports(this);

            ga.getLogger().setLogLevel(Logger.LogLevel.VERBOSE);
        }
    }

    public Tracker getTracker() {
        startTracking();

        return tracker;
    }

}
