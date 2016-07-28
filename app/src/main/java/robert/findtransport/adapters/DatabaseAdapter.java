package robert.findtransport.adapters;

import android.content.ContentValues;
import android.content.Context;
import android.content.res.Configuration;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

import java.util.Locale;

import robert.findtransport.R;

/**
 * Created by robert on 11/15/15.
 */
public class DatabaseAdapter {

    private DatabaseHelper databaseHelper;
    private Context context;
    private SQLiteDatabase db;
    private Cursor cursor;

    public DatabaseAdapter(Context context) {
        databaseHelper = new DatabaseHelper(context);
        db = databaseHelper.getWritableDatabase();

//        databaseHelper.notify();
        this.context = context;
    }

    public String getTransport() {
        StringBuffer buffer = new StringBuffer();

        cursor = db.query(DatabaseHelper.TABLE_TRANSPORT_NAME, null, null, null, null, null, null);

        int indexTransportNumber = cursor.getColumnIndex(DatabaseHelper.COLUMN_TRANSPORT_NUMBER);
        int indexTransportType = cursor.getColumnIndex(DatabaseHelper.COLUMN_TRANSPORT_TYPE);
        int indexStop1 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP1);
        int indexStop2 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP2);
        int indexStop3 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP3);
        int indexStop4 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP4);
        int indexStop5 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP5);
        int indexStop6 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP6);
        int indexStop7 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP7);
        int indexStop8 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP8);
        int indexStop9 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP9);
        int indexStop10 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP10);
        int indexStop11 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP11);
        int indexStop12 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP12);
        int indexStop13 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP13);
        int indexStop14 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP14);
        int indexStop15 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP15);
        int indexStop16 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP16);
        int indexStop17 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP17);
        int indexStop18 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP18);
        int indexStop19 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP19);
        int indexStop20 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP20);
        int indexStop21 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP21);
        int indexStop22 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP22);
        int indexStop23 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP23);
        int indexStop24 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP24);
        int indexStop25 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP25);
        int indexStop26 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP26);
        int indexStop27 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP27);
        int indexStop28 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP28);
        int indexStop29 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP29);
        int indexStop30 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP30);
        int indexStop31 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP31);
        int indexStop32 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP32);
        int indexStop33 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP33);
        int indexStop34 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP34);
        int indexStop35 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP35);
        int indexStop36 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP36);
        int indexStop37 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP37);
        int indexStop38 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP38);
        int indexStop39 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP39);
        int indexStop40 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP40);
        int indexStop41 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP41);
        int indexStop42 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP42);
        int indexStop43 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP43);
        int indexStop44 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP44);
        int indexStop45 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP45);

        while (cursor.moveToNext()) {
            buffer.append(cursor.getString(indexTransportNumber) + "\t" + cursor.getString(indexTransportType) + "\t" + cursor.getString(indexStop1) + "\t"
                    + cursor.getString(indexStop2) + "\t" + cursor.getString(indexStop3) + "\t" + cursor.getString(indexStop4) + "\t" + cursor.getString(indexStop5) + "\t"
                    + cursor.getString(indexStop6) + "\t" + cursor.getString(indexStop7) + "\t" + cursor.getString(indexStop8) + "\t" + cursor.getString(indexStop9) + "\t"
                    + cursor.getString(indexStop10) + "\t" + cursor.getString(indexStop11) + "\t" + cursor.getString(indexStop12) + "\t" + cursor.getString(indexStop13) + "\t"
                    + cursor.getString(indexStop14) + "\t" + cursor.getString(indexStop15) + "\t" + cursor.getString(indexStop16) + "\t" + cursor.getString(indexStop17) + "\t"
                    + cursor.getString(indexStop18) + "\t" + cursor.getString(indexStop19) + "\t" + cursor.getString(indexStop20) + "\t" + cursor.getString(indexStop21) + "\t"
                    + cursor.getString(indexStop22) + "\t" + cursor.getString(indexStop23) + "\t" + cursor.getString(indexStop24) + "\t" + cursor.getString(indexStop25) + "\t"
                    + cursor.getString(indexStop26) + "\t" + cursor.getString(indexStop27) + "\t" + cursor.getString(indexStop28) + "\t" + cursor.getString(indexStop29) + "\t"
                    + cursor.getString(indexStop30) + "\t" + cursor.getString(indexStop31) + "\t" + cursor.getString(indexStop31) + "\t" + cursor.getString(indexStop32) + "\t"
                    + cursor.getString(indexStop33) + "\t" + cursor.getString(indexStop34) + "\t" + cursor.getString(indexStop35) + "\t" + cursor.getString(indexStop36) + "\t"
                    + cursor.getString(indexStop37) + "\t" + cursor.getString(indexStop38) + "\t" + cursor.getString(indexStop39) + "\t" + cursor.getString(indexStop40) + "\t"
                    + cursor.getString(indexStop41) + "\t" + cursor.getString(indexStop42) + "\t" + cursor.getString(indexStop43) + "\t" + cursor.getString(indexStop44) + "\t"
                    + cursor.getString(indexStop45) + "\n");
        }

//        cursor.close();
        return buffer.toString();
    }

    public String getTransportEn() {
        StringBuffer buffer = new StringBuffer();

        cursor = db.query(DatabaseHelper.TABLE_TRANSPORT_NAME_EN, null, null, null, null, null, null);

        int indexTransportNumber = cursor.getColumnIndex(DatabaseHelper.COLUMN_TRANSPORT_NUMBER);
        int indexTransportType = cursor.getColumnIndex(DatabaseHelper.COLUMN_TRANSPORT_TYPE);
        int indexStop1 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP1);
        int indexStop2 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP2);
        int indexStop3 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP3);
        int indexStop4 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP4);
        int indexStop5 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP5);
        int indexStop6 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP6);
        int indexStop7 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP7);
        int indexStop8 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP8);
        int indexStop9 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP9);
        int indexStop10 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP10);
        int indexStop11 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP11);
        int indexStop12 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP12);
        int indexStop13 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP13);
        int indexStop14 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP14);
        int indexStop15 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP15);
        int indexStop16 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP16);
        int indexStop17 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP17);
        int indexStop18 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP18);
        int indexStop19 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP19);
        int indexStop20 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP20);
        int indexStop21 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP21);
        int indexStop22 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP22);
        int indexStop23 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP23);
        int indexStop24 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP24);
        int indexStop25 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP25);
        int indexStop26 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP26);
        int indexStop27 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP27);
        int indexStop28 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP28);
        int indexStop29 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP29);
        int indexStop30 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP30);
        int indexStop31 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP31);
        int indexStop32 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP32);
        int indexStop33 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP33);
        int indexStop34 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP34);
        int indexStop35 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP35);
        int indexStop36 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP36);
        int indexStop37 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP37);
        int indexStop38 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP38);
        int indexStop39 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP39);
        int indexStop40 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP40);
        int indexStop41 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP41);
        int indexStop42 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP42);
        int indexStop43 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP43);
        int indexStop44 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP44);
        int indexStop45 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP45);

        while (cursor.moveToNext()) {
            buffer.append(cursor.getString(indexTransportNumber) + "\t" + cursor.getString(indexTransportType) + "\t" + cursor.getString(indexStop1) + "\t"
                    + cursor.getString(indexStop2) + "\t" + cursor.getString(indexStop3) + "\t" + cursor.getString(indexStop4) + "\t" + cursor.getString(indexStop5) + "\t"
                    + cursor.getString(indexStop6) + "\t" + cursor.getString(indexStop7) + "\t" + cursor.getString(indexStop8) + "\t" + cursor.getString(indexStop9) + "\t"
                    + cursor.getString(indexStop10) + "\t" + cursor.getString(indexStop11) + "\t" + cursor.getString(indexStop12) + "\t" + cursor.getString(indexStop13) + "\t"
                    + cursor.getString(indexStop14) + "\t" + cursor.getString(indexStop15) + "\t" + cursor.getString(indexStop16) + "\t" + cursor.getString(indexStop17) + "\t"
                    + cursor.getString(indexStop18) + "\t" + cursor.getString(indexStop19) + "\t" + cursor.getString(indexStop20) + "\t" + cursor.getString(indexStop21) + "\t"
                    + cursor.getString(indexStop22) + "\t" + cursor.getString(indexStop23) + "\t" + cursor.getString(indexStop24) + "\t" + cursor.getString(indexStop25) + "\t"
                    + cursor.getString(indexStop26) + "\t" + cursor.getString(indexStop27) + "\t" + cursor.getString(indexStop28) + "\t" + cursor.getString(indexStop29) + "\t"
                    + cursor.getString(indexStop30) + "\t" + cursor.getString(indexStop31) + "\t" + cursor.getString(indexStop31) + "\t" + cursor.getString(indexStop32) + "\t"
                    + cursor.getString(indexStop33) + "\t" + cursor.getString(indexStop34) + "\t" + cursor.getString(indexStop35) + "\t" + cursor.getString(indexStop36) + "\t"
                    + cursor.getString(indexStop37) + "\t" + cursor.getString(indexStop38) + "\t" + cursor.getString(indexStop39) + "\t" + cursor.getString(indexStop40) + "\t"
                    + cursor.getString(indexStop41) + "\t" + cursor.getString(indexStop42) + "\t" + cursor.getString(indexStop43) + "\t" + cursor.getString(indexStop44) + "\t"
                    + cursor.getString(indexStop45) + "\n");
        }

//        cursor.close();
        return buffer.toString();
    }

    public String getTransportRu() {
        StringBuffer buffer = new StringBuffer();

        cursor = db.query(DatabaseHelper.TABLE_TRANSPORT_NAME_RU, null, null, null, null, null, null);

        int indexTransportNumber = cursor.getColumnIndex(DatabaseHelper.COLUMN_TRANSPORT_NUMBER);
        int indexTransportType = cursor.getColumnIndex(DatabaseHelper.COLUMN_TRANSPORT_TYPE);
        int indexStop1 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP1);
        int indexStop2 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP2);
        int indexStop3 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP3);
        int indexStop4 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP4);
        int indexStop5 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP5);
        int indexStop6 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP6);
        int indexStop7 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP7);
        int indexStop8 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP8);
        int indexStop9 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP9);
        int indexStop10 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP10);
        int indexStop11 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP11);
        int indexStop12 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP12);
        int indexStop13 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP13);
        int indexStop14 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP14);
        int indexStop15 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP15);
        int indexStop16 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP16);
        int indexStop17 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP17);
        int indexStop18 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP18);
        int indexStop19 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP19);
        int indexStop20 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP20);
        int indexStop21 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP21);
        int indexStop22 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP22);
        int indexStop23 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP23);
        int indexStop24 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP24);
        int indexStop25 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP25);
        int indexStop26 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP26);
        int indexStop27 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP27);
        int indexStop28 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP28);
        int indexStop29 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP29);
        int indexStop30 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP30);
        int indexStop31 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP31);
        int indexStop32 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP32);
        int indexStop33 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP33);
        int indexStop34 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP34);
        int indexStop35 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP35);
        int indexStop36 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP36);
        int indexStop37 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP37);
        int indexStop38 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP38);
        int indexStop39 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP39);
        int indexStop40 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP40);
        int indexStop41 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP41);
        int indexStop42 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP42);
        int indexStop43 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP43);
        int indexStop44 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP44);
        int indexStop45 = cursor.getColumnIndex(DatabaseHelper.COLUMN_STOP45);

        while (cursor.moveToNext()) {
            buffer.append(cursor.getString(indexTransportNumber) + "\t" + cursor.getString(indexTransportType) + "\t" + cursor.getString(indexStop1) + "\t"
                    + cursor.getString(indexStop2) + "\t" + cursor.getString(indexStop3) + "\t" + cursor.getString(indexStop4) + "\t" + cursor.getString(indexStop5) + "\t"
                    + cursor.getString(indexStop6) + "\t" + cursor.getString(indexStop7) + "\t" + cursor.getString(indexStop8) + "\t" + cursor.getString(indexStop9) + "\t"
                    + cursor.getString(indexStop10) + "\t" + cursor.getString(indexStop11) + "\t" + cursor.getString(indexStop12) + "\t" + cursor.getString(indexStop13) + "\t"
                    + cursor.getString(indexStop14) + "\t" + cursor.getString(indexStop15) + "\t" + cursor.getString(indexStop16) + "\t" + cursor.getString(indexStop17) + "\t"
                    + cursor.getString(indexStop18) + "\t" + cursor.getString(indexStop19) + "\t" + cursor.getString(indexStop20) + "\t" + cursor.getString(indexStop21) + "\t"
                    + cursor.getString(indexStop22) + "\t" + cursor.getString(indexStop23) + "\t" + cursor.getString(indexStop24) + "\t" + cursor.getString(indexStop25) + "\t"
                    + cursor.getString(indexStop26) + "\t" + cursor.getString(indexStop27) + "\t" + cursor.getString(indexStop28) + "\t" + cursor.getString(indexStop29) + "\t"
                    + cursor.getString(indexStop30) + "\t" + cursor.getString(indexStop31) + "\t" + cursor.getString(indexStop31) + "\t" + cursor.getString(indexStop32) + "\t"
                    + cursor.getString(indexStop33) + "\t" + cursor.getString(indexStop34) + "\t" + cursor.getString(indexStop35) + "\t" + cursor.getString(indexStop36) + "\t"
                    + cursor.getString(indexStop37) + "\t" + cursor.getString(indexStop38) + "\t" + cursor.getString(indexStop39) + "\t" + cursor.getString(indexStop40) + "\t"
                    + cursor.getString(indexStop41) + "\t" + cursor.getString(indexStop42) + "\t" + cursor.getString(indexStop43) + "\t" + cursor.getString(indexStop44) + "\t"
                    + cursor.getString(indexStop45) + "\n");
        }

//        cursor.close();
        return buffer.toString();
    }

    public String getStops() {
        StringBuffer buffer = new StringBuffer();

        cursor = db.query(databaseHelper.TABLE_STOP_NAME, null, null, null, null, null, null);

        int indexStops = cursor.getColumnIndex(databaseHelper.COLUMN_ALL_STOPS);
        int indexStopsLatitude = cursor.getColumnIndex(databaseHelper.COLUMN_ALL_STOPS_LATITUDE);
        int indexStopsLongitude = cursor.getColumnIndex(databaseHelper.COLUMN_ALL_STOPS_LONGITUDE);

        while (cursor.moveToNext()) {
            buffer.append(cursor.getString(indexStops) + "\t" + cursor.getString(indexStopsLatitude) + "\t" + cursor.getString(indexStopsLongitude) + "\n");
        }

        return buffer.toString();
    }

    public String getStopsEn() {
        StringBuffer buffer = new StringBuffer();

        cursor = db.query(databaseHelper.TABLE_STOP_NAME_EN, null, null, null, null, null, null);

        int indexStops = cursor.getColumnIndex(databaseHelper.COLUMN_ALL_STOPS);
        int indexStopsLatitude = cursor.getColumnIndex(databaseHelper.COLUMN_ALL_STOPS_LATITUDE);
        int indexStopsLongitude = cursor.getColumnIndex(databaseHelper.COLUMN_ALL_STOPS_LONGITUDE);

        while (cursor.moveToNext()) {
            buffer.append(cursor.getString(indexStops) + "\t" + cursor.getString(indexStopsLatitude) + "\t" + cursor.getString(indexStopsLongitude) + "\n");
        }

        return buffer.toString();
    }

    public String getStopsRu() {
        StringBuffer buffer = new StringBuffer();

        cursor = db.query(databaseHelper.TABLE_STOP_NAME_RU, null, null, null, null, null, null);

        int indexStops = cursor.getColumnIndex(databaseHelper.COLUMN_ALL_STOPS);
        int indexStopsLatitude = cursor.getColumnIndex(databaseHelper.COLUMN_ALL_STOPS_LATITUDE);
        int indexStopsLongitude = cursor.getColumnIndex(databaseHelper.COLUMN_ALL_STOPS_LONGITUDE);

        while (cursor.moveToNext()) {
            buffer.append(cursor.getString(indexStops) + "\t" + cursor.getString(indexStopsLatitude) + "\t" + cursor.getString(indexStopsLongitude) + "\n");
        }

        return buffer.toString();
    }

    public void closeDatabase() {
        databaseHelper.close();
    }

    private class DatabaseHelper extends SQLiteOpenHelper {


        private Context context;

        private static final String DATABASE_NAME = "Transport";
        private static final int DATABASE_VERSION = 29;

        private static final String TABLE_TRANSPORT_NAME = "table_transport";
        private static final String TABLE_STOP_NAME = "table_stop";

        private static final String TABLE_TRANSPORT_NAME_EN = "table_transport_en";
        private static final String TABLE_STOP_NAME_EN = "table_stop_en";

        private static final String TABLE_TRANSPORT_NAME_RU = "table_transport_ru";
        private static final String TABLE_STOP_NAME_RU = "table_stop_ru";

        private static final String COLUMN_ID = "_id";
        private static final String COLUMN_TRANSPORT_NUMBER = "transport_number";
        private static final String COLUMN_TRANSPORT_TYPE = "transport_type";
        private static final String COLUMN_STOP1 = "stop1", COLUMN_STOP2 = "stop2", COLUMN_STOP3 = "stop3", COLUMN_STOP4 = "stop4",
                COLUMN_STOP5 = "stop5", COLUMN_STOP6 = "stop6", COLUMN_STOP7 = "stop7", COLUMN_STOP8 = "stop8",
                COLUMN_STOP9 = "stop9", COLUMN_STOP10 = "stop10", COLUMN_STOP11 = "stop11", COLUMN_STOP12 = "stop12",
                COLUMN_STOP13 = "stop13", COLUMN_STOP14 = "stop14", COLUMN_STOP15 = "stop15", COLUMN_STOP16 = "stop16",
                COLUMN_STOP17 = "stop17", COLUMN_STOP18 = "stop18", COLUMN_STOP19 = "stop19", COLUMN_STOP20 = "stop20",
                COLUMN_STOP21 = "stop21", COLUMN_STOP22 = "stop22", COLUMN_STOP23 = "stop23", COLUMN_STOP24 = "stop24",
                COLUMN_STOP25 = "stop25", COLUMN_STOP26 = "stop26", COLUMN_STOP27 = "stop27", COLUMN_STOP28 = "stop28",
                COLUMN_STOP29 = "stop29", COLUMN_STOP30 = "stop30", COLUMN_STOP31 = "stop31", COLUMN_STOP32 = "stop32",
                COLUMN_STOP33 = "stop33", COLUMN_STOP34 = "stop34", COLUMN_STOP35 = "stop35", COLUMN_STOP36 = "stop36",
                COLUMN_STOP37 = "stop37", COLUMN_STOP38 = "stop38", COLUMN_STOP39 = "stop39", COLUMN_STOP40 = "stop40",
                COLUMN_STOP41 = "stop41", COLUMN_STOP42 = "stop42", COLUMN_STOP43 = "stop43", COLUMN_STOP44 = "stop44",
                COLUMN_STOP45 = "stop45";

        private static final String COLUMN_ALL_STOPS = "all_stops";
        private static final String COLUMN_ALL_STOPS_LATITUDE = "all_stops_latitude";
        private static final String COLUMN_ALL_STOPS_LONGITUDE = "all_stops_longitude";

        /*--*/

        private static final String CREATE_TABLE_TRANSPORT_NAME = "create table " + TABLE_TRANSPORT_NAME + " (" +
                COLUMN_ID + " integer primary key autoincrement, " +
                COLUMN_TRANSPORT_NUMBER + " varchar(255), " +
                COLUMN_TRANSPORT_TYPE + " varchar(255), " +
                COLUMN_STOP1 + " varchar(255), " + COLUMN_STOP2 + " varchar(255), " + COLUMN_STOP3 + " varchar(255), " + COLUMN_STOP4 + " varchar(255), " +
                COLUMN_STOP5 + " varchar(255), " + COLUMN_STOP6 + " varchar(255), " + COLUMN_STOP7 + " varchar(255), " + COLUMN_STOP8 + " varchar(255), " +
                COLUMN_STOP9 + " varchar(255), " + COLUMN_STOP10 + " varchar(255), " + COLUMN_STOP11 + " varchar(255), " + COLUMN_STOP12 + " varchar(255), " +
                COLUMN_STOP13 + " varchar(255), " + COLUMN_STOP14 + " varchar(255), " + COLUMN_STOP15 + " varchar(255), " + COLUMN_STOP16 + " varchar(255), " +
                COLUMN_STOP17 + " varchar(255), " + COLUMN_STOP18 + " varchar(255), " + COLUMN_STOP19 + " varchar(255), " + COLUMN_STOP20 + " varchar(255), " +
                COLUMN_STOP21 + " varchar(255), " + COLUMN_STOP22 + " varchar(255), " + COLUMN_STOP23 + " varchar(255), " + COLUMN_STOP24 + " varchar(255), " +
                COLUMN_STOP25 + " varchar(255), " + COLUMN_STOP26 + " varchar(255), " + COLUMN_STOP27 + " varchar(255), " + COLUMN_STOP28 + " varchar(255), " +
                COLUMN_STOP29 + " varchar(255), " + COLUMN_STOP30 + " varchar(255), " + COLUMN_STOP31 + " varchar(255), " + COLUMN_STOP32 + " varchar(255), " +
                COLUMN_STOP33 + " varchar(255), " + COLUMN_STOP34 + " varchar(255), " + COLUMN_STOP35 + " varchar(255), " + COLUMN_STOP36 + " varchar(255), " +
                COLUMN_STOP37 + " varchar(255), " + COLUMN_STOP38 + " varchar(255), " + COLUMN_STOP39 + " varchar(255), " + COLUMN_STOP40 + " varchar(255), " +
                COLUMN_STOP41 + " varchar(255), " + COLUMN_STOP42 + " varchar(255), " + COLUMN_STOP43 + " varchar(255), " + COLUMN_STOP44 + " varchar(255), " +
                COLUMN_STOP45 + " varchar(255));";

        private static final String CREATE_TABLE_TRANSPORT_NAME_EN = "create table " + TABLE_TRANSPORT_NAME_EN + " (" +
                COLUMN_ID + " integer primary key autoincrement, " +
                COLUMN_TRANSPORT_NUMBER + " varchar(255), " +
                COLUMN_TRANSPORT_TYPE + " varchar(255), " +
                COLUMN_STOP1 + " varchar(255), " + COLUMN_STOP2 + " varchar(255), " + COLUMN_STOP3 + " varchar(255), " + COLUMN_STOP4 + " varchar(255), " +
                COLUMN_STOP5 + " varchar(255), " + COLUMN_STOP6 + " varchar(255), " + COLUMN_STOP7 + " varchar(255), " + COLUMN_STOP8 + " varchar(255), " +
                COLUMN_STOP9 + " varchar(255), " + COLUMN_STOP10 + " varchar(255), " + COLUMN_STOP11 + " varchar(255), " + COLUMN_STOP12 + " varchar(255), " +
                COLUMN_STOP13 + " varchar(255), " + COLUMN_STOP14 + " varchar(255), " + COLUMN_STOP15 + " varchar(255), " + COLUMN_STOP16 + " varchar(255), " +
                COLUMN_STOP17 + " varchar(255), " + COLUMN_STOP18 + " varchar(255), " + COLUMN_STOP19 + " varchar(255), " + COLUMN_STOP20 + " varchar(255), " +
                COLUMN_STOP21 + " varchar(255), " + COLUMN_STOP22 + " varchar(255), " + COLUMN_STOP23 + " varchar(255), " + COLUMN_STOP24 + " varchar(255), " +
                COLUMN_STOP25 + " varchar(255), " + COLUMN_STOP26 + " varchar(255), " + COLUMN_STOP27 + " varchar(255), " + COLUMN_STOP28 + " varchar(255), " +
                COLUMN_STOP29 + " varchar(255), " + COLUMN_STOP30 + " varchar(255), " + COLUMN_STOP31 + " varchar(255), " + COLUMN_STOP32 + " varchar(255), " +
                COLUMN_STOP33 + " varchar(255), " + COLUMN_STOP34 + " varchar(255), " + COLUMN_STOP35 + " varchar(255), " + COLUMN_STOP36 + " varchar(255), " +
                COLUMN_STOP37 + " varchar(255), " + COLUMN_STOP38 + " varchar(255), " + COLUMN_STOP39 + " varchar(255), " + COLUMN_STOP40 + " varchar(255), " +
                COLUMN_STOP41 + " varchar(255), " + COLUMN_STOP42 + " varchar(255), " + COLUMN_STOP43 + " varchar(255), " + COLUMN_STOP44 + " varchar(255), " +
                COLUMN_STOP45 + " varchar(255));";

        private static final String CREATE_TABLE_TRANSPORT_NAME_RU = "create table " + TABLE_TRANSPORT_NAME_RU + " (" +
                COLUMN_ID + " integer primary key autoincrement, " +
                COLUMN_TRANSPORT_NUMBER + " varchar(255), " +
                COLUMN_TRANSPORT_TYPE + " varchar(255), " +
                COLUMN_STOP1 + " varchar(255), " + COLUMN_STOP2 + " varchar(255), " + COLUMN_STOP3 + " varchar(255), " + COLUMN_STOP4 + " varchar(255), " +
                COLUMN_STOP5 + " varchar(255), " + COLUMN_STOP6 + " varchar(255), " + COLUMN_STOP7 + " varchar(255), " + COLUMN_STOP8 + " varchar(255), " +
                COLUMN_STOP9 + " varchar(255), " + COLUMN_STOP10 + " varchar(255), " + COLUMN_STOP11 + " varchar(255), " + COLUMN_STOP12 + " varchar(255), " +
                COLUMN_STOP13 + " varchar(255), " + COLUMN_STOP14 + " varchar(255), " + COLUMN_STOP15 + " varchar(255), " + COLUMN_STOP16 + " varchar(255), " +
                COLUMN_STOP17 + " varchar(255), " + COLUMN_STOP18 + " varchar(255), " + COLUMN_STOP19 + " varchar(255), " + COLUMN_STOP20 + " varchar(255), " +
                COLUMN_STOP21 + " varchar(255), " + COLUMN_STOP22 + " varchar(255), " + COLUMN_STOP23 + " varchar(255), " + COLUMN_STOP24 + " varchar(255), " +
                COLUMN_STOP25 + " varchar(255), " + COLUMN_STOP26 + " varchar(255), " + COLUMN_STOP27 + " varchar(255), " + COLUMN_STOP28 + " varchar(255), " +
                COLUMN_STOP29 + " varchar(255), " + COLUMN_STOP30 + " varchar(255), " + COLUMN_STOP31 + " varchar(255), " + COLUMN_STOP32 + " varchar(255), " +
                COLUMN_STOP33 + " varchar(255), " + COLUMN_STOP34 + " varchar(255), " + COLUMN_STOP35 + " varchar(255), " + COLUMN_STOP36 + " varchar(255), " +
                COLUMN_STOP37 + " varchar(255), " + COLUMN_STOP38 + " varchar(255), " + COLUMN_STOP39 + " varchar(255), " + COLUMN_STOP40 + " varchar(255), " +
                COLUMN_STOP41 + " varchar(255), " + COLUMN_STOP42 + " varchar(255), " + COLUMN_STOP43 + " varchar(255), " + COLUMN_STOP44 + " varchar(255), " +
                COLUMN_STOP45 + " varchar(255));";

        private static final String CREATE_TABLE_STOP_NAME = "create table " + TABLE_STOP_NAME + " (" +
                COLUMN_ID + " integer primary key autoincrement, " +
                COLUMN_ALL_STOPS + " varchar(255), " +
                COLUMN_ALL_STOPS_LATITUDE + " varchar(255), " +
                COLUMN_ALL_STOPS_LONGITUDE + " varchar(255));";

        private static final String CREATE_TABLE_STOP_NAME_EN = "create table " + TABLE_STOP_NAME_EN + " (" +
                COLUMN_ID + " integer primary key autoincrement, " +
                COLUMN_ALL_STOPS + " varchar(255), " +
                COLUMN_ALL_STOPS_LATITUDE + " varchar(255), " +
                COLUMN_ALL_STOPS_LONGITUDE + " varchar(255));";

        private static final String CREATE_TABLE_STOP_NAME_RU = "create table " + TABLE_STOP_NAME_RU + " (" +
                COLUMN_ID + " integer primary key autoincrement, " +
                COLUMN_ALL_STOPS + " varchar(255), " +
                COLUMN_ALL_STOPS_LATITUDE + " varchar(255), " +
                COLUMN_ALL_STOPS_LONGITUDE + " varchar(255));";

        private static final String DROP_TABLE_TRANSPORT_NAME = "drop table if exists " + TABLE_TRANSPORT_NAME;
        private static final String DROP_TABLE_STOP_NAME = "drop table if exists " + TABLE_STOP_NAME;

        private static final String DROP_TABLE_TRANSPORT_NAME_EN = "drop table if exists " + TABLE_TRANSPORT_NAME_EN;
        private static final String DROP_TABLE_STOP_NAME_EN = "drop table if exists " + TABLE_STOP_NAME_EN;

        private static final String DROP_TABLE_TRANSPORT_NAME_RU = "drop table if exists " + TABLE_TRANSPORT_NAME_RU;
        private static final String DROP_TABLE_STOP_NAME_RU = "drop table if exists " + TABLE_STOP_NAME_RU;


        public DatabaseHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
            this.context = context;
        }

        @Override
        public void onCreate(SQLiteDatabase db) {

            try {
                db.execSQL(CREATE_TABLE_TRANSPORT_NAME);
                db.execSQL(CREATE_TABLE_TRANSPORT_NAME_EN);
                db.execSQL(CREATE_TABLE_TRANSPORT_NAME_RU);
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                db.execSQL(CREATE_TABLE_STOP_NAME);
                db.execSQL(CREATE_TABLE_STOP_NAME_EN);
                db.execSQL(CREATE_TABLE_STOP_NAME_RU);
            } catch (SQLException e) {
                e.printStackTrace();
            }

            insertIntoTransport(db);
            insertIntoTransportEn(db);
            insertIntoTransportRu(db);

            insertIntoStop(db);
            insertIntoStopEn(db);
            insertIntoStopRu(db);

        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

            if (newVersion > oldVersion) {
                try {
                    db.execSQL(DROP_TABLE_TRANSPORT_NAME);
                    db.execSQL(DROP_TABLE_TRANSPORT_NAME_EN);
                    db.execSQL(DROP_TABLE_TRANSPORT_NAME_RU);
                } catch (SQLException e) {
                    e.printStackTrace();
                    Log.e("TR_NAME", "NOT DROPPED");
                }

                try {
                    db.execSQL(DROP_TABLE_STOP_NAME);
                    db.execSQL(DROP_TABLE_STOP_NAME_EN);
                    db.execSQL(DROP_TABLE_STOP_NAME_RU);
                    onCreate(db);
                } catch (SQLException e) {
                    e.printStackTrace();
                    Log.e("ST_NAME", "NOT DROPPED");
                }
            }

        }

        private ContentValues insertDataToTableTransport(String transportNumber, String transportType, String stop1, String stop2, String stop3, String stop4,
                                                         String stop5, String stop6, String stop7, String stop8, String stop9, String stop10, String stop11,
                                                         String stop12, String stop13, String stop14, String stop15, String stop16, String stop17,
                                                         String stop18, String stop19, String stop20, String stop21, String stop22, String stop23,
                                                         String stop24, String stop25, String stop26, String stop27, String stop28, String stop29,
                                                         String stop30, String stop31, String stop32, String stop33, String stop34, String stop35,
                                                         String stop36, String stop37, String stop38, String stop39, String stop40, String stop41,
                                                         String stop42, String stop43, String stop44, String stop45) {

            ContentValues contentValues = new ContentValues();

            contentValues.put(COLUMN_TRANSPORT_NUMBER, transportNumber);
            contentValues.put(COLUMN_TRANSPORT_TYPE, transportType);
            contentValues.put(COLUMN_STOP1, stop1);
            contentValues.put(COLUMN_STOP2, stop2);
            contentValues.put(COLUMN_STOP3, stop3);
            contentValues.put(COLUMN_STOP4, stop4);
            contentValues.put(COLUMN_STOP5, stop5);
            contentValues.put(COLUMN_STOP6, stop6);
            contentValues.put(COLUMN_STOP7, stop7);
            contentValues.put(COLUMN_STOP8, stop8);
            contentValues.put(COLUMN_STOP9, stop9);
            contentValues.put(COLUMN_STOP10, stop10);
            contentValues.put(COLUMN_STOP11, stop11);
            contentValues.put(COLUMN_STOP12, stop12);
            contentValues.put(COLUMN_STOP13, stop13);
            contentValues.put(COLUMN_STOP14, stop14);
            contentValues.put(COLUMN_STOP15, stop15);
            contentValues.put(COLUMN_STOP16, stop16);
            contentValues.put(COLUMN_STOP17, stop17);
            contentValues.put(COLUMN_STOP18, stop18);
            contentValues.put(COLUMN_STOP19, stop19);
            contentValues.put(COLUMN_STOP20, stop20);
            contentValues.put(COLUMN_STOP21, stop21);
            contentValues.put(COLUMN_STOP22, stop22);
            contentValues.put(COLUMN_STOP23, stop23);
            contentValues.put(COLUMN_STOP24, stop24);
            contentValues.put(COLUMN_STOP25, stop25);
            contentValues.put(COLUMN_STOP26, stop26);
            contentValues.put(COLUMN_STOP27, stop27);
            contentValues.put(COLUMN_STOP28, stop28);
            contentValues.put(COLUMN_STOP29, stop29);
            contentValues.put(COLUMN_STOP30, stop30);
            contentValues.put(COLUMN_STOP31, stop31);
            contentValues.put(COLUMN_STOP32, stop32);
            contentValues.put(COLUMN_STOP33, stop33);
            contentValues.put(COLUMN_STOP34, stop34);
            contentValues.put(COLUMN_STOP35, stop35);
            contentValues.put(COLUMN_STOP36, stop36);
            contentValues.put(COLUMN_STOP37, stop37);
            contentValues.put(COLUMN_STOP38, stop38);
            contentValues.put(COLUMN_STOP39, stop39);
            contentValues.put(COLUMN_STOP40, stop40);
            contentValues.put(COLUMN_STOP41, stop41);
            contentValues.put(COLUMN_STOP42, stop42);
            contentValues.put(COLUMN_STOP43, stop43);
            contentValues.put(COLUMN_STOP44, stop44);
            contentValues.put(COLUMN_STOP45, stop45);

            return contentValues;
        }

        private ContentValues insertDataToTableStop(String allStops, String allStopsLatitude, String allStopsLongitude) {

            ContentValues contentValues = new ContentValues();

            contentValues.put(COLUMN_ALL_STOPS, allStops);
            contentValues.put(COLUMN_ALL_STOPS_LATITUDE, allStopsLatitude);
            contentValues.put(COLUMN_ALL_STOPS_LONGITUDE, allStopsLongitude);

            return contentValues;
        }

        private void insertIntoTransport(SQLiteDatabase db) {

            /**
             * Buses
             * */

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("1", "A", "Էրեբունու զ/ծ", "Խաղաղ Դոնի փ․", "Տիտոգրադյան փ․", "Այվազովսկու փ․",
                    "Էրեբունու փ․", "Արցախի փ․", "Տիգրան Մեծի պ․ (Կայարան)", "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)", "Տիգրան Մեծի պ․ (Այրարատ կ/թ)",
                    "Մանկավարժական համալսարան", "Տիգրան Մեծի պ․ (Ֆիրդուսի շուկա)", "Հանրապետության Հրապարակ", "Ամիրյան փ․", "Մաշտոցի պ․ (Ամիրյան խաչմերուկ)",
                    "Մաշտոցի պ․ (Մարգարյան հիվ․)", "Մաշտոցի պ․ (Օպերա)", "Բաղրամյան պ․ (Օպերա)", "Բաղրամյան պ․ (Սահմանադրական դատարան)", "Բաղրամյան պ․ (Ամերիկյան համալսարան)",
                    "Բաղրամյան պ․ (Կամոյի դպրոց)", "Բաղրամյան պ․ (SAS)", "Կասյան փ․", "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)", "Կոմիտասի պ․ (Վաղարշյան խաչմերուկ)",
                    "Կոմիտասի պ․ (Փափազյան խաչմերուկ)", "Կոմիտասի պ․ (Սլավոնական համալսարան)", "Կոմիտասի պ․ (Վրացական խաչմերուկ)", "Կոմիտասի պ․ (Կոմիտասի շուկա)",
                    "Կոմիտասի պ․ (Լամբադա կամուրջ)", "Ազատության պ․ (Ռայկոմ)", "Պարույր Սևակի փ․", "Դրոյի փ․", "Լեփսիուսի փ․", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("3", "A", "ՀԱԹ", "Առնո Բաբաջանյան փ․", "Րաֆֆու փ․", "Րաֆֆու փ․ (Մալաթիայի շուկա)",
                    "Սեբաստիայի փ․ (Մալաթիայի շուկա)", "Սեբաստիայի փ․ (Տիչինայի խաչմերուկ)", "Սեբաստիայի փ․ (Լենինգրադյան խաչմերուկ)", "Լենինգրադյան փ․ (Եվրովագեն)",
                    "Լենինգրադյան փ․ (Շինարարների խաչմերուկ)", "Լենինգրադյան փ․ (Մոնթե Մելքոնյան խաչմերուկ)", "Լենինգրադյան փ․ (Կիևյան կամուրջ)", "Կիևյան փ․ (Կիևյան կամուրջ)",
                    "Կիևյան փ․ (Օրբելի խաչմերուկ)", "Կիևյան փ․ (Բարեկամություն)", "Կասյան փ․", "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)", "Կոմիտասի պ․ (Վաղարշյան խաչմերուկ)",
                    "Կոմիտասի պ․ (Փափազյան խաչմերուկ)", "Կոմիտասի պ․ (Սլավոնական համալսարան)", "Կոմիտասի պ․ (Վրացական խաչմերուկ)", "Կոմիտասի պ․ (Կոմիտասի շուկա)",
                    "Կոմիտասի պ․ (Լամբադա կամուրջ)", "Դավիթ Անհաղթի փ․ (թաղապետարան)", "Դավիթ Անհաղթի փ․ (Կերամա Մարացի)", "Դավիթ Անհաղթի փ․ (Դրոյի խաչմերուկ)",
                    "Ռուբինյանց փ․ (Ահարոնյան փ․)", "Ռուբինյանց փ․ (Երևան Սիթի)", "Ռուբինյանց փ․ (Ալմաստ գ/ն)", "Գայի պ․ (Աքվատեք)", "Գայի պ․ (Գայի արձան)",
                    "Գայի պ․ (Մերսեդեսի սրահ)", "Բադալ Մուրադյան փ․", "Դավիթ Բեկի փ.", "Հունան Ավետիսյան փ․", "Նոր Նորքի 7-րդ զ/ծ", "Վիլնյուսի փ․", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("5", "A", "Ջրվեժ", "Քոչինյան փ․", "Թևոսյան փ․", "Հովհաննիսյան փ․", "Ակսել Բակունցի փ․",
                    "Գյուլիքեխվյան փ․", "Գայի պ․ (Մերսեդեսի սրահ)", "Գայի պ․ (Գայի արձան)", "Գայի պ․ (Աքվատեք)", "Մյասնիկյան պ․ (Ջրաշխարհ)", "Մյասնիկյան պ․ (Կենդանաբանական այգի)",
                    "Մյասնիկյան պ․ (Հերացի խաչմերուկ)", "Աբովյան փ․ (Պլանի գլուխ)", "Աբովյան փ․ (Գյուղակադեմիա)", "Աբովյան փ․ (Երիտասարդական մ/կ)", "Մոսկովյան փ․ (Կոնսերվատորիա)",
                    "Մաշտոցի պ․ (Կոնսերվատորիա)", "Մաշտոցի պ․ (Օպերա)", "Մաշտոցի պ․ (Մարգարյան հիվ․)", "Մաշտոցի պ․ (Ամիրյան խաչմերուկ)", "Մաշտոցի պ․ (Ծածկած շուկա)",
                    "Մաշտոցի պ․ (Ձկան խանութ)", "Հաղթանակ կամուրջ", "Ծովակալ Իսակովի պ․", "Կիլիկիա ավտոկայան", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("7", "A", "Էրեբունու զ/ծ ", "Խաղաղ Դոնի փ․", "Տիտոգրադյան փ․", "Այվազովսկու փ․", "Էրեբունու փ․",
                    "Աթոյան փ․", "Բելինսկու փ․", "Սասունցի Դավթի փ․", "Տիգրան Մեծի պ․ (Կայարան)", "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)",
                    "Տիգրան Մեծի պ․ (Այրարատ կ/թ)", "Մանկավարժական համալսարան", "Խանջյան փ․ (Լունապարկ)", "Վերնիսաժ", "Թումանյան փ․", "Մաշտոցի պ․ (Օպերա)",
                    "Մաշտոցի պ․ (Կոնսերվատորիա)", "Մաշտոցի պ․ (Մատենադարան)", "Կորյունի փ․ (Ցիտադել)", "Աբովյան փ․ (Գյուղակադեմիա)", "Աբովյան փ․ (Պլանի գլուխ)",
                    "Մյասնիկյան պ․ (Հերացի խաչմերուկ)", "Սարալանջի փ․", "Ավետ Ավետիսյան փ․", "Վաղարշյան փ․", "Սասնա Ծռերի փ․", "Դավթաշենի 1-ին թաղ․", "Տիգրան Պետրոսյան փ․",
                    "Եղվարդի խճ․", "Դավթաշենի 4-րդ թաղ․", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("8", "A", "Դավթաշենի 4-րդ թաղ․", "Տիգրան Պետրոսյան փ․", "Դավթաշենի 1-ին թաղ․", "Իոսիֆյան փ․",
                    "Հալաբյան փ․ (Ֆիզիկայի խաչմերուկ)", "Հալաբյան փ․ (ԹՈՒՄՈ)", "Հալաբյան փ․ (Կիևյան կամուրջ)", "Կիևյան փ․ (Կիևյան կամուրջ)", "Կիևյան փ․ (Օրբելի խաչմերուկ)",
                    "Կիևյան փ․ (Բարեկամություն)", "Բաղրամյան պ․ (SAS)", "Բաղրամյան պ․ (Կամոյի դպրոց)", "Բաղրամյան պ․ (Ամերիկյան համալսարան)",
                    "Բաղրամյան պ․ (Սահմանադրական դատարան)", "Բաղրամյան պ․ (Օպերա)", "Մաշտոցի պ․ (Կոնսերվատորիա)", "Մոսկովյան փ․ (Կոնսերվատորիա)", "Աբովյան փ․ (Երիտասարդական մ/կ)",
                    "Աբովյան փ․ (Գյուղակադեմիա)", "Աբովյան փ․ (Պլանի գլուխ)", "Մյասնիկյան պ․ (Երիտասարդական մ/կ)", "Մյասնիկյան պ․ (Հերացի խաչմերուկ)",
                    "Մյասնիկյան պ․ (Կենդանաբանական այգի)", "Մյասնիկյան պ․ (Ջրաշխարհ)", "Գայի պ․ (Աքվատեք)", "Գայի պ․ (Գայի արձան)", "Գայի պ․ (Մերսեդեսի սրահ)",
                    "Բադալ Մուրադյան փ․", "Դավիթ Բեկի փ․", "Հունան Ավետիսյան փ․", "Նոր Նորքի 7-րդ զ/ծ", "Վիլնյուսի փ․", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("9", "A", "Սարի թաղ", "Սարի թաղի 12-րդ փ․", "Սարի թաղի 11-րդ փ․", "Սարի թաղի 5-րդ փ․",
                    "Սարի թաղի 1-ին փ․", "Գլինկայի փ․", "Խորենացու փ․ (Սիլաչի)", "Նար-Դոսի փ․ (Սիլաչի խաչմերուկ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)", "Գումի շուկա", "Զավարյան փ․",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("12", "A", "Աերացիա", "Շիրակի փ․ (Ձիարշավարան)", "Շիրակի փ․ (Չարբախի շուկա)", "Արտաշիսյան փ․",
                    "Բագրատունյաց պ․ (Արտաշիսյան խաչմերուկ)", "Բագրատունյաց պ․ (Երևան Սիթի)", "Բագրատունյաց պ․ (Իսակով խաչմերուկ)", "Սեբաստիայի փ․ (Կուրղինյան խաչմերուկ)",
                    "Սեբաստիայի փ․ (Մալաթիայի շուկա)", "Սեբաստիայի փ․ (Տիչինայի խաչմերուկ)", "Սեբաստիայի փ․ (Լենինգրադյան խաչմերուկ)", "Գրիգոր Հասրաթյան փ․", "Ջանիբեկյան փ․",
                    "Բաշինջաղյան փ․", "Մարգարյան փ․ (Պեգաս)", "Մարգարյան փ․ (Հանրապետական հիվ․)", "Հալաբյան փ․ (Ֆիզիկայի խաչմերուկ)", "Դավթաշենի 1-ին թաղ․", "Իոսիֆյան փ․",
                    "Տիգրան Պետրոսյան փ․", "Դավթաշենի 4-րդ թաղ․", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("13", "A", "Գազպրոմ Արմենիա", "Թբիլիսյան խճ․ (Ռադիոկայմ)", "Զաքարիա Քանաքեռցու փ․",
                    "Ազատության պ․ (Ռայկոմ)", "Կոմիտասի պ․ (Լամբադա կամուրջ)", "Կոմիտասի պ․ (Կոմիտասի շուկա)", "Կոմիտասի պ․ (Վրացական խաչմերուկ)",
                    "Կոմիտասի պ․ (Սլավոնական համալսարան)", "Կոմիտասի պ․ (Փափազյան խաչմերուկ)", "Կոմիտասի պ․ (Վաղարշյան խաչմերուկ)", "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)",
                    "Կասյան փ․", "Բաղրամյան պ․ (SAS)", "Բաղրամյան պ․ (Կամոյի դպրոց)", "Բաղրամյան պ․ (Ամերիկյան համալսարան)", "Բաղրամյան պ․ (Սահմանադրական դատարան)",
                    "Բաղրամյան պ․ (Օպերա)", "Սայաթ-Նովա պ․ (Նալբանդյան խաչմերուկ)", "Սայաթ-Նովա պ․ (Ալեք Մանուկյան խաչմերուկ)", "Ռադիոտուն", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("14", "A", "Լեփսիուսի փ․", "Դրոյի փ․", "Պարույր Սևակի փ․", "Ուլնեցու փ․", "Ներսիսյան փ․",
                    "Ազատության պ․ (Ռայկոմ)", "Ազատության պ․ (Նաիրի Զարյան խաչմերուկ)", "Ազատության պ․ (Զինկոմիսարիատ)", "Ազատության պ․ (Հաղթանակի այգի)", "Սարալանջի փ․",
                    "Աբովյան փ․ (Պլանի գլուխ)", "Աբովյան փ․ (Գյուղակադեմիա)", "Աբովյան փ․ (Երիտասարդական մ/կ)", "Մոսկովյան փ․ (Կամերային երաժշտության տուն)",
                    "Խանջյան փ․ (Շախմատի տուն)", "Վերնիսաժ", "Խանջյան փ․ (Լունապարկ)", "Մանկավարժական համալսարան", "Տիգրան Մեծի պ․ (Այրարատ կ/թ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)",
                    "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)", "Տիգրան Մեծի պ․ (Կայարան)", "Արցախի փ․", "Վստրեչի կամուրջ", "Գարեգին Նժդեհի փ․", "Արշակունյաց պ․ (Հայրենիք կ/թ)",
                    "Աշխատանքի հրապարակ (Բանվորի արձան)", "Արշակունյաց պ․ (Դեպի Չարբախ)", "Շիրակի փ․ (Էրեբունի օդանավակայան)", "Արարատյան փ․", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("15", "A", "Նոր Նորքի 6-րդ զ/ծ", "Բադալ Մուրադյան փ․", "Շոպրոնի փ․", "Գյուրջյան փ․", "Ներսոն Սաֆարյան փ․",
                    "Նանսենի փ․", "Գայի պ․ (Գայի արձան)", "Գայի պ․ (Աքվատեք)", "Մյասնիկյան պ․ (Ջրաշխարհ)", "Մյասնիկյան պ․ (Կենդանաբանական այգի)", "Մյասնիկյան պ․ (Հերացի խաչմերուկ)",
                    "Աբովյան փ․ (Պլանի գլուխ)", "Աբովյան փ․ (Գյուղակադեմիա)", "Աբովյան փ․ (Երիտասարդական մ/կ)", "Մոսկովյան փ․ (Կամերային երաժշտության տուն)",
                    "Խանջյան փ․ (Շախմատի տուն)", "Վերնիսաժ", "Խանջյան փ․ (Լունապարկ)", "Մանկավարժական համալսարան", "Ագաթանգեղոսի փ․", "Արշակունյաց պ․ (Կրկես)",
                    "Արշակունյաց պ․ (Սուրմալու)", "Արշակունյաց պ․ (Կոմիտասի այգի)", "Արշակունյաց պ․ (Երևան Մոլ)", "Արշակունյաց պ․ (Հայրենիք կ/թ)", "Գարեգին Նժդեհի փ․",
                    "Գարեգին Նժդեհի հրապարակ", "Բագրատունյաց պ․ (Արտաշիսյան խաչմերուկ)", "Արտաշիսյան փ․", "Շիրակի փ․ (Չարբախի շուկա)", "Շիրակի փ․ (Ձիարշավարան)", "Աերացիա", "",
                    "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("16", "A", "Նուբարաշենի 11-րդ փ․", "Նուբարաշենի 9-րդ փ․", "Նուբարաշենի 10-րդ փ․",
                    "Նուբարաշենի 6-րդ փ․", "Նուբարաշենի խճ․", "Խաչիկ Դաշտենցի փ․", "Էրեբունու թ/ն", "Էրեբունու փ․", "Ազատամարտիկների փ․", "Սասունցի Դավթի փ․",
                    "Տիգրան Մեծի պ․ (Կայարան)", "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)", "Տիգրան Մեծի պ․ (Այրարատ կ/թ)", "Մանկավարժական համալսարան",
                    "Խանջյան փ․ (Լունապարկ)", "Վերնիսաժ", "Խանջյան փ․ (Շախմատի տուն)", "Սայաթ-Նովա պ․ (Ալեք Մանուկյան խաչմերուկ)", "Չարենցի փ․ (Zigzag խանութ-սրահ)",
                    "Չարենցի փ․ (ԵՊՀ)", "Չարենցի փ․ (ՀՀ Ոստիկանություն)", "Բժշկական համալսարան", "Կորյունի փ․ (Ցիտադել)", "Մաշտոցի պ․ (Մատենադարան)",
                    "Մաշտոցի պ․ (Կոնսերվատորիա)", "Մաշտոցի պ․ (Օպերա)", "Բաղրամյան պ․ (Օպերա)", "Բաղրամյան պ․ (Սահմանադրական դատարան)", "Բաղրամյան պ․ (Ամերիկյան համալսարան)",
                    "Բաղրամյան պ․ (Կամոյի դպրոց)", "Բաղրամյան պ․ (SAS)", "Կասյան փ․", "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)", "Կոմիտասի պ․ (Վաղարշյան խաչմերուկ)",
                    "Կոմիտասի պ․ (Փափազյան խաչմերուկ)", "Կոմիտասի պ․ (Սլավոնական համալսարան)", "Կոմիտասի պ․ (Վրացական խաչմերուկ)", "Կոմիտասի պ․ (Կոմիտասի շուկա)",
                    "Կոմիտասի պ․ (Լամբադա կամուրջ)", "Ազատության պ․ (Ռայկոմ)", "Ահարոնյան փ․", "Դրոյի փ․", "Կաթի գ/ն", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("18", "A", "գ. Քասախ", "Վահագնի թաղ․", "Կարմիր խաչ", "Հույսի թաղ․", "Սիլիկյան Նոր խճ․", "Աշտարակի խճ․", "Չաուշի փ․",
                    "Մազմանյան փ․", "Բաշինջաղյան փ․", "Ջանիբեկյան փ․", "Շինարարների փ․", "Արզումանյան փ․", "Հալաբյան փ․ (ԹՈՒՄՈ)",
                    "Հալաբյան փ․ (Կիևյան կամուրջ)", "Կիևյան փ․ (Կիևյան կամուրջ)", "Կիևյան փ․ (Օրբելի խաչմերուկ)", "Կիևյան փ․ (Բարեկամություն)", "Բաղրամյան պ․ (SAS)"
                    , "Բաղրամյան պ․ (Կամոյի դպրոց)", "Բաղրամյան պ․ (Ամերիկյան համալսարան)", "Բաղրամյան պ․ (Սահմանադրական դատարան)", "Բաղրամյան պ․ (Օպերա)",
                    "Մաշտոցի պ․ (Կոնսերվատորիա)", "Մաշտոցի պ․ (Մատենադարան)", "Կորյունի փ․ (Ցիտադել)", "Բժշկական համալսարան", "Չարենցի փ․ (ՀՀ Ոստիկանություն)",
                    "Չարենցի փ․ (ԵՊՀ)", "Չարենցի փ․ (Zigzag խանութ-սրահ)", "Սայաթ-Նովա պ․ (Ալեք Մանուկյան խաչմերուկ)", "Խանջյան փ․ (Շախմատի տուն)", "Վերնիսաժ",
                    "Խանջյան փ․ (Լունապարկ)", "Մանկավարժական համալսարան", "Տիգրան Մեծի պ․ (Այրարատ կ/թ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)", "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)",
                    "Տիգրան Մեծի պ․ (Կայարան)", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("20", "A", "Ավան ", "Դուրյան թաղ․", "Նվեր Սաֆարյան փ․", "Մարշալ Խուդյակովի փ․", "Ալմաթիի փ․",
                    "Մարշալ Բաբաջանյան փ․", "Աճառյան փ․", "Բուսաբանական այգի", "Մյասնիկյան պ․ (Ջրաշխարհ)", "Մյասնիկյան պ․ (Կենդանաբանական այգի)",
                    "Մյասնիկյան պ․ (Հերացի խաչմերուկ)", "Աբովյան փ․ (Պլանի գլուխ)", "Աբովյան փ․ (Գյուղակադեմիա)", "Բժշկական համալսարան", "Նալբանդյան փ․ (ԵՊՏՀ)",
                    "Սայաթ-Նովա պ․ (Նալբանդյան խաչմերուկ)", "Մաշտոցի պ․ (Օպերա)", "Մաշտոցի պ․ (Մարգարյան հիվ․)", "Մաշտոցի պ․ (Ամիրյան խաչմերուկ)",
                    "Խորենացու փ․ (Մաշտոց խաչմերուկ)", "Խորենացու փ․ (Շահումյան հրապ․)", "Բեյրութի փ․", "Գրիգոր Լուսավորիչ (Երևանի քաղաքապետարան)", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("21", "A", "Սարի թաղ", "Սարի թաղի 20-րդ փ․", "Սարի թաղի 21-րդ փ․", "Սարի թաղի 3-րդ փ․",
                    "Սարի թաղի 1-ին փ․", "Խորենացու փ․ (Սիլաչի)", "Նար-Դոսի փ․ (Սիլաչի խաչմերուկ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)", "Տիգրան Մեծի պ․ (Այրարատ կ/թ)",
                    "Մանկավարժական համալսարան", "Խանջյան փ․ (Լունապարկ)", "Վերնիսաժ", "Խանջյան փ․ (Շախմատի տուն)", "Մոսկովյան փ․ (Կամերային երաժշտության տուն)",
                    "Աբովյան փ․ (Երիտասարդական մ/կ)", "Աբովյան փ․ (Գյուղակադեմիա)", "Աբովյան փ․ (Պլանի գլուխ)", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("22", "A", "Նոր Նորքի 9-րդ զ/ծ", "Վիլնյուսի փ․", "Նոր Նորքի 8-րդ զ/ծ", "Մինսկի փ․ (Նոր նորքի 8-րդ զ/ծ)",
                    "Արտեմ Միկոյան փ․", "Բադալ Մուրադյան փ․", "Մյասնիկյան պ․ (Ջրաշխարհ)", "Մյասնիկյան պ․ (Կենդանաբանական այգի)", "Մյասնիկյան պ․ (Հերացի խաչմերուկ)",
                    "Աբովյան փ․ (Պլանի գլուխ)", "Աբովյան փ․ (Գյուղակադեմիա)", "Բժշկական համալսարան", "Նալբանդյան փ․ (ԵՊՏՀ)", "Սայաթ-Նովա պ․ (Նալբանդյան խաչմերուկ)", "Մաշտոցի պ․ (Օպերա)",
                    "Մաշտոցի պ․ (Մարգարյան հիվ․)", "Մաշտոցի պ․ (Ամիրյան խաչմերուկ)", "Ամիրյան փ․", "Հանրապետության Հրապարակ", "Տիգրան Մեծի պ․ (Ֆիրդուսի շուկա)",
                    "Մանկավարժական համալսարան", "Տիգրան Մեծի պ․ (Այրարատ կ/թ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)", "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)", "Տիգրան Մեծի պ․ (Կայարան)",
                    "Արցախի փ․", "Էրեբունու փ․", "Աթոյան փ․", "Այվազովսկու փ․", "Ավանեսովի փ․", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("23", "A", "Ծովակալ Իսակովի պ․", "Առնո Բաբաջանյան փ․", "Գուսան Շերամի փ․", "Օհանովի փ․",
                    "Զորավար Անդրանիկի փ․", "Րաֆֆու փ․", "Րաֆֆու փ․ (Մալաթիայի շուկա)", "Սեբաստիայի փ․ (Մալաթիայի շուկա)", "Սեբաստիայի փ․ (Կուրղինյան խաչմերուկ)",
                    "Ծովակալ Իսակովի պ․ (Սեբաստիայի խաչմերուկ)", "Կիլիկիա ավտոկայան", "Հաղթանակ կամուրջ", "Մաշտոցի պ․ (Ձկան խանութ)", "Մաշտոցի պ․ (Ծածկած շուկա)",
                    "Մաշտոցի պ․ (Ամիրյան խաչմերուկ)", "Մաշտոցի պ․ (Մարգարյան հիվ․)", "Մաշտոցի պ․ (Օպերա)", "Մաշտոցի պ․ (Կոնսերվատորիա)", "Մաշտոցի պ․ (Մատենադարան)",
                    "Կորյունի փ․ (Ցիտադել)", "Աբովյան փ․ (Գյուղակադեմիա)", "Սարալանջի փ․", "Ազատության պ․ (Հաղթանակի այգի)", "Ազատության պ․ (Զինկոմիսարիատ)",
                    "Ազատության պ․ (Նաիրի Զարյան խաչմերուկ)", "Ազատության պ․ (Ռայկոմ)", "Պարույր Սևակի փ․", "Ռուբինյանց փ․ (Երևան Սիթի)", "Ռուբինյանց փ․ (Ալմաստ գ/ն)",
                    "Գայի պ․ (Աքվատեք)", "Գայի պ․ (Գայի արձան)", "Գայի պ․ (Մերսեդեսի սրահ)", "Բադալ Մուրադյան փ․", "Նոր Նորքի 6-րդ զ/ծ", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("24", "A", "Ռուբինյանց փ․ (Ալմաստ գ/ն)", "Ռուբինյանց փ․ (Երևան Սիթի)",
                    "Ռուբինյանց փ․ (Ահարոնյան փ․)", "Դավիթ Անհաղթի փ․ (Դրոյի խաչմերուկ)", "Դավիթ Անհաղթի փ․ (Կերամա Մարացի)", "Դավիթ Անհաղթի փ․ (թաղապետարան)",
                    "Ազատության պ․ (Նաիրի Զարյան խաչմերուկ)", "Ազատության պ․ (Զինկոմիսարիատ)", "Ազատության պ․ (Հաղթանակի այգի)", "Սարալանջի փ․", "Կորյունի փ․ (Ցիտադել)",
                    "Մաշտոցի պ․ (Մատենադարան)", "Մաշտոցի պ․ (Կոնսերվատորիա)", "Մաշտոցի պ․ (Օպերա)", "Մաշտոցի պ․ (Մարգարյան հիվ․)", "Մաշտոցի պ․ (Ամիրյան խաչմերուկ)",
                    "Մաշտոցի պ․ (Ծածկած շուկա)", "Մաշտոցի պ․ (Ձկան խանութ)", "Գրիգոր Լուսավորիչ (Երևանի քաղաքապետարան)", "Արշակունյաց պ․ (Կրկես)",
                    "Արշակունյաց պ․ (Սուրմալու)", "Արշակունյաց պ․ (Կոմիտասի այգի)", "Արշակունյաց պ․ (Երևան Մոլ)", "Արշակունյաց պ․ (Հայրենիք կ/թ)", "Գարեգին Նժդեհի փ․",
                    "Գարեգին Նժդեհի հրապարակ", "Բագրատունյաց պ․ (Արտաշիսյան խաչմերուկ)", "Բագրատունյաց պ․ (Երևան Սիթի)", "Բագրատունյաց պ․ (Իսակով խաչմերուկ)",
                    "Սեբաստիայի փ․ (Կուրղինյան խաչմերուկ)", "Կուրղինյան փ․", "Վանթյան փ․", "Վարուժանի փ․", "Մալաթիա բ/կ", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("26", "A", "ՀԱԹ", "Զորավար Անդրանիկի փ․", "Րաֆֆու փ․", "Րաֆֆու փ․ (Մալաթիայի շուկա)",
                    "Սեբաստիայի փ․ (Մալաթիայի շուկա)", "Սեբաստիայի փ․ (Տիչինայի խաչմերուկ)", "Սեբաստիայի փ․ (Լենինգրադյան խաչմերուկ)", "Լենինգրադյան փ․ (Եվրովագեն)",
                    "Լենինգրադյան փ․ (Շինարարների խաչմերուկ)", "Լենինգրադյան փ․ (Մոնթե Մելքոնյան խաչմերուկ)", "Ծիծեռնակաբերդի խճ․", "Դալմա Գարդեն Մոլ", "Աթենքի փ․",
                    "Հրազդան մ/դ", "Հաղթանակ կամուրջ", "Արգիշտի փ․", "Գրիգոր Լուսավորիչ (Երևանի քաղաքապետարան)", "Մաշտոցի պ․ (Ձկան խանութ)", "Մաշտոցի պ․ (Ծածկած շուկա)",
                    "Մաշտոցի պ․ (Ամիրյան խաչմերուկ)", "Մաշտոցի պ․ (Մարգարյան հիվ․)", "Մաշտոցի պ․ (Օպերա)", "Մաշտոցի պ․ (Կոնսերվատորիա)", "Մոսկովյան փ․ (Կոնսերվատորիա)",
                    "Աբովյան փ․ (Երիտասարդական մ/կ)", "Աբովյան փ․ (Գյուղակադեմիա)", "Աբովյան փ․ (Պլանի գլուխ)", "Մյասնիկյան պ․ (Հերացի խաչմերուկ)",
                    "Մյասնիկյան պ․ (Կենդանաբանական այգի)", "Մյասնիկյան պ․ (Ջրաշխարհ)", "Գայի պ․ (Աքվատեք)", "Գայի պ․ (Գայի արձան)", "Գայի պ․ (Մերսեդեսի սրահ)",
                    "Բադալ Մուրադյան փ․", "Դավիթ Բեկի փ․", "Հունան Ավետիսյան փ․", "Նոր Նորքի 7-րդ զ/ծ", "Վիլնյուսի փ․", "Նոր Նորքի 9-րդ զ/ծ", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("27", "A", "16-րդ թաղամաս", "Նորաշեն թաղ.", "Մելքումովի փ.", "Բեկնազարյան փ․", "Բաշինջաղյան փ․",
                    "Մարգարյան փ․ (Պեգաս)", "Մարգարյան փ․ (Հանրապետական հիվ․)", "Հալաբյան փ․ (Ֆիզիկայի խաչմերուկ)", "Հալաբյան փ․ (ԹՈՒՄՈ)", "Էստոնական փ․", "Շինարարների փ․",
                    "Արզումանյան փ․", "Հալաբյան փ․ (Կիևյան կամուրջ)", "Լենինգրադյան փ․ (Կիևյան կամուրջ)", "Ծիծեռնակաբերդի խճ․", "Դալմա Գարդեն Մոլ", "Աթենքի փ․",
                    "Հրազդան մ/դ", "Հաղթանակ կամուրջ", "Մաշտոցի պ․ (Ձկան խանութ)", "Մաշտոցի պ․ (Ծածկած շուկա)", "Մաշտոցի պ․ (Ամիրյան խաչմերուկ)", "Մաշտոցի պ․ (Մարգարյան հիվ․)"
                    , "Մաշտոցի պ․ (Օպերա)", "Մաշտոցի պ․ (Կոնսերվատորիա)", "Մաշտոցի պ․ (Մատենադարան)", "Կորյունի փ․ (Ցիտադել)", "Բժշկական համալսարան",
                    "Չարենցի փ․ (ՀՀ Ոստիկանություն)", "Հերացու փ․", "Արմենակյան փ․", "Հովսեփյան փ․", "Հեռուստակենտրոն", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("28", "A", "Նոր Նորքի 8-րդ զ/ծ", "Մինսկի փ․ (Նոր նորքի 8-րդ զ/ծ)", "Արտեմ Միկոյան փ․",
                    "Բադալ Մուրադյան փ․", "Գայի պ․ (Մերսեդեսի սրահ)", "Գայի պ․ (Գայի արձան)", "Գայի պ․ (Աքվատեք)", "Ռուբինյանց փ․ (Ալմաստ գ/ն)", "Ռուբինյանց փ․ (Երևան Սիթի)",
                    "Ռուբինյանց փ․ (Ահարոնյան փ․)", "Դավիթ Անհաղթի փ․ (Դրոյի խաչմերուկ)", "Դավիթ Անհաղթի փ․ (Կերամա Մարացի)", "Դավիթ Անհաղթի փ․ (թաղապետարան)",
                    "Կոմիտասի պ․ (Լամբադա կամուրջ)", "Կոմիտասի պ․ (Կոմիտասի շուկա)", "Կոմիտասի պ․ (Վրացական խաչմերուկ)", "Կոմիտասի պ․ (Սլավոնական համալսարան)",
                    "Կոմիտասի պ․ (Փափազյան խաչմերուկ)", "Կոմիտասի պ․ (Վաղարշյան խաչմերուկ)", "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)", "Կասյան փ․", "Կիևյան փ․ (Բարեկամություն)",
                    "Կիևյան փ․ (Օրբելի խաչմերուկ)", "Կիևյան փ․ (Կիևյան կամուրջ)", "Հալաբյան փ․ (Կիևյան կամուրջ)", "Հալաբյան փ․ (ԹՈՒՄՈ)", "Հալաբյան փ․ (Ֆիզիկայի խաչմերուկ)",
                    "Մարգարյան փ․ (Հանրապետական հիվ․)", "Մարգարյան փ․ (Պեգաս)", "Բաշինջաղյան փ․", "Մազմանյան փ․", "Չաուշի փ․", "Աշտարակի խճ․", "Հույսի թաղ․", "", "", "", "",
                    "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("32", "A", "Հյուսիսային ավտոկայան", "Գազպրոմ Արմենիա․", "Թբիլիսյան խճ․ (Ռադիոկայմ)",
                    "Զաքարիա Քանաքեռցու փ․", "Ազատության պ․ (Ռայկոմ)", "Ազատության պ․ (Նաիրի Զարյան խաչմերուկ)", "Ազատության պ․ (Զինկոմիսարիատ)", "Ազատության պ․ (Հաղթանակի այգի)",
                    "Սարալանջի փ․", "Տերյան փ․", "Կորյունի փ․ (Ցիտադել)", "Մաշտոցի պ․ (Մատենադարան)", "Մաշտոցի պ․ (Կոնսերվատորիա)", "Մաշտոցի պ․ (Օպերա)",
                    "Մաշտոցի պ․ (Մարգարյան հիվ․)", "Ամիրյան փ․", "Հանրապետության Հրապարակ", "Տիգրան Մեծի պ․ (Ֆիրդուսի շուկա)", "Մանկավարժական համալսարան", "Ագաթանգեղոսի փ․",
                    "Արշակունյաց պ․ (Կրկես)", "Արշակունյաց պ․ (Սուրմալու)", "Արշակունյաց պ․ (Կոմիտասի այգի)", "Արշակունյաց պ․ (Երևան Մոլ)", "Արշակունյաց պ․ (Հայրենիք կ/թ)",
                    "Գարեգին Նժդեհի փ․", "Գարեգին Նժդեհի հրապարակ", "Մանանդյան փ.", "Արաքս մ/դ", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("33", "A", "Դավթաշենի 4-րդ թաղ.", "Տիգրան Պետրոսյան փ․", "Դավթաշենի 1-ին թաղ․", "Իոսիֆյան փ․",
                    "Հալաբյան փ․ (Ֆիզիկայի խաչմերուկ)", "Հալաբյան փ․ (ԹՈՒՄՈ)", "Հալաբյան փ․ (Կիևյան կամուրջ)", "Լենինգրադյան փ․ (Կիևյան կամուրջ)", "Ծիծեռնակաբերդի խճ․",
                    "Դալմա Գարդեն Մոլ", "Աթենքի փ․", "Հրազդան մ/դ", "Հաղթանակ կամուրջ", "Մաշտոցի պ․ (Ձկան խանութ)", "Մաշտոցի պ․ (Ծածկած շուկա)", "Ամիրյան փ․",
                    "Հանրապետության Հրապարակ", "Տիգրան Մեծի պ․ (Ֆիրդուսի շուկա)", "Մանկավարժական համալսարան", "Տիգրան Մեծի պ․ (Այրարատ կ/թ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)",
                    "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)", "Տիգրան Մեծի պ․ (Կայարան)", "Արցախի ․", "Վստրեչի կամուրջ", "Գարեգին Նժդեհի փ․", "Արշակունյաց պ․ (Հայրենիք կ/թ)",
                    "Աշխատանքի հրապարակ (Բանվորի արձան)", "Նորագավթի 1-ին փ․", "Արտաշատի խճ․", "գ․ Խարբերդ", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("34", "A", "գ. Մուշավան", "գ. Վարդաշեն", "Մահարու փ․", "Նուբարաշենի փ․", "Դավիթ Բեկի փ․",
                    "Ազատամարտիկների փ․", "Սասունցի Դավթի փ․", "Տիգրան Մեծի պ․ (Կայարան)", "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)",
                    "Տիգրան Մեծի պ․ (Այրարատ կ/թ)", "Մանկավարժական համալսարան", "Տիգրան Մեծի պ․ (Ֆիրդուսի շուկա)", "Հանրապետության Հրապարակ", "Ամիրյան փ․",
                    "Մաշտոցի պ․ (Ամիրյան խաչմերուկ)", "Մաշտոցի պ․ (Մարգարյան հիվ․)", "Մաշտոցի պ․ (Օպերա)", "Մաշտոցի պ․ (Կոնսերվատորիա)", "Մաշտոցի պ․ (Մատենադարան)",
                    "Կորյունի փ․ (Ցիտադել)", "Աբովյան փ․ (Գյուղակադեմիա)", "Աբովյան փ․ (Պլանի գլուխ)", "Սարալանջի փ․", "Ազատության պ․ (Հաղթանակի այգի)",
                    "Գեներալ Բաբայանի փ․", "Արաբկիրի 17-րդ փ․", "Արաբկիրի 29-րդ փ․", "Ռիգայի փ․", "Հրաչյա Քոչար փ․ (Վրացական խաչմերուկ)", "Հրաչյա Քոչար փ․ (Փափազյան խաչմերուկ)",
                    "Հրաչյա Քոչար փ․ (Վաղարշյան խաչմերուկ)", "Վաղարշյան փ․", "Դավթաշենի կամուրջ", "Դավթաշենի 1-ին թաղ․", "Տիգրան Պետրոսյան փ․", "Դավթաշենի 2-րդ թաղ.", "", "",
                    "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("35", "A", "Նոր Նորքի 4-րդ զ/ծ", "Գյուլիքեխվյան փ․", "Գալշոյան փ․", "Արտեմ Միկոյան փ․",
                    "Բադալ Մուրադյան փ․", "Գայի պ․ (Մերսեդեսի սրահ)", "Գայի պ․ (Գայի արձան)", "Գայի պ․ (Աքվատեք)", "Մյասնիկյան պ․ (Ջրաշխարհ)",
                    "Մյասնիկյան պ․ (Կենդանաբանական այգի)", "Մյասնիկյան պ․ (Հերացի խաչմերուկ)", "Աբովյան փ․ (Պլանի գլուխ)", "Աբովյան փ․ (Գյուղակադեմիա)",
                    "Աբովյան փ․ (Երիտասարդական մ/կ)", "Մոսկովյան փ․ (Կոնսերվատորիա)", "Մաշտոցի պ․ (Կոնսերվատորիա)", "Մաշտոցի պ․ (Օպերա)", "Բաղրամյան պ․ (Օպերա)",
                    "Բաղրամյան պ․ (Սահմանադրական դատարան)", "Բաղրամյան պ․ (Ամերիկյան համալսարան)", "Բաղրամյան պ․ (Կամոյի դպրոց)", "Բաղրամյան պ․ (SAS)",
                    "Կիևյան փ․ (Բարեկամություն)", "Կիևյան փ․ (Օրբելի խաչմերուկ)", "Կիևյան փ․ (Կիևյան կամուրջ)", "Լենինգրադյան փ․ (Կիևյան կամուրջ)",
                    "Լենինգրադյան փ․ (Մոնթե Մելքոնյան խաչմերուկ)", "Լենինգրադյան փ․ (Շինարարների խաչմերուկ)", "Լենինգրադյան փ․ (Եվրովագեն)",
                    "Սեբաստիայի փ․ (Լենինգրադյան խաչմերուկ)", "Սեբաստիայի փ․ (Տիչինայի խաչմերուկ)", "Սեբաստիայի փ․ (Մալաթիայի շուկա)", "Րաֆֆու փ․ (Մալաթիայի շուկա)",
                    "Րաֆֆու փ․", "Զորավար Անդրանիկի փ․", "Օհանովի փ․", "Գուսան Շերամի փ․", "Առնո Բաբաջանյան փ․", "Ծովակալ Իսակովի պ․", "գ․ Արգավանդ", "գ․ Գեղանիստ",
                    "գ․ Ազատաշեն", "գ. Խաչփառ", "", ""));

            ////61A soon -> edit
//            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("36ա", "A", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""
//                    , "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("37", "A", "Էրեբունու զ/ծ ", "Տիտոգրադյան փ․", "Այվազովսկու փ․", "Էրեբունու փ․",
                    "Արցախի փ․", "Տիգրան Մեծի պ․ (Կայարան)", "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)", "Տիգրան Մեծի պ․ (Այրարատ կ/թ)",
                    "Մանկավարժական համալսարան", "Տիգրան Մեծի պ․ (Ֆիրդուսի շուկա)", "Հանրապետության Հրապարակ", "Ամիրյան փ․", "Մաշտոցի պ․ (Ամիրյան խաչմերուկ)",
                    "Մաշտոցի պ․ (Մարգարյան հիվ․)", "Մաշտոցի պ․ (Օպերա)", "Բաղրամյան պ․ (Օպերա)", "Բաղրամյան պ․ (Սահմանադրական դատարան)",
                    "Բաղրամյան պ․ (Ամերիկյան համալսարան)", "Բաղրամյան պ․ (Կամոյի դպրոց)", "Բաղրամյան պ․ (SAS)", "Կասյան փ․",
                    "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)", "Կոմիտասի պ․ (Վաղարշյան խաչմերուկ)", "Կոմիտասի պ․ (Փափազյան խաչմերուկ)",
                    "Կոմիտասի պ․ (Սլավոնական համալսարան)", "Կոմիտասի պ․ (Վրացական խաչմերուկ)", "Կոմիտասի պ․ (Կոմիտասի շուկա)", "Կոմիտասի պ․ (Լամբադա կամուրջ)",
                    "Դավիթ Անհաղթի փ․ (թաղապետարան)", "Դավիթ Անհաղթի փ․ (Կերամա Մարացի)", "Դավիթ Անհաղթի փ․ (Դրոյի խաչմերուկ)", "Ռուբինյանց փ․ (Ահարոնյան փ․)",
                    "Ռուբինյանց փ․ (Երևան Սիթի)", "Ռուբինյանց փ․ (Ալմաստ գ/ն)", "Գայի պ․ (Աքվատեք)", "Լվովյան փ․", "Նոր Նորքի 1-ին զ/ծ", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("38", "A", "գ. Այնթապ", "Արտաշատի խճ․", "Նորագավթի 1-ին փ․", "Աշխատանքի հրապարակ (Բանվորի արձան)",
                    "Բագրատունյաց պ․ (Բանվորի արձան)", "Գարեգին Նժդեհի հրապարակ", "Գարեգին Նժդեհի փ․", "Արշակունյաց պ․ (Հայրենիք կ/թ)", "Արշակունյաց պ․ (Երևան Մոլ)",
                    "Արշակունյաց պ․ (Կոմիտասի այգի)", "Արշակունյաց պ․ (Սուրմալու)", "Արշակունյաց պ․ (Կրկես)", "Ագաթանգեղոսի փ․", "Մանկավարժական համալսարան",
                    "Խանջյան փ․ (Լունապարկ)", "Վերնիսաժ", "Սայաթ-Նովա պ․ (Նալբանդյան խաչմերուկ)", "Սայաթ-Նովա պ․ (Ալեք Մանուկյան խաչմերուկ)", "Չարենցի փ․ (Zigzag խանութ-սրահ)"
                    , "Չարենցի փ․ (ԵՊՀ)", "Չարենցի փ․ (ՀՀ Ոստիկանություն)", "Բժշկական համալսարան", "Աբովյան փ․ (Երիտասարդական մ/կ)", "Աբովյան փ․ (Գյուղակադեմիա)",
                    "Աբովյան փ․ (Պլանի գլուխ)", "Մյասնիկյան պ․ (Հերացի խաչմերուկ)", "Մյասնիկյան պ․ (Կենդանաբանական այգի)", "Մյասնիկյան պ․ (Ջրաշխարհ)", "Գայի պ․ (Աքվատեք)",
                    "Գայի պ․ (Գայի արձան)", "Ստեփանյան փ․", "Մոլդովական փ․", "Նոր Նորքի 2-րդ զ/ծ", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("39", "A", "16-րդ թաղամաս", "Նորաշեն թաղ.", "Մելքումովի փ.", "Բեկնազարյան փ․", "15-րդ թաղամաս", "Մազմանյան փ․", "Շիրազի փ․",
                    "Գրիգոր Հասրաթյան փ․", "Սեբաստիայի փ․ (Լենինգրադյան խաչմերուկ)", "Սեբաստիայի փ․ (Տիչինայի խաչմերուկ)", "Սեբաստիայի փ․ (Մալաթիայի շուկա)",
                    "Սեբաստիայի փ․ (Կուրղինյան խաչմերուկ)", "Բագրատունյաց պ․ (Իսակով խաչմերուկ)", "Բագրատունյաց պ․ (Երևան Սիթի)", "Բագրատունյաց պ․ (Արտաշիսյան խաչմերուկ)",
                    "Գարեգին Նժդեհի հրապարակ", "Գարեգին Նժդեհի փ․", "Վստրեչի կամուրջ", "Արցախի փ․", "Էրեբունու փ․", "Այվազովսկու փ․", "Տիտոգրադյան փ․", "Էրեբունու զ/ծ", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("41", "A", "Ավան ", "Մարշալ Բաբաջանյան փ․", "Աճառյան փ․", "Բուսաբանական այգի",
                    "Մյասնիկյան պ․ (Ջրաշխարհ)", "Մյասնիկյան պ․ (Կենդանաբանական այգի)", "Մյասնիկյան պ․ (Հերացի խաչմերուկ)", "Աբովյան փ․ (Պլանի գլուխ)",
                    "Աբովյան փ․ (Գյուղակադեմիա)", "Բժշկական համալսարան", "Նալբանդյան փ․ (ԵՊՏՀ)", "Սայաթ-Նովա պ․ (Նալբանդյան խաչմերուկ)", "Վերնիսաժ", "Խանջյան փ․ (Լունապարկ)",
                    "Մանկավարժական համալսարան", "Տիգրան Մեծի պ․ (Այրարատ կ/թ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)", "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)", "Տիգրան Մեծի պ․ (Կայարան)",
                    "Արցախի փ․", "Էրեբունու փ․", "Այվազովսկու փ․", "Տիտոգրադյան փ․", "Խաղաղ Դոնի փ․", "Էրեբունու զ/ծ", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("42", "A", "Նոր Նորքի 8-րդ զ/ծ", "Մինսկի փ․ (Նոր նորքի 8-րդ զ/ծ)", "Արտեմ Միկոյան փ․",
                    "Բադալ Մուրադյան փ․", "Գայի պ․ (Մերսեդեսի սրահ)", "Գայի պ․ (Գայի արձան)", "Գայի պ․ (Աքվատեք)", "Մյասնիկյան պ․ (Ջրաշխարհ)", "Մյասնիկյան պ․ (Կենդանաբանական այգի)",
                    "Մյասնիկյան պ․ (Հերացի խաչմերուկ)", "Աբովյան փ․ (Պլանի գլուխ)", "Աբովյան փ․ (Գյուղակադեմիա)", "Բժշկական համալսարան", "Նալբանդյան փ․ (ԵՊՏՀ)",
                    "Սայաթ-Նովա պ․ (Նալբանդյան խաչմերուկ)", "Սայաթ-Նովա պ․ (Ալեք Մանուկյան խաչմերուկ)", "Ալեք-Մանուկյան փ․", "Երվանդ Քոչար փ․", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)",
                    "Տիգրան Մեծի պ․ (Այրարատ կ/թ)", "Մանկավարժական համալսարան", "Ագաթանգեղոսի փ․", "Արշակունյաց պ․ (Կրկես)", "Արշակունյաց պ․ (Սուրմալու)",
                    "Արշակունյաց պ․ (Կոմիտասի այգի)", "Արշակունյաց պ․ (Երևան Մոլ)", "Արշակունյաց պ․ (Հայրենիք կ/թ)", "Գարեգին Նժդեհի փ․", "Գարեգին Նժդեհի հրապարակ",
                    "Մանանդյան փ.", "Արաքս մ/դ", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("44", "A", "Տիչինայի փ․", "Զորավար Անդրանիկի փ․", "Օհանովի փ․", "Գուսան Շերամի փ․",
                    "Րաֆֆու փ․", "Րաֆֆու փ․ (Մալաթիայի շուկա)", "Սեբաստիայի փ․ (Մալաթիայի շուկա)", "Սեբաստիայի փ․ (Կուրղինյան խաչմերուկ)", "Բագրատունյաց պ․ (Իսակով խաչմերուկ)",
                    "Բագրատունյաց պ․ (Երևան Սիթի)", "Բագրատունյաց պ․ (Արտաշիսյան խաչմերուկ)", "Գարեգին Նժդեհի հրապարակ", "Գարեգին Նժդեհի փ․", "Վստրեչի կամուրջ", "Արցախի փ․",
                    "Տիգրան Մեծի պ․ (Կայարան)", "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)", "Տիգրան Մեծի պ․ (Այրարատ կ/թ)", "Մանկավարժական համալսարան",
                    "Տիգրան Մեծի պ․ (Ֆիրդուսի շուկա)", "Հանրապետության Հրապարակ", "Ամիրյան փ․", "Մաշտոցի պ․ (Ամիրյան խաչմերուկ)", "Մաշտոցի պ․ (Մարգարյան հիվ․)",
                    "Մաշտոցի պ․ (Օպերա)", "Մոսկովյան փ․ (Կոնսերվատորիա)", "Աբովյան փ․ (Երիտասարդական մ/կ)", "Աբովյան փ․ (Գյուղակադեմիա)", "Աբովյան փ․ (Պլանի գլուխ)",
                    "Մյասնիկյան պ․ (Հերացի խաչմերուկ)", "Մյասնիկյան պ․ (Կենդանաբանական այգի)", "Մյասնիկյան պ․ (Ջրաշխարհ)", "Գայի պ․ (Աքվատեք)", "Գայի պ․ (Գայի արձան)",
                    "Ներսոն Սաֆարյան փ․", "Գյուրջյան փ․ ", "Սուրբ Գրիգոր Լուսավորիչ բ/կ", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("45", "A", "Մարաշ", "Նորքի 13-րդ փ․", "Նորքի 9-րդ փ․", "Նորքի 6-րդ փ․", "Նորքի 5-րդ փ․",
                    "Նորքի 8-րդ փ․", "Արմենակյան փ․", "Սարալանջի փ․", "Հերացու փ․", "Չարենցի փ․ (ՀՀ Ոստիկանություն)", "Բժշկական համալսարան", "Կորյունի փ․ (Ցիտադել)",
                    "Մաշտոցի պ․ (Մատենադարան)", "Մաշտոցի պ․ (Կոնսերվատորիա)", "Մաշտոցի պ․ (Օպերա)", "Բաղրամյան պ․ (Օպերա)", "Բաղրամյան պ․ (Սահմանադրական դատարան)",
                    "Բաղրամյան պ․ (Ամերիկյան համալսարան)", "Բաղրամյան պ․ (Կամոյի դպրոց)", "Բաղրամյան պ․ (SAS)", "Կասյան փ․", "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)",
                    "Վաղարշյան փ․", "Սասնա Ծռերի փ․", "Դավթաշենի 1-ին թաղ․", "Տիգրան Պետրոսյան փ․", "Դավթաշենի 4-րդ թաղ․", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("46", "A", "Առինջ Մոլ", "Հյուսիսային ավտոկայան", "Գազպրոմ Արմենիա", "Թբիլիսյան խճ․ (Ռադիոկայմ)",
                    "Զաքարիա Քանաքեռցու փ․", "Թբիլիսյան խճ․ (Լամպերի լիճ)", "Ազատության պ․ (Ռայկոմ)", "Ազատության պ․ (Նաիրի Զարյան խաչմերուկ)", "Ազատության պ․ (Զինկոմիսարիատ)",
                    "Ազատության պ․ (Հաղթանակի այգի)", "Սարալանջի փ․", "Աբովյան փ․ (Պլանի գլուխ)", "Աբովյան փ․ (Գյուղակադեմիա)", "Աբովյան փ․ (Երիտասարդական մ/կ)",
                    "Մոսկովյան փ․ (Կամերային երաժշտության տուն)", "Խանջյան փ․ (Շախմատի տուն)", "Վերնիսաժ", "Խանջյան փ․ (Լունապարկ)", "Մանկավարժական համալսարան",
                    "Տիգրան Մեծի պ․ (Այրարատ կ/թ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)", "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)", "Տիգրան Մեծի պ․ (Կայարան)", "Արցախի փ․", "Էրեբունու փ․",
                    "Այվազովսկու փ․", "Տիտոգրադյան փ․", "Խաղաղ Դոնի փ․", "Էրեբունու զ/ծ", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("47", "A", "գ. Առինջ", "Աճառյան փ.", "Գազպրոմ Արմենիա", "Թբիլիսյան խճ․ (Ռադիոկայմ)",
                    "Զաքարիա Քանաքեռցու փ․", "Թբիլիսյան խճ․ (Լամպերի լիճ)", "Ազատության պ․ (Ռայկոմ)", "Կոմիտասի պ․ (Լամբադա կամուրջ)", "Կոմիտասի պ․ (Կոմիտասի շուկա)",
                    "Կոմիտասի պ․ (Վրացական խաչմերուկ)", "Կոմիտասի պ․ (Սլավոնական համալսարան)", "Կոմիտասի պ․ (Փափազյան խաչմերուկ)", "Կոմիտասի պ․ (Վաղարշյան խաչմերուկ)",
                    "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)", "Կասյան փ․", "Բաղրամյան պ․ (SAS)", "Բաղրամյան պ․ (Կամոյի դպրոց)", "Բաղրամյան պ․ (Ամերիկյան համալսարան)",
                    "Բաղրամյան պ․ (Սահմանադրական դատարան)", "Բաղրամյան պ․ (Օպերա)", "Մաշտոցի պ․ (Օպերա)", "Մաշտոցի պ․ (Մարգարյան հիվ․)", "Մաշտոցի պ․ (Ամիրյան խաչմերուկ)",
                    "Մաշտոցի պ․ (Ծածկած շուկա)", "Մաշտոցի պ․ (Ձկան խանութ)", "Հաղթանակ կամուրջ", "Ծովակալ Իսակովի պ․", "Կիլիկիա ավտոկայան", "Սեբաստիայի փ․ (Կուրղինյան խաչմերուկ)",
                    "Սեբաստիայի փ․ (Մալաթիայի շուկա)", "Րաֆֆու փ․ (Մալաթիայի շուկա)", "Րաֆֆու փ․", "Զորավար Անդրանիկի փ․", "Առնո Բաբաջանյան փ․", "Շահումյանի 4-րդ փ․", "Եռաբլուր",
                    "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("53", "A", "Նոր Նորքի 9-րդ զ/ծ", "Վիլնյուսի փ․", "Նոր Նորքի 7-րդ զ/ծ", "Հունան Ավետիսյան փ․", "Դավիթ Բեկի փ․",
                    "Բադալ Մուրադյան փ․", "Գայի պ․ (Մերսեդեսի սրահ)", "Գայի պ․ (Գայի արձան)", "Գայի պ․ (Աքվատեք)", "Մյասնիկյան պ․ (Ջրաշխարհ)", "Մյասնիկյան պ․ (Կենդանաբանական այգի)",
                    "Մյասնիկյան պ․ (Հերացի խաչմերուկ)", "Աբովյան փ․ (Պլանի գլուխ)", "Աբովյան փ․ (Գյուղակադեմիա)", "Աբովյան փ․ (Երիտասարդական մ/կ)",
                    "Մոսկովյան փ․ (Կամերային երաժշտության տուն)", "Խանջյան փ․ (Շախմատի տուն)", "Վերնիսաժ", "Խանջյան փ․ (Լունապարկ)", "Մանկավարժական համալսարան", "Ագաթանգեղոսի փ․",
                    "Արշակունյաց պ․ (Կրկես)", "Արշակունյաց պ․ (Սուրմալու)", "Արշակունյաց պ․ (Կոմիտասի այգի)", "Արշակունյաց պ․ (Երևան Մոլ)", "Արշակունյաց պ․ (Հայրենիք կ/թ)",
                    "Գարեգին Նժդեհի փ․", "Գարեգին Նժդեհի հրապարակ", "Բագրատունյաց պ․ (Արտաշիսյան խաչմերուկ)", "Բագրատունյաց պ․ (Երևան Սիթի)", "Բագրատունյաց պ․ (Իսակով խաչմերուկ)",
                    "Սեբաստիայի փ․ (Կուրղինյան խաչմերուկ)", "Սեբաստիայի փ․ (Մալաթիայի շուկա)", "Րաֆֆու փ․ (Մալաթիայի շուկա)", "Րաֆֆու փ․", "Զորավար Անդրանիկի փ․",
                    "Առնո Բաբաջանյան փ․", "Շահումյանի 4-րդ փ․", "Եռաբլուր", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("54", "A", "Ավան-Առինջ", "Տաշքենդի փ․", "Մարշալ Բաբաջանյան փ․", "Աճառյան փ․", "Բուսաբանական այգի",
                    "Մյասնիկյան պ․ (Ջրաշխարհ)", "Մյասնիկյան պ․ (Կենդանաբանական այգի)", "Մյասնիկյան պ․ (Հերացի խաչմերուկ)", "Աբովյան փ․ (Պլանի գլուխ)", "Աբովյան փ․ (Գյուղակադեմիա)",
                    "Աբովյան փ․ (Գյուղակադեմիա)", "Աբովյան փ․ (Երիտասարդական մ/կ)", "Մոսկովյան փ․ (Կոնսերվատորիա)", "Մաշտոցի պ․ (Կոնսերվատորիա)", "Մաշտոցի պ․ (Օպերա)",
                    "Մաշտոցի պ․ (Մարգարյան հիվ․)", "Մաշտոցի պ․ (Ամիրյան խաչմերուկ)", "Ամիրյան փ․", "Հանրապետության Հրապարակ", "Տիգրան Մեծի պ․ (Ֆիրդուսի շուկա)",
                    "Մանկավարժական համալսարան", "Ագաթանգեղոսի փ․", "Արշակունյաց պ․ (Կրկես)", "Արշակունյաց պ․ (Սուրմալու)", "Արշակունյաց պ․ (Կոմիտասի այգի)",
                    "Արշակունյաց պ․ (Երևան Մոլ)", "Արշակունյաց պ․ (Հայրենիք կ/թ)", "Գարեգին Նժդեհի փ․", "Գարեգին Նժդեհի հրապարակ", "Բագրատունյաց պ․ (Արտաշիսյան խաչմերուկ)",
                    "Արտաշիսյան փ․", "Շիրակի փ․ (Էրեբունի օդանավակայան)", "Արարատյան փ․", "Ներքին Չարբախի 1-ին փ․", "գ. Նորաբաց", "գ.Դաշտավան", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("55", "A", "Հայ֊Բելոռուսական ա/կ", "Շիրակի փ․ (Չարբախի շուկա)", "Արտաշիսյան փ․",
                    "Բագրատունյաց պ․ (Արտաշիսյան խաչմերուկ)", "Բագրատունյաց պ․ (Երևան Սիթի)", "Բագրատունյաց պ․ (Իսակով խաչմերուկ)", "Սեբաստիայի փ․ (Կուրղինյան խաչմերուկ)",
                    "Կուրղինյան փ․", "Վանթյան փ․", "Վարուժանի փ․", "Սեբաստիայի փ․ (Մալաթիայի շուկա)", "Սեբաստիայի փ․ (Տիչինայի խաչմերուկ)", "Սեբաստիայի փ․ (Լենինգրադյան խաչմերուկ)",
                    "Լենինգրադյան փ․ (Եվրովագեն)", "Լենինգրադյան փ․ (Մոնթե Մելքոնյան խաչմերուկ)", "Լենինգրադյան փ․ (Կիևյան կամուրջ)", "Հալաբյան փ․ (Կիևյան կամուրջ)",
                    "Հալաբյան փ․ (ԹՈՒՄՈ)", "Արզումանյան փ․", "Շինարարների փ․", "Աբելյան փ․", "Հալաբյան փ․ (Ֆիզիկայի խաչմերուկ)", "Մարգարյան փ․ (Հանրապետական հիվ․)", "Ֆուչիկի փ․",
                    "Մելքումովի փ.", "Նորաշեն թաղ.", "16-րդ թաղամաս", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("57", "A", "15-րդ թաղամաս", "Մազմանյան փ․", "Չաուշի փ․", "Մելքումովի փ.", "Ֆուչիկի փ․",
                    "Մարգարյան փ․ (Հանրապետական հիվ․)", "Հալաբյան փ․ (Ֆիզիկայի խաչմերուկ)", "Հալաբյան փ․ (Ֆիզիկայի խաչմերուկ)", "Հալաբյան փ․ (ԹՈՒՄՈ)",
                    "Հալաբյան փ․ (Կիևյան կամուրջ)", "Կիևյան փ․ (Կիևյան կամուրջ)", "Կիևյան փ․ (Օրբելի խաչմերուկ)", "Կիևյան փ․ (Բարեկամություն)", "Բաղրամյան պ․ (SAS)",
                    "Բաղրամյան պ․ (Կամոյի դպրոց)", "Բաղրամյան պ․ (Ամերիկյան համալսարան)", "Բաղրամյան պ․ (Սահմանադրական դատարան)", "Բաղրամյան պ․ (Օպերա)",
                    "Սայաթ-Նովա պ․ (Նալբանդյան խաչմերուկ)", "Սայաթ-Նովա պ․ (Ալեք Մանուկյան խաչմերուկ)", "Ալեք-Մանուկյան փ․", "Երվանդ Քոչար փ․", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)",
                    "Նար-Դոսի փ․ (Սիլաչի խաչմերուկ)", "Խորենացու փ․ (Սիլաչի)", "Զավարյան փ․", "Գումի շուկա", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("58", "A", "Էրեբունու զ/ծ", "Խաղաղ Դոնի փ․", "Տիտոգրադյան փ․", "Այվազովսկու փ․", "Էրեբունու փ․",
                    "Աթոյան փ․", "Բելինսկու փ․", "Սասունցի Դավթի փ․", "Տիգրան Մեծի պ․ (Կայարան)", "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)",
                    "Տիգրան Մեծի պ․ (Այրարատ կ/թ)", "Մանկավարժական համալսարան", "Տիգրան Մեծի պ․ (Ֆիրդուսի շուկա)", "Հանրապետության Հրապարակ", "Ամիրյան փ․",
                    "Մաշտոցի պ․ (Ամիրյան խաչմերուկ)", "Մաշտոցի պ․ (Մարգարյան հիվ․)", "Մաշտոցի պ․ (Օպերա)", "Բաղրամյան պ․ (Օպերա)", "Բաղրամյան պ․ (Սահմանադրական դատարան)",
                    "Բաղրամյան պ․ (Ամերիկյան համալսարան)", "Բաղրամյան պ․ (Կամոյի դպրոց)", "Բաղրամյան պ․ (SAS)", "Կասյան փ․", "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)",
                    "Կոմիտասի պ․ (Վաղարշյան խաչմերուկ)", "Կոմիտասի պ․ (Փափազյան խաչմերուկ)", "Կոմիտասի պ․ (Սլավոնական համալսարան)", "Կոմիտասի պ․ (Վրացական խաչմերուկ)",
                    "Կոմիտասի պ․ (Կոմիտասի շուկա)", "Կոմիտասի պ․ (Լամբադա կամուրջ)", "Ազատության պ․ (Ռայկոմ)", "Պարույր Սևակի փ․", "Ռուբինյանց փ․ (Երևան Սիթի)",
                    "Ռուբինյանց փ․ (Ալմաստ գ/ն)", "Խուդյակովի փ․", "Թումանյան թաղ.", "Մարշալ Բաբաջանյան փ․", "Աշխաբադի փ․", "Ավան-Առինջ", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("59", "A", "Ավան", "Խուդյակովի փ․", "Ալմաթիի փ․", "Մարշալ Բաբաջանյան փ․", "Աճառյան փ․",
                    "Մյասնիկյան պ․ (Ջրաշխարհ)", "Մյասնիկյան պ․ (Կենդանաբանական այգի)", "Մյասնիկյան պ․ (Հերացի խաչմերուկ)", "Աբովյան փ․ (Պլանի գլուխ)", "Աբովյան փ․ (Գյուղակադեմիա)",
                    "Աբովյան փ․ (Երիտասարդական մ/կ)", "Սայաթ-Նովա պ․ (Աբովյան խաչմերուկ)", "Մաշտոցի պ․ (Օպերա)", "Մաշտոցի պ․ (Մարգարյան հիվ․)", "Մաշտոցի պ․ (Ամիրյան խաչմերուկ)",
                    "Խորենացու փ․ (Մաշտոց խաչմերուկ)", "Խորենացու փ․ (Շահումյան հրապ․)", "Ագաթանգեղոսի փ․", "Արշակունյաց պ․ (Կրկես)", "Արշակունյաց պ․ (Սուրմալու)",
                    "Քրիստափորի փ․", "Փեթակ ա/կ", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            ///Temporary unavailable
//            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("62", "A", "Պռոշյան ավան", "Աշտարակի խճ․", "Մելքումովի փ․", "15-րդ թաղամաս", "Բեկնազարյան փ․", "Մազմանյան փ․",
//                    "Շիրազի փ․", "Գրիգոր Հասրաթյան փ․", "Լենինգրադյան փ․ (Եվրովագեն)", "Լենինգրադյան փ․ (Շինարարների խաչմերուկ)", "Լենինգրադյան փ․ (Մոնթե Մելքոնյան խաչմերուկ)",
//                    "Ծիծեռնակաբերդի խճ․", "Դալմա Գարդեն Մոլ", "Աթենքի փ․", "Հրազդան մ/դ", "Հաղթանակ կամուրջ", "Մաշտոցի պ․ (Ծածկած շուկա)", "Մաշտոցի պ․ (Ձկան խանութ)",
//                    "Ամիրյան փ․", "Հանրապետության Հրապարակ", "Տիգրան Մեծի պ․ (Ֆիրդուսի շուկա)", "Մանկավարժական համալսարան", "Տիգրան Մեծի պ․ (Այրարատ կ/թ)",
//                    "Տիգրան Մեծի պ․ (Տաշիր ա/կ)", "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)", "Տիգրան Մեծի պ․ (Կայարան)", "Արցախի փ․", "Արին Բերդի փ.", "Մսի կոմբինատ", "", "", "", "", "",
//                    "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("63", "A", "Նոր Նորքի 9-րդ զ/ծ", "Վիլնյուսի փ․", "Նոր Նորքի 7-րդ զ/ծ", "Հունան Ավետիսյան փ․", "Դավիթ Բեկի փ․",
                    "Բադալ Մուրադյան փ․", "Գայի պ․ (Մերսեդեսի սրահ)", "Գայի պ․ (Գայի արձան)", "Գայի պ․ (Աքվատեք)", "Մյասնիկյան պ․ (Ջրաշխարհ)",
                    "Մյասնիկյան պ․ (Կենդանաբանական այգի)", "Մյասնիկյան պ․ (Հերացի խաչմերուկ)", "Աբովյան փ․ (Պլանի գլուխ)", "Աբովյան փ․ (Գյուղակադեմիա)",
                    "Աբովյան փ․ (Երիտասարդական մ/կ)", "Մոսկովյան փ․ (Կամերային երաժշտության տուն)", "Խանջյան փ․ (Շախմատի տուն)", "Վերնիսաժ", "Խանջյան փ․ (Լունապարկ)",
                    "Մանկավարժական համալսարան", "Տիգրան Մեծի պ․ (Ֆիրդուսի շուկա)", "Հանրապետության Հրապարակ", "Ամիրյան փ․", "Մաշտոցի պ․ (Ծածկած շուկա)",
                    "Մաշտոցի պ․ (Ձկան խանութ)", "Հաղթանակ կամուրջ", "Հրազդան մ/դ", "Աթենքի փ․", "Դալմա Գարդեն Մոլ", "Ծիծեռնակաբերդի խճ․",
                    "Լենինգրադյան փ․ (Մոնթե Մելքոնյան խաչմերուկ)", "Հալաբյան փ․ (Կիևյան կամուրջ)", "Հալաբյան փ․ (ԹՈՒՄՈ)", "Հալաբյան փ․ (Ֆիզիկայի խաչմերուկ)",
                    "Մարգարյան փ․ (Հանրապետական հիվ․)", "Մարգարյան փ․ (Պեգաս)", "Բաշինջաղյան փ․", "", "", "", "", "", "", "", ""));

//            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("67", "A", "Նազարբեկյան թաղ.", "Սիլիկյան Նոր խճ․", "Գրիգոր Հասրաթյան փ․",
//                    "Սեբաստիայի փ․ (Լենինգրադյան խաչմերուկ)", "Սեբաստիայի փ․ (Տիչինայի խաչմերուկ)", "Սեբաստիայի փ․ (Մալաթիայի շուկա)", "Սեբաստիայի փ․ (Կուրղինյան խաչմերուկ)",
//                    "Ծովակալ Իսակովի պ․ (Սեբաստիայի խաչմերուկ)", "Կիլիկիա ավտոկայան", "Հաղթանակ կամուրջ", "Մաշտոցի պ․ (Ձկան խանութ)", "Մաշտոցի պ․ (Ծածկած շուկա)", "Ամիրյան փ․",
//                    "Հանրապետության Հրապարակ", "Տիգրան Մեծի պ․ (Ֆիրդուսի շուկա)", "Մանկավարժական համալսարան", "Տիգրան Մեծի պ․ (Այրարատ կ/թ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)",
//                    "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)", "Տիգրան Մեծի պ․ (Կայարան)", "Արցախի փ․", "Ռոստովյան փ․", "Մուրացանի փ․", "Էրեբունու փ․", "Աթոյան փ․", "Այվազովսկու փ․",
//                    "Ավանեսովի փ․", "Էրեբունու զ/ծ ", "Առնո Բաբաջանյան փ․", "Զորավար Անդրանիկի փ․", "Րաֆֆու փ․", "Րաֆֆու փ․ (Մալաթիայի շուկա)", "Սեբաստիայի փ․ (Մալաթիայի շուկա)",
//                    "Վանթյան փ․", "Կուրղինյան փ․", "Սեբաստիայի փ․ (Կուրղինյան խաչմերուկ)", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("68", "A", "Էներգետիկների բանավան", "Էջմիածնի խճ.", "Ծովակալ Իսակովի պ․ (Սեբաստիայի խաչմերուկ)",
                    "Կիլիկիա ավտոկայան", "Հաղթանակ կամուրջ", "Մաշտոցի պ․ (Ձկան խանութ)", "Մաշտոցի պ․ (Ծածկած շուկա)", "Ամիրյան փ․", "Հանրապետության Հրապարակ",
                    "Տիգրան Մեծի պ․ (Ֆիրդուսի շուկա)", "Մանկավարժական համալսարան", "Տիգրան Մեծի պ․ (Այրարատ կ/թ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)", "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)",
                    "Տիգրան Մեծի պ․ (Կայարան)", "Սասունցի Դավթի փ․", "Կուստոյի փ․", "Քաղաքային պանթեոն", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("259", "A", "Կիլիկիա ավտոկայան", "Հաղթանակ կամուրջ", "Մաշտոցի պ․ (Ձկան խանութ)",
                    "Մաշտոցի պ․ (Ծածկած շուկա)", "Մաշտոցի պ․ (Ամիրյան խաչմերուկ)", "Մաշտոցի պ․ (Մարգարյան հիվ․)", "Մաշտոցի պ․ (Օպերա)", "Բաղրամյան պ․ (Օպերա)",
                    "Բաղրամյան պ․ (Սահմանադրական դատարան)", "Բաղրամյան պ․ (Ամերիկյան համալսարան)", "Բաղրամյան պ․ (Կամոյի դպրոց)", "Բաղրամյան պ․ (SAS)",
                    "Կասյան փ․", "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)", "Կոմիտասի պ․ (Վաղարշյան խաչմերուկ)", "Կոմիտասի պ․ (Փափազյան խաչմերուկ)",
                    "Կոմիտասի պ․ (Սլավոնական համալսարան)", "Կոմիտասի պ․ (Վրացական խաչմերուկ)", "Կոմիտասի պ․ (Կոմիտասի շուկա)", "Կոմիտասի պ․ (Լամբադա կամուրջ)",
                    "Ազատության պ․ (Ռայկոմ)", "Թբիլիսյան խճ․ (Լամպերի լիճ)", "Թբիլիսյան խճ․ (Լամպերի գ/ն)", "Թբիլիսյան խճ․ (Այբ ավագ դպրոց)",
                    "Թբիլիսյան խճ․ (Երևանի Շամպայնի գ/ն)", "Թբիլիսյան խճ․ (Ռադիոկայմ)", "Գազպրոմ Արմենիա", "Առինջ Մոլ", "գ․ Վերին Պտղնի", "գ․ Բալահովիտ", "ք․ Աբովյան", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("261", "A", "Տիգրան Մեծի պ․ (Կայարան)", "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)",
                    "Տիգրան Մեծի պ․ (Այրարատ կ/թ)", "Մանկավարժական համալսարան", "Խանջյան փ․ (Լունապարկ)", "Վերնիսաժ", "Հերացու փ․", "Մյասնիկյան պ․ (Հերացի խաչմերուկ)",
                    "Մյասնիկյան պ․ (Կենդանաբանական այգի)", "Մյասնիկյան պ․ (Ջրաշխարհ)", "Բուսաբանական այգի", "Աճառյան փ․", "գ․ Վերին Պտղնի", "գ․ Բալահովիտ", "ք․ Աբովյան", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            /**
             * Microbuses
             * */

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("1", "M", "Էրեբունի օդանավակայան", "Աշխատանքի հրապարակ (Բանվորի արձան)",
                    "Արշակունյաց պ․ (Դեպի Չարբախ)", "Բագրատունյաց պ․ (Բանվորի արձան)", "Գարեգին Նժդեհի հրապարակ", "Բագրատունյաց պ․ (Արտաշիսյան խաչմերուկ)",
                    "Բագրատունյաց պ․ (Երևան Սիթի)", "Բագրատունյաց պ․ (Իսակով խաչմերուկ)", "Սեբաստիայի փ․ (Կուրղինյան խաչմերուկ)", "Սեբաստիայի փ․ (Մալաթիայի շուկա)",
                    "Րաֆֆու փ․ (Մալաթիայի շուկա)", "Րաֆֆու փ․", "Գուսան Շերամի փ․", "Օհանովի փ․", "Զորավար Անդրանիկի փ․", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("2", "M", "Ուռուցքաբանության ինստիտուտ", "Ֆանարջյան փ․", "Զաքարիա Քանաքեռցու փ․", "Էզրաս Հասրաթյան փ․",
                    "Ուլնեցու փ․", "Ներսիսյան փ․", "Ազատության պ․ (Ռայկոմ)", "Կոմիտասի պ․ (Լամբադա կամուրջ)", "Կոմիտասի պ․ (Կոմիտասի շուկա)", "Կոմիտասի պ․ (Վրացական խաչմերուկ)",
                    "Կոմիտասի պ․ (Սլավոնական համալսարան)", "Կոմիտասի պ․ (Փափազյան խաչմերուկ)", "Կոմիտասի պ․ (Վաղարշյան խաչմերուկ)", "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)",
                    "Կասյան փ․", "Բաղրամյան պ․ (SAS)", "Բաղրամյան պ․ (Կամոյի դպրոց)", "Բաղրամյան պ․ (Ամերիկյան համալսարան)", "Բաղրամյան պ․ (Սահմանադրական դատարան)",
                    "Բաղրամյան պ․ (Օպերա)", "Մաշտոցի պ․ (Օպերա)", "Մաշտոցի պ․ (Կոնսերվատորիա)", "Մաշտոցի պ․ (Մատենադարան)", "Կորյունի փ․ (Ցիտադել)", "Բժշկական համալսարան",
                    "Չարենցի փ․ (ՀՀ Ոստիկանություն)", "Չարենցի փ․ (ԵՊՀ)", "Չարենցի փ․ (Zigzag խանութ-սրահ)", "Սայաթ-Նովա պ․ (Ալեք Մանուկյան խաչմերուկ)", "Ալեք-Մանուկյան փ․",
                    "Վարդանանց փ․", "Հանրապետական մ/դ", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("3", "M", "15-րդ թաղամաս", "Բաշինջաղյան փ․", "Մարգարյան փ․ (Պեգաս)", "Մարգարյան փ․ (Հանրապետական հիվ․)",
                    "Հալաբյան փ․ (Ֆիզիկայի խաչմերուկ)", "Հալաբյան փ․ (ԹՈՒՄՈ)", "Հալաբյան փ․ (Կիևյան կամուրջ)", "Կիևյան փ․ (Կիևյան կամուրջ)", "Կիևյան փ․ (Օրբելի խաչմերուկ)",
                    "Կիևյան փ․ (Բարեկամություն)", "Կասյան փ․", "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)", "Կոմիտասի պ․ (Վաղարշյան խաչմերուկ)", "Կոմիտասի պ․ (Փափազյան խաչմերուկ)",
                    "Փափազյան փ․", "Արամ Խաչատրյան փ․", "Ռիգայի փ․", "Ռուս-Հայկական համալսարան", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("4", "M", "Ռուբինյանց փ․ (Երևան Սիթի)", "Պարույր Սևակի փ․", "Ազատության պ․ (Ռայկոմ)", "Կոմիտասի պ․ (Լամբադա կամուրջ)",
                    "Կոմիտասի պ․ (Կոմիտասի շուկա)", "Կոմիտասի պ․ (Վրացական խաչմերուկ)", "Կոմիտասի պ․ (Սլավոնական համալսարան)", "Կոմիտասի պ․ (Փափազյան խաչմերուկ)",
                    "Կոմիտասի պ․ (Վաղարշյան խաչմերուկ)", "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)", "Կասյան փ․", "Բաղրամյան պ․ (SAS)", "Բաղրամյան պ․ (Կամոյի դպրոց)",
                    "Բաղրամյան պ․ (Ամերիկյան համալսարան)", "Բաղրամյան պ․ (Սահմանադրական դատարան)", "Բաղրամյան պ․ (Օպերա)", "Մաշտոցի պ․ (Օպերա)", "Մաշտոցի պ․ (Մարգարյան հիվ․)",
                    "Մաշտոցի պ․ (Ամիրյան խաչմերուկ)", "Մաշտոցի պ․ (Ծածկած շուկա)", "Մաշտոցի պ․ (Ձկան խանութ)", "Հաղթանակ կամուրջ", "Աթենքի փ․", "Հրազդան մ/դ",
                    "Դալմա Գարդեն Մոլ", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("5", "M", "Ավան", "Դուրյան թաղ․", "Նվեր Սաֆարյան փ․", "Մարշալ Բաբաջանյան փ․", "Աճառյան փ․",
                    "Ռուբինյանց փ․ (Ալմաստ գ/ն)", "Ռուբինյանց փ․ (Երևան Սիթի)", "Ռուբինյանց փ․ (Ահարոնյան փ․)", "Դավիթ Անհաղթի փ․ (Դրոյի խաչմերուկ)",
                    "Դավիթ Անհաղթի փ․ (Կերամա Մարացի)", "Դավիթ Անհաղթի փ․ (թաղապետարան)", "Կոմիտասի պ․ (Լամբադա կամուրջ)", "Կոմիտասի պ․ (Կոմիտասի շուկա)",
                    "Կոմիտասի պ․ (Վրացական խաչմերուկ)", "Կոմիտասի պ․ (Սլավոնական համալսարան)", "Կոմիտասի պ․ (Փափազյան խաչմերուկ)", "Կոմիտասի պ․ (Վաղարշյան խաչմերուկ)",
                    "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)", "Կասյան փ․", "Կիևյան փ․ (Բարեկամություն)", "Կիևյան փ․ (Օրբելի խաչմերուկ)", "Կիևյան փ․ (Կիևյան կամուրջ)",
                    "Հալաբյան փ․ (Կիևյան կամուրջ)", "Հալաբյան փ․ (ԹՈՒՄՈ)", "Հալաբյան փ․ (Ֆիզիկայի խաչմերուկ)", "Հալաբյան փ․ (Ֆիզիկայի խաչմերուկ)",
                    "Մարգարյան փ․ (Հանրապետական հիվ․)", "Ֆուչիկի փ․", "Մելքումովի փ.", "Նորաշեն թաղ․", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("6", "M", "Նոր Նորքի 3-րդ զ/ծ", "Գյուրջյան փ․", "Շոպրոնի փ․", "Բադալ Մուրադյան փ․",
                    "Գայի պ․ (Մերսեդեսի սրահ)", "Գայի պ․ (Գայի արձան)", "Գայի պ․ (Աքվատեք)", "Ռուբինյանց փ․ (Ալմաստ գ/ն)", "Ռուբինյանց փ․ (Երևան Սիթի)",
                    "Ռուբինյանց փ․ (Ահարոնյան փ․)", "Դավիթ Անհաղթի փ․ (Դրոյի խաչմերուկ)", "Դավիթ Անհաղթի փ․ (Կերամա Մարացի)", "Դավիթ Անհաղթի փ․ (թաղապետարան)",
                    "Կոմիտասի պ․ (Լամբադա կամուրջ)", "Կոմիտասի պ․ (Կոմիտասի շուկա)", "Կոմիտասի պ․ (Վրացական խաչմերուկ)", "Կոմիտասի պ․ (Սլավոնական համալսարան)",
                    "Կոմիտասի պ․ (Փափազյան խաչմերուկ)", "Կոմիտասի պ․ (Վաղարշյան խաչմերուկ)", "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)", "Կասյան փ․", "Կիևյան փ․ (Բարեկամություն)",
                    "Կիևյան փ․ (Օրբելի խաչմերուկ)", "Կիևյան փ․ (Կիևյան կամուրջ)", "Լենինգրադյան փ․ (Կիևյան կամուրջ)", "Լենինգրադյան փ․ (Մոնթե Մելքոնյան խաչմերուկ)",
                    "Լենինգրադյան փ․ (Շինարարների խաչմերուկ)", "Լենինգրադյան փ․ (Եվրովագեն)", "Սեբաստիայի փ․ (Լենինգրադյան խաչմերուկ)", "Սեբաստիայի փ․ (Տիչինայի խաչմերուկ)",
                    "Սեբաստիայի փ․ (Մալաթիայի շուկա)", "Րաֆֆու փ․ (Մալաթիայի շուկա)", "Րաֆֆու փ․", "Առնո Բաբաջանյան փ․", "ՀԱԹ", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("6ա", "M", "Էրեբունու զ/ծ", "Խաղաղ Դոնի փ․", "Տիտոգրադյան փ․", "Այվազովսկու փ․",
                    "Էրեբունու փ․", "Արցախի փ․", "Տիգրան Մեծի պ․ (Կայարան)", "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)", "Տիգրան Մեծի պ․ (Այրարատ կ/թ)",
                    "Մանկավարժական համալսարան", "Տիգրան Մեծի պ․ (Ֆիրդուսի շուկա)", "Հանրապետության Հրապարակ", "Նալբանդյան փ․ (Հանրապետության Հրապարակ)", "Թումանյան փ․",
                    "Մաշտոցի պ․ (Օպերա)", "Մաշտոցի պ․ (Մարգարյան հիվ․)", "Մաշտոցի պ․ (Ամիրյան խաչմերուկ)", "Խորենացու փ․ (Մաշտոց խաչմերուկ)", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("7", "M", "Նոր Նորքի 9-րդ զ/ծ", "Վիլնյուսի փ․", "Նոր Նորքի 7-րդ զ/ծ", "Հունան Ավետիսյան փ․", "Դավիթ Բեկի փ․",
                    "Ազատամարտիկների փ․", "Սասունցի Դավթի փ.", "Արցախի պ.", "Վստրեչի կամուրջ", "Գարեգին Նժդեհի փ․", "Գարեգին Նժդեհի հրապարակ",
                    "Բագրատունյաց պ․ (Արտաշիսյան խաչմերուկ)", "Արտաշիսյան փ․", "Չեխովի փ․", "Հ․Հովսեփյան փ․", "Տարոնցու փ․", "Շենգավիթ մ/կ", "Ներքին Շենգավիթի 9-րդ փ.",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("8", "M", "Քանաքեռ ՀԷԿ", "Ղափանցյան փ․", "Ադոնցի փ․", "Կանազ հոսպիտալ", "Շիրվանզադեի փ․",
                    "Կոմիտասի պ․ (Լամբադա կամուրջ)", "Կոմիտասի պ․ (Կոմիտասի շուկա)", "Կոմիտասի պ․ (Վրացական խաչմերուկ)", "Կոմիտասի պ․ (Սլավոնական համալսարան)",
                    "Կոմիտասի պ․ (Փափազյան խաչմերուկ)", "Կոմիտասի պ․ (Վաղարշյան խաչմերուկ)", "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)", "Կասյան փ․",
                    "Բաղրամյան պ․ (SAS)", "Բաղրամյան պ․ (Կամոյի դպրոց)", "Պռոշյան փ․ ", "Պարոնյան փ․ (Նաիրի բ/կ)", "Պարոնյան փ․ (Կեսարի պալատ)",
                    "Գրիգոր Լուսավորիչ (Երևանի քաղաքապետարան)", "Գրիգոր Լուսավորիչ (Կրկես)", "Արշակունյաց պ․ (Կրկես)", "Արշակունյաց պ․ (Սուրմալու)", "Արշակունյաց պ․ (Կոմիտասի այգի)",
                    "Արշակունյաց պ․ (Երևան Մոլ)", "Արշակունյաց պ․ (Հայրենիք կ/թ)", "Գարեգին Նժդեհի փ․", "Գարեգին Նժդեհի հրապարակ", "Մանանդյան փ.", "Արաքս մ/դ", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("9", "M", "Ջրվեժ", "Մինսկի փ․ (Նոր նորքի 8-րդ զ/ծ) (Նոր նորքի 8-րդ զ/ծ)", "Արտեմ Միկոյան փ․",
                    "Բադալ Մուրադյան փ․", "Մյասնիկյան պ․ (Ջրաշխարհ)", "Մյասնիկյան պ․ (Կենդանաբանական այգի)", "Մյասնիկյան պ․ (Հերացի խաչմերուկ)", "Հերացու փ․",
                    "Չարենցի փ․ (ՀՀ Ոստիկանություն)", "Նալբանդյան փ․ (ԵՊՏՀ)", "Խանջյան փ․ (Շախմատի տուն)", "Վերնիսաժ", "Խանջյան փ․ (Լունապարկ)", "Մանկավարժական համալսարան",
                    "Տիգրան Մեծի պ․ (Այրարատ կ/թ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)", "Քրիստափորի փ․", "Փեթակ ա/կ", "Սևանի փ․", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("10", "M", "Աշխատանքի հրապարակ (Բանվորի արձան)", "Բագրատունյաց պ․ (Բանվորի արձան)",
                    "Գարեգին Նժդեհի հրապարակ", "Գարեգին Նժդեհի փ․", "Արշակունյաց պ․ (Հայրենիք կ/թ)", "Արշակունյաց պ․ (Երևան Մոլ)", "Արշակունյաց պ․ (Կոմիտասի այգի)",
                    "Արշակունյաց պ․ (Սուրմալու)", "Արշակունյաց պ․ (Կրկես)", "Գրիգոր Լուսավորիչ (Երևանի քաղաքապետարան)", "Մաշտոցի պ․ (Ձկան խանութ)",
                    "Մաշտոցի պ․ (Ծածկած շուկա)", "Մաշտոցի պ․ (Ամիրյան խաչմերուկ)", "Մաշտոցի պ․ (Մարգարյան հիվ․)", "Մաշտոցի պ․ (Օպերա)", "Մաշտոցի պ․ (Կոնսերվատորիա)",
                    "Մաշտոցի պ․ (Մատենադարան)", "Կորյունի փ․ (Ցիտադել)", "Աբովյան փ․ (Գյուղակադեմիա)", "Աբովյան փ․ (Պլանի գլուխ)", "Սարալանջի փ․",
                    "Ազատության պ․ (Հաղթանակի այգի)", "Ազատության պ․ (Զինկոմիսարիատ)", "Ազատության պ․ (Նաիրի Զարյան խաչմերուկ)", "Ազատության պ․ (Ռայկոմ)",
                    "Ներսիսյան փ․", "Ուլնեցու փ․", "Պարույր Սևակի փ․", "Ռուբինյանց փ․ (Երևան Սիթի)", "Ռուբինյանց փ․ (Ալմաստ գ/ն)", "Աճառյան փ․", "Աճառյան փ. 2-րդ փակուղի",
                    "Աղի հանք", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("11", "M", "Վարդաշենի 5-րդ փ.", "Մահարու փ․", "Նոր Արեշի 50-րդ փ․", "Նոր Արեշի 7-րդ փ․",
                    "Նոր Արեշի 20-րդ փ․", "Ազատամարտիկների փ․", "Սասունցի Դավթի փ․", "Տիգրան Մեծի պ․ (Կայարան)", "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)",
                    "Տիգրան Մեծի պ․ (Այրարատ կ/թ)", "Ագաթանգեղոսի փ․", "Գրիգոր Լուսավորիչ (Կրկես)", "Գրիգոր Լուսավորիչ (Երևանի քաղաքապետարան)", "Զաքյան փ․",
                    "Ամիրյան փ․", "Մաշտոցի պ․ (Ամիրյան խաչմերուկ)", "Մաշտոցի պ․ (Ծածկած շուկա)", "Մաշտոցի պ․ (Ձկան խանութ)", "Հաղթանակ կամուրջ", "Հրազդան մ/դ", "Աթենքի փ․",
                    "Դալմա Գարդեն Մոլ", "Ծիծեռնակաբերդի խճ․", "Մազմանյան փ․", "Չաուշի փ․", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("12", "M", "Լեփսիուսի փ․", "Դրոյի փ․", "Պարույր Սևակի փ․", "Ազատության պ․ (Ռայկոմ)",
                    "Կոմիտասի պ․ (Լամբադա կամուրջ)", "Կոմիտասի պ․ (Կոմիտասի շուկա)", "Կոմիտասի պ․ (Վրացական խաչմերուկ)", "Կոմիտասի պ․ (Սլավոնական համալսարան)",
                    "Կոմիտասի պ․ (Փափազյան խաչմերուկ)", "Կոմիտասի պ․ (Վաղարշյան խաչմերուկ)", "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)", "Կասյան փ․",
                    "Կիևյան փ․ (Բարեկամություն)", "Կիևյան փ․ (Օրբելի խաչմերուկ)", "Կիևյան փ․ (Կիևյան կամուրջ)", "Հալաբյան փ․ (Կիևյան կամուրջ)", "Հալաբյան փ․ (ԹՈՒՄՈ)",
                    "Հալաբյան փ․ (Ֆիզիկայի խաչմերուկ)", "Մարգարյան փ․ (Հանրապետական հիվ․)", "Մարգարյան փ․ (Պեգաս)", "Բաշինջաղյան փ․", "Մազմանյան փ․", "15-րդ թաղամաս",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("13", "M", "Ներքին Շենգավիթ", "Թադևոսյան փ․", "Բագրատունյաց պ․ (Բանվորի արձան)",
                    "Գարեգին Նժդեհի հրապարակ", "Բագրատունյաց պ․ (Արտաշիսյան խաչմերուկ)", "Բագրատունյաց պ․ (Երևան Սիթի)", "Բագրատունյաց պ․ (Իսակով խաչմերուկ)",
                    "Ծովակալ Իսակովի պ․ (Սեբաստիայի խաչմերուկ)", "Կիլիկիա ավտոկայան", "Ծովակալ Իսակովի պ․", "Հաղթանակ կամուրջ", "Մաշտոցի պ․ (Ձկան խանութ)",
                    "Մաշտոցի պ․ (Ծածկած շուկա)", "Մաշտոցի պ․ (Ամիրյան խաչմերուկ)", "Մաշտոցի պ․ (Մարգարյան հիվ․)", "Մաշտոցի պ․ (Օպերա)", "Բաղրամյան պ․ (Օպերա)",
                    "Բաղրամյան պ․ (Սահմանադրական դատարան)", "Բաղրամյան պ․ (Ամերիկյան համալսարան)", "Բաղրամյան պ․ (Կամոյի դպրոց)", "Բաղրամյան պ․ (SAS)",
                    "Կիևյան փ․ (Բարեկամություն)", "Կիևյան փ․ (Օրբելի խաչմերուկ)", "Կիևյան փ․ (Կիևյան կամուրջ)", "Հալաբյան փ․ (Կիևյան կամուրջ)", "Հալաբյան փ․ (ԹՈՒՄՈ)",
                    "Հալաբյան փ․ (Ֆիզիկայի խաչմերուկ)", "Իոսիֆյան փ․", "Դավթաշենի 1-ին թաղ․", "Տիգրան Պետրոսյան փ․", "Աղաբաբյան փ․", "Դավթաշենի 1-ին թաղ․", "", "", "", "", "",
                    "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("14", "M", "Նուբարաշենի խճ. (Զորամաս)", "Խաղաղ Դոնի փ․", "Տիտոգրադյան փ․", "Այվազովսկու փ․",
                    "Էրեբունու փ․", "Ազատամարտիկների փ․", "Սասունցի Դավթի փ․", "Բելինսկու փ․", "Խորենացու փ․ (Սիլաչի)", "Նար-Դոսի փ․ (Սիլաչի խաչմերուկ)",
                    "Տիգրան Մեծի պ․ (Տաշիր ա/կ)", "Տիգրան Մեծի պ․ (Այրարատ կ/թ)", "Մանկավարժական համալսարան", "Խանջյան փ․ (Լունապարկ)", "Վերնիսաժ",
                    "Խանջյան փ․ (Շախմատի տուն)", "Մոսկովյան փ․ (Կամերային երաժշտության տուն)", "Աբովյան փ․ (Երիտասարդական մ/կ)", "Աբովյան փ․ (Գյուղակադեմիա)",
                    "Աբովյան փ․ (Պլանի գլուխ)", "Սարալանջի փ․", "Ազատության պ․ (Հաղթանակի այգի)", "Ազատության պ․ (Զինկոմիսարիատ)", "Ազատության պ․ (Նաիրի Զարյան խաչմերուկ)",
                    "Ազատության պ․ (Ռայկոմ)", "Ադոնցի փ․", "Ղափանցյան փ․", "Քանաքեռ ՀԷԿ", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("15", "M", "Ավան ", "Մարշալ Խուդյակովի փ․", "Ալմաթիի փ․", "Մարշալ Բաբաջանյան փ․",
                    "Աճառյան փ․", "Ռուբինյանց փ․ (Ալմաստ գ/ն)", "Ռուբինյանց փ․ (Երևան Սիթի)", "Պարույր Սևակի փ․", "Ազատության պ․ (Ռայկոմ)", "Կոմիտասի պ․ (Լամբադա կամուրջ)",
                    "Կոմիտասի պ․ (Կոմիտասի շուկա)", "Գրիբոյեդովի փ․", "Նաիրի Զարյան փ․", "Բորսայի շենք", "Հրաչյա Քոչար փ․ (Վրացական խաչմերուկ)",
                    "Հրաչյա Քոչար փ․ (Փափազյան խաչմերուկ)", "Հրաչյա Քոչար փ․ (Վաղարշյան խաչմերուկ)", "Վաղարշյան փ․", "Դավթաշենի կամուրջ", "Սասնա Ծռերի փ․", "Դավթաշենի 1-ին թաղ․",
                    "Տիգրան Պետրոսյան փ․", "Դավթաշենի 4-րդ թաղ․", "Ադոնցի փ․", "Ազատության պ․ (Ռայկոմ)", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("16", "M", "Ավան ", "Մարշալ Խուդյակովի փ․", "Ալմաթիի փ․", "Մարշալ Բաբաջանյան փ․",
                    "Աճառյան փ․", "Գայի պ․ (Գայի արձան)", "Գայի պ․ (Մերսեդեսի սրահ)", "Բադալ Մուրադյան փ․", "Դավիթ Բեկի փ․", "Հունան Ավետիսյան փ․", "Նոր Նորքի 7-րդ զ/ծ",
                    "Վիլնյուսի փ․", "Նոր Նորքի 9-րդ զ/ծ", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("17", "M", "Արմենալ գ/ն", "Ադոնցի փ․", "Ազատության պ․ (Ռայկոմ)", "Կոմիտասի պ․ (Լամբադա կամուրջ)", "Կոմիտասի պ․ (Կոմիտասի շուկա)",
                    "Կոմիտասի պ․ (Վրացական խաչմերուկ)", "Կոմիտասի պ․ (Սլավոնական համալսարան)", "Կոմիտասի պ․ (Փափազյան խաչմերուկ)", "Կոմիտասի պ․ (Վաղարշյան խաչմերուկ)",
                    "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)", "Կասյան փ․", "Կիևյան փ․ (Բարեկամություն)", "Կիևյան փ․ (Օրբելի խաչմերուկ)", "Կիևյան փ․ (Կիևյան կամուրջ)",
                    "Լենինգրադյան փ․ (Կիևյան կամուրջ)", "Լենինգրադյան փ․ (Մոնթե Մելքոնյան խաչմերուկ)", "Լենինգրադյան փ․ (Շինարարների խաչմերուկ)",
                    "Լենինգրադյան փ․ (Եվրովագեն)", "Սեբաստիայի փ․ (Լենինգրադյան խաչմերուկ)", "Սեբաստիայի փ․ (Տիչինայի խաչմերուկ)", "Սեբաստիայի փ․ (Մալաթիայի շուկա)",
                    "Սեբաստիայի փ․ (Կուրղինյան խաչմերուկ)", "Ծովակալ Իսակովի պ․ (Սեբաստիայի խաչմերուկ)", "Էջմիածնի խճ․", "Զվարթնոց օդանավակայան", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("18", "M", "Աբովյան փ․ (Պլանի գլուխ)", "Աբովյան փ․ (Գյուղակադեմիա)",
                    "Աբովյան փ․ (Երիտասարդական մ/կ)", "Մոսկովյան փ․ (Կամերային երաժշտության տուն)", "Խանջյան փ․ (Շախմատի տուն)", "Վերնիսաժ", "Խանջյան փ․ (Լունապարկ)",
                    "Մանկավարժական համալսարան", "Տիգրան Մեծի պ․ (Այրարատ կ/թ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)", "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)", "Տիգրան Մեծի պ․ (Կայարան)",
                    "Արցախի փ․", "Վստրեչի կամուրջ", "Գարեգին Նժդեհի փ․", "Արշակունյաց պ․ (Հայրենիք կ/թ)", "Գարեգին Նժդեհի հրապարակ", "Բագրատունյաց պ․ (Արտաշիսյան խաչմերուկ)",
                    "Բագրատունյաց պ․ (Երևան Սիթի)", "Բագրատունյաց պ․ (Իսակով խաչմերուկ)", "Ծովակալ Իսակովի պ․ (Սեբաստիայի խաչմերուկ)", "Էջմիածնի խճ․",
                    "Զվարթնոց օդանավակայան", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("19", "M", "Գաջեգործների փ․", "Կուստոյի փ․", "Սասունցի Դավթի փ․", "Տիգրան Մեծի պ․ (Կայարան)",
                    "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)", "Տիգրան Մեծի պ․ (Այրարատ կ/թ)", "Մանկավարժական համալսարան", "Խանջյան փ․ (Լունապարկ)", "Վերնիսաժ",
                    "Խանջյան փ․ (Շախմատի տուն)", "Մոսկովյան փ․ (Կամերային երաժշտության տուն)", "Աբովյան փ․ (Երիտասարդական մ/կ)", "Աբովյան փ․ (Գյուղակադեմիա)",
                    "Աբովյան փ․ (Պլանի գլուխ)", "Սարալանջի փ․", "Ազատության պ․ (Հաղթանակի այգի)", "Ազատության պ․ (Զինկոմիսարիատ)", "Ազատության պ․ (Նաիրի Զարյան խաչմերուկ)",
                    "Դավիթ Անհաղթի փ․ (թաղապետարան)", "Դավիթ Անհաղթի փ․ (Կերամա Մարացի)", "Դավիթ Անհաղթի փ․ (Դրոյի խաչմերուկ)", "Ռուբինյանց փ․ (Ահարոնյան փ․)",
                    "Ռուբինյանց փ․ (Երևան Սիթի)", "Պարույր Սևակի փ․", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("20", "M", "Ավան ", "Մարշալ Բաբաջանյան փ․", "Աճառյան փ․", "Բուսաբանական այգի",
                    "Մյասնիկյան պ․ (Ջրաշխարհ)", "Մյասնիկյան պ․ (Կենդանաբանական այգի)", "Մյասնիկյան պ․ (Հերացի խաչմերուկ)", "Աբովյան փ․ (Պլանի գլուխ)",
                    "Աբովյան փ․ (Գյուղակադեմիա)", "Մոսկովյան փ․ (Կամերային երաժշտության տուն)", "Խանջյան փ․ (Շախմատի տուն)", "Վերնիսաժ", "Խանջյան փ․ (Լունապարկ)",
                    "Մանկավարժական համալսարան", "Ագաթանգեղոսի փ․", "Արշակունյաց պ․ (Կրկես)", "Արշակունյաց պ․ (Սուրմալու)", "Արշակունյաց պ․ (Կոմիտասի այգի)",
                    "Արշակունյաց պ․ (Երևան Մոլ)", "Արշակունյաց պ․ (Հայրենիք կ/թ)", "Գարեգին Նժդեհի փ․", "Գարեգին Նժդեհի հրապարակ", "Բագրատունյաց պ․ (Բանվորի արձան)",
                    "Թադևոսյան փ․", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("21", "M", "ՀԱԹ", "Առնո Բաբաջանյան փ․", "Զորավար Անդրանիկի փ․", "Տիչինայի փ․",
                    "Սեբաստիայի փ․ (Տիչինայի խաչմերուկ)", "Սեբաստիայի փ․ (Լենինգրադյան խաչմերուկ)", "Լենինգրադյան փ․ (Եվրովագեն)", "Լենինգրադյան փ․ (Շինարարների խաչմերուկ)",
                    "Լենինգրադյան փ․ (Մոնթե Մելքոնյան խաչմերուկ)", "Լենինգրադյան փ․ (Կիևյան կամուրջ)", "Կիևյան փ․ (Կիևյան կամուրջ)", "Կիևյան փ․ (Օրբելի խաչմերուկ)",
                    "Կիևյան փ․ (Բարեկամություն)", "Բաղրամյան պ․ (SAS)", "Բաղրամյան պ․ (Կամոյի դպրոց)", "Բաղրամյան պ․ (Ամերիկյան համալսարան)",
                    "Բաղրամյան պ․ (Սահմանադրական դատարան)", "Բաղրամյան պ․ (Օպերա)", "Մաշտոցի պ․ (Կոնսերվատորիա)", "Մոսկովյան փ․ (Կոնսերվատորիա)",
                    "Աբովյան փ․ (Երիտասարդական մ/կ)", "Աբովյան փ․ (Գյուղակադեմիա)", "Աբովյան փ․ (Պլանի գլուխ)", "Սարալանջի փ․", "Ազատության պ․ (Հաղթանակի այգի)",
                    "Ազատության պ․ (Զինկոմիսարիատ)", "Ազատության պ․ (Նաիրի Զարյան խաչմերուկ)", "Ազատության պ․ (Ռայկոմ)", "Թբիլիսյան խճ․ (Լամպերի լիճ)",
                    "Թբիլիսյան խճ․ (Լամպերի գ/ն)", "Թբիլիսյան խճ․ (Այբ ավագ դպրոց)", "Թբիլիսյան խճ․ (Երևանի Շամպայնի գ/ն)", "", "", "", "", "", "", "", "", "", "",
                    "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("22", "M", "Մարաշ", "Նորքի 9-րդ փ․", "Նորքի 7-րդ փ․", "Նորքի 8-րդ փ․", "Արմենակյան փ․",
                    "Սարալանջի փ․", "Հերացու փ․", "Չարենցի փ․ (ՀՀ Ոստիկանություն)", "Նալբանդյան փ․ (ԵՊՏՀ)", "Խանջյան փ․ (Շախմատի տուն)", "Վերնիսաժ", "Խանջյան փ․ (Լունապարկ)",
                    "Մանկավարժական համալսարան", "Տիգրան Մեծի պ․ (Այրարատ կ/թ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)", "Քրիստափորի փ․", "Փեթակ ա/կ", "Արշակունյաց պ․ (Կոմիտասի այգի)",
                    "Արշակունյաց պ․ (Երևան Մոլ)", "Արշակունյաց պ․ (Հայրենիք կ/թ)", "Գարեգին Նժդեհի փ․", "Մայիսի 9-ի փ․", "Մուսաելյան փ․", "Օդեսայի փ․",
                    "Արևելյան քաղցրավենիքներ գ/ն", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("23", "M", "Տիգրան Մեծի պ․ (Կայարան)", "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)",
                    "Տիգրան Մեծի պ․ (Այրարատ կ/թ)", "Մանկավարժական համալսարան", "Խորենացու փ․ (Շահումյան հրապ․)", "Խորենացու փ․ (Մաշտոց խաչմերուկ)",
                    "Մաշտոցի պ․ (Ծածկած շուկա)", "Մաշտոցի պ․ (Ձկան խանութ)", "Հաղթանակ կամուրջ", "Ծովակալ Իսակովի պ․", "Կիլիկիա ավտոկայան",
                    "Ծովակալ Իսակովի պ․ (Սեբաստիայի խաչմերուկ)", "Սեբաստիայի փ․ (Կուրղինյան խաչմերուկ)", "Սեբաստիայի փ․ (Մալաթիայի շուկա)", "Րաֆֆու փ․ (Մալաթիայի շուկա)",
                    "Րաֆֆու փ․", "Գուսան Շերամի փ․", "Օհանովի փ․", "գ. Հաղթանակի 1-ին փ․", "գ. Հաղթանակի 6-րդ փ․", "գ. Հաղթանակի 9-րդ փ․", "գ. Հաղթանակի 10-րդ փ․",
                    "գ. Հաղթանակի 7-րդ փ․", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("24", "M", "Նորագյուղ", "Էջմիածնի հին խճ․", "Ծովակալ Իսակովի պ․", "Կիլիկիա ավտոկայան",
                    "Հաղթանակ կամուրջ", "Մաշտոցի պ․ (Ձկան խանութ)", "Մաշտոցի պ․ (Ծածկած շուկա)", "Մաշտոցի պ․ (Ամիրյան խաչմերուկ)", "Մաշտոցի պ․ (Մարգարյան հիվ․)",
                    "Մաշտոցի պ․ (Օպերա)", "Բաղրամյան պ․ (Օպերա)", "Բաղրամյան պ․ (Սահմանադրական դատարան)", "Բաղրամյան պ․ (Ամերիկյան համալսարան)", "Բաղրամյան պ․ (Կամոյի դպրոց)"
                    , "Բաղրամյան պ․ (SAS)", "Կասյան փ․", "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)", "Կոմիտասի պ․ (Վաղարշյան խաչմերուկ)",
                    "Կոմիտասի պ․ (Փափազյան խաչմերուկ)", "Կոմիտասի պ․ (Սլավոնական համալսարան)", "Կոմիտասի պ․ (Վրացական խաչմերուկ)", "Կոմիտասի պ․ (Կոմիտասի շուկա)",
                    "Կոմիտասի պ․ (Լամբադա կամուրջ)", "Շիրվանզադեի փ․", "Մամիկոնյանց փ․", "Գրիբոյեդովի փ․", "Արղության փ․", "Մալխասյանց փ․", "Մալխասյանց փակուղի",
                    "Երևանի պետական հումանիտար քոլեջ", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("25", "M", "Էլեկտրոն գ/ն", "Շարուրի փ․", "Շիրակի փ․ (Չարբախի շուկա)", "Արտաշիսյան փ․",
                    "Բագրատունյաց պ․ (Արտաշիսյան խաչմերուկ)", "Գարեգին Նժդեհի հրապարակ", "Գարեգին Նժդեհի փ․", "Վստրեչի կամուրջ", "Ռոստովյան փ․", "Ազատամարտիկների փ․",
                    "Էրեբունու փ․", "Այվազովսկու փ․", "Տիտոգրադյան փ․", "Խաղաղ Դոնի փ․", "Էրեբունու զ/ծ", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("26", "M", "Նոր Նորքի 1-ին զ/ծ", "Ջուղայի փ․", "Լվովյան փ․", "Բորյան փ․", "Նանսենի փ․",
                    "Գայի պ․ (Գայի արձան)", "Գայի պ․ (Մերսեդեսի սրահ)", "Բաղյան փ․", "Գյուրջյան փ․", "Նորքի 1-ին փող. նրբ.", "Նորքի 2-րդ փող. նրբ.", "Հովսեփյան փ․",
                    "Արմենակյան փ․", "Սարալանջի փ․", "Արմենակյան փ․", "Մյասնիկյան պ․ (Հերացի խաչմերուկ)", "Աբովյան փ․ (Պլանի գլուխ)", "Աբովյան փ․ (Գյուղակադեմիա)",
                    "Մոսկովյան փ․ (Կոնսերվատորիա)", "Մոսկովյան փ․ (Կասկադ)", "Մոսկովյան փ․ (Թումանյան խաչմերուկ)", "Սարյան փ․ (Թումանյան խաչմերուկ)",
                    "Սարյան փ․ (Սարյան փոշտ)", "Սարյան փ․ (Ամիրյան խաչմերուկ)", "Մաշտոցի պ․ (Ծածկած շուկա)", "Մաշտոցի պ․ (Ձկան խանութ)",
                    "Գրիգոր Լուսավորիչ (Երևանի քաղաքապետարան)", "Արգիշտի փ․", "Հաղթանակ կամուրջ", "Աթենքի փ․", "Հրազդան մ/դ", "Դալմա Գարդեն Մոլ", "Ծիծեռնակաբերդի խճ․",
                    "Լենինգրադյան փ․ (Մոնթե Մելքոնյան խաչմերուկ)", "Լենինգրադյան փ․ (Շինարարների խաչմերուկ)", "Լենինգրադյան փ․ (Եվրովագեն)", "Գրիգոր Հասրաթյան փ․",
                    "Մարտիրոսյան փ․", "Լուկաշինի փ․", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("27", "M", "Սիլիկյան 7-րդ փ․", "Սիլիկյան 10-րդ փ․", "Սիլիկյան Նոր խճ․", "Մազմանյան փ․",
                    "Բաշինջաղյան փ․", "Մարգարյան փ․ (Պեգաս)", "Մարգարյան փ․ (Հանրապետական հիվ․)", "Հալաբյան փ․ (Ֆիզիկայի խաչմերուկ)", "Հալաբյան փ․ (Ֆիզիկայի խաչմերուկ)",
                    "Հալաբյան փ․ (ԹՈՒՄՈ)", "Հալաբյան փ․ (Կիևյան կամուրջ)", "Կիևյան փ․ (Կիևյան կամուրջ)", "Օրբելի փ․", "Բաղրամյան պ․ (Կամոյի դպրոց)",
                    "Բաղրամյան պ․ (Ամերիկյան համալսարան)", "Բաղրամյան պ․ (Սահմանադրական դատարան)", "Մոսկովյան փ․ (Կասկադ)", "Մաշտոցի պ․ (Կոնսերվատորիա)",
                    "Մաշտոցի պ․ (Մատենադարան)", "Կորյունի փ․ (Ցիտադել)", "Բժշկական համալսարան", "Չարենցի փ․ (ՀՀ Ոստիկանություն)", "Չարենցի փ․ (ԵՊՀ)",
                    "Չարենցի փ․ (Zigzag խանութ-սրահ)", "Սայաթ-Նովա պ․ (Ալեք Մանուկյան խաչմերուկ)", "Ալեք-Մանուկյան փ․", "Վարդանանց փ․", "Հանրապետական մ/դ", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("28", "M", "Եռաբլուր", "Շահումյանի 4-րդ փ․", "Առնո Բաբաջանյան փ․", "Զորավար Անդրանիկի փ․", "Րաֆֆու փ․",
                    "Րաֆֆու փ․ (Մալաթիայի շուկա)", "Սեբաստիայի փ․ (Մալաթիայի շուկա)", "Վարուժանի փ․", "Վանթյան փ․", "Կուրղինյան փ․", "Սեբաստիայի փ․ (Կուրղինյան խաչմերուկ)",
                    "Բագրատունյաց պ․ (Իսակով խաչմերուկ)", "Բագրատունյաց պ․ (Երևան Սիթի)", "Բագրատունյաց պ․ (Արտաշիսյան խաչմերուկ)", "Գարեգին Նժդեհի հրապարակ",
                    "Գարեգին Նժդեհի փ․", "Արշակունյաց պ․ (Հայրենիք կ/թ)", "Արշակունյաց պ․ (Երևան Մոլ)", "Արշակունյաց պ․ (Կոմիտասի այգի)", "Արշակունյաց պ․ (Սուրմալու)",
                    "Արշակունյաց պ․ (Կրկես)", "Ագաթանգեղոսի փ․", "Մանկավարժական համալսարան", "Խանջյան փ․ (Լունապարկ)", "Վերնիսաժ", "Խանջյան փ․ (Շախմատի տուն)",
                    "Մոսկովյան փ․ (Կամերային երաժշտության տուն)", "Աբովյան փ․ (Երիտասարդական մ/կ)", "Աբովյան փ․ (Գյուղակադեմիա)", "Աբովյան փ․ (Պլանի գլուխ)",
                    "Սարալանջի փ․", "Ազատության պ․ (Հաղթանակի այգի)", "Ազատության պ․ (Զինկոմիսարիատ)", "Վարշավյան փ․", "Ուսումնական հանրակացարաններ", "", "", "", "",
                    "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("29", "M", "Արագածի փ.", "Մայիսի 9-ի փ․", "Չեխովի փ․", "Բագրատունյաց պ․ (Արտաշիսյան խաչմերուկ)",
                    "Գարեգին Նժդեհի հրապարակ", "Գարեգին Նժդեհի փ․", "Արշակունյաց պ․ (Հայրենիք կ/թ)", "Արշակունյաց պ․ (Երևան Մոլ)", "Արշակունյաց պ․ (Կոմիտասի այգի)",
                    "Արշակունյաց պ․ (Սուրմալու)", "Արշակունյաց պ․ (Կրկես)", "Ագաթանգեղոսի փ․", "Մանկավարժական համալսարան", "Տիգրան Մեծի պ․ (Այրարատ կ/թ)",
                    "Տիգրան Մեծի պ․ (Տաշիր ա/կ)", "Նար-Դոսի փ․ (Սիլաչի խաչմերուկ)", "Չարենցի փ․ (Zigzag խանութ-սրահ)", "Չարենցի փ․ (ԵՊՀ)", "Չարենցի փ․ (ՀՀ Ոստիկանություն)",
                    "Բժշկական համալսարան", "Աբովյան փ․ (Գյուղակադեմիա)", "Աբովյան փ․ (Պլանի գլուխ)", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("30", "M", "Դավթաշենի 4-րդ թաղ.", "Եղվարդի խճ․", "Տիգրան Պետրոսյան փ․", "Դավթաշենի 1-ին թաղ․",
                    "Կոմիտասի պ․ (Վաղարշյան խաչմերուկ)", "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)", "Կասյան փ․", "Բաղրամյան պ․ (SAS)", "Բաղրամյան պ․ (Կամոյի դպրոց)",
                    "Բաղրամյան պ․ (Ամերիկյան համալսարան)", "Բաղրամյան պ․ (Սահմանադրական դատարան)", "Մոսկովյան փ․ (Կասկադ)", "Մաշտոցի պ․ (Կոնսերվատորիա)",
                    "Մաշտոցի պ․ (Մատենադարան)", "Կորյունի փ․ (Ցիտադել)", "Բժշկական համալսարան", "Նալբանդյան փ․ (ԵՊՏՀ)", "Խանջյան փ․ (Շախմատի տուն)", "Երվանդ Քոչար փ․",
                    "Տիգրան Մեծի պ․ (Տաշիր ա/կ)", "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)", "Տիգրան Մեծի պ․ (Կայարան)", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("31", "M", "Դավթաշենի 4-րդ թաղ.", "Եղվարդի խճ․", "Դավթաշենի 1-ին թաղ․", "Տիգրան Պետրոսյան փ․", "Իոսիֆյան փ․",
                    "Հալաբյան փ․ (Ֆիզիկայի խաչմերուկ)", "Հալաբյան փ․ (ԹՈՒՄՈ)", "Հալաբյան փ․ (Կիևյան կամուրջ)", "Կիևյան փ․ (Կիևյան կամուրջ)", "Կիևյան փ․ (Օրբելի խաչմերուկ)",
                    "Կիևյան փ․ (Բարեկամություն)", "Կասյան փ․", "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)", "Կոմիտասի պ․ (Վաղարշյան խաչմերուկ)", "Կոմիտասի պ․ (Փափազյան խաչմերուկ)",
                    "Կոմիտասի պ․ (Սլավոնական համալսարան)", "Կոմիտասի պ․ (Վրացական խաչմերուկ)", "Կոմիտասի պ․ (Կոմիտասի շուկա)", "Կոմիտասի պ․ (Լամբադա կամուրջ)",
                    "Դավիթ Անհաղթի փ․ (թաղապետարան)", "Դավիթ Անհաղթի փ․ (Կերամա Մարացի)", "Դավիթ Անհաղթի փ․ (Դրոյի խաչմերուկ)", "Ռուբինյանց փ․ (Ահարոնյան փ․)",
                    "Ռուբինյանց փ․ (Երևան Սիթի)", "Ռուբինյանց փ․ (Ալմաստ գ/ն)", "Գայի պ․ (Աքվատեք)", "Գայի պ․ (Գայի արձան)", "Գայի պ․ (Մերսեդեսի սրահ)", "Հովհաննիսյան փ․",
                    "Թևոսյան փ․", "Քոչինյան փ․", "Ջրվեժ", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            /////29A soon
            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("31ա", "M", "Արաքս գ/ն", "Եղվարդի խճ․", "Անաստաս Միկոյան փ․", "Դավթաշենի 4-րդ թաղ․",
                    "Դավթաշենի 3-րդ թաղ․", "Արմենիա հ/ը", "Հալաբյան փ․ (Ֆիզիկայի խաչմերուկ)", "Մարգարյան փ․ (Հանրապետական հիվ․)", "Մարգարյան փ․ (Պեգաս)", "Բաշինջաղյան փ․",
                    "Մազմանյան փ․", "Շիրազի փ․", "Գրիգոր Հասրաթյան փ․", "Սեբաստիայի փ․ (Լենինգրադյան խաչմերուկ)", "Սեբաստիայի փ․ (Տիչինայի խաչմերուկ)", "Սեբաստիայի փ․ (Մալաթիայի շուկա)",
                    "Րաֆֆու փ․ (Մալաթիայի շուկա)", "Րաֆֆու փ․", "Գուսան Շերամի փ․", "Օհանովի փ․", "Զորավար Անդրանիկի փ․", "ՀԱԹ", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("32", "M", "Առինջ Մոլ", "Ավան-Առինջ", "Տաշքենդի փ․", "Մարշալ Բաբաջանյան փ․", "Ալմաթիի փ․", "Մարշալ Խուդյակովի փ․",
                    "Նվեր Սաֆարյան փ․", "Դուրյան թաղ․", "Վախթանգովի փ․", "Թոթովենցի փ․", "Ստեփանյան փ․", "Գայի պ․ (Մերսեդեսի սրահ)", "Բադալ Մուրադյան փ․", "Արտեմ Միկոյան փ․",
                    "Մինսկի փ․ (Նոր նորքի 8-րդ զ/ծ)", "Նոր Նորքի 8-րդ զ/ծ", "Վիլնյուսի փ․", "Նոր Նորքի 7-րդ զ/ծ", "Հունան Ավետիսյան փ․", "Դավիթ Բեկի փ․", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("33", "M", "Աերացիա", "Շիրակի 5-րդ նրբ․", "գ. Գեղանիստ", "գ. Արգավանդ", "Ծովակալ Իսակովի պ․",
                    "Առնո Բաբաջանյան փ․", "Զորավար Անդրանիկի փ․", "Րաֆֆու փ․", "Րաֆֆու փ․ (Մալաթիայի շուկա)", "Սեբաստիայի փ․ (Մալաթիայի շուկա)",
                    "Սեբաստիայի փ․ (Կուրղինյան խաչմերուկ)", "Ծովակալ Իսակովի պ․ (Սեբաստիայի խաչմերուկ)", "Կիլիկիա ավտոկայան", "Հաղթանակ կամուրջ", "Մաշտոցի պ․ (Ձկան խանութ)",
                    "Մաշտոցի պ․ (Ծածկած շուկա)", "Մաշտոցի պ․ (Ամիրյան խաչմերուկ)", "Մաշտոցի պ․ (Մարգարյան հիվ․)", "Մաշտոցի պ․ (Օպերա)", "Մաշտոցի պ․ (Կոնսերվատորիա)",
                    "Մոսկովյան փ․ (Կոնսերվատորիա)", "Աբովյան փ․ (Երիտասարդական մ/կ)", "Աբովյան փ․ (Գյուղակադեմիա)", "Աբովյան փ․ (Պլանի գլուխ)", "Սարալանջի փ․",
                    "Ազատության պ․ (Հաղթանակի այգի)", "Ազատության պ․ (Զինկոմիսարիատ)", "Ազատության պ․ (Նաիրի Զարյան խաչմերուկ)", "Ազատության պ․ (Ռայկոմ)",
                    "Պարույր Սևակի փ․", "Ուլնեցու փ․", "Էզրաս Հասրաթյան փ․", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            /////10A soon
            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("33ա", "M", "Նոր Նորքի 1-ին զ/ծ", "Նորք կ/թ", "Ջուղայի փ․", "Ներսոն Սաֆարյան փ․",
                    "Գայի պ․ (Գայի արձան)", "Գայի պ․ (Աքվատեք)", "Ռուբինյանց փ․ (Ալմաստ գ/ն)", "Ռուբինյանց փ․ (Երևան Սիթի)", "Պարույր Սևակի փ․", "Ուլնեցու փ․", "Ահարոնյան փ․",
                    "Ազատության պ․ (Ռայկոմ)", "Ազատության պ․ (Նաիրի Զարյան խաչմերուկ)", "Ազատության պ․ (Հաղթանակի այգի)", "Ազատության պ․ (Զինկոմիսարիատ)", "Սարալանջի փ․",
                    "Աբովյան փ․ (Պլանի գլուխ)", "Աբովյան փ․ (Գյուղակադեմիա)", "Աբովյան փ․ (Երիտասարդական մ/կ)", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("34", "M", "Մարս գ-ն", "Գուսան Շերամի փ․", "Րաֆֆու փ․", "Րաֆֆու փ․ (Մալաթիայի շուկա)",
                    "Սեբաստիայի փ․ (Մալաթիայի շուկա)", "Սեբաստիայի փ․ (Տիչինայի խաչմերուկ)", "Սեբաստիայի փ․ (Լենինգրադյան խաչմերուկ)", "Լենինգրադյան փ․ (Եվրովագեն)",
                    "Լենինգրադյան փ․ (Շինարարների խաչմերուկ)", "Լենինգրադյան փ․ (Մոնթե Մելքոնյան խաչմերուկ)", "Լենինգրադյան փ․ (Կիևյան կամուրջ)", "Կիևյան փ․ (Կիևյան կամուրջ)",
                    "Կիևյան փ․ (Օրբելի խաչմերուկ)", "Կիևյան փ․ (Բարեկամություն)", "Կասյան փ․", "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)", "Կոմիտասի պ․ (Վաղարշյան խաչմերուկ)",
                    "Կոմիտասի պ․ (Փափազյան խաչմերուկ)", "Կոմիտասի պ․ (Սլավոնական համալսարան)", "Կոմիտասի պ․ (Վրացական խաչմերուկ)", "Կոմիտասի պ․ (Կոմիտասի շուկա)",
                    "Կոմիտասի պ․ (Լամբադա կամուրջ)", "Դավիթ Անհաղթի փ․ (թաղապետարան)", "Դավիթ Անհաղթի փ․ (Կերամա Մարացի)", "Դավիթ Անհաղթի փ․ (Դրոյի խաչմերուկ)",
                    "Ռուբինյանց փ․ (Ահարոնյան փ․)", "Ռուբինյանց փ․ (Երևան Սիթի)", "Ռուբինյանց փ․ (Ալմաստ գ/ն)", "Ծարավ Աղբյուրի փ․", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("35", "M", "Դավթաշենի 4-րդ թաղ․", "Տիգրան Պետրոսյան փ․", "Դավթաշենի 1-ին թաղ․", "Իոսիֆյան փ․",
                    "Հալաբյան փ․ (Ֆիզիկայի խաչմերուկ)", "Մարգարյան փ․ (Հանրապետական հիվ․)", "Մարգարյան փ․ (Պեգաս)", "Բաշինջաղյան փ․", "Ջանիբեկյան փ․", "Գրիգոր Հասրաթյան փ․",
                    "Սեբաստիայի փ․ (Լենինգրադյան խաչմերուկ)", "Սեբաստիայի փ․ (Տիչինայի խաչմերուկ)", "Սեբաստիայի փ․ (Մալաթիայի շուկա)", "Րաֆֆու փ․ (Մալաթիայի շուկա)",
                    "Րաֆֆու փ․", "Գուսան Շերամի փ․", "Օհանովի փ․", "Շիրազի փ․", "Գրիգոր Հասրաթյան փ․", "15-րդ թաղամաս", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("36", "M", "Սպանդարյան կայարան", "Սիլիկյան 4-րդ փ․", "Սիլիկյան 10-րդ փ․", "Սիլիկյան Նոր խճ․",
                    "Սեբաստիայի փ․ (Լենինգրադյան խաչմերուկ)", "Սեբաստիայի փ․ (Տիչինայի խաչմերուկ)", "Սեբաստիայի փ․ (Մալաթիայի շուկա)", "Րաֆֆու փ․ (Մալաթիայի շուկա)",
                    "Րաֆֆու փ․", "Առնո Բաբաջանյան փ․", "գ. Արգավանդ", "գ. Գեղանիստ", "Աերացիա", "Շիրակի 5-րդ նրբ.", "Շիրակի փ․ (Ձիարշավարան)", "Շիրակի փ․ (Չարբախի շուկա)",
                    "Շարուրի փ․", "Էլեկտրոն գ/ն", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("37", "M", "գ. Քասախ", "Աշտարակի խճ.", "16-րդ թաղամաս", "Նորաշեն թաղ.", "Չաուշի փ․", "Մելքումովի փ.", "Ֆուչիկի փ․",
                    "Մարգարյան փ․ (Հանրապետական հիվ․)", "Հալաբյան փ․ (Ֆիզիկայի խաչմերուկ)", "Հալաբյան փ․ (Ֆիզիկայի խաչմերուկ)", "Հալաբյան փ․ (ԹՈՒՄՈ)", "Էստոնական փ․",
                    "Շինարարների փ․", "Լենինգրադյան փ․ (Շինարարների խաչմերուկ)", "Լենինգրադյան փ․ (Եվրովագեն)", "Սեբաստիայի փ․ (Լենինգրադյան խաչմերուկ)",
                    "Սեբաստիայի փ․ (Տիչինայի խաչմերուկ)", "Սեբաստիայի փ․ (Մալաթիայի շուկա)", "Րաֆֆու փ․ (Մալաթիայի շուկա)", "Րաֆֆու փ․", "Զորավար Անդրանիկի փ․",
                    "Առնո Բաբաջանյան փ․", "Էջմիածնի խճ.", "գ․ Արգավանդ", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("38", "M", "Պրոթեզավորման Կենտրոն", "Ծարավ Աղբյուրի փ․", "Ռուբինյանց փ․ (Ալմաստ գ/ն)",
                    "Ռուբինյանց փ․ (Երևան Սիթի)", "Ռուբինյանց փ․ (Ահարոնյան փ․)", "Դավիթ Անհաղթի փ․ (Դրոյի խաչմերուկ)", "Դավիթ Անհաղթի փ․ (Կերամա Մարացի)",
                    "Դավիթ Անհաղթի փ․ (թաղապետարան)", "Ազատության պ․ (Նաիրի Զարյան խաչմերուկ)", "Ազատության պ․ (Զինկոմիսարիատ)", "Ազատության պ․ (Հաղթանակի այգի)",
                    "Սարալանջի փ․", "Տերյան փ․", "Կորյունի փ․ (Ցիտադել)", "Աբովյան փ․ (Երիտասարդական մ/կ)", "Սայաթ-Նովա պ․ (Նալբանդյան խաչմերուկ)", "Մաշտոցի պ․ (Օպերա)",
                    "Մաշտոցի պ․ (Մարգարյան հիվ․)", "Մաշտոցի պ․ (Ամիրյան խաչմերուկ)", "Մաշտոցի պ․ (Ծածկած շուկա)", "Մաշտոցի պ․ (Ձկան խանութ)",
                    "Գրիգոր Լուսավորիչ (Երևանի քաղաքապետարան)", "Արշակունյաց պ․ (Կրկես)", "Ագաթանգեղոսի փ․", "Մանկավարժական համալսարան", "Տիգրան Մեծի պ․ (Այրարատ կ/թ)",
                    "Տիգրան Մեծի պ․ (Տաշիր ա/կ)", "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)", "Տիգրան Մեծի պ․ (Կայարան)", "Արցախի փ․", "Արին Բերդի 3-րդ նրբ.", "ՋԵԿ", "", "", "", "", "", "",
                    "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("39", "M", "Շիրակի փ․ (Չարբախի շուկա)", "Արտաշիսյան փ․", "Բագրատունյաց պ․ (Արտաշիսյան խաչմերուկ)",
                    "Գարեգին Նժդեհի հրապարակ", "Գարեգին Նժդեհի փ․", "Արշակունյաց պ․ (Հայրենիք կ/թ)", "Արշակունյաց պ․ (Երևան Մոլ)", "Արշակունյաց պ․ (Կոմիտասի այգի)",
                    "Արշակունյաց պ․ (Սուրմալու)", "Արշակունյաց պ․ (Կրկես)", "Գրիգոր Լուսավորիչ (Կրկես)", "Գրիգոր Լուսավորիչ (Երևանի քաղաքապետարան)", "Պարոնյան փ․ (Կեսարի պալատ)",
                    "Պարոնյան փ․ (Նաիրի բ/կ)", "Պռոշյան փ․ ", "Բաղրամյան պ․ (Կամոյի դպրոց)", "Բաղրամյան պ․ (SAS)", "Կասյան փ․",
                    "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)", "Կոմիտասի պ․ (Վաղարշյան խաչմերուկ)", "Կոմիտասի պ․ (Փափազյան խաչմերուկ)", "Կոմիտասի պ․ (Սլավոնական համալսարան)",
                    "Կոմիտասի պ․ (Վրացական խաչմերուկ)", "Կոմիտասի պ․ (Կոմիտասի շուկա)", "Կոմիտասի պ․ (Լամբադա կամուրջ)", "Շիրվանզադեի փ․", "Կանազ հոսպիտալ", "Ադոնցի փ․", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("40", "M", "Նոր Նորքի 9-րդ զ/ծ", "Վիլնյուսի փ․", "Մինսկի փ․ (Նոր նորքի 8-րդ զ/ծ)", "Արտեմ Միկոյան փ․",
                    "Գալշոյան փ․", "Բադալ Մուրադյան փ․", "Գայի պ․ (Մերսեդեսի սրահ)", "Գայի պ․ (Գայի արձան)", "Գայի պ․ (Աքվատեք)", "Ռուբինյանց փ․ (Ալմաստ գ/ն)",
                    "Ռուբինյանց փ․ (Երևան Սիթի)", "Պարույր Սևակի փ․", "Ուլնեցու փ․", "Էզրաս Հասրաթյան փ․", "Զաքարիա Քանաքեռցու փ․", "Թբիլիսյան խճ․ (Ռադիոկայմ)", "Գազպրոմ Արմենիա",
                    "Հյուսիսային ավտոկայան", "Առինջ Մոլ", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("41", "M", "Էլեկտրոն գ/ն", "Շարուրի փ․", "Շիրակի փ․ (Չարբախի շուկա)", "Արտաշիսյան փ․",
                    "Մանթաշյան փ․", "Չեխովի փ․", "Մայիսի 9-ի փ․", "Գարեգին Նժդեհի փ․", "Արշակունյաց պ․ (Հայրենիք կ/թ)", "Արշակունյաց պ․ (Երևան Մոլ)",
                    "Արշակունյաց պ․ (Կոմիտասի այգի)", "Արշակունյաց պ․ (Սուրմալու)", "Արշակունյաց պ․ (Կրկես)", "Գրիգոր Լուսավորիչ (Երևանի քաղաքապետարան)",
                    "Մաշտոցի պ․ (Ձկան խանութ)", "Մաշտոցի պ․ (Ծածկած շուկա)", "Մաշտոցի պ․ (Ամիրյան խաչմերուկ)", "Մաշտոցի պ․ (Մարգարյան հիվ․)", "Մաշտոցի պ․ (Օպերա)",
                    "Տերյան փ․", "Կորյունի փ․ (Ցիտադել)", "Աբովյան փ․ (Երիտասարդական մ/կ)", "Աբովյան փ․ (Գյուղակադեմիա)", "Աբովյան փ․ (Պլանի գլուխ)", "Սարալանջի փ․",
                    "Ազատության պ․ (Հաղթանակի այգի)", "Ազատության պ․ (Զինկոմիսարիատ)", "Ազատության պ․ (Նաիրի Զարյան խաչմերուկ)", "Ազատության պ․ (Ռայկոմ)", "Ադոնցի փ․",
                    "Շիրվանզադեի փ․", "Մամիկոնյանց փ․", "Մալխասյանց փ․", "Հուշանվերների կոմբինատ", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("42", "M", "ՀԱԹ", "Առնո Բաբաջանյան փ․", "Զորավար Անդրանիկի փ․", "Րաֆֆու փ․",
                    "Րաֆֆու փ․ (Մալաթիայի շուկա)", "Սեբաստիայի փ․ (Մալաթիայի շուկա)", "Վարուժանի փ․", "Վանթյան փ․", "Կուրղինյան փ․", "Սեբաստիայի փ․ (Կուրղինյան խաչմերուկ)",
                    "Բագրատունյաց պ․ (Իսակով խաչմերուկ)", "Բագրատունյաց պ․ (Երևան Սիթի)", "Բագրատունյաց պ․ (Արտաշիսյան խաչմերուկ)", "Գարեգին Նժդեհի հրապարակ",
                    "Գարեգին Նժդեհի փ․", "Արշակունյաց պ․ (Հայրենիք կ/թ)", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("43", "M", "Լեփսիուսի փ․", "Զեյթունի 5-րդ փ․", "Դրոյի փ․", "Պարույր Սևակի փ․", "Ուլնեցու փ․",
                    "Ներսիսյան փ․", "Ազատության պ․ (Ռայկոմ)", "Ազատության պ․ (Նաիրի Զարյան խաչմերուկ)", "Ազատության պ․ (Զինկոմիսարիատ)", "Ազատության պ․ (Հաղթանակի այգի)",
                    "Սարալանջի փ․", "Աբովյան փ․ (Պլանի գլուխ)", "Աբովյան փ․ (Գյուղակադեմիա)", "Աբովյան փ․ (Երիտասարդական մ/կ)", "Մոսկովյան փ․ (Կամերային երաժշտության տուն)",
                    "Խանջյան փ․ (Շախմատի տուն)", "Վերնիսաժ", "Խանջյան փ․ (Լունապարկ)", "Մանկավարժական համալսարան", "Տիգրան Մեծի պ․ (Այրարատ կ/թ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)",
                    "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)", "Տիգրան Մեծի պ․ (Կայարան)", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("44", "M", "Էներգետիկների բանավան", "Էջմիածնի խճ.", "Առնո Բաբաջանյան փ․", "Զորավար Անդրանիկի փ․",
                    "Րաֆֆու փ․", "Րաֆֆու փ․ (Մալաթիայի շուկա)", "Սեբաստիայի փ․ (Մալաթիայի շուկա)", "Սեբաստիայի փ․ (Կուրղինյան խաչմերուկ)", "Բագրատունյաց պ․ (Իսակով խաչմերուկ)",
                    "Բագրատունյաց պ․ (Երևան Սիթի)", "Բագրատունյաց պ․ (Արտաշիսյան խաչմերուկ)", "Գարեգին Նժդեհի հրապարակ", "Գարեգին Նժդեհի փ․", "Արշակունյաց պ․ (Հայրենիք կ/թ)",
                    "Աշխատանքի հրապարակ (Բանվորի արձան)", "Նորագավթի 1-ին փ․", "գ. Մարմարաշեն", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("45", "M", "Էրեբունու զ/ծ ", "Խաղաղ Դոնի փ․", "Տիտոգրադյան փ․", "Այվազովսկու փ․", "Էրեբունու փ․",
                    "Մուրացանի փ․", "Ռոստովյան փ․", "Արցախի փ․", "Տիգրան Մեծի պ․ (Կայարան)", "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)",
                    "Տիգրան Մեծի պ․ (Այրարատ կ/թ)", "Մանկավարժական համալսարան", "Խանջյան փ․ (Լունապարկ)", "Վերնիսաժ", "Խանջյան փ․ (Շախմատի տուն)",
                    "Մոսկովյան փ․ (Կամերային երաժշտության տուն)", "Աբովյան փ․ (Երիտասարդական մ/կ)", "Աբովյան փ․ (Գյուղակադեմիա)", "Աբովյան փ․ (Պլանի գլուխ)", "Սարալանջի փ․",
                    "Ազատության պ․ (Հաղթանակի այգի)", "Ազատության պ․ (Զինկոմիսարիատ)", "Ազատության պ․ (Նաիրի Զարյան խաչմերուկ)", "Ազատության պ․ (Ռայկոմ)",
                    "Թբիլիսյան խճ․ (Լամպերի լիճ)", "Զաքարիա Քանաքեռցու փ․", "Էզրաս Հասրաթյան փ․", "Ուլնեցու փ․", "Ֆանարջյան փ․", "Ուռուցքաբանության ինստիտուտ", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("46", "M", "Նազարբեկյան թաղ.", "Սիլիկյան Նոր խճ․", "15-րդ թաղամաս", "Շիրազի փ․", "Ջանիբեկյան փ․", "Շինարարների փ․",
                    "Արզումանյան փ․", "Հալաբյան փ․ (Կիևյան կամուրջ)", "Կիևյան փ․ (Կիևյան կամուրջ)", "Կիևյան փ․ (Օրբելի խաչմերուկ)", "Կիևյան փ․ (Բարեկամություն)",
                    "Բաղրամյան պ․ (SAS)", "Բաղրամյան պ․ (Կամոյի դպրոց)", "Բաղրամյան պ․ (Ամերիկյան համալսարան)", "Բաղրամյան պ․ (Սահմանադրական դատարան)",
                    "Բաղրամյան պ․ (Օպերա)", "Մաշտոցի պ․ (Օպերա)", "Մաշտոցի պ․ (Մարգարյան հիվ․)", "Մաշտոցի պ․ (Ամիրյան խաչմերուկ)", "Մաշտոցի պ․ (Ծածկած շուկա)",
                    "Մաշտոցի պ․ (Ձկան խանութ)", "Գրիգոր Լուսավորիչ (Երևանի քաղաքապետարան)", "Ագաթանգեղոսի փ․", "Մանկավարժական համալսարան", "Խանջյան փ․ (Լունապարկ)",
                    "Վերնիսաժ", "Վարդանանց փ․", "Երվանդ Քոչար փ․", "Սբ. Գրիգոր Լուսավորիչ եկեղեցի", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("47", "M", "Նուբարաշենի 11-րդ փ․", "Նուբարաշենի 9-րդ փ․", "Նուբարաշենի 6-րդ փ․", "Նուբարաշենի խճ․",
                    "Խաղաղ Դոնի փ․", "Տիտոգրադյան փ․", "Այվազովսկու փ․", "Էրեբունու փ․", "Մուրացանի փ․", "Ռոստովյան փ․", "Արցախի փ․", "Տիգրան Մեծի պ․ (Կայարան)",
                    "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)", "Քրիստափորի փ․", "Փեթակ ա/կ", "Արշակունյաց պ․ (Կոմիտասի այգի)", "Արշակունյաց պ․ (Երևան Մոլ)", "Արշակունյաց պ․ (Հայրենիք կ/թ)",
                    "Աշխատանքի հրապարակ (Բանվորի արձան)", "Բագրատունյաց պ․ (Բանվորի արձան)", "Գարեգին Նժդեհի հրապարակ", "Բագրատունյաց պ․ (Արտաշիսյան խաչմերուկ)",
                    "Բագրատունյաց պ․ (Երևան Սիթի)", "Բագրատունյաց պ․ (Իսակով խաչմերուկ)", "Սեբաստիայի փ․ (Կուրղինյան խաչմերուկ)", "Սեբաստիայի փ․ (Մալաթիայի շուկա)",
                    "Րաֆֆու փ․ (Մալաթիայի շուկա)", "Րաֆֆու փ․", "Առնո Բաբաջանյան փ․", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("48", "M", "Գրանդ Քենդի ՀՁ", "Շահամիրյան փ․", "Արշակունյաց պ․ (Հայրենիք կ/թ)", "Գարեգին Նժդեհի փ․",
                    "Գարեգին Նժդեհի հրապարակ", "Բագրատունյաց պ․ (Արտաշիսյան խաչմերուկ)", "Բագրատունյաց պ․ (Արտաշիսյան խաչմերուկ)", "Բագրատունյաց պ․ (Երևան Սիթի)",
                    "Բագրատունյաց պ․ (Իսակով խաչմերուկ)", "Սեբաստիայի փ․ (Կուրղինյան խաչմերուկ)", "Սեբաստիայի փ․ (Մալաթիայի շուկա)", "Սեբաստիայի փ․ (Տիչինայի խաչմերուկ)",
                    "Սեբաստիայի փ․ (Լենինգրադյան խաչմերուկ)", "Լենինգրադյան փ․ (Եվրովագեն)", "Լենինգրադյան փ․ (Շինարարների խաչմերուկ)", "Շինարարների փ․", "Արզումանյան փ․",
                    "Հալաբյան փ․ (Կիևյան կամուրջ)", "Հալաբյան փ․ (ԹՈՒՄՈ)", "Հալաբյան փ․ (Ֆիզիկայի խաչմերուկ)", "Մարգարյան փ․ (Հանրապետական հիվ․)", "Մարգարյան փ․ (Պեգաս)",
                    "Բաշինջաղյան փ․", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("49", "M", "Ներքին Շենգավիթի 11-րդ փ.", "Ներքին Շենգավիթի 9-րդ փ.", "Շենգավիթ մ/կ", "Տարոնցու փ․",
                    "Բագրատունյաց պ․ (Բանվորի արձան)", "Գարեգին Նժդեհի հրապարակ", "Գարեգին Նժդեհի փ․", "Արցախի փ․", "Տիգրան Մեծի պ․ (Կայարան)", "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)",
                    "Տիգրան Մեծի պ․ (Տաշիր ա/կ)", "Տիգրան Մեծի պ․ (Այրարատ կ/թ)", "Մանկավարժական համալսարան", "Խանջյան փ․ (Լունապարկ)", "Վերնիսաժ",
                    "Սայաթ-Նովա պ․ (Ալեք Մանուկյան խաչմերուկ)", "Չարենցի փ․ (Zigzag խանութ-սրահ)", "Չարենցի փ․ (ԵՊՀ)", "Չարենցի փ․ (ՀՀ Ոստիկանություն)",
                    "Բժշկական համալսարան", "Կորյունի փ․ (Ցիտադել)", "Մաշտոցի պ․ (Մատենադարան)", "Մաշտոցի պ․ (Կոնսերվատորիա)", "Մաշտոցի պ․ (Օպերա)", "Բաղրամյան պ․ (Օպերա)",
                    "Բաղրամյան պ․ (Սահմանադրական դատարան)", "Բաղրամյան պ․ (Ամերիկյան համալսարան)", "Բաղրամյան պ․ (Կամոյի դպրոց)", "Բաղրամյան պ․ (SAS)",
                    "Կասյան փ․", "Մերգելյանի ինստիտուտ", "Հակոբ Հակոբյան փ․", "Արամ Խաչատրյան փ․", "Ռիգայի փ․", "Ռուս-Հայկական համալսարան", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("50", "M", "Ժամացույցի գ/ն", "Աղբյուր Սերոբի փ․", "Գյուլբենկյան փ․",
                    "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)", "Կոմիտասի պ․ (Վաղարշյան խաչմերուկ)", "Կոմիտասի պ․ (Փափազյան խաչմերուկ)", "Կոմիտասի պ․ (Սլավոնական համալսարան)",
                    "Կոմիտասի պ․ (Վրացական խաչմերուկ)", "Կոմիտասի պ․ (Կոմիտասի շուկա)", "Կոմիտասի պ․ (Լամբադա կամուրջ)", "Ազատության պ․ (Նաիրի Զարյան խաչմերուկ)",
                    "Ազատության պ․ (Զինկոմիսարիատ)", "Ազատության պ․ (Հաղթանակի այգի)", "Սարալանջի փ․", "Աբովյան փ․ (Պլանի գլուխ)", "Աբովյան փ․ (Գյուղակադեմիա)",
                    "Աբովյան փ․ (Երիտասարդական մ/կ)", "Մոսկովյան փ․ (Կամերային երաժշտության տուն)", "Խանջյան փ․ (Շախմատի տուն)", "Վերնիսաժ", "Խանջյան փ․ (Լունապարկ)",
                    "Մանկավարժական համալսարան", "Տիգրան Մեծի պ․ (Այրարատ կ/թ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)", "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)", "Տիգրան Մեծի պ․ (Կայարան)",
                    "Արցախի փ․", "Էրեբունու փ․", "Այվազովսկու փ․", "Տիտոգրադյան փ․", "Խաղաղ Դոնի փ․", "Էրեբունու զ/ծ", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("52", "M", "Նազարբեկյան թաղ.", "Սիլիկյան Նոր խճ․", "15-րդ թաղամաս", "Չաուշի փ․", "Մելքումովի փ.",
                    "Բեկնազարյան փ․", "Մազմանյան փ․", "Շիրազի փ․", "Գրիգոր Հասրաթյան փ․", "Սեբաստիայի փ․ (Լենինգրադյան խաչմերուկ)", "Սեբաստիայի փ․ (Տիչինայի խաչմերուկ)",
                    "Սեբաստիայի փ․ (Մալաթիայի շուկա)", "Սեբաստիայի փ․ (Կուրղինյան խաչմերուկ)", "Բագրատունյաց պ․ (Իսակով խաչմերուկ)", "Բագրատունյաց պ․ (Երևան Սիթի)",
                    "Բագրատունյաց պ․ (Արտաշիսյան խաչմերուկ)", "Գարեգին Նժդեհի հրապարակ", "Բագրատունյաց պ․ (Բանվորի արձան)", "Աշխատանքի հրապարակ (Բանվորի արձան)",
                    "Արշակունյաց պ․ (Դեպի Չարբախ)", "Էրեբունի օդանավակայան", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("52ա", "M", "Նազարբեկյան թաղ.", "Չաուշի փ․", "Մազմանյան փ․", "Բաշինջաղյան փ․", "Մարգարյան փ․ (Պեգաս)",
                    "Մարգարյան փ․ (Հանրապետական հիվ․)", "Հալաբյան փ․ (Ֆիզիկայի խաչմերուկ)", "Հալաբյան փ․ (ԹՈՒՄՈ)", "Հալաբյան փ․ (Կիևյան կամուրջ)", "Կիևյան փ․ (Կիևյան կամուրջ)",
                    "Կիևյան փ․ (Օրբելի խաչմերուկ)", "Կիևյան փ․ (Բարեկամություն)", "Հրաչյա Քոչար փ․ (Գյուլբենկյան խաչմերուկ)", "Հրաչյա Քոչար փ․ (Վաղարշյան խաչմերուկ)",
                    "Հրաչյա Քոչար փ․ (Փափազյան խաչմերուկ)", "Հրաչյա Քոչար փ․ (Վրացական խաչմերուկ)", "Բորսայի շենք", "Նաիրի Զարյան փ․", "Գրիբոյեդովի փ․",
                    "Կոմիտասի պ․ (Կոմիտասի շուկա)", "Կոմիտասի պ․ (Լամբադա կամուրջ)", "Ազատության պ․ (Ռայկոմ)", "Ներսիսյան փ․", "Ուլնեցու փ․", "Պարույր Սևակի փ․",
                    "Ռուբինյանց փ․ (Երևան Սիթի)", "Ռուբինյանց փ․ (Ալմաստ գ/ն)", "Գայի պ․ (Աքվատեք)", "Գայի պ․ (Գայի արձան)", "Գայի պ․ (Մերսեդեսի սրահ)", "Գյուլիքեխվյան փ․",
                    "Նոր Նորքի 4-րդ զ/ծ", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("53", "M", "Ջրվեժ", "Քոչինյան փ․", "Բագրևանդի փ․", "Մոլդովական փ․", "Գայի պ․ (Մերսեդեսի սրահ)",
                    "Բադալ Մուրադյան փ․", "Դավիթ Բեկի փ․", "Ռոստովյան փ․", "Վստրեչի կամուրջ", "Աշխատանքի հրապարակ (Բանվորի արձան)", "Բագրատունյաց պ․ (Բանվորի արձան)",
                    "Գարեգին Նժդեհի հրապարակ", "Մանանդյան փ․", "Հ․Հովսեփյան փ․", "Չեխովի փ․", "Արտաշիսյան փ․", "Հովհաննիսյան փ․", "Վերին Չարբախ", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("54", "M", "Դավթաշենի 4-րդ թաղ․", "Եղվարդի խճ․", "Տիգրան Պետրոսյան փ․", "Դավթաշենի 1-ին թաղ․",
                    "Սասնա Ծռերի փ․", "Արմենիա հ/ը", "Հալաբյան փ․ (Ֆիզիկայի խաչմերուկ)", "Հալաբյան փ․ (ԹՈՒՄՈ)", "Հալաբյան փ․ (Կիևյան կամուրջ)", "Կիևյան փ․ (Կիևյան կամուրջ)",
                    "Կիևյան փ․ (Օրբելի խաչմերուկ)", "Կիևյան փ․ (Բարեկամություն)", "Բաղրամյան պ․ (SAS)", "Բաղրամյան պ․ (Կամոյի դպրոց)", "Պռոշյան փ․ ",
                    "Պարոնյան փ․ (Նաիրի բ/կ)", "Պարոնյան փ․ (Կեսարի պալատ)", "Գրիգոր Լուսավորիչ (Երևանի քաղաքապետարան)", "Գրիգոր Լուսավորիչ (Կրկես)", "Ագաթանգեղոսի փ․",
                    "Տիգրան Մեծի պ․ (Այրարատ կ/թ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)", "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)", "Տիգրան Մեծի պ․ (Կայարան)", "Սասունցի Դավթի փ․",
                    "Ազատամարտիկների փ․", "Էրեբունու փ․", "Էրեբունու թ/ն", "Մահարու փ․", "գ. Ջրաշեն", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("55", "M", "Նոր Նորքի 2-րդ զ/ծ", "Մոլդովական փ․", "Ստեփանյան փ․", "Գայի պ․ (Գայի արձան)",
                    "Գայի պ․ (Աքվատեք)", "Մյասնիկյան պ․ (Ջրաշխարհ)", "Մյասնիկյան պ․ (Կենդանաբանական այգի)", "Մյասնիկյան պ․ (Հերացի խաչմերուկ)", "Աբովյան փ․ (Պլանի գլուխ)",
                    "Աբովյան փ․ (Գյուղակադեմիա)", "Աբովյան փ․ (Երիտասարդական մ/կ)", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("56", "M", "Կաթի կոմբինատ", "գ. Հաղթանակի 8-րդ փ․", "գ. Հաղթանակի 3-րդ փ․",
                    "գ. Հաղթանակի 10-րդ փ․", "գ. Հաղթանակի 9-րդ փ․", "գ. Հաղթանակի 2-րդ փ․", "գ. Հաղթանակի 1-ին փ․", "Օհանովի փ․", "Զորավար Անդրանիկի փ․", "Րաֆֆու փ․",
                    "Րաֆֆու փ․ (Մալաթիայի շուկա)", "Սեբաստիայի փ․ (Մալաթիայի շուկա)", "Սեբաստիայի փ․ (Տիչինայի խաչմերուկ)", "Սեբաստիայի փ․ (Լենինգրադյան խաչմերուկ)",
                    "Լենինգրադյան փ․ (Եվրովագեն)", "Լենինգրադյան փ․ (Շինարարների խաչմերուկ)", "Լենինգրադյան փ․ (Մոնթե Մելքոնյան խաչմերուկ)", "Լենինգրադյան փ․ (Կիևյան կամուրջ)",
                    "Կիևյան փ․ (Կիևյան կամուրջ)", "Կիևյան փ․ (Օրբելի խաչմերուկ)", "Կիևյան փ․ (Բարեկամություն)", "Հրաչյա Քոչար փ․ (Գյուլբենկյան խաչմերուկ)",
                    "Հրաչյա Քոչար փ․ (Վաղարշյան խաչմերուկ)", "Հրաչյա Քոչար փ․ (Փափազյան խաչմերուկ)", "Հրաչյա Քոչար փ․ (Վրացական խաչմերուկ)", "Բորսայի շենք",
                    "Նաիրի Զարյան փ․", "Գրիբոյեդովի փ․", "Կոմիտասի պ․ (Կոմիտասի շուկա)", "Կոմիտասի պ․ (Լամբադա կամուրջ)", "Դավիթ Անհաղթի փ․ (թաղապետարան)",
                    "Դավիթ Անհաղթի փ․ (Կերամա Մարացի)", "Դավիթ Անհաղթի փ․ (Դրոյի խաչմերուկ)", "Ռուբինյանց փ․ (Ահարոնյան փ․)", "Ռուբինյանց փ․ (Երևան Սիթի)",
                    "Ռուբինյանց փ․ (Ալմաստ գ/ն)", "Աճառյան փ․", "Մարշալ Բաբաջանյան փ․", "Տաշքենդի փ․", "Ավան-Առինջ", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("57", "M", "Դավթաշենի 1-ին թաղ.", "Աղաբաբյան փ․", "Տիգրան Պետրոսյան փ․", "Իոսիֆյան փ․",
                    "Հալաբյան փ․ (Ֆիզիկայի խաչմերուկ)", "Մարգարյան փ․ (Հանրապետական հիվ․)", "Մարգարյան փ․ (Պեգաս)", "Բաշինջաղյան փ․", "Ջանիբեկյան փ․", "Գրիգոր Հասրաթյան փ․",
                    "Սեբաստիայի փ․ (Լենինգրադյան խաչմերուկ)", "Սեբաստիայի փ․ (Տիչինայի խաչմերուկ)", "Սեբաստիայի փ․ (Մալաթիայի շուկա)", "Սեբաստիայի փ․ (Կուրղինյան խաչմերուկ)",
                    "Բագրատունյաց պ․ (Իսակով խաչմերուկ)", "Բագրատունյաց պ․ (Երևան Սիթի)", "Բագրատունյաց պ․ (Արտաշիսյան խաչմերուկ)", "Արտաշիսյան փ․",
                    "Շիրակի փ․ (Էրեբունի օդանավակայան)", "Արշակունյաց պ․ (Դեպի Չարբախ)", "Նորագավթի 1-ին փ․", "Արտաշատի խճ․", "գ․ Այնթափ", "ք․ Մասիս", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("58", "M", "Նոր Նորքի 8-րդ զ/ծ", "Մինսկի փ․ (Նոր նորքի 8-րդ զ/ծ)", "Արտեմ Միկոյան փ․",
                    "Բադալ Մուրադյան փ․", "Գայի պ․ (Մերսեդեսի սրահ)", "Գայի պ․ (Գայի արձան)", "Գայի պ․ (Աքվատեք)", "Ռուբինյանց փ․ (Ալմաստ գ/ն)", "Ռուբինյանց փ․ (Երևան Սիթի)",
                    "Ռուբինյանց փ․ (Ահարոնյան փ․)", "Դավիթ Անհաղթի փ․ (Դրոյի խաչմերուկ)", "Դավիթ Անհաղթի փ․ (Կերամա Մարացի)", "Դավիթ Անհաղթի փ․ (թաղապետարան)",
                    "Կոմիտասի պ․ (Լամբադա կամուրջ)", "Կոմիտասի պ․ (Կոմիտասի շուկա)", "Կոմիտասի պ․ (Վրացական խաչմերուկ)", "Կոմիտասի պ․ (Սլավոնական համալսարան)",
                    "Կոմիտասի պ․ (Փափազյան խաչմերուկ)", "Կոմիտասի պ․ (Վաղարշյան խաչմերուկ)", "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)", "Կասյան փ․", "Կիևյան փ․ (Բարեկամություն)",
                    "Կիևյան փ․ (Օրբելի խաչմերուկ)", "Կիևյան փ․ (Կիևյան կամուրջ)", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("59", "M", "Սուրբ Գրիգոր Լուսավորիչ բ/կ", "Գյուրջյան փ․ ", "Բաղյան փ․",
                    "Գայի պ․ (Մերսեդեսի սրահ)", "Գայի պ․ (Գայի արձան)", "Գայի պ․ (Աքվատեք)", "Ռուբինյանց փ․ (Ալմաստ գ/ն)", "Ռուբինյանց փ․ (Երևան Սիթի)", "Պարույր Սևակի փ․",
                    "Ազատության պ․ (Ռայկոմ)", "Կոմիտասի պ․ (Լամբադա կամուրջ)", "Կոմիտասի պ․ (Կոմիտասի շուկա)", "Կոմիտասի պ․ (Վրացական խաչմերուկ)",
                    "Կոմիտասի պ․ (Սլավոնական համալսարան)", "Կոմիտասի պ․ (Փափազյան խաչմերուկ)", "Կոմիտասի պ․ (Վաղարշյան խաչմերուկ)", "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)",
                    "Կասյան փ․", "Կիևյան փ․ (Բարեկամություն)", "Կիևյան փ․ (Օրբելի խաչմերուկ)", "Կիևյան փ․ (Կիևյան կամուրջ)", "Լենինգրադյան փ․ (Կիևյան կամուրջ)",
                    "Ծիծեռնակաբերդի խճ․", "Դալմա Գարդեն Մոլ", "Աթենքի փ․", "Հրազդան մ/դ", "Կիլիկիա ավտոկայան", "Ծովակալ Իսակովի պ․", "Ծովակալ Իսակովի պ․ (Սեբաստիայի խաչմերուկ)",
                    "Սեբաստիայի փ․ (Կուրղինյան խաչմերուկ)", "Կուրղինյան փ․", "Վանթյան փ․", "Վարուժանի փ․", "Սեբաստիայի փ․ (Մալաթիայի շուկա)", "Րաֆֆու փ․ (Մալաթիայի շուկա)",
                    "Րաֆֆու փ․", "Գուսան Շերամի փ․", "Օհանովի փ․", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("60", "M", "Նուբարաշենի խճ. (Զորամաս)", "Խաչիկ Դաշտենցի փ․", "Էրեբունու թ/ն", "Էրեբունու փ․",
                    "Մուրացանի փ․", "Սասունցի Դավթի փ․", "Տիգրան Մեծի պ․ (Կայարան)", "Քրիստափորի փ․", "Նար-Դոսի փ․ (Սիլաչի խաչմերուկ)", "Խորենացու փ․ (Սիլաչի)",
                    "Չարենցի փ․ (Zigzag խանութ-սրահ)", "Չարենցի փ․ (ԵՊՀ)", "Չարենցի փ․ (ՀՀ Ոստիկանություն)", "Բժշկական համալսարան", "Աբովյան փ․ (Գյուղակադեմիա)",
                    "Աբովյան փ․ (Պլանի գլուխ)", "Բագրատունյաց պ․ (Բանվորի արձան)", "Աշխատանքի հրապարակ (Բանվորի արձան)", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("61", "M", "գ. Վարդաշեն", "Վարդաշենի 9-րդ փ.", "Վարդաշենի 6-րդ փ.", "Մահարու փ․",
                    "Էրեբունու թ/ն", "Էրեբունու փ․", "Մուրացանի փ․", "Ռոստովյան փ․", "Վստրեչի կամուրջ", "Գարեգին Նժդեհի փ․", "Գարեգին Նժդեհի հրապարակ",
                    "Բագրատունյաց պ․ (Բանվորի արձան)", "Աշխատանքի հրապարակ (Բանվորի արձան)", "Արշակունյաց պ․ (Դեպի Չարբախ)", "Էրեբունի օդանավակայան", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("62", "M", "Քանաքեռի 13- րդ փ.", "Զաքարիա Քանաքեռցու փ․", "Թբիլիսյան խճ․ (Լամպերի լիճ)",
                    "Ազատության պ․ (Ռայկոմ)", "Կոմիտասի պ․ (Լամբադա կամուրջ)", "Կոմիտասի պ․ (Կոմիտասի շուկա)", "Բորսայի շենք", "Հրաչյա Քոչար փ․ (Վրացական խաչմերուկ)",
                    "Հրաչյա Քոչար փ․ (Փափազյան խաչմերուկ)", "Հրաչյա Քոչար փ․ (Վաղարշյան խաչմերուկ)", "Հրաչյա Քոչար փ․ (Գյուլբենկյան խաչմերուկ)", "Բաղրամյան պ․ (SAS)",
                    "Բաղրամյան պ․ (Կամոյի դպրոց)", "Բաղրամյան պ․ (Ամերիկյան համալսարան)", "Բաղրամյան պ․ (Սահմանադրական դատարան)", "Բաղրամյան պ․ (Օպերա)", "Մաշտոցի պ․ (Օպերա)",
                    "Մաշտոցի պ․ (Մարգարյան հիվ․)", "Մաշտոցի պ․ (Ամիրյան խաչմերուկ)", "Հանրապետության Հրապարակ", "Վազգեն Սարգսյան փ․", "Խորենացու փ․ (Շահումյան հրապ․)",
                    "Ագաթանգեղոսի փ․", "Մանկավարժական համալսարան", "Տիգրան Մեծի պ․ (Այրարատ կ/թ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)", "Երվանդ Քոչար փ․", "Սբ. Գրիգոր Լուսավորիչ եկեղեցի",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("63", "M", "Օհանովի փ․", "Գուսան Շերամի փ․", "Րաֆֆու փ․", "Րաֆֆու փ․ (Մալաթիայի շուկա)",
                    "Սեբաստիայի փ․ (Մալաթիայի շուկա)", "Սեբաստիայի փ․ (Տիչինայի խաչմերուկ)", "Սեբաստիայի փ․ (Լենինգրադյան խաչմերուկ)", "Լենինգրադյան փ․ (Եվրովագեն)",
                    "Լենինգրադյան փ․ (Շինարարների խաչմերուկ)", "Լենինգրադյան փ․ (Մոնթե Մելքոնյան խաչմերուկ)", "Լենինգրադյան փ․ (Կիևյան կամուրջ)", "Կիևյան փ․ (Կիևյան կամուրջ)",
                    "Կիևյան փ․ (Օրբելի խաչմերուկ)", "Կիևյան փ․ (Բարեկամություն)", "Կասյան փ․", "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)", "Կոմիտասի պ․ (Վաղարշյան խաչմերուկ)",
                    "Կոմիտասի պ․ (Փափազյան խաչմերուկ)", "Կոմիտասի պ․ (Սլավոնական համալսարան)", "Կոմիտասի պ․ (Վրացական խաչմերուկ)", "Կոմիտասի պ․ (Կոմիտասի շուկա)",
                    "Կոմիտասի պ․ (Լամբադա կամուրջ)", "Ազատության պ․ (Ռայկոմ)", "Ահարոնյան փ․", "Ուլնեցու փ․", "Պարույր Սևակի փ․", "Ռուբինյանց փ․ (Երևան Սիթի)",
                    "Ռուբինյանց փ․ (Ալմաստ գ/ն)", "Գայի պ․ (Աքվատեք)", "Գայի պ․ (Գայի արձան)", "Ստեփանյան փ․", "Մոլդովական փ․", "Նոր Նորքի 2-րդ զ/ծ", "", "", "", "", "", "", "",
                    "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("64", "M", "16-րդ թաղամաս", "Նորաշեն թաղ.", "Մելքումովի փ.", "Բեկնազարյան փ․", "Բաշինջաղյան փ․",
                    "Մարգարյան փ․ (Պեգաս)", "Մարգարյան փ․ (Հանրապետական հիվ․)", "Հալաբյան փ․ (Ֆիզիկայի խաչմերուկ)", "Հալաբյան փ․ (ԹՈՒՄՈ)", "Հալաբյան փ․ (Կիևյան կամուրջ)",
                    "Կիևյան փ․ (Կիևյան կամուրջ)", "Կիևյան փ․ (Օրբելի խաչմերուկ)", "Կիևյան փ․ (Բարեկամություն)", "Բաղրամյան պ․ (SAS)", "Բաղրամյան պ․ (Կամոյի դպրոց)",
                    "Պռոշյան փ․ ", "Պարոնյան փ․ (Նաիրի բ/կ)", "Պարոնյան փ․ (Կեսարի պալատ)", "Գրիգոր Լուսավորիչ (Երևանի քաղաքապետարան)", "Գրիգոր Լուսավորիչ (Կրկես)",
                    "Ագաթանգեղոսի փ․", "Տիգրան Մեծի պ․ (Այրարատ կ/թ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)", "Երվանդ Քոչար փ․", "Ալեք Մանուկյան փ․", "ԵՊՀ", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("65", "M", "Աերացիա", "Շիրակի 5-րդ նրբ․", "Շիրակի փ․ (Ձիարշավարան)", "Շիրակի փ․ (Չարբախի շուկա)",
                    "Արտաշիսյան փ․", "Բագրատունյաց պ․ (Արտաշիսյան խաչմերուկ)", "Գարեգին Նժդեհի հրապարակ", "Գարեգին Նժդեհի փ․", "Արշակունյաց պ․ (Հայրենիք կ/թ)",
                    "Արշակունյաց պ․ (Երևան Մոլ)", "Արշակունյաց պ․ (Կոմիտասի այգի)", "Արշակունյաց պ․ (Սուրմալու)", "Արշակունյաց պ․ (Կրկես)", "Ագաթանգեղոսի փ․",
                    "Մանկավարժական համալսարան", "Խանջյան փ․ (Լունապարկ)", "Վերնիսաժ", "Խանջյան փ․ (Շախմատի տուն)", "Մոսկովյան փ․ (Կամերային երաժշտության տուն)",
                    "Աբովյան փ․ (Երիտասարդական մ/կ)", "Աբովյան փ․ (Գյուղակադեմիա)", "Աբովյան փ․ (Պլանի գլուխ)", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("66", "M", "Նոր Նորքի 9-րդ զ/ծ", "Վիլնյուսի փ․", "Նոր Նորքի 7-րդ զ/ծ", "Հունան Ավետիսյան փ․", "Դավիթ Բեկի փ․",
                    "Բադալ Մուրադյան փ․", "Գայի պ․ (Մերսեդեսի սրահ)", "Գայի պ․ (Գայի արձան)", "Գայի պ․ (Աքվատեք)", "Ռուբինյանց փ․ (Ալմաստ գ/ն)", "Ռուբինյանց փ․ (Երևան Սիթի)",
                    "Ռուբինյանց փ․ (Ահարոնյան փ․)", "Դավիթ Անհաղթի փ․ (Դրոյի խաչմերուկ)", "Դավիթ Անհաղթի փ․ (Կերամա Մարացի)", "Դավիթ Անհաղթի փ․ (թաղապետարան)",
                    "Կոմիտասի պ․ (Լամբադա կամուրջ)", "Կոմիտասի պ․ (Կոմիտասի շուկա)", "Կոմիտասի պ․ (Վրացական խաչմերուկ)", "Կոմիտասի պ․ (Սլավոնական համալսարան)",
                    "Կոմիտասի պ․ (Փափազյան խաչմերուկ)", "Կոմիտասի պ․ (Վաղարշյան խաչմերուկ)", "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)", "Գյուլբենկյան փ․",
                    "Հրաչյա Քոչար փ․ (Գյուլբենկյան խաչմերուկ)", "Կասյան փ․", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("67", "M", "Արարատյան փ․", "Շիրակի փ․ (Էրեբունի օդանավակայան)", "Արտաշիսյան փ․",
                    "Բագրատունյաց պ․ (Արտաշիսյան խաչմերուկ)", "Բագրատունյաց պ․ (Երևան Սիթի)", "Բագրատունյաց պ․ (Իսակով խաչմերուկ)", "Սեբաստիայի փ․ (Կուրղինյան խաչմերուկ)",
                    "Սեբաստիայի փ․ (Մալաթիայի շուկա)", "Րաֆֆու փ․ (Մալաթիայի շուկա)", "Րաֆֆու փ․", "Զորավար Անդրանիկի փ․", "Օհանովի փ․", "Գուսան Շերամի փ․",
                    "Առնո Բաբաջանյան փ․", "Էջմիածնի խճ․", "գ. Փարաքար", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("68", "M", "Էրեբունու զ/ծ ", "Խաղաղ Դոնի փ․", "Տիտոգրադյան փ․", "Այվազովսկու փ․", "Էրեբունու փ․",
                    "Ազատամարտիկների փ․", "Սասունցի Դավթի փ․", "Տիգրան Մեծի պ․ (Կայարան)", "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)",
                    "Տիգրան Մեծի պ․ (Այրարատ կ/թ)", "Մանկավարժական համալսարան", "Ագաթանգեղոսի փ․", "Գրիգոր Լուսավորիչ (Կրկես)", "Գրիգոր Լուսավորիչ (Երևանի քաղաքապետարան)",
                    "Հաղթանակ կամուրջ", "Ծովակալ Իսակովի պ․", "Կիլիկիա ավտոկայան", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("69", "M", "Նոր Նորքի 9-րդ զ/ծ", "Վիլնյուսի փ․", "Նոր Նորքի 7-րդ զ/ծ", "Հունան Ավետիսյան փ․", "Դավիթ Բեկի փ․",
                    "Բադալ Մուրադյան փ․", "Գայի պ․ (Մերսեդեսի սրահ)", "Գայի պ․ (Գայի արձան)", "Գայի պ․ (Աքվատեք)", "Մյասնիկյան պ․ (Ջրաշխարհ)",
                    "Մյասնիկյան պ․ (Կենդանաբանական այգի)", "Մյասնիկյան պ․ (Հերացի խաչմերուկ)", "Աբովյան փ․ (Պլանի գլուխ)", "Աբովյան փ․ (Գյուղակադեմիա)",
                    "Աբովյան փ․ (Երիտասարդական մ/կ)", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("70", "M", "ՀԱԹ", "Զորավար Անդրանիկի փ․", "Րաֆֆու փ․", "Րաֆֆու փ․ (Մալաթիայի շուկա)",
                    "Սեբաստիայի փ․ (Մալաթիայի շուկա)", "Սեբաստիայի փ․ (Տիչինայի խաչմերուկ)", "Սեբաստիայի փ․ (Լենինգրադյան խաչմերուկ)", "Լենինգրադյան փ․ (Եվրովագեն)",
                    "Լենինգրադյան փ․ (Շինարարների խաչմերուկ)", "Լենինգրադյան փ․ (Մոնթե Մելքոնյան խաչմերուկ)", "Ծիծեռնակաբերդի խճ․", "Դալմա Գարդեն Մոլ", "Աթենքի փ․",
                    "Հրազդան մ/դ", "Հաղթանակ կամուրջ", "Մաշտոցի պ․ (Ձկան խանութ)", "Մաշտոցի պ․ (Ծածկած շուկա)", "Մաշտոցի պ․ (Ամիրյան խաչմերուկ)", "Մաշտոցի պ․ (Մարգարյան հիվ․)",
                    "Մաշտոցի պ․ (Օպերա)", "Մաշտոցի պ․ (Կոնսերվատորիա)", "Մոսկովյան փ․ (Կոնսերվատորիա)", "Աբովյան փ․ (Երիտասարդական մ/կ)", "Աբովյան փ․ (Գյուղակադեմիա)",
                    "Աբովյան փ․ (Պլանի գլուխ)", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("71", "M", "ՀԱԹ", "Առնո Բաբաջանյան փ․", "Զորավար Անդրանիկի փ․", "Րաֆֆու փ․",
                    "Րաֆֆու փ․ (Մալաթիայի շուկա)", "Սեբաստիայի փ․ (Մալաթիայի շուկա)", "Սեբաստիայի փ․ (Տիչինայի խաչմերուկ)", "Սեբաստիայի փ․ (Լենինգրադյան խաչմերուկ)",
                    "Լենինգրադյան փ․ (Եվրովագեն)", "Լենինգրադյան փ․ (Շինարարների խաչմերուկ)", "Լենինգրադյան փ․ (Մոնթե Մելքոնյան խաչմերուկ)", "Լենինգրադյան փ․ (Կիևյան կամուրջ)",
                    "Կիևյան փ․ (Կիևյան կամուրջ)", "Կիևյան փ․ (Օրբելի խաչմերուկ)", "Կիևյան փ․ (Բարեկամություն)", "Կասյան փ․", "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)",
                    "Կոմիտասի պ․ (Վաղարշյան խաչմերուկ)", "Կոմիտասի պ․ (Փափազյան խաչմերուկ)", "Կոմիտասի պ․ (Սլավոնական համալսարան)", "Կոմիտասի պ․ (Վրացական խաչմերուկ)",
                    "Կոմիտասի պ․ (Կոմիտասի շուկա)", "Կոմիտասի պ․ (Լամբադա կամուրջ)", "Ազատության պ․ (Նաիրի Զարյան խաչմերուկ)", "Ազատության պ․ (Զինկոմիսարիատ)",
                    "Ազատության պ․ (Հաղթանակի այգի)", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("72", "M", "գ․ Մուշավան", "գ․ Վարդաշեն", "Մահարու փ․", "Էրեբունու թ/ն", "Էրեբունու փ․",
                    "Ազատամարտիկների փ․", "Սասունցի Դավթի փ․", "Արցախի փ․", "Վստրեչի կամուրջ", "Գարեգին Նժդեհի փ․", "Գարեգին Նժդեհի հրապարակ",
                    "Բագրատունյաց պ․ (Արտաշիսյան խաչմերուկ)", "Բագրատունյաց պ․ (Երևան Սիթի)", "Բագրատունյաց պ․ (Իսակով խաչմերուկ)", "Սեբաստիայի փ․ (Կուրղինյան խաչմերուկ)",
                    "Սեբաստիայի փ․ (Մալաթիայի շուկա)", "Րաֆֆու փ․ (Մալաթիայի շուկա)", "Րաֆֆու փ․", "Գուսան Շերամի փ․", "Տիչինայի փ․", "Ռոմանոս Մելիքյան փ․", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("73", "M", "Էրեբունու զ/ծ ", "Խաղաղ Դոնի փ․", "Տիտոգրադյան փ․", "Այվազովսկու փ․", "Էրեբունու փ․",
                    "Ազատամարտիկների փ․", "Սասունցի Դավթի փ․", "Տիգրան Մեծի պ․ (Կայարան)", "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)", "Տիգրան Մեծի պ․ (Այրարատ կ/թ)",
                    "Մանկավարժական համալսարան", "Խանջյան փ․ (Լունապարկ)", "Վերնիսաժ", "Խանջյան փ․ (Շախմատի տուն)", "Մոսկովյան փ․ (Կամերային երաժշտության տուն)",
                    "Աբովյան փ․ (Երիտասարդական մ/կ)", "Աբովյան փ․ (Գյուղակադեմիա)", "Աբովյան փ․ (Պլանի գլուխ)", "Մյասնիկյան պ․ (Հերացի խաչմերուկ)",
                    "Մյասնիկյան պ․ (Կենդանաբանական այգի)", "Մյասնիկյան պ․ (Ջրաշխարհ)", "Գայի պ․ (Գայի արձան)", "Գայի պ․ (Մերսեդեսի սրահ)", "Բաղյան փ․", "Գյուրջյան փ․",
                    "Շոպրոնի փ․", "Դավիթ Բեկի փ․", "Հունան Ավետիսյան փ․", "Նոր Նորքի 7-րդ զ/ծ", "Վիլնյուսի փ․", "Նոր Նորքի 9-րդ զ/ծ", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("74", "M", "գ․ Զովունի", "Եղվարդի խճ․", "Զովունի 6-րդ փ․", "Զովունի 39-րդ փ․", "Զովունի 8-րդ փ․",
                    "Դավթաշենի 4-րդ թաղ.", "Տիգրան Պետրոսյան փ․", "Դավթաշենի 1-ին թաղ․", "Իոսիֆյան փ․", "Հալաբյան փ․ (Ֆիզիկայի խաչմերուկ)", "Հալաբյան փ․ (ԹՈՒՄՈ)", "Հալաբյան փ․ (Կիևյան կամուրջ)",
                    "Լենինգրադյան փ․ (Կիևյան կամուրջ)", "Ծիծեռնակաբերդի խճ․", "Դալմա Գարդեն Մոլ", "Աթենքի փ․", "Հրազդան մ/դ", "Հաղթանակ կամուրջ",
                    "Գրիգոր Լուսավորիչ (Երևանի քաղաքապետարան)", "Գրիգոր Լուսավորիչ (Կրկես)", "Ագաթանգեղոսի փ․", "Տիգրան Մեծի պ․ (Այրարատ կ/թ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)",
                    "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)", "Քրիստափորի փ․", "Փեթակ ա/կ", "Արշակունյաց պ․ (Կոմիտասի այգի)", "Արշակունյաց պ․ (Երևան Մոլ)", "Արշակունյաց պ․ (Հայրենիք կ/թ)",
                    "Վստրեչի կամուրջ", "Ռոստովյան փ․", "Աթոյան փ․", "Էրեբունու փ․", "Այվազովսկու փ․", "Տիտոգրադյան փ․", "Խաղաղ Դոնի փ․", "Էրեբունու զ/ծ", "", "", "", "", "",
                    "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("75", "M", "Տիչինայի փ․", "Զորավար Անդրանիկի փ․", "Օհանովի փ․", "Գուսան Շերամի փ․", "Րաֆֆու փ․",
                    "Րաֆֆու փ․ (Մալաթիայի շուկա)", "Սեբաստիայի փ․ (Մալաթիայի շուկա)", "Սեբաստիայի փ․ (Կուրղինյան խաչմերուկ)", "Ծովակալ Իսակովի պ․ (Սեբաստիայի խաչմերուկ)",
                    "Կիլիկիա ավտոկայան", "Հաղթանակ կամուրջ", "Մաշտոցի պ․ (Ձկան խանութ)", "Մաշտոցի պ․ (Ծածկած շուկա)", "Մաշտոցի պ․ (Ամիրյան խաչմերուկ)",
                    "Մաշտոցի պ․ (Մարգարյան հիվ․)", "Մաշտոցի պ․ (Օպերա)", "Մաշտոցի պ․ (Կոնսերվատորիա)", "Մաշտոցի պ․ (Մատենադարան)", "Կորյունի փ․ (Ցիտադել)",
                    "Բժշկական համալսարան", "Չարենցի փ․ (ՀՀ Ոստիկանություն)", "Հերացու փ․", "Արմենակյան փ․", "Նորքի այգիներ 1-ին անցուղի", "Նորք-Մարաշ բ/կ", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("76", "M", "ՀԱԹ", "Զորավար Անդրանիկի փ․", "Րաֆֆու փ․", "Րաֆֆու փ․ (Մալաթիայի շուկա)",
                    "Սեբաստիայի փ․ (Մալաթիայի շուկա)", "Սեբաստիայի փ․ (Տիչինայի խաչմերուկ)", "Սեբաստիայի փ․ (Լենինգրադյան խաչմերուկ)", "Լենինգրադյան փ․ (Եվրովագեն)",
                    "Լենինգրադյան փ․ (Շինարարների խաչմերուկ)", "Լենինգրադյան փ․ (Մոնթե Մելքոնյան խաչմերուկ)", "Լենինգրադյան փ․ (Կիևյան կամուրջ)", "Կիևյան փ․ (Կիևյան կամուրջ)",
                    "Օրբելի փ․", "Բաղրամյան պ․ (Կամոյի դպրոց)", "Բաղրամյան պ․ (Ամերիկյան համալսարան)", "Բաղրամյան պ․ (Սահմանադրական դատարան)", "Բաղրամյան պ․ (Օպերա)",
                    "Մաշտոցի պ․ (Օպերա)", "Մաշտոցի պ․ (Կոնսերվատորիա)", "Մաշտոցի պ․ (Մատենադարան)", "Կորյունի փ․ (Ցիտադել)", "Բժշկական համալսարան",
                    "Չարենցի փ․ (ՀՀ Ոստիկանություն)", "Չարենցի փ․ (ԵՊՀ)", "Չարենցի փ․ (Zigzag խանութ-սրահ)", "Սայաթ-Նովա պ․ (Ալեք Մանուկյան խաչմերուկ)",
                    "Ալեք Մանուկյան փ․", "Երվանդ Քոչար փ․", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)", "Քրիստափորի փ․", "Փեթակ ա/կ", "Սևանի փ․", "", "", "", "", "", "", "", "", "", "", "",
                    "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("77", "M", "Ավան-Առինջ", "Տաշքենդի փ․", "Մարշալ Բաբաջանյան փ․", "Մարշալ Խուդյակովի փ․",
                    "Բուսաբանական այգի", "Մյասնիկյան պ․ (Ջրաշխարհ)", "Մյասնիկյան պ․ (Կենդանաբանական այգի)", "Մյասնիկյան պ․ (Հերացի խաչմերուկ)", "Աբովյան փ․ (Պլանի գլուխ)",
                    "Աբովյան փ․ (Գյուղակադեմիա)", "Բժշկական համալսարան", "Չարենցի փ․ (ՀՀ Ոստիկանություն)", "Չարենցի փ․ (ԵՊՀ)", "Չարենցի փ․ (Zigzag խանութ-սրահ)",
                    "Սայաթ-Նովա պ․ (Ալեք Մանուկյան խաչմերուկ)", "Խանջյան փ․ (Շախմատի տուն)", "Վերնիսաժ", "Խանջյան փ․ (Լունապարկ)", "Մանկավարժական համալսարան",
                    "Ագաթանգեղոսի փ․", "Արշակունյաց պ․ (Կրկես)", "Գրիգոր Լուսավորիչ (Երևանի քաղաքապետարան)", "Հաղթանակ կամուրջ", "Հրազդան մ/դ", "Աթենքի փ․",
                    "Դալմա Գարդեն Մոլ", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            //////56A soon
            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("99", "M", "ՀԱԹ", "Եռաբլուր", "Շահումյանի 4-րդ փ․", "Առնո Բաբաջանյան փ․", "Րաֆֆու փ․", "Րաֆֆու փ․ (Մալաթիայի շուկա)",
                    "Սեբաստիայի փ․ (Մալաթիայի շուկա)", "Սեբաստիայի փ․ (Կուրղինյան խաչմերուկ)", "Ծովակալ Իսակովի պ․", "Կիլիկիա ավտոկայան", "Հաղթանակ կամուրջ", "Արգիշտի փ․",
                    "Գրիգոր Լուսավորիչ (Երևանի քաղաքապետարան)", "Արշակունյաց պ․ (Կրկես)", "Ագաթանգեղոսի փ․", "Մանկավարժական համալսարան", "Խանջյան փ․ (Լունապարկ)",
                    "Վերնիսաժ", "Խանջյան փ․ (Շախմատի տուն)", "Մոսկովյան փ․ (Կամերային երաժշտության տուն)", "Աբովյան փ․ (Երիտասարդական մ/կ)", "Աբովյան փ․ (Գյուղակադեմիա)",
                    "Աբովյան փ․ (Պլանի գլուխ)", "Սարալանջի փ․", "Ազատության պ․ (Հաղթանակի այգի)", "Ազատության պ․ (Զինկոմիսարիատ)", "Ազատության պ․ (Նաիրի Զարյան խաչմերուկ)",
                    "Ազատության պ․ (Ռայկոմ)", "Ներսիսյան փ․", "Քանաքեռ-Զեյթուն բ/կ", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            ///60A soon
//            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("101", "M", "Հյուսիսային ավտոկայան", "Գազպրոմ Արմենիա", "Թբիլիսյան խճ․ (Ռադիոկայմ)",
//                    "Զաքարիա Քանաքեռցու փ․", "Ազատության պ․ (Ռայկոմ)", "Կոմիտասի պ․ (Լամբադա կամուրջ)","Կոմիտասի պ․ (Կոմիտասի շուկա)", "Կոմիտասի պ․ (Վրացական խաչմերուկ)",
//                    "Կոմիտասի պ․ (Սլավոնական համալսարան)", "Կոմիտասի պ․ (Փափազյան խաչմերուկ)", "Կոմիտասի պ․ (Վաղարշյան խաչմերուկ)", "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)",
//                    "Կասյան փ․", "Կիևյան փ․ (Բարեկամություն)", "Կիևյան փ․ (Օրբելի խաչմերուկ)", "Կիևյան փ․ (Կիևյան կամուրջ)", "Լենինգրադյան փ․ (Կիևյան կամուրջ)",
//                    "Լենինգրադյան փ․ (Մոնթե Մելքոնյան խաչմերուկ)", "Լենինգրադյան փ․ (Շինարարների խաչմերուկ)", "Լենինգրադյան փ․ (Եվրովագեն)", "Սեբաստիայի փ․ (Լենինգրադյան խաչմերուկ)",
//                    "Սեբաստիայի փ․ (Տիչինայի խաչմերուկ)", "Սեբաստիայի փ․ (Մալաթիայի շուկա)", "Րաֆֆու փ․ (Մալաթիայի շուկա)", "Րաֆֆու փ․", "ՀԱԹ", "", "", "", "", "", "", "", "",
//                    "", "", "", "", "", "", "", "", "", "", ""));

            ///50A soon
//            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("110", "M", "Զորավար Անդրանիկի փ․", "Օհանովի փ․", "Գուսան Շերամի փ․", "Րաֆֆու փ․",
//                    "Րաֆֆու փ․ (Մալաթիայի շուկա)", "Սեբաստիայի փ․ (Մալաթիայի շուկա)", "Սեբաստիայի փ․ (Տիչինայի խաչմերուկ)", "Սեբաստիայի փ․ (Լենինգրադյան խաչմերուկ)",
//                    "Լենինգրադյան փ․ (Եվրովագեն)", "Լենինգրադյան փ․ (Շինարարների խաչմերուկ)", "Լենինգրադյան փ․ (Շինարարների խաչմերուկ)", "Լենինգրադյան փ․ (Մոնթե Մելքոնյան խաչմերուկ)",
//                    "Ծիծեռնակաբերդի խճ․", "Դալմա Գարդեն Մոլ", "Աթենքի փ․", "Հրազդան մ/դ", "Հաղթանակ կամուրջ", "Արգիշտի փ․", "Գրիգոր Լուսավորիչ (Երևանի քաղաքապետարան)",
//                    "Գրիգոր Լուսավորիչ (Կրկես)", "Ագաթանգեղոսի փ․", "Տիգրան Մեծի պ․ (Այրարատ կ/թ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)", "Երվանդ Քոչար փ․", "Ալեք-Մանուկյան փ․",
//                    "Սայաթ-Նովա պ․ (Ալեք Մանուկյան խաչմերուկ)", "Չարենցի փ․ (ԵՊՀ)", "Չարենցի փ․ (Zigzag խանութ-սրահ)", "Չարենցի փ․ (ՀՀ Ոստիկանություն)", "Բժշկական համալսարան",
//                    "Կորյունի փ․ (Ցիտադել)", "Տերյան փ․", "Աբովյան փ․ (Պլանի գլուխ)", "", "", "", "", "", "", "", "", "", "", "", ""));

            ///25A soon
            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("114", "M", "Դավիթ Անհաղթի փ․ (Կերամա Մարացի)", "Ուլնեցու փ․ (Դեպի Մոնումենտ)",
                    "Գեներալ Բաբայանի փ․", "Ազատության պ․ (Զինկոմիսարիատ)", "Ազատության պ․ (Նաիրի Զարյան խաչմերուկ)", "Կոմիտասի պ․ (Լամբադա կամուրջ)",
                    "Կոմիտասի պ․ (Կոմիտասի շուկա)", "Գրիբոյեդովի փ․", "Նաիրի Զարյան փ․", "Բորսայի շենք", "Հրաչյա Քոչար փ․ (Վրացական խաչմերուկ)",
                    "Հրաչյա Քոչար փ․ (Փափազյան խաչմերուկ)", "Հրաչյա Քոչար փ․ (Վաղարշյան խաչմերուկ)", "Հրաչյա Քոչար փ․ (Գյուլբենկյան խաչմերուկ)",
                    "Կիևյան փ․ (Բարեկամություն)", "Կիևյան փ․ (Օրբելի խաչմերուկ)", "Կիևյան փ․ (Կիևյան կամուրջ)", "Լենինգրադյան փ․ (Կիևյան կամուրջ)",
                    "Լենինգրադյան փ․ (Մոնթե Մելքոնյան խաչմերուկ)", "Լենինգրադյան փ․ (Շինարարների խաչմերուկ)", "Լենինգրադյան փ․ (Եվրովագեն)", "Գրիգոր Հասրաթյան փ․",
                    "Շիրազի փ․", "15-րդ թաղամաս", "Չաուշի փ․", "Աշտարակի խճ․", "Պռոշյան ավան", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            /**
             * Trollybuses
             * */
            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("1", "T", "Աշխատանքի հրապարակ (Բանվորի արձան)", "Բագրատունյաց պ․ (Բանվորի արձան)", "Գարեգին Նժդեհի հրապարակ",
                    "Գարեգին Նժդեհի փ․", "Արշակունյաց պ․ (Հայրենիք կ/թ)", "Արշակունյաց պ․ (Երևան Մոլ)", "Արշակունյաց պ․ (Կոմիտասի այգի)", "Արշակունյաց պ․ (Սուրմալու)",
                    "Արշակունյաց պ․ (Կրկես)", "Գրիգոր Լուսավորիչ (Կրկես)", "Գրիգոր Լուսավորիչ (Երևանի քաղաքապետարան)", "Մաշտոցի պ․ (Ձկան խանութ)", "Մաշտոցի պ․ (Ծածկած շուկա)",
                    "Մաշտոցի պ․ (Ամիրյան խաչմերուկ)", "Մաշտոցի պ․ (Մարգարյան հիվ․)", "Մաշտոցի պ․ (Օպերա)", "Մաշտոցի պ․ (Կոնսերվատորիա)", "Մաշտոցի պ․ (Մատենադարան)", "Կորյունի փ․ (Ցիտադել)",
                    "Կորյունի փ․ (Ցիտադել)", "Բժշկական համալսարան", "Չարենցի փ․ (ՀՀ Ոստիկանություն)", "Հերացու փ․", "Մյասնիկյան պ․ (Հերացի խաչմերուկ)", "Մյասնիկյան պ․ (Կենդանաբանական այգի)",
                    "Մյասնիկյան պ․ (Ջրաշխարհ)", "Գայի պ․ (Աքվատեք)", "Գայի պ․ (Գայի արձան)", "Գայի պ․ (Մերսեդեսի սրահ)", "Բադալ Մուրադյան փ․", "Թևոսյան փ․",
                    "Քոչինյան փ․", "Ջրվեժ", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("2", "T", "Արտաշիսյան փ․", "Շիրակի փ․ (Չարբախի շուկա)", "Չեխովի փ․", "Բագրատունյաց պ․ (Արտաշիսյան խաչմերուկ)",
                    "Գարեգին Նժդեհի հրապ․", "Բագրատունյաց պ․ (Բանվորի արձան)", "Աշխատանքի հրապարակ (Բանվորի արձան)", "Արշակունյաց պ․ (Հայրենիք կ/թ)", "Արշակունյաց պ․ (Երևան Մոլ)",
                    "Արշակունյաց պ․ (Կոմիտասի այգի)", "Արշակունյաց պ․ (Սուրմալու)", "Արշակունյաց պ․ (Կրկես)", "Ագաթանգեղոսի փ․", "Տիգրան Մեծի պ․ (Այրարատ կ/թ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)",
                    "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)", "Տիգրան Մեծի պ․ (Կայարան)", "Արցախի փ․", "Էրեբունու փ․", "Էրեբունու թ/ն", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", ""));

//            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("3", "T", "Ավան", "Մարշալ Բաբաջանյան փ․", "Աճառյան փ․", "Բուսաբանական այգի", "Մյասնիկյան պ․ (Ջրաշխարհ)",
//                    "Մյասնիկյան պ․ (Կենդանաբանական այգի)", "Մյասնիկյան պ․ (Հերացի խաչմերուկ)", "Չարենցի փ․ (ՀՀ Ոստիկանություն)", "Նալբանդյան փ․ (ԵՊՏՀ)", "Սայաթ-Նովա պ․ (Նալբանդյան խաչմերուկ)",
//                    "Վերնիսաժ", "Խանջյան փ․ (Լունապարկ)", "Մանկավարժական համալսարան", "Տիգրան Մեծի պ․ (Այրարատ կ/թ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)", "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)", "Տիգրան Մեծի պ․ (Կայարան)",
//                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("9", "T", "Ավան", "Մարշալ Բաբաջանյան փ․", "Աճառյան փ․", "Բուսաբանական այգի", "Ռուբինյանց փ․ (Ալմաստ գ/ն)",
                    "Ռուբինյանց փ․ (Երևան Սիթի)", "Ռուբինյանց փ․ (Ահարոնյան փ․)", "Դավիթ Անհաղթի փ․ (Դրոյի խաչմերուկ)", "Դավիթ Անհաղթի փ․ (Կերամա Մարացի)", "Դավիթ Անհաղթի փ․ (թաղապետարան)",
                    "Կոմիտասի պ․ (Լամբադա կամուրջ)", "Կոմիտասի պ․ (Կոմիտասի շուկա)", "Կոմիտասի պ․ (Վրացական խաչմերուկ)", "Կոմիտասի պ․ (Սլավոնական համալսարան)",
                    "Կոմիտասի պ․ (Փափազյան խաչմերուկ)", "Կոմիտասի պ․ (Վաղարշյան խաչմերուկ)", "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)", "Կասյան փ․", "Բաղրամյան պ․ (SAS)",
                    "Բաղրամյան պ․ (Կամոյի դպրոց)", "Բաղրամյան պ․ (Ամերիկյան համալսարան)", "Բաղրամյան պ․ (Սահմանադրական դատարան)", "Բաղրամյան պ․ (Օպերա)",
                    "Սայաթ-Նովա պ․ (Նալբանդյան խաչմերուկ)", "Վերնիսաժ", "Խանջյան փ․ (Լունապարկ)", "Մանկավարժական համալսարան", "Ագաթանգեղոսի փ․", "Գրիգոր Լուսավորիչ (Կրկես)",
                    "Գրիգոր Լուսավորիչ (Երևանի քաղաքապետարան)", "Մաշտոցի պ․ (Ձկան խանութ)", "Մաշտոցի պ․ (Ծածկած շուկա)", "Մաշտոցի պ․ (Ամիրյան խաչմերուկ)",
                    "Մաշտոցի պ․ (Մարգարյան հիվ․)", "Մաշտոցի պ․ (Օպերա)", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("10", "T", "Նոր Նորքի 5-րդ զ/ծ", "Բադալ Մուրադյան փ․", "Գայի պ․ (Մերսեդեսի սրահ)",
                    "Գայի պ․ (Գայի արձան)", "Գայի պ․ (Աքվատեք)", "Ռուբինյանց փ․ (Ալմաստ գ/ն)", "Ռուբինյանց փ․ (Երևան Սիթի)", "Ռուբինյանց փ․ (Ահարոնյան փ․)",
                    "Դավիթ Անհաղթի փ․ (Դրոյի խաչմերուկ)", "Դավիթ Անհաղթի փ․ (Կերամա Մարացի)", "Դավիթ Անհաղթի փ․ (թաղապետարան)", "Կոմիտասի պ․ (Լամբադա կամուրջ)",
                    "Կոմիտասի պ․ (Կոմիտասի շուկա)", "Կոմիտասի պ․ (Վրացական խաչմերուկ)", "Կոմիտասի պ․ (Սլավոնական համալսարան)", "Կոմիտասի պ․ (Փափազյան խաչմերուկ)",
                    "Կոմիտասի պ․ (Վաղարշյան խաչմերուկ)", "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)", "Կասյան փ․", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("15", "T", "15-րդ թաղամաս", "Մազմանյան փ․", "Շիրազի փ․", "Գրիգոր Հասրաթյան փ․",
                    "Սեբաստիայի փ․ (Լենինգրադյան խաչմերուկ)", "Սեբաստիայի փ․ (Տիչինայի խաչմերուկ)", "Սեբաստիայի փ․ (Մալաթիայի շուկա)", "Սեբաստիայի փ․ (Կուրղինյան խաչմերուկ)",
                    "Բագրատունյաց պ․ (Իսակով խաչմերուկ)", "Բագրատունյաց պ․ (Երևան Սիթի)", "Բագրատունյաց պ․ (Արտաշիսյան խաչմերուկ)", "Գարեգին Նժդեհի հրապարակ",
                    "Բագրատունյաց պ․ (Բանվորի արձան)", "Աշխատանքի հրապարակ (Բանվորի արձան)", "Արշակունյաց պ․ (Դեպի Չարբախ)", "Էրեբունի օդանավակայան",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("23", "T", "Ջրվեժ", "Քոչինյան փ․", "Թևոսյան փ․", "Բադալ Մուրադյան փ․", "Գայի պ․ (Մերսեդեսի սրահ)",
                    "Գայի պ․ (Գայի արձան)", "Գայի պ․ (Աքվատեք)", "Մյասնիկյան պ․ (Ջրաշխարհ)", "Մյասնիկյան պ․ (Կենդանաբանական այգի)", "Մյասնիկյան պ․ (Հերացի խաչմերուկ)",
                    "Չարենցի փ․ (ՀՀ Ոստիկանություն)", "Սայաթ-Նովա պ․ (Նալբանդյան խաչմերուկ)", "Վերնիսաժ", "Մանկավարժական համալսարան", "Խանջյան փ․ (Լունապարկ)",
                    "Տիգրան Մեծի պ․ (Ֆիրդուսի շուկա)", "Մելիք-Ադամյան փ․", "Նալբանդյան փ․ (ԵՊՏՀ)", "Մոսկովյան փ․ (Կամերային երաժշտության տուն)", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("24", "T", "ՀԱԹ", "Րաֆֆու փ․", "Րաֆֆու փ․ (Մալաթիայի շուկա)", "Սեբաստիայի փ․ (Մալաթիայի շուկա)",
                    "Սեբաստիայի փ․ (Կուրղինյան խաչմերուկ)", "Ծովակալ Իսակովի պ․", "Կիլիկիա ավտոկայան", "Հաղթանակի կ/ջ", "Մաշտոցի պ․ (Ձկան խանութ)", "Մաշտոցի պ․ (Ծածկած շուկա)", "Մաշտոցի պ․ (Ամիրյան խաչմերուկ)",
                    "Մաշտոցի պ․ (Մարգարյան հիվ․)", "Մաշտոցի պ․ (Օպերա)", "Մաշտոցի պ․ (Կոնսերվատորիա)", "Մոսկովյան փ․ (Կոնսերվատորիա)", "Աբովյան փ․ (Երիտասարդական մ/կ)",
                    "Աբովյան փ․ (Գյուղակադեմիա)", "Աբովյան փ․ (Պլանի գլուխ)", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

        }

        private void insertIntoTransportEn(SQLiteDatabase db) {

            /**
             * Buses
             * */

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("1", "A", "Erebuni district", "Khakhagh Don str.", "Titigradyan str.", "Ayvazovski str.",
                    "Erebuni str.", "Artsakh str.", "Tigran Mets ave. (Yerevan Railway Station)", "Tigran Mets ave. (Yerevan Railway Station Management)", "Tigran Mets ave. (Tashir Mall)", "Tigran Mets ave. (Ayrarat cinema)",
                    "Pedagogical University", "Tigran Mets ave. (Firdus Market)", "Republic Square", "Amiryan str.", "Mashtots ave. (Amiryan cross)",
                    "Mashtots ave. (Margaryan hospital)", "Mashtots ave. (Opera)", "Baghramyan Ave. (Opera House)", "Baghramyan Ave. (Constitutional Court)", "Baghramyan Ave. (American University of Armenia)",
                    "Baghramyan Ave. (School after Kamo)", "Baghramyan Ave. (SAS Supermarket)", "Kasyan str.", "Komitas ave. (Gyulbenkyan cross)", "Komitas ave. (Vagharshyan cross)",
                    "Komitas ave. (Papazyan cross)", "Komitas ave. (Russian-Armenian University)", "Komitas ave. (Vracakan cross)", "Komitas ave. (Komitas Market)",
                    "Komitas ave. (Lambada bridge)", "Komitas ave. (Lambada bridge)Azatutyan Ave. (Raykom)", "Paruyr Sevak str.", "Dro srt.", "Lepsius str.", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("3", "A", "South-Western district", "Arno Babajanyan str.", "Raffi str.", "Raffi str. (Malatia Market)",
                    "Sebastia str. (Malatia Market)", "Sebastia str. (Tichina cross)", "Sebastia str. (Leningradyan cross)", "Leningradyan str. (Eurowagen)",
                    "Leningradyan str. (Shinararner cross)", "Leningradyan str. (Monte Melkonyan cross)", "Leningradyan str. (Kievyan bridge)", "Kievyan str.(Kievyan bridge)",
                    "Kievyan str.(Orbeli cross)", "Kievyan str.(Barkamutyun)", "Kasyan str.", "Komitas ave. (Gyulbenkyan cross)", "Komitas ave. (Vagharshyan cross)",
                    "Komitas ave. (Papazyan cross)", "Komitas ave. (Russian-Armenian University)", "Komitas ave. (Vracakan cross)", "Komitas ave. (Komitas Market)",
                    "Komitas ave. (Lambada bridge)", "Davit Anhaght str. (Municipality)", "Davit Anhaght str. (Kerama Marazzi)", "Davit Anhaght str. (Dro str. cross)",
                    "Rubinyants str. (Aharonyan str.)", "Rubinyants str. (Yerevan City Supermarket)", "Rubinyants str. (Almast factory)", "Gayi ave. (Aquatec)",
                    "Gayi ave. (Statue of Gay)", "Gayi ave. (Mersedes Benz Salon)", "Badal Muradyan str.", "Davit Bek", "Hunan Avetisyan str.", "Nor Norq 7th district",
                    "Vilnus str.", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("5", "A", "Jrvezh", "Qochinyan str.", "Tevosyan str.", "Hovhannisyan str.", "Aksel Bakunts str.",
                    "Gyuliqekhvyan str.", "Gayi ave. (Mersedes Benz Salon)", "Gayi ave. (Statue of Gay)", "Gayi ave. (Aquatec)", "Myasnikyan ave. (Water world)",
                    "Myasnikyan ave. (Yerevan Zoo)", "Myasnikyan ave. (Heratsi cross)", "Abovyan str. (Abovyan park)", "Abovyan str. (Agrarayin Academy)",
                    "Abovyan str. (Yeritasardakan m/s)", "Moskovyan str. (Conservatoire)", "Mashtots ave. (Conservatoire)", "Mashtots ave. (Opera)", "Mashtots ave. (Margaryan hospital)",
                    "Mashtots ave. (Amiryan cross)", "Mashtots ave. (Covered market)", "Mashtots ave. (Fish market)", "Victory bridge", "Isakov ave.",
                    "Kilikia autostation", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("7", "A", "Erebuni district ", "Khakhagh Don str.", "Titigradyan str.", "Ayvazovski str.",
                    "Erebuni str.", "Atoyan str.", "Belinsku str.", "Sasuntsi Davit str.", "Tigran Mets ave. (Yerevan Railway Station)", "Tigran Mets ave. (Yerevan Railway Station Management)",
                    "Tigran Mets ave. (Tashir Mall)", "Tigran Mets ave. (Ayrarat cinema)", "Pedagogical University", "Khanjyan str. (Lunapark)", "Vernisage",
                    "Tumanyan str.", "Mashtots ave. (Opera)", "Mashtots ave. (Conservatoire)", "Mashtots ave. (Matenadaran)", "Koryun str. (Citadel)", "Abovyan str. (Agrarayin Academy)",
                    "Abovyan str. (Abovyan park)", "Myasnikyan ave. (Heratsi cross)", "Saralanj str.", "Avet Avetisyan str.", "Vagharshyan str.", "Sasna Tsrer str.",
                    "Davtashen 1st district", "Tigran Petrosyan str.", "Eghvard highway", "Davtashen 4th district", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("8", "A", "Davtashen 4th district", "Tigran Petrosyan str.", "Davtashen 1st district",
                    "Iosifyan str.", "Halabyan str. (Fizika cross)", "Halabyan str. (TUMO)", "Halabyan str. (Kievyan bridge)", "Kievyan str.(Kievyan bridge)",
                    "Kievyan str.(Orbeli cross)", "Kievyan str.(Barkamutyun)", "Baghramyan Ave. (SAS Supermarket)", "Baghramyan Ave. (School after Kamo)",
                    "Baghramyan Ave. (American University of Armenia)", "Baghramyan Ave. (Constitutional Court)", "Baghramyan Ave. (Opera House)",
                    "Mashtots ave. (Conservatoire)", "Moskovyan str. (Conservatoire)", "Abovyan str. (Yeritasardakan m/s)", "Abovyan str. (Agrarayin Academy)",
                    "Abovyan str. (Abovyan park)", "Myasnikyan ave. (Heratsi cross)", "Myasnikyan ave. (Yerevan Zoo)",
                    "Myasnikyan ave. (Water world)", "Gayi ave. (Aquatec)", "Gayi ave. (Statue of Gay)", "Gayi ave. (Mersedes Benz Salon)", "Badal Muradyan str.",
                    "Davit Bek", "Hunan Avetisyan str.", "Nor Norq 7th district", "Vilnus str.", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("9", "A", "Sari tagh", "Sari Tagh 12th str.", "Sari Tagh 11th str.", "Sari Tagh 5th str.",
                    "Sari Tagh 1st str.", "Glinka str.", "Khorenatsi str. (Shilachi)", "Nar-Dos str. (Shilachi cross)", "Tigran Mets ave. (Tashir Mall)", "Gum Market",
                    "Zavaryan str.", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("12", "A", "Aeratsia", "Shirak str. (Hippodrome)", "Shirak str. (Charbakh Market)",
                    "Artashisyan str.", "Bagratunyats Ave. (Artashisyan cross)", "Bagratunyats Ave. (Yerevan City Supermarket)", "Bagratunyats Ave. (Isakov cross)",
                    "Sebastia str. (Kurghinyan cross)", "Sebastia str. (Malatia Market)", "Sebastia str. (Tichina cross)", "Sebastia str. (Leningradyan cross)",
                    "Grigor Hasratyan str.", "Janibekyan str.", "Bashinjaghyan str.", "Margaryan str. (Pegas)", "Margaryan str. (Hanrapetakan hospital)",
                    "Halabyan str. (Fizika cross)", "Davtashen 1st district", "Iosifyan str.", "Tigran Petrosyan str.", "Davtashen 4th district", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("13", "A", "Gasprom Armenia", "Tbilisyan highway (Radiomast)", "Zakarya Kanaqerci str.",
                    "Azatutyan Ave. (Raykom)", "Komitas ave. (Lambada bridge)", "Komitas ave. (Komitas Market)", "Komitas ave. (Vracakan cross)",
                    "Komitas ave. (Russian-Armenian University)", "Komitas ave. (Papazyan cross)", "Komitas ave. (Vagharshyan cross)", "Komitas ave. (Gyulbenkyan cross)",
                    "Kasyan str.", "Baghramyan Ave. (SAS Supermarket)", "Baghramyan Ave. (School after Kamo)", "Baghramyan Ave. (American University of Armenia)",
                    "Baghramyan Ave. (Constitutional Court)", "Baghramyan Ave. (Opera House)", "Sayat Nova ave. (Nalbandyan cross)", "Sayat Nova ave. (Aleq Manukyan cross)",
                    "Radiohouse", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("14", "A", "Lepsius str.", "Dro srt.", "Paruyr Sevak str.", "Ulnetsi str.", "Nersisyan str.",
                    "Azatutyan Ave. (Raykom)", "Azatutyan Ave. (Nairi Zaryan cross)", "Azatutyan Ave. (Military Commission)", "Azatutyan Ave. (The Victory Park)",
                    "Saralanj str.", "Abovyan str. (Abovyan park)", "Abovyan str. (Agrarayin Academy)", "Abovyan str. (Yeritasardakan m/s)", "Moskovyan str. (Camera music house)",
                    "Khanjyan str. (Chess house)", "Vernisage", "Khanjyan str. (Lunapark)", "Pedagogical University", "Tigran Mets ave. (Ayrarat cinema)",
                    "Tigran Mets ave. (Tashir Mall)", "Tigran Mets ave. (Yerevan Railway Station Management)", "Tigran Mets ave. (Yerevan Railway Station)",
                    "Artsakh str.", "Vstrech bridge", "Garegin Njdeh str.", "Arshakunyats Ave. (Hayreniq cinema)", "Ashkhatanq square (Worker's statue)",
                    "Arshakunyats Ave. (To Charbakh)", "Shirak str. (Erebuni Airport)", "Araratyan str.", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("15", "A", "Nor Norq 6th district", "Badal Muradyan str.", "Shopron str.", "Gyurjyan str.", "Nerson Safaryan str.",
                    "Nansen str.", "Gayi ave. (Statue of Gay)", "Gayi ave. (Aquatec)", "Myasnikyan ave. (Water world)", "Myasnikyan ave. (Yerevan Zoo)", "Myasnikyan ave. (Heratsi cross)",
                    "Abovyan str. (Abovyan park)", "Abovyan str. (Agrarayin Academy)", "Abovyan str. (Yeritasardakan m/s)", "Moskovyan str. (Camera music house)",
                    "Khanjyan str. (Chess house)", "Vernisage", "Khanjyan str. (Lunapark)", "Pedagogical University", "Agathangeghos str.", "Arshakunyats Ave. (Circus)",
                    "Arshakunyats Ave. (Surmalu Mall)", "Arshakunyats Ave. (Komitas's park)", "Arshakunyats Ave. (Yerevan Mall)", "Arshakunyats Ave. (Hayreniq cinema)", "Garegin Njdeh str.",
                    "Garegin Njdeh square", "Bagratunyats Ave. (Artashisyan cross)", "Artashisyan str.", "Shirak str. (Charbakh Market)", "Shirak str. (Hippodrome)", "Aeratsia", "",
                    "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("16", "A", "Nubarashen 11th str.", "Nubarashen 9th str.", "Nubarashen 10th str.",
                    "Nubarashen 6th str.", "Nubarashen highway", "Khachik Dashtents str.", "Erebuni museum", "Erebuni str.", "Azatamartikneri str.", "Sasuntsi Davit str.",
                    "Tigran Mets ave. (Yerevan Railway Station)", "Tigran Mets ave. (Yerevan Railway Station Management)", "Tigran Mets ave. (Tashir Mall)", "Tigran Mets ave. (Ayrarat cinema)", "Pedagogical University",
                    "Khanjyan str. (Lunapark)", "Vernisage", "Khanjyan str. (Chess house)", "Sayat Nova ave. (Aleq Manukyan cross)", "Charenc str. (Zigzag)",
                    "Charenc str. (Yerevan State University)", "Charenc str. (RA Police)", "Medical University", "Koryun str. (Citadel)", "Mashtots ave. (Matenadaran)",
                    "Mashtots ave. (Conservatoire)", "Mashtots ave. (Opera)", "Baghramyan Ave. (Opera House)", "Baghramyan Ave. (Constitutional Court)", "Baghramyan Ave. (American University of Armenia)",
                    "Baghramyan Ave. (School after Kamo)", "Baghramyan Ave. (SAS Supermarket)", "Kasyan str.", "Komitas ave. (Gyulbenkyan cross)", "Komitas ave. (Vagharshyan cross)",
                    "Komitas ave. (Papazyan cross)", "Komitas ave. (Russian-Armenian University)", "Komitas ave. (Vracakan cross)", "Komitas ave. (Komitas Market)",
                    "Komitas ave. (Lambada bridge)", "Azatutyan Ave. (Raykom)", "Aharonyan str.", "Dro srt.", "Milk factory", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("18", "A", "Qasakh village", "Vahagni district", "Red Cross", "Huysi district",
                    "Silikyan New Highway․", "Ashtarak road", "Chaush str.", "Mazmanyan str.", "Bashinjaghyan str.", "Janibekyan str.", "Shinararner str.", "Arzumanyan str.", "Halabyan str. (TUMO)",
                    "Halabyan str. (Kievyan bridge)", "Kievyan str.(Kievyan bridge)", "Kievyan str.(Orbeli cross)", "Kievyan str.(Barkamutyun)", "Baghramyan Ave. (SAS Supermarket)",
                    "Baghramyan Ave. (School after Kamo)", "Baghramyan Ave. (American University of Armenia)", "Baghramyan Ave. (Constitutional Court)", "Baghramyan Ave. (Opera House)",
                    "Mashtots ave. (Conservatoire)", "Mashtots ave. (Matenadaran)", "Koryun str. (Citadel)", "Medical University", "Charenc str. (RA Police)",
                    "Charenc str. (Yerevan State University)", "Charenc str. (Zigzag)", "Sayat Nova ave. (Aleq Manukyan cross)", "Khanjyan str. (Chess house)", "Vernisage",
                    "Khanjyan str. (Lunapark)", "Pedagogical University", "Tigran Mets ave. (Ayrarat cinema)", "Tigran Mets ave. (Tashir Mall)", "Tigran Mets ave. (Yerevan Railway Station Management)",
                    "Tigran Mets ave. (Yerevan Railway Station)", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("20", "A", "Avan ", "Duryan district", "Nver Safaryan str.", "Marshal Khudyakov str.",
                    "Almati str.", "Marshal Babajanyan str.", "Acharyan str.", "Botanical park", "Myasnikyan ave. (Water world)", "Myasnikyan ave. (Yerevan Zoo)",
                    "Myasnikyan ave. (Heratsi cross)", "Abovyan str. (Abovyan park)", "Abovyan str. (Agrarayin Academy)", "Medical University", "Nalbandyan str. (Yerevan State Economical University)",
                    "Sayat Nova ave. (Nalbandyan cross)", "Mashtots ave. (Opera)", "Mashtots ave. (Margaryan hospital)", "Mashtots ave. (Amiryan cross)",
                    "Khorenatsi str. (Mashtoc cross)", "Khorenatsi str. (Shahumyan square)", "Beirut str.", "Grigor Lusavoritch str. (City Hall)", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("21", "A", "Sari tagh", "Sari Tagh 20th str.", "Sari Tagh 21th str.", "Sari Tagh 3rd str.",
                    "Sari Tagh 1st str.", "Khorenatsi str. (Shilachi)", "Nar-Dos str. (Shilachi cross)", "Tigran Mets ave. (Tashir Mall)", "Tigran Mets ave. (Ayrarat cinema)",
                    "Pedagogical University", "Khanjyan str. (Lunapark)", "Vernisage", "Khanjyan str. (Chess house)", "Moskovyan str. (Camera music house)",
                    "Abovyan str. (Yeritasardakan m/s)", "Abovyan str. (Agrarayin Academy)", "Abovyan str. (Abovyan park)", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("22", "A", "Nor Norq 9th district", "Vilnus str.", "Nor Norq 8th district", "Minsk str. (Nor Nork 8th district)",
                    "Artem Mikoyan str.", "Badal Muradyan str.", "Myasnikyan ave. (Water world)", "Myasnikyan ave. (Yerevan Zoo)", "Myasnikyan ave. (Heratsi cross)",
                    "Abovyan str. (Abovyan park)", "Abovyan str. (Agrarayin Academy)", "Medical University", "Nalbandyan str. (Yerevan State Economical University)", "Sayat Nova ave. (Nalbandyan cross)", "Mashtots ave. (Opera)",
                    "Mashtots ave. (Margaryan hospital)", "Mashtots ave. (Amiryan cross)", "Amiryan str.", "Republic Square", "Tigran Mets ave. (Firdus Market)",
                    "Pedagogical University", "Tigran Mets ave. (Ayrarat cinema)", "Tigran Mets ave. (Tashir Mall)", "Tigran Mets ave. (Yerevan Railway Station Management)", "Tigran Mets ave. (Yerevan Railway Station)",
                    "Artsakh str.", "Erebuni str.", "Atoyan str.", "Ayvazovski str.", "Avanesov str.", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("23", "A", "Isakov ave.", "Arno Babajanyan str.", "Gusan Sheram str.", "Ohanov str.",
                    "Zoravar Andranik str.", "Raffi str.", "Raffi str. (Malatia Market)", "Sebastia str. (Malatia Market)", "Sebastia str. (Kurghinyan cross)",
                    "Isakov ave. (Sebastia cross)", "Kilikia autostation", "Victory bridge", "Mashtots ave. (Fish market)", "Mashtots ave. (Covered market)",
                    "Mashtots ave. (Amiryan cross)", "Mashtots ave. (Margaryan hospital)", "Mashtots ave. (Opera)", "Mashtots ave. (Conservatoire)", "Mashtots ave. (Matenadaran)",
                    "Koryun str. (Citadel)", "Abovyan str. (Agrarayin Academy)", "Saralanj str.", "Azatutyan Ave. (The Victory Park)", "Azatutyan Ave. (Military Commission)",
                    "Azatutyan Ave. (Nairi Zaryan cross)", "Azatutyan Ave. (Raykom)", "Paruyr Sevak str.", "Rubinyants str. (Yerevan City Supermarket)", "Rubinyants str. (Almast factory)",
                    "Gayi ave. (Aquatec)", "Gayi ave. (Statue of Gay)", "Gayi ave. (Mersedes Benz Salon)", "Badal Muradyan str.", "Nor Norq 6th district", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("24", "A", "Rubinyants str. (Almast factory)", "Rubinyants str. (Yerevan City Supermarket)",
                    "Rubinyants str. (Aharonyan str.)", "Davit Anhaght str. (Dro str. cross)", "Davit Anhaght str. (Kerama Marazzi)", "Davit Anhaght str. (Municipality)",
                    "Azatutyan Ave. (Nairi Zaryan cross)", "Azatutyan Ave. (Military Commission)", "Azatutyan Ave. (The Victory Park)", "Saralanj str.", "Koryun str. (Citadel)",
                    "Mashtots ave. (Matenadaran)", "Mashtots ave. (Conservatoire)", "Mashtots ave. (Opera)", "Mashtots ave. (Margaryan hospital)", "Mashtots ave. (Amiryan cross)",
                    "Mashtots ave. (Covered market)", "Mashtots ave. (Fish market)", "Grigor Lusavoritch str. (City Hall)", "Arshakunyats Ave. (Circus)",
                    "Arshakunyats Ave. (Surmalu Mall)", "Arshakunyats Ave. (Komitas's park)", "Arshakunyats Ave. (Yerevan Mall)", "Arshakunyats Ave. (Hayreniq cinema)", "Garegin Njdeh str.",
                    "Garegin Njdeh square", "Bagratunyats Ave. (Artashisyan cross)", "Bagratunyats Ave. (Yerevan City Supermarket)", "Bagratunyats Ave. (Isakov cross)",
                    "Sebastia str. (Kurghinyan cross)", "Kurghinyan str.", "Vantyan str.", "Varouzhan str.", "Malatia Medical Center", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("26", "A", "South-Western district", "Zoravar Andranik str.", "Raffi str.", "Raffi str. (Malatia Market)",
                    "Sebastia str. (Malatia Market)", "Sebastia str. (Tichina cross)", "Sebastia str. (Leningradyan cross)", "Leningradyan str. (Eurowagen)",
                    "Leningradyan str. (Shinararner cross)", "Leningradyan str. (Monte Melkonyan cross)", "Tsitsarnakaberd higway", "Dalma Garden Mall", "Athens str.",
                    "Hrazdan stadium", "Victory bridge", "Argishti str.", "Grigor Lusavoritch str. (City Hall)", "Mashtots ave. (Fish market)", "Mashtots ave. (Covered market)",
                    "Mashtots ave. (Amiryan cross)", "Mashtots ave. (Margaryan hospital)", "Mashtots ave. (Opera)", "Mashtots ave. (Conservatoire)", "Moskovyan str. (Conservatoire)",
                    "Abovyan str. (Yeritasardakan m/s)", "Abovyan str. (Agrarayin Academy)", "Abovyan str. (Abovyan park)", "Myasnikyan ave. (Heratsi cross)",
                    "Myasnikyan ave. (Yerevan Zoo)", "Myasnikyan ave. (Water world)", "Gayi ave. (Aquatec)", "Gayi ave. (Statue of Gay)", "Gayi ave. (Mersedes Benz Salon)",
                    "Badal Muradyan str.", "Davit Bek", "Hunan Avetisyan str.", "Nor Norq 7th district", "Vilnus str.", "Nor Norq 9th district", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("27", "A", "16th district", "Norashen district", "Melqumov str.", "Beknazaryan str.", "Bashinjaghyan str.",
                    "Margaryan str. (Pegas)", "Margaryan str. (Hanrapetakan hospital)", "Halabyan str. (Fizika cross)", "Halabyan str. (TUMO)", "Estonakan str.", "Shinararner str.",
                    "Arzumanyan str.", "Halabyan str. (Kievyan bridge)", "Leningradyan str. (Kievyan bridge)", "Tsitsarnakaberd higway", "Dalma Garden Mall", "Athens str.",
                    "Hrazdan stadium", "Victory bridge", "Mashtots ave. (Fish market)", "Mashtots ave. (Covered market)", "Mashtots ave. (Amiryan cross)", "Mashtots ave. (Margaryan hospital)",
                    "Mashtots ave. (Opera)", "Mashtots ave. (Conservatoire)", "Mashtots ave. (Matenadaran)", "Koryun str. (Citadel)", "Medical University",
                    "Charenc str. (RA Police)", "Heratsi str.", "Armenakyan str.", "Hovsepyan str.", "Telecenter", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("28", "A", "Nor Norq 8th district", "Minsk str. (Nor Nork 8th district)", "Artem Mikoyan str.",
                    "Badal Muradyan str.", "Gayi ave. (Mersedes Benz Salon)", "Gayi ave. (Statue of Gay)", "Gayi ave. (Aquatec)", "Rubinyants str. (Almast factory)", "Rubinyants str. (Yerevan City Supermarket)",
                    "Rubinyants str. (Aharonyan str.)", "Davit Anhaght str. (Dro str. cross)", "Davit Anhaght str. (Kerama Marazzi)", "Davit Anhaght str. (Municipality)",
                    "Komitas ave. (Lambada bridge)", "Komitas ave. (Komitas Market)", "Komitas ave. (Vracakan cross)", "Komitas ave. (Russian-Armenian University)",
                    "Komitas ave. (Papazyan cross)", "Komitas ave. (Vagharshyan cross)", "Komitas ave. (Gyulbenkyan cross)", "Kasyan str.", "Kievyan str.(Barkamutyun)",
                    "Kievyan str.(Orbeli cross)", "Kievyan str.(Kievyan bridge)", "Halabyan str. (Kievyan bridge)", "Halabyan str. (TUMO)", "Halabyan str. (Fizika cross)",
                    "Margaryan str. (Hanrapetakan hospital)", "Margaryan str. (Pegas)", "Bashinjaghyan str.", "Mazmanyan str.", "Chaush str.", "Ashtarak road", "Huysi district", "", "", "", "",
                    "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("32", "A", "Northern autostation", "Gasprom Armenia․", "Tbilisyan highway (Radiomast)",
                    "Zakarya Kanaqerci str.", "Azatutyan Ave. (Raykom)", "Azatutyan Ave. (Nairi Zaryan cross)", "Azatutyan Ave. (Military Commission)", "Azatutyan Ave. (The Victory Park)",
                    "Saralanj str.", "Teryan str.", "Koryun str. (Citadel)", "Mashtots ave. (Matenadaran)", "Mashtots ave. (Conservatoire)", "Mashtots ave. (Opera)",
                    "Mashtots ave. (Margaryan hospital)", "Amiryan str.", "Republic Square", "Tigran Mets ave. (Firdus Market)", "Pedagogical University", "Agathangeghos str.",
                    "Arshakunyats Ave. (Circus)", "Arshakunyats Ave. (Surmalu Mall)", "Arshakunyats Ave. (Komitas's park)", "Arshakunyats Ave. (Yerevan Mall)", "Arshakunyats Ave. (Hayreniq cinema)",
                    "Garegin Njdeh str.", "Garegin Njdeh square", "Manandyan str.", "Arax stadium", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("33", "A", "Davtashen 4th district", "Tigran Petrosyan str.", "Davtashen 1st district", "Iosifyan str.",
                    "Halabyan str. (Fizika cross)", "Halabyan str. (TUMO)", "Halabyan str. (Kievyan bridge)", "Leningradyan str. (Kievyan bridge)", "Tsitsarnakaberd higway",
                    "Dalma Garden Mall", "Athens str.", "Hrazdan stadium", "Victory bridge", "Mashtots ave. (Fish market)", "Mashtots ave. (Covered market)", "Amiryan str.",
                    "Republic Square", "Tigran Mets ave. (Firdus Market)", "Pedagogical University", "Tigran Mets ave. (Ayrarat cinema)", "Tigran Mets ave. (Tashir Mall)",
                    "Tigran Mets ave. (Yerevan Railway Station Management)", "Tigran Mets ave. (Yerevan Railway Station)", "Artsakh str.", "Vstrech bridge", "Garegin Njdeh str.", "Arshakunyats Ave. (Hayreniq cinema)",
                    "Ashkhatanq square (Worker's statue)", "Noragavit 1st str.", "Artashat road", "Kharberd village", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("34", "A", "Mushavan village", "Vardashen village", "Mahari str.", "Nubarashen str.", "Davit Bek",
                    "Azatamartikneri str.", "Sasuntsi Davit str.", "Tigran Mets ave. (Yerevan Railway Station)", "Tigran Mets ave. (Yerevan Railway Station Management)", "Tigran Mets ave. (Tashir Mall)",
                    "Tigran Mets ave. (Ayrarat cinema)", "Pedagogical University", "Tigran Mets ave. (Firdus Market)", "Republic Square", "Amiryan str.",
                    "Mashtots ave. (Amiryan cross)", "Mashtots ave. (Margaryan hospital)", "Mashtots ave. (Opera)", "Mashtots ave. (Conservatoire)", "Mashtots ave. (Matenadaran)",
                    "Koryun str. (Citadel)", "Abovyan str. (Agrarayin Academy)", "Abovyan str. (Abovyan park)", "Saralanj str.", "Azatutyan Ave. (The Victory Park)",
                    "General Babayan str.", "Arabkir 17th str.", "Arabkir 29th str.", "Riga str.", "Hrachya Kochar str. (Vratsakan cross)", "Hrachya Kochar str. (Papazyan cross)",
                    "Hrachya Kochar str. (Vagharshyan cross)", "Vagharshyan str.", "Davtashen bridge", "Davtashen 1st district", "Tigran Petrosyan str.", "Davtashen 2nd district", "", "",
                    "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("35", "A", "Nor Norq 4th district", "Gyuliqekhvyan str.", "Galshoyan str.", "Artem Mikoyan str.",
                    "Badal Muradyan str.", "Gayi ave. (Mersedes Benz Salon)", "Gayi ave. (Statue of Gay)", "Gayi ave. (Aquatec)", "Myasnikyan ave. (Water world)",
                    "Myasnikyan ave. (Yerevan Zoo)", "Myasnikyan ave. (Heratsi cross)", "Abovyan str. (Abovyan park)", "Abovyan str. (Agrarayin Academy)",
                    "Abovyan str. (Yeritasardakan m/s)", "Moskovyan str. (Conservatoire)", "Mashtots ave. (Conservatoire)", "Mashtots ave. (Opera)", "Baghramyan Ave. (Opera House)",
                    "Baghramyan Ave. (Constitutional Court)", "Baghramyan Ave. (American University of Armenia)", "Baghramyan Ave. (School after Kamo)", "Baghramyan Ave. (SAS Supermarket)",
                    "Kievyan str.(Barkamutyun)", "Kievyan str.(Orbeli cross)", "Kievyan str.(Kievyan bridge)", "Leningradyan str. (Kievyan bridge)",
                    "Leningradyan str. (Monte Melkonyan cross)", "Leningradyan str. (Shinararner cross)", "Leningradyan str. (Eurowagen)",
                    "Sebastia str. (Leningradyan cross)", "Sebastia str. (Tichina cross)", "Sebastia str. (Malatia Market)", "Raffi str. (Malatia Market)",
                    "Raffi str.", "Zoravar Andranik str.", "Ohanov str.", "Gusan Sheram str.", "Arno Babajanyan str.", "Isakov ave.", "Argavand village", "Geghanist village",
                    "Azatashen village", "Khachpar village", "", ""));

            ////61A soon -> edit
//            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("36a", "A", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""
//                    , "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("37", "A", "Erebuni district ", "Titigradyan str.", "Ayvazovski str.", "Erebuni str.",
                    "Artsakh str.", "Tigran Mets ave. (Yerevan Railway Station)", "Tigran Mets ave. (Yerevan Railway Station Management)", "Tigran Mets ave. (Tashir Mall)", "Tigran Mets ave. (Ayrarat cinema)",
                    "Pedagogical University", "Tigran Mets ave. (Firdus Market)", "Republic Square", "Amiryan str.", "Mashtots ave. (Amiryan cross)",
                    "Mashtots ave. (Margaryan hospital)", "Mashtots ave. (Opera)", "Baghramyan Ave. (Opera House)", "Baghramyan Ave. (Constitutional Court)",
                    "Baghramyan Ave. (American University of Armenia)", "Baghramyan Ave. (School after Kamo)", "Baghramyan Ave. (SAS Supermarket)", "Kasyan str.",
                    "Komitas ave. (Gyulbenkyan cross)", "Komitas ave. (Vagharshyan cross)", "Komitas ave. (Papazyan cross)",
                    "Komitas ave. (Russian-Armenian University)", "Komitas ave. (Vracakan cross)", "Komitas ave. (Komitas Market)", "Komitas ave. (Lambada bridge)",
                    "Davit Anhaght str. (Municipality)", "Davit Anhaght str. (Kerama Marazzi)", "Davit Anhaght str. (Dro str. cross)", "Rubinyants str. (Aharonyan str.)",
                    "Rubinyants str. (Yerevan City Supermarket)", "Rubinyants str. (Almast factory)", "Gayi ave. (Aquatec)", "Lvovyan str.", "Nor Norq 1st district", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("38", "A", "Aynthap village", "Artashat road", "Noragavit 1st str.", "Ashkhatanq square (Worker's statue)",
                    "Bagratunyats Ave. (Worker's statue)", "Garegin Njdeh square", "Garegin Njdeh str.", "Arshakunyats Ave. (Hayreniq cinema)", "Arshakunyats Ave. (Yerevan Mall)",
                    "Arshakunyats Ave. (Komitas's park)", "Arshakunyats Ave. (Surmalu Mall)", "Arshakunyats Ave. (Circus)", "Agathangeghos str.", "Pedagogical University",
                    "Khanjyan str. (Lunapark)", "Vernisage", "Sayat Nova ave. (Nalbandyan cross)", "Sayat Nova ave. (Aleq Manukyan cross)", "Charenc str. (Zigzag)",
                    "Charenc str. (Yerevan State University)", "Charenc str. (RA Police)", "Medical University", "Abovyan str. (Yeritasardakan m/s)", "Abovyan str. (Agrarayin Academy)",
                    "Abovyan str. (Abovyan park)", "Myasnikyan ave. (Heratsi cross)", "Myasnikyan ave. (Yerevan Zoo)", "Myasnikyan ave. (Water world)", "Gayi ave. (Aquatec)",
                    "Gayi ave. (Statue of Gay)", "Stepanyan str.", "Moldovakan str.", "Nor Norq 2nd district", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("39", "A", "16th district", "Norashen district", "Melqumov str.", "Beknazaryan str.", "15th district", "Mazmanyan str.",
                    "Shiraz str.", "Grigor Hasratyan str.", "Sebastia str. (Leningradyan cross)", "Sebastia str. (Tichina cross)", "Sebastia str. (Malatia Market)",
                    "Sebastia str. (Kurghinyan cross)", "Bagratunyats Ave. (Isakov cross)", "Bagratunyats Ave. (Yerevan City Supermarket)", "Bagratunyats Ave. (Artashisyan cross)",
                    "Garegin Njdeh square", "Garegin Njdeh str.", "Vstrech bridge", "Artsakh str.", "Erebuni str.", "Ayvazovski str.", "Titigradyan str.", "Erebuni district", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("41", "A", "Avan ", "Marshal Babajanyan str.", "Acharyan str.", "Botanical park",
                    "Myasnikyan ave. (Water world)", "Myasnikyan ave. (Yerevan Zoo)", "Myasnikyan ave. (Heratsi cross)", "Abovyan str. (Abovyan park)", "Abovyan str. (Agrarayin Academy)",
                    "Medical University", "Nalbandyan str. (Yerevan State Economical University)", "Sayat Nova ave. (Nalbandyan cross)", "Vernisage", "Khanjyan str. (Lunapark)",
                    "Pedagogical University", "Tigran Mets ave. (Ayrarat cinema)", "Tigran Mets ave. (Tashir Mall)", "Tigran Mets ave. (Yerevan Railway Station Management)", "Tigran Mets ave. (Yerevan Railway Station)",
                    "Artsakh str.", "Erebuni str.", "Ayvazovski str.", "Titigradyan str.", "Khakhagh Don str.", "Erebuni district", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("42", "A", "Nor Norq 8th district", "Minsk str. (Nor Nork 8th district)", "Artem Mikoyan str.",
                    "Badal Muradyan str.", "Gayi ave. (Mersedes Benz Salon)", "Gayi ave. (Statue of Gay)", "Gayi ave. (Aquatec)", "Myasnikyan ave. (Water world)", "Myasnikyan ave. (Yerevan Zoo)",
                    "Myasnikyan ave. (Heratsi cross)", "Abovyan str. (Abovyan park)", "Abovyan str. (Agrarayin Academy)", "Medical University", "Nalbandyan str. (Yerevan State Economical University)",
                    "Sayat Nova ave. (Nalbandyan cross)", "Sayat Nova ave. (Aleq Manukyan cross)", "Alek Manukyan str.", "Yervand Kochar str.", "Tigran Mets ave. (Tashir Mall)",
                    "Tigran Mets ave. (Ayrarat cinema)", "Pedagogical University", "Agathangeghos str.", "Arshakunyats Ave. (Circus)", "Arshakunyats Ave. (Surmalu Mall)",
                    "Arshakunyats Ave. (Komitas's park)", "Arshakunyats Ave. (Yerevan Mall)", "Arshakunyats Ave. (Hayreniq cinema)", "Garegin Njdeh str.", "Garegin Njdeh square",
                    "Manandyan str.", "Arax stadium", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("44", "A", "Tichina str.", "Zoravar Andranik str.", "Ohanov str.", "Gusan Sheram str.",
                    "Raffi str.", "Raffi str. (Malatia Market)", "Sebastia str. (Malatia Market)", "Sebastia str. (Kurghinyan cross)", "Bagratunyats Ave. (Isakov cross)",
                    "Bagratunyats Ave. (Yerevan City Supermarket)", "Bagratunyats Ave. (Artashisyan cross)", "Garegin Njdeh square", "Garegin Njdeh str.", "Vstrech bridge", "Artsakh str.",
                    "Tigran Mets ave. (Yerevan Railway Station)", "Tigran Mets ave. (Yerevan Railway Station Management)", "Tigran Mets ave. (Tashir Mall)", "Tigran Mets ave. (Ayrarat cinema)",
                    "Pedagogical University", "Tigran Mets ave. (Firdus Market)", "Republic Square", "Amiryan str.", "Mashtots ave. (Amiryan cross)", "Mashtots ave. (Margaryan hospital)",
                    "Mashtots ave. (Opera)", "Moskovyan str. (Conservatoire)", "Abovyan str. (Yeritasardakan m/s)", "Abovyan str. (Agrarayin Academy)", "Abovyan str. (Abovyan park)",
                    "Myasnikyan ave. (Heratsi cross)", "Myasnikyan ave. (Yerevan Zoo)", "Myasnikyan ave. (Water world)", "Gayi ave. (Aquatec)", "Gayi ave. (Statue of Gay)",
                    "Nerson Safaryan str.", "Gyurjyan str. ", "Saint Gregory Iluminator Medical Center", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("45", "A", "Marash", "Norq 13th str.", "Norq 9th str.", "Norq 6th str.", "Norq 5th str.",
                    "Norq 8th str.", "Armenakyan str.", "Saralanj str.", "Heratsi str.", "Charenc str. (RA Police)", "Medical University", "Koryun str. (Citadel)",
                    "Mashtots ave. (Matenadaran)", "Mashtots ave. (Conservatoire)", "Mashtots ave. (Opera)", "Baghramyan Ave. (Opera House)", "Baghramyan Ave. (Constitutional Court)",
                    "Baghramyan Ave. (American University of Armenia)", "Baghramyan Ave. (School after Kamo)", "Baghramyan Ave. (SAS Supermarket)", "Kasyan str.", "Komitas ave. (Gyulbenkyan cross)",
                    "Vagharshyan str.", "Sasna Tsrer str.", "Davtashen 1st district", "Tigran Petrosyan str.", "Davtashen 4th district", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("46", "A", "Arinj Mall", "Northern autostation", "Gasprom Armenia", "Tbilisyan highway (Radiomast)",
                    "Zakarya Kanaqerci str.", "Tbilisyan highway (Lights factory)", "Azatutyan Ave. (Raykom)", "Azatutyan Ave. (Nairi Zaryan cross)", "Azatutyan Ave. (Military Commission)",
                    "Azatutyan Ave. (The Victory Park)", "Saralanj str.", "Abovyan str. (Abovyan park)", "Abovyan str. (Agrarayin Academy)", "Abovyan str. (Yeritasardakan m/s)",
                    "Moskovyan str. (Camera music house)", "Khanjyan str. (Chess house)", "Vernisage", "Khanjyan str. (Lunapark)", "Pedagogical University", "Tigran Mets ave. (Ayrarat cinema)",
                    "Tigran Mets ave. (Tashir Mall)", "Tigran Mets ave. (Yerevan Railway Station Management)", "Tigran Mets ave. (Yerevan Railway Station)", "Artsakh str.",
                    "Erebuni str.", "Ayvazovski str.", "Titigradyan str.", "Khakhagh Don str.", "Erebuni district", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("47", "A", "Arinj village", "Acharyan str.", "Gasprom Armenia", "Tbilisyan highway (Radiomast)",
                    "Zakarya Kanaqerci str.", "Tbilisyan highway (Lights factory)", "Azatutyan Ave. (Raykom)", "Komitas ave. (Lambada bridge)", "Komitas ave. (Komitas Market)",
                    "Komitas ave. (Vracakan cross)", "Komitas ave. (Russian-Armenian University)", "Komitas ave. (Papazyan cross)", "Komitas ave. (Vagharshyan cross)",
                    "Komitas ave. (Gyulbenkyan cross)", "Kasyan str.", "Baghramyan Ave. (SAS Supermarket)", "Baghramyan Ave. (School after Kamo)", "Baghramyan Ave. (American University of Armenia)",
                    "Baghramyan Ave. (Constitutional Court)", "Baghramyan Ave. (Opera House)", "Mashtots ave. (Opera)", "Mashtots ave. (Margaryan hospital)", "Mashtots ave. (Amiryan cross)",
                    "Mashtots ave. (Covered market)", "Mashtots ave. (Fish market)", "Victory bridge", "Isakov ave.", "Kilikia autostation", "Sebastia str. (Kurghinyan cross)",
                    "Sebastia str. (Malatia Market)", "Raffi str. (Malatia Market)", "Raffi str.", "Zoravar Andranik str.", "Arno Babajanyan str.", "Shahumyan 4th str.", "Yerablur",
                    "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("53", "A", "Nor Norq 9th district", "Vilnus str.", "Nor Norq 7th district", "Hunan Avetisyan str.", "Davit Bek",
                    "Badal Muradyan str.", "Gayi ave. (Mersedes Benz Salon)", "Gayi ave. (Statue of Gay)", "Gayi ave. (Aquatec)", "Myasnikyan ave. (Water world)", "Myasnikyan ave. (Yerevan Zoo)",
                    "Myasnikyan ave. (Heratsi cross)", "Abovyan str. (Abovyan park)", "Abovyan str. (Agrarayin Academy)", "Abovyan str. (Yeritasardakan m/s)",
                    "Moskovyan str. (Camera music house)", "Khanjyan str. (Chess house)", "Vernisage", "Khanjyan str. (Lunapark)", "Pedagogical University", "Agathangeghos str.",
                    "Arshakunyats Ave. (Circus)", "Arshakunyats Ave. (Surmalu Mall)", "Arshakunyats Ave. (Komitas's park)", "Arshakunyats Ave. (Yerevan Mall)", "Arshakunyats Ave. (Hayreniq cinema)",
                    "Garegin Njdeh str.", "Garegin Njdeh square", "Bagratunyats Ave. (Artashisyan cross)", "Bagratunyats Ave. (Yerevan City Supermarket)", "Bagratunyats Ave. (Isakov cross)",
                    "Sebastia str. (Kurghinyan cross)", "Sebastia str. (Malatia Market)", "Raffi str. (Malatia Market)", "Raffi str.", "Zoravar Andranik str.",
                    "Arno Babajanyan str.", "Shahumyan 4th str.", "Yerablur", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("54", "A", "Avan-Arinj", "Tashkent str.", "Marshal Babajanyan str.", "Acharyan str.", "Botanical park",
                    "Myasnikyan ave. (Water world)", "Myasnikyan ave. (Yerevan Zoo)", "Myasnikyan ave. (Heratsi cross)", "Abovyan str. (Abovyan park)", "Abovyan str. (Agrarayin Academy)",
                    "Abovyan str. (Agrarayin Academy)", "Abovyan str. (Yeritasardakan m/s)", "Moskovyan str. (Conservatoire)", "Mashtots ave. (Conservatoire)", "Mashtots ave. (Opera)",
                    "Mashtots ave. (Margaryan hospital)", "Mashtots ave. (Amiryan cross)", "Amiryan str.", "Republic Square", "Tigran Mets ave. (Firdus Market)",
                    "Pedagogical University", "Agathangeghos str.", "Arshakunyats Ave. (Circus)", "Arshakunyats Ave. (Surmalu Mall)", "Arshakunyats Ave. (Komitas's park)",
                    "Arshakunyats Ave. (Yerevan Mall)", "Arshakunyats Ave. (Hayreniq cinema)", "Garegin Njdeh str.", "Garegin Njdeh square", "Bagratunyats Ave. (Artashisyan cross)",
                    "Artashisyan str.", "Shirak str. (Erebuni Airport)", "Araratyan str.", "Nerqin Charbakh 1st str.", "Norabac village", "Dashtavan village", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("55", "A", "Armenian-Belorussian trade center", "Shirak str. (Charbakh Market)", "Artashisyan str.",
                    "Bagratunyats Ave. (Artashisyan cross)", "Bagratunyats Ave. (Yerevan City Supermarket)", "Bagratunyats Ave. (Isakov cross)", "Sebastia str. (Kurghinyan cross)",
                    "Kurghinyan str.", "Vantyan str.", "Varouzhan str.", "Sebastia str. (Malatia Market)", "Sebastia str. (Tichina cross)", "Sebastia str. (Leningradyan cross)",
                    "Leningradyan str. (Eurowagen)", "Leningradyan str. (Monte Melkonyan cross)", "Leningradyan str. (Kievyan bridge)", "Halabyan str. (Kievyan bridge)",
                    "Halabyan str. (TUMO)", "Arzumanyan str.", "Shinararner str.", "Abelyan str.", "Halabyan str. (Fizika cross)", "Margaryan str. (Hanrapetakan hospital)", "Fuchik str.",
                    "Melqumov str.", "Norashen district", "16th district", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("57", "A", "15th district", "Mazmanyan str.", "Chaush str.", "Melqumov str.", "Fuchik str.",
                    "Margaryan str. (Hanrapetakan hospital)", "Halabyan str. (Fizika cross)", "Halabyan str. (Fizika cross)", "Halabyan str. (TUMO)",
                    "Halabyan str. (Kievyan bridge)", "Kievyan str.(Kievyan bridge)", "Kievyan str.(Orbeli cross)", "Kievyan str.(Barkamutyun)", "Baghramyan Ave. (SAS Supermarket)",
                    "Baghramyan Ave. (School after Kamo)", "Baghramyan Ave. (American University of Armenia)", "Baghramyan Ave. (Constitutional Court)", "Baghramyan Ave. (Opera House)",
                    "Sayat Nova ave. (Nalbandyan cross)", "Sayat Nova ave. (Aleq Manukyan cross)", "Alek Manukyan str.", "Yervand Kochar str.", "Tigran Mets ave. (Tashir Mall)",
                    "Nar-Dos str. (Shilachi cross)", "Khorenatsi str. (Shilachi)", "Zavaryan str.", "Gum Market", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("58", "A", "Erebuni district", "Khakhagh Don str.", "Titigradyan str.", "Ayvazovski str.", "Erebuni str.",
                    "Atoyan str.", "Belinsku str.", "Sasuntsi Davit str.", "Tigran Mets ave. (Yerevan Railway Station)", "Tigran Mets ave. (Yerevan Railway Station Management)", "Tigran Mets ave. (Tashir Mall)",
                    "Tigran Mets ave. (Ayrarat cinema)", "Pedagogical University", "Tigran Mets ave. (Firdus Market)", "Republic Square", "Amiryan str.",
                    "Mashtots ave. (Amiryan cross)", "Mashtots ave. (Margaryan hospital)", "Mashtots ave. (Opera)", "Baghramyan Ave. (Opera House)", "Baghramyan Ave. (Constitutional Court)",
                    "Baghramyan Ave. (American University of Armenia)", "Baghramyan Ave. (School after Kamo)", "Baghramyan Ave. (SAS Supermarket)", "Kasyan str.", "Komitas ave. (Gyulbenkyan cross)",
                    "Komitas ave. (Vagharshyan cross)", "Komitas ave. (Papazyan cross)", "Komitas ave. (Russian-Armenian University)", "Komitas ave. (Vracakan cross)",
                    "Komitas ave. (Komitas Market)", "Komitas ave. (Lambada bridge)", "Azatutyan Ave. (Raykom)", "Paruyr Sevak str.", "Rubinyants str. (Yerevan City Supermarket)",
                    "Rubinyants str. (Almast factory)", "Khudyakov str.", "Tumanyan district", "Marshal Babajanyan str.", "Ashkhabad str.", "Avan-Arinj", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("59", "A", "Avan", "Khudyakov str.", "Almati str.", "Marshal Babajanyan str.", "Acharyan str.",
                    "Myasnikyan ave. (Water world)", "Myasnikyan ave. (Yerevan Zoo)", "Myasnikyan ave. (Heratsi cross)", "Abovyan str. (Abovyan park)", "Abovyan str. (Agrarayin Academy)",
                    "Abovyan str. (Yeritasardakan m/s)", "Sayat Nova ave. (Abovyan cross)", "Mashtots ave. (Opera)", "Mashtots ave. (Margaryan hospital)", "Mashtots ave. (Amiryan cross)",
                    "Khorenatsi str. (Mashtoc cross)", "Khorenatsi str. (Shahumyan square)", "Agathangeghos str.", "Arshakunyats Ave. (Circus)", "Arshakunyats Ave. (Surmalu Mall)",
                    "Qristapor str.", "Petak Mall", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            ///Temporary unavailable
//            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("62", "A", "Proshyan avan", "Ashtarak road", "Melqumov str.", "15th district", "Beknazaryan str.", "Mazmanyan str.",
//                    "Shiraz str.", "Grigor Hasratyan str.", "Leningradyan str. (Eurowagen)", "Leningradyan str. (Shinararner cross)", "Leningradyan str. (Monte Melkonyan cross)",
//                    "Tsitsarnakaberd higway", "Dalma Garden Mall", "Athens str.", "Hrazdan stadium", "Victory bridge", "Mashtots ave. (Covered market)", "Mashtots ave. (Fish market)",
//                    "Amiryan str.", "Republic Square", "Tigran Mets ave. (Firdus Market)", "Pedagogical University", "Tigran Mets ave. (Ayrarat cinema)",
//                    "Tigran Mets ave. (Tashir Mall)", "Tigran Mets ave. (Yerevan Railway Station Management)", "Tigran Mets ave. (Yerevan Railway Station)", "Artsakh str.", "Arin Berd str.", "Meat combinate", "", "", "", "", "",
//                    "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("63", "A", "Nor Norq 9th district", "Vilnus str.", "Nor Norq 7th district", "Hunan Avetisyan str.", "Davit Bek",
                    "Badal Muradyan str.", "Gayi ave. (Mersedes Benz Salon)", "Gayi ave. (Statue of Gay)", "Gayi ave. (Aquatec)", "Myasnikyan ave. (Water world)",
                    "Myasnikyan ave. (Yerevan Zoo)", "Myasnikyan ave. (Heratsi cross)", "Abovyan str. (Abovyan park)", "Abovyan str. (Agrarayin Academy)",
                    "Abovyan str. (Yeritasardakan m/s)", "Moskovyan str. (Camera music house)", "Khanjyan str. (Chess house)", "Vernisage", "Khanjyan str. (Lunapark)",
                    "Pedagogical University", "Tigran Mets ave. (Firdus Market)", "Republic Square", "Amiryan str.", "Mashtots ave. (Covered market)",
                    "Mashtots ave. (Fish market)", "Victory bridge", "Hrazdan stadium", "Athens str.", "Dalma Garden Mall", "Tsitsarnakaberd higway",
                    "Leningradyan str. (Monte Melkonyan cross)", "Halabyan str. (Kievyan bridge)", "Halabyan str. (TUMO)", "Halabyan str. (Fizika cross)",
                    "Margaryan str. (Hanrapetakan hospital)", "Margaryan str. (Pegas)", "Bashinjaghyan str.", "", "", "", "", "", "", "", ""));

//            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("67", "A", "Nazarbekyan district", "Silikyan New Highway․", "Grigor Hasratyan str.",
//                    "Sebastia str. (Leningradyan cross)", "Sebastia str. (Tichina cross)", "Sebastia str. (Malatia Market)", "Sebastia str. (Kurghinyan cross)",
//                    "Isakov ave. (Sebastia cross)", "Kilikia autostation", "Victory bridge", "Mashtots ave. (Fish market)", "Mashtots ave. (Covered market)", "Amiryan str.",
//                    "Republic Square", "Tigran Mets ave. (Firdus Market)", "Pedagogical University", "Tigran Mets ave. (Ayrarat cinema)", "Tigran Mets ave. (Tashir Mall)",
//                    "Tigran Mets ave. (Yerevan Railway Station Management)", "Tigran Mets ave. (Yerevan Railway Station)", "Artsakh str.", "Rostovyan str.", "Muratsan str.",
//                    "Erebuni str.", "Atoyan str.", "Ayvazovski str.", "Avanesov str.", "Erebuni district ", "Arno Babajanyan str.", "Zoravar Andranik str.", "Raffi str.",
//                    "Raffi str. (Malatia Market)", "Sebastia str. (Malatia Market)", "Vantyan str.", "Kurghinyan str.", "Sebastia str. (Kurghinyan cross)", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("68", "A", "Energetikneri banavan", "Ejmiatsin highway", "Isakov ave. (Sebastia cross)",
                    "Kilikia autostation", "Victory bridge", "Mashtots ave. (Fish market)", "Mashtots ave. (Covered market)", "Amiryan str.", "Republic Square",
                    "Tigran Mets ave. (Firdus Market)", "Pedagogical University", "Tigran Mets ave. (Ayrarat cinema)", "Tigran Mets ave. (Tashir Mall)", "Tigran Mets ave. (Yerevan Railway Station Management)",
                    "Tigran Mets ave. (Yerevan Railway Station)", "Sasuntsi Davit str.", "Custo str.", "City Pantheon", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("259", "A", "Kilikia autostation", "Victory bridge", "Mashtots ave. (Fish market)",
                    "Mashtots ave. (Covered market)", "Mashtots ave. (Amiryan cross)", "Mashtots ave. (Margaryan hospital)", "Mashtots ave. (Opera)", "Baghramyan Ave. (Opera House)",
                    "Baghramyan Ave. (Constitutional Court)", "Baghramyan Ave. (American University of Armenia)", "Baghramyan Ave. (School after Kamo)", "Baghramyan Ave. (SAS Supermarket)",
                    "Kasyan str.", "Komitas ave. (Gyulbenkyan cross)", "Komitas ave. (Vagharshyan cross)", "Komitas ave. (Papazyan cross)",
                    "Komitas ave. (Russian-Armenian University)", "Komitas ave. (Vracakan cross)", "Komitas ave. (Komitas Market)", "Komitas ave. (Lambada bridge)",
                    "Azatutyan Ave. (Raykom)", "Tbilisyan highway (Lights factory)", "Tbilisyan highway (Lights factory)", "Tbilisyan highway (Ayb High School)",
                    "Tbilisyan highway (Shampain factory of Yerevan)", "Tbilisyan highway (Radiomast)", "Gasprom Armenia", "Arinj Mall", "Verin Ptghni village",
                    "Balahovit village", "Abovyan city", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("261", "A", "Tigran Mets ave. (Yerevan Railway Station)", "Tigran Mets ave. (Yerevan Railway Station Management)",
                    "Tigran Mets ave. (Tashir Mall)", "Tigran Mets ave. (Ayrarat cinema)", "Pedagogical University", "Khanjyan str. (Lunapark)", "Vernisage", "Heratsi str.",
                    "Myasnikyan ave. (Heratsi cross)", "Myasnikyan ave. (Yerevan Zoo)", "Myasnikyan ave. (Water world)", "Botanical park", "Acharyan str.",
                    "Verin Ptghni village", "Balahovit village", "Abovyan city", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            /**
             * Microbuses
             * */

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("1", "M", "Erebuni Airport", "Ashkhatanq square (Worker's statue)",
                    "Arshakunyats Ave. (To Charbakh)", "Bagratunyats Ave. (Worker's statue)", "Garegin Njdeh square", "Bagratunyats Ave. (Artashisyan cross)",
                    "Bagratunyats Ave. (Yerevan City Supermarket)", "Bagratunyats Ave. (Isakov cross)", "Sebastia str. (Kurghinyan cross)", "Sebastia str. (Malatia Market)",
                    "Raffi str. (Malatia Market)", "Raffi str.", "Gusan Sheram str.", "Ohanov str.", "Zoravar Andranik str.", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("2", "M", "Oncology Institute", "Fanarjyan str.", "Zakarya Kanaqerci str.", "Ezras Hasratyan str.",
                    "Ulnetsi str.", "Nersisyan str.", "Azatutyan Ave. (Raykom)", "Komitas ave. (Lambada bridge)", "Komitas ave. (Komitas Market)", "Komitas ave. (Vracakan cross)",
                    "Komitas ave. (Russian-Armenian University)", "Komitas ave. (Papazyan cross)", "Komitas ave. (Vagharshyan cross)", "Komitas ave. (Gyulbenkyan cross)",
                    "Kasyan str.", "Baghramyan Ave. (SAS Supermarket)", "Baghramyan Ave. (School after Kamo)", "Baghramyan Ave. (American University of Armenia)", "Baghramyan Ave. (Constitutional Court)",
                    "Baghramyan Ave. (Opera House)", "Mashtots ave. (Opera)", "Mashtots ave. (Conservatoire)", "Mashtots ave. (Matenadaran)", "Koryun str. (Citadel)", "Medical University",
                    "Charenc str. (RA Police)", "Charenc str. (Yerevan State University)", "Charenc str. (Zigzag)", "Sayat Nova ave. (Aleq Manukyan cross)", "Alek Manukyan str.",
                    "Vardananc str.", "Hanrapetakan stadium", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("3", "M", "15th district", "Bashinjaghyan str.", "Margaryan str. (Pegas)", "Margaryan str. (Hanrapetakan hospital)",
                    "Halabyan str. (Fizika cross)", "Halabyan str. (TUMO)", "Halabyan str. (Kievyan bridge)", "Kievyan str.(Kievyan bridge)", "Kievyan str.(Orbeli cross)",
                    "Kievyan str.(Barkamutyun)", "Kasyan str.", "Komitas ave. (Gyulbenkyan cross)", "Komitas ave. (Vagharshyan cross)", "Komitas ave. (Papazyan cross)",
                    "Papazyan str.", "Aram Khachaturyan str.", "Riga str.", "Russian-Armenian University", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("4", "M", "Rubinyants str. (Yerevan City Supermarket)", "Paruyr Sevak str.", "Komitas ave. (Lambada bridge)Azatutyan Ave. (Raykom)",
                    "Komitas ave. (Lambada bridge)", "Komitas ave. (Komitas Market)", "Komitas ave. (Vracakan cross)", "Komitas ave. (Russian-Armenian University)",
                    "Komitas ave. (Papazyan cross)", "Komitas ave. (Vagharshyan cross)", "Komitas ave. (Gyulbenkyan cross)", "Kasyan str.", "Baghramyan Ave. (SAS Supermarket)",
                    "Baghramyan Ave. (School after Kamo)", "Baghramyan Ave. (American University of Armenia)", "Baghramyan Ave. (Constitutional Court)",
                    "Baghramyan Ave. (Opera House)", "Mashtots ave. (Opera)", "Mashtots ave. (Margaryan hospital)", "Mashtots ave. (Amiryan cross)", "Mashtots ave. (Covered market)",
                    "Mashtots ave. (Fish market)", "Victory bridge", "Athens str.", "Hrazdan stadium", "Dalma Garden Mall", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("5", "M", "Avan", "Duryan district", "Nver Safaryan str.", "Marshal Babajanyan str.", "Acharyan str.",
                    "Rubinyants str. (Almast factory)", "Rubinyants str. (Yerevan City Supermarket)", "Rubinyants str. (Aharonyan str.)", "Davit Anhaght str. (Dro str. cross)",
                    "Davit Anhaght str. (Kerama Marazzi)", "Davit Anhaght str. (Municipality)", "Komitas ave. (Lambada bridge)", "Komitas ave. (Komitas Market)",
                    "Komitas ave. (Vracakan cross)", "Komitas ave. (Russian-Armenian University)", "Komitas ave. (Papazyan cross)", "Komitas ave. (Vagharshyan cross)",
                    "Komitas ave. (Gyulbenkyan cross)", "Kasyan str.", "Kievyan str.(Barkamutyun)", "Kievyan str.(Orbeli cross)", "Kievyan str.(Kievyan bridge)",
                    "Halabyan str. (Kievyan bridge)", "Halabyan str. (TUMO)", "Halabyan str. (Fizika cross)", "Halabyan str. (Fizika cross)",
                    "Margaryan str. (Hanrapetakan hospital)", "Fuchik str.", "Melqumov str.", "Norashen district", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("6", "M", "Nor Norq 3rd district", "Gyurjyan str.", "Shopron str.", "Badal Muradyan str.",
                    "Gayi ave. (Mersedes Benz Salon)", "Gayi ave. (Statue of Gay)", "Gayi ave. (Aquatec)", "Rubinyants str. (Almast factory)", "Rubinyants str. (Yerevan City Supermarket)",
                    "Rubinyants str. (Aharonyan str.)", "Davit Anhaght str. (Dro str. cross)", "Davit Anhaght str. (Kerama Marazzi)", "Davit Anhaght str. (Municipality)",
                    "Komitas ave. (Lambada bridge)", "Komitas ave. (Komitas Market)", "Komitas ave. (Vracakan cross)", "Komitas ave. (Russian-Armenian University)",
                    "Komitas ave. (Papazyan cross)", "Komitas ave. (Vagharshyan cross)", "Komitas ave. (Gyulbenkyan cross)", "Kasyan str.", "Kievyan str.(Barkamutyun)",
                    "Kievyan str.(Orbeli cross)", "Kievyan str.(Kievyan bridge)", "Leningradyan str. (Kievyan bridge)", "Leningradyan str. (Monte Melkonyan cross)",
                    "Leningradyan str. (Shinararner cross)", "Leningradyan str. (Eurowagen)", "Sebastia str. (Leningradyan cross)", "Sebastia str. (Tichina cross)",
                    "Sebastia str. (Malatia Market)", "Raffi str. (Malatia Market)", "Raffi str.", "Arno Babajanyan str.", "South-Western district", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("6a", "M", "Erebuni district", "Khakhagh Don str.", "Titigradyan str.", "Ayvazovski str.",
                    "Erebuni str.", "Artsakh str.", "Tigran Mets ave. (Yerevan Railway Station)", "Tigran Mets ave. (Yerevan Railway Station Management)", "Tigran Mets ave. (Tashir Mall)", "Tigran Mets ave. (Ayrarat cinema)",
                    "Pedagogical University", "Tigran Mets ave. (Firdus Market)", "Republic Square", "Nalbandyan str. (Republic Square)", "Tumanyan str.",
                    "Mashtots ave. (Opera)", "Mashtots ave. (Margaryan hospital)", "Mashtots ave. (Amiryan cross)", "Khorenatsi str. (Mashtoc cross)", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("7", "M", "Nor Norq 9th district", "Vilnus str.", "Nor Norq 7th district", "Hunan Avetisyan str.", "Davit Bek",
                    "Azatamartikneri str.", "Sasuntsi Davit str.", "Artsakh str.", "Vstrech bridge", "Garegin Njdeh str.", "Garegin Njdeh square",
                    "Bagratunyats Ave. (Artashisyan cross)", "Artashisyan str.", "Chekhov str.", "H.Hovsepyan str.", "Tarontsi str.", "Shengavit metro station",
                    "Nerqin Shengavit 9th str.", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("8", "M", "Qanaqer Hydro Power Plant", "Ghapantsyan str.", "Adonts str.", "Kanaz Military Hospital", "Shirvanzade str.",
                    "Komitas ave. (Lambada bridge)", "Komitas ave. (Komitas Market)", "Komitas ave. (Vracakan cross)", "Komitas ave. (Russian-Armenian University)",
                    "Komitas ave. (Papazyan cross)", "Komitas ave. (Vagharshyan cross)", "Komitas ave. (Gyulbenkyan cross)", "Kasyan str.",
                    "Baghramyan Ave. (SAS Supermarket)", "Baghramyan Ave. (School after Kamo)", "Proshyan str.", "Paronyan str. (Nairi Medical Center)", "Paronyan str. (Cesar Palace)",
                    "Grigor Lusavoritch str. (City Hall)", "Grigor Lusavoritch str. (Circus)", "Arshakunyats Ave. (Circus)", "Arshakunyats Ave. (Surmalu Mall)", "Arshakunyats Ave. (Komitas's park)",
                    "Arshakunyats Ave. (Yerevan Mall)", "Arshakunyats Ave. (Hayreniq cinema)", "Garegin Njdeh str.", "Garegin Njdeh square", "Manandyan str.", "Arax stadium", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("9", "M", "Jrvezh", "Minsk str. (Nor Nork 8th district) (Nor Norq 8th district)", "Artem Mikoyan str.",
                    "Badal Muradyan str.", "Myasnikyan ave. (Water world)", "Myasnikyan ave. (Yerevan Zoo)", "Myasnikyan ave. (Heratsi cross)", "Heratsi str.",
                    "Charenc str. (RA Police)", "Nalbandyan str. (Yerevan State Economical University)", "Khanjyan str. (Chess house)", "Vernisage", "Khanjyan str. (Lunapark)", "Pedagogical University",
                    "Tigran Mets ave. (Ayrarat cinema)", "Tigran Mets ave. (Tashir Mall)", "Qristapor str.", "Petak Mall", "Sevan str.", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("10", "M", "Ashkhatanq square (Worker's statue)", "Bagratunyats Ave. (Worker's statue)",
                    "Garegin Njdeh square", "Garegin Njdeh str.", "Arshakunyats Ave. (Hayreniq cinema)", "Arshakunyats Ave. (Yerevan Mall)", "Arshakunyats Ave. (Komitas's park)",
                    "Arshakunyats Ave. (Surmalu Mall)", "Arshakunyats Ave. (Circus)", "Grigor Lusavoritch str. (City Hall)", "Mashtots ave. (Fish market)",
                    "Mashtots ave. (Covered market)", "Mashtots ave. (Amiryan cross)", "Mashtots ave. (Margaryan hospital)", "Mashtots ave. (Opera)", "Mashtots ave. (Conservatoire)",
                    "Mashtots ave. (Matenadaran)", "Koryun str. (Citadel)", "Abovyan str. (Agrarayin Academy)", "Abovyan str. (Abovyan park)", "Saralanj str.",
                    "Azatutyan Ave. (The Victory Park)", "Azatutyan Ave. (Military Commission)", "Azatutyan Ave. (Nairi Zaryan cross)", "Komitas ave. (Lambada bridge)Azatutyan Ave. (Raykom)",
                    "Nersisyan str.", "Ulnetsi str.", "Paruyr Sevak str.", "Rubinyants str. (Yerevan City Supermarket)", "Rubinyants str. (Almast factory)", "Acharyan str.", "Acharyan str. 2nd deadlock",
                    "Salt Mine", "", "", "", "", "", "", "", "", "", "", "", ""));
//TODO here
            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("11", "M", "Vardashen 5th str.", "Mahari str.", "Nor Aresh 50th str.", "Nor Aresh 7th str.",
                    "Nor Aresh 20th str.", "Azatamartikneri str.", "Sasuntsi Davit str.", "Tigran Mets ave. (Yerevan Railway Station)", "Tigran Mets ave. (Yerevan Railway Station Management)",
                    "Tigran Mets ave. (Tashir Mall)", "Tigran Mets ave. (Ayrarat cinema)", "Agathangeghos str.", "Grigor Lusavoritch str. (Circus)", "Grigor Lusavoritch str. (City Hall)",
                    "Zakyan str.", "Amiryan str.", "Mashtots ave. (Amiryan cross)", "Mashtots ave. (Covered market)", "Mashtots ave. (Fish market)", "Victory bridge", "Hrazdan stadium", "Athens str.",
                    "Dalma Garden Mall", "Tsitsarnakaberd higway", "Mazmanyan str.", "Chaush str.", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("12", "M", "Lepsius str.", "Dro srt.", "Paruyr Sevak str.", "Komitas ave. (Lambada bridge)Azatutyan Ave. (Raykom)",
                    "Komitas ave. (Lambada bridge)", "Komitas ave. (Komitas Market)", "Komitas ave. (Vracakan cross)", "Komitas ave. (Russian-Armenian University)",
                    "Komitas ave. (Papazyan cross)", "Komitas ave. (Vagharshyan cross)", "Komitas ave. (Gyulbenkyan cross)", "Kasyan str.",
                    "Kievyan str.(Barkamutyun)", "Kievyan str.(Orbeli cross)", "Kievyan str.(Kievyan bridge)", "Halabyan str. (Kievyan bridge)", "Halabyan str. (TUMO)",
                    "Halabyan str. (Fizika cross)", "Margaryan str. (Hanrapetakan hospital)", "Margaryan str. (Pegas)", "Bashinjaghyan str.", "Mazmanyan str.", "15th district",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("13", "M", "Nerqin Shengavit", "Tadevosyan str.", "Bagratunyats Ave. (Worker's statue)",
                    "Garegin Njdeh square", "Bagratunyats Ave. (Artashisyan cross)", "Bagratunyats Ave. (Yerevan City Supermarket)", "Bagratunyats Ave. (Isakov cross)",
                    "Isakov ave. (Sebastia cross)", "Kilikia autostation", "Isakov ave.", "Victory bridge", "Mashtots ave. (Fish market)",
                    "Mashtots ave. (Covered market)", "Mashtots ave. (Amiryan cross)", "Mashtots ave. (Margaryan hospital)", "Mashtots ave. (Opera)", "Baghramyan Ave. (Opera House)",
                    "Baghramyan Ave. (Constitutional Court)", "Baghramyan Ave. (American University of Armenia)", "Baghramyan Ave. (School after Kamo)", "Baghramyan Ave. (SAS Supermarket)",
                    "Kievyan str.(Barkamutyun)", "Kievyan str.(Orbeli cross)", "Kievyan str.(Kievyan bridge)", "Halabyan str. (Kievyan bridge)", "Halabyan str. (TUMO)",
                    "Halabyan str. (Fizika cross)", "Iosifyan str.", "Davtashen 1st district", "Tigran Petrosyan str.", "Aghababyan str.", "Davtashen 1st district", "", "", "", "", "",
                    "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("14", "M", "Nubarashen highway (Military unit)", "Khakhagh Don str.", "Titigradyan str.",
                    "Ayvazovski str.", "Erebuni str.", "Azatamartikneri str.", "Sasuntsi Davit str.", "Belinsku str.", "Khorenatsi str. (Shilachi)", "Nar-Dos str. (Shilachi cross)",
                    "Tigran Mets ave. (Tashir Mall)", "Tigran Mets ave. (Ayrarat cinema)", "Pedagogical University", "Khanjyan str. (Lunapark)", "Vernisage",
                    "Khanjyan str. (Chess house)", "Moskovyan str. (Camera music house)", "Abovyan str. (Yeritasardakan m/s)", "Abovyan str. (Agrarayin Academy)",
                    "Abovyan str. (Abovyan park)", "Saralanj str.", "Azatutyan Ave. (The Victory Park)", "Azatutyan Ave. (Military Commission)", "Azatutyan Ave. (Nairi Zaryan cross)",
                    "Azatutyan Ave. (Raykom)", "Adonts str.", "Ghapantsyan str.", "Qanaqer Hydro Power Plant", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("15", "M", "Avan ", "Marshal Khudyakov str.", "Almati str.", "Marshal Babajanyan str.",
                    "Acharyan str.", "Rubinyants str. (Almast factory)", "Rubinyants str. (Yerevan City Supermarket)", "Paruyr Sevak str.", "Komitas ave. (Lambada bridge)Azatutyan Ave. (Raykom)", "Komitas ave. (Lambada bridge)",
                    "Komitas ave. (Komitas Market)", "Griboyedov str.", "Nairi Zaryan str.", "Exchange building", "Hrachya Kochar str. (Vratsakan cross)",
                    "Hrachya Kochar str. (Papazyan cross)", "Hrachya Kochar str. (Vagharshyan cross)", "Vagharshyan str.", "Davtashen bridge", "Sasna Tsrer str.", "Davtashen 1st district",
                    "Tigran Petrosyan str.", "Davtashen 4th district", "Adonts str.", "Azatutyan Ave. (Raykom)", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("16", "M", "Avan ", "Marshal Khudyakov str.", "Almati str.", "Marshal Babajanyan str.",
                    "Acharyan str.", "Gayi ave. (Statue of Gay)", "Gayi ave. (Mersedes Benz Salon)", "Badal Muradyan str.", "Davit Bek", "Hunan Avetisyan str.", "Nor Norq 7th district",
                    "Vilnus str.", "Nor Norq 9th district", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("17", "M", "Armenal factory", "Adonts str.", "Azatutyan Ave. (Raykom)", "Komitas ave. (Lambada bridge)",
                    "Komitas ave. (Komitas Market)", "Komitas ave. (Vracakan cross)", "Komitas ave. (Russian-Armenian University)", "Komitas ave. (Papazyan cross)",
                    "Komitas ave. (Vagharshyan cross)", "Komitas ave. (Gyulbenkyan cross)", "Kasyan str.", "Kievyan str.(Barkamutyun)", "Kievyan str.(Orbeli cross)",
                    "Kievyan str.(Kievyan bridge)", "Leningradyan str. (Kievyan bridge)", "Leningradyan str. (Monte Melkonyan cross)", "Leningradyan str. (Shinararner cross)",
                    "Leningradyan str. (Eurowagen)", "Sebastia str. (Leningradyan cross)", "Sebastia str. (Tichina cross)", "Sebastia str. (Malatia Market)",
                    "Sebastia str. (Kurghinyan cross)", "Isakov ave. (Sebastia cross)", "Ejmiatsin highway", "Zvarthnoc Airport", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("18", "M", "Abovyan str. (Abovyan park)", "Abovyan str. (Agrarayin Academy)",
                    "Abovyan str. (Yeritasardakan m/s)", "Moskovyan str. (Camera music house)", "Khanjyan str. (Chess house)", "Vernisage", "Khanjyan str. (Lunapark)",
                    "Pedagogical University", "Tigran Mets ave. (Ayrarat cinema)", "Tigran Mets ave. (Tashir Mall)", "Tigran Mets ave. (Yerevan Railway Station Management)",
                    "Tigran Mets ave. (Yerevan Railway Station)", "Artsakh str.", "Vstrech bridge", "Garegin Njdeh str.", "Arshakunyats Ave. (Hayreniq cinema)",
                    "Garegin Njdeh square", "Bagratunyats Ave. (Artashisyan cross)", "Bagratunyats Ave. (Yerevan City Supermarket)", "Bagratunyats Ave. (Isakov cross)",
                    "Isakov ave. (Sebastia cross)", "Ejmiatsin highway", "Zvarthnoc Airport", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("19", "M", "Gajegorcneri str.", "Custo str.", "Sasuntsi Davit str.", "Tigran Mets ave. (Yerevan Railway Station)",
                    "Tigran Mets ave. (Yerevan Railway Station Management)", "Tigran Mets ave. (Tashir Mall)", "Tigran Mets ave. (Ayrarat cinema)", "Pedagogical University", "Khanjyan str. (Lunapark)",
                    "Vernisage", "Khanjyan str. (Chess house)", "Moskovyan str. (Camera music house)", "Abovyan str. (Yeritasardakan m/s)", "Abovyan str. (Agrarayin Academy)",
                    "Abovyan str. (Abovyan park)", "Saralanj str.", "Azatutyan Ave. (The Victory Park)", "Azatutyan Ave. (Military Commission)", "Azatutyan Ave. (Nairi Zaryan cross)",
                    "Davit Anhaght str. (Municipality)", "Davit Anhaght str. (Kerama Marazzi)", "Davit Anhaght str. (Dro str. cross)", "Rubinyants str. (Aharonyan str.)",
                    "Rubinyants str. (Yerevan City Supermarket)", "Paruyr Sevak str.", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("20", "M", "Avan ", "Marshal Babajanyan str.", "Acharyan str.", "Botanical park",
                    "Myasnikyan ave. (Water world)", "Myasnikyan ave. (Yerevan Zoo)", "Myasnikyan ave. (Heratsi cross)", "Abovyan str. (Abovyan park)",
                    "Abovyan str. (Agrarayin Academy)", "Moskovyan str. (Camera music house)", "Khanjyan str. (Chess house)", "Vernisage", "Khanjyan str. (Lunapark)",
                    "Pedagogical University", "Agathangeghos str.", "Arshakunyats Ave. (Circus)", "Arshakunyats Ave. (Surmalu Mall)", "Arshakunyats Ave. (Komitas's park)",
                    "Arshakunyats Ave. (Yerevan Mall)", "Arshakunyats Ave. (Hayreniq cinema)", "Garegin Njdeh str.", "Garegin Njdeh square", "Bagratunyats Ave. (Worker's statue)",
                    "Tadevosyan str.", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("21", "M", "South-Western district", "Arno Babajanyan str.", "Zoravar Andranik str.", "Tichina str.",
                    "Sebastia str. (Tichina cross)", "Sebastia str. (Leningradyan cross)", "Leningradyan str. (Eurowagen)", "Leningradyan str. (Shinararner cross)",
                    "Leningradyan str. (Monte Melkonyan cross)", "Leningradyan str. (Kievyan bridge)", "Kievyan str.(Kievyan bridge)", "Kievyan str.(Orbeli cross)",
                    "Kievyan str.(Barkamutyun)", "Baghramyan Ave. (SAS Supermarket)", "Baghramyan Ave. (School after Kamo)", "Baghramyan Ave. (American University of Armenia)",
                    "Baghramyan Ave. (Constitutional Court)", "Baghramyan Ave. (Opera House)", "Mashtots ave. (Conservatoire)", "Moskovyan str. (Conservatoire)",
                    "Abovyan str. (Yeritasardakan m/s)", "Abovyan str. (Agrarayin Academy)", "Abovyan str. (Abovyan park)", "Saralanj str.", "Azatutyan Ave. (The Victory Park)",
                    "Azatutyan Ave. (Military Commission)", "Azatutyan Ave. (Nairi Zaryan cross)", "Azatutyan Ave. (Raykom)", "Tbilisyan highway (Lights factory)",
                    "Tbilisyan highway (Lights factory)", "Tbilisyan highway (Ayb High School)", "Tbilisyan highway (Shampain factory of Yerevan)", "", "", "", "", "", "", "", "", "", "",
                    "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("22", "M", "Marash", "Norq 9th str.", "Norq 7th str.", "Norq 8th str.", "Armenakyan str.",
                    "Saralanj str.", "Heratsi str.", "Charenc str. (RA Police)", "Nalbandyan str. (Yerevan State Economical University)", "Khanjyan str. (Chess house)", "Vernisage",
                    "Khanjyan str. (Lunapark)", "Pedagogical University", "Tigran Mets ave. (Ayrarat cinema)", "Tigran Mets ave. (Tashir Mall)", "Qristapor str.", "Petak Mall",
                    "Arshakunyats Ave. (Komitas's park)", "Arshakunyats Ave. (Yerevan Mall)", "Arshakunyats Ave. (Hayreniq cinema)", "Garegin Njdeh str.", "Mayisi 9th str.",
                    "Musayelyan str.", "Odesa str.", "Eastern Sweets factory", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("23", "M", "Tigran Mets ave. (Yerevan Railway Station)", "Tigran Mets ave. (Yerevan Railway Station Management)",
                    "Tigran Mets ave. (Tashir Mall)", "Tigran Mets ave. (Ayrarat cinema)", "Pedagogical University", "Khorenatsi str. (Shahumyan square)",
                    "Khorenatsi str. (Mashtoc cross)", "Mashtots ave. (Covered market)", "Mashtots ave. (Fish market)", "Victory bridge", "Isakov ave.", "Kilikia autostation",
                    "Isakov ave. (Sebastia cross)", "Sebastia str. (Kurghinyan cross)", "Sebastia str. (Malatia Market)", "Raffi str. (Malatia Market)",
                    "Raffi str.", "Gusan Sheram str.", "Ohanov str.", "Haghtanak village 1st str.", "Haghtanak village 6th str.", "Haghtanak village 9th str.",
                    "Haghtanak village 10th str.", "Haghtanak village 7th str.", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("24", "M", "Noragyukh", "Ejmiatsin old highway", "Isakov ave.", "Kilikia autostation",
                    "Victory bridge", "Mashtots ave. (Fish market)", "Mashtots ave. (Covered market)", "Mashtots ave. (Amiryan cross)", "Mashtots ave. (Margaryan hospital)",
                    "Mashtots ave. (Opera)", "Baghramyan Ave. (Opera House)", "Baghramyan Ave. (Constitutional Court)", "Baghramyan Ave. (American University of Armenia)",
                    "Baghramyan Ave. (School after Kamo)", "Baghramyan Ave. (SAS Supermarket)", "Kasyan str.", "Komitas ave. (Gyulbenkyan cross)", "Komitas ave. (Vagharshyan cross)",
                    "Komitas ave. (Papazyan cross)", "Komitas ave. (Russian-Armenian University)", "Komitas ave. (Vracakan cross)", "Komitas ave. (Komitas Market)",
                    "Komitas ave. (Lambada bridge)", "Shirvanzade str.", "Mamikonyants str.", "Griboyedov str.", "Arghutyan str.", "Malkhasyants str.", "Malkhasyants dead end",
                    "Yerevan State Humanitarian Collage", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("25", "M", "Electron factory", "Sharur str.", "Shirak str. (Charbakh Market)", "Artashisyan str.",
                    "Bagratunyats Ave. (Artashisyan cross)", "Garegin Njdeh square", "Garegin Njdeh str.", "Vstrech bridge", "Rostovyan str.", "Azatamartikneri str.",
                    "Erebuni str.", "Ayvazovski str.", "Titigradyan str.", "Khakhagh Don str.", "Erebuni district", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("26", "M", "Nor Norq 1st district", "Jugha str.", "Lvovyan str.", "Boryan str.", "Nansen str.",
                    "Gayi ave. (Statue of Gay)", "Gayi ave. (Mersedes Benz Salon)", "Baghyan str.", "Gyurjyan str.", "Norq 1st str. lane", "Norq 2nd str. lane", "Hovsepyan str.",
                    "Armenakyan str.", "Saralanj str.", "Armenakyan str.", "Myasnikyan ave. (Heratsi cross)", "Abovyan str. (Abovyan park)", "Abovyan str. (Agrarayin Academy)",
                    "Moskovyan str. (Conservatoire)", "Moskovyan str. (Cascade)", "Moskovyan str. (Tumanyan cross)", "Saryan str. (Tumanyan cross)",
                    "Saryan str. (Saryan post)", "Saryan str. (Amiryan cross)", "Mashtots ave. (Covered market)", "Mashtots ave. (Fish market)",
                    "Grigor Lusavoritch str. (City Hall)", "Argishti str.", "Victory bridge", "Athens str.", "Hrazdan stadium", "Dalma Garden Mall", "Tsitsarnakaberd higway",
                    "Leningradyan str. (Monte Melkonyan cross)", "Leningradyan str. (Shinararner cross)", "Leningradyan str. (Eurowagen)", "Grigor Hasratyan str.",
                    "Martirossyan str.", "Lukashin str.", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("27", "M", "Silikyan 7th str.", "Silikyan 10th str.", "Silikyan New Highway․", "Mazmanyan str.",
                    "Bashinjaghyan str.", "Margaryan str. (Pegas)", "Margaryan str. (Hanrapetakan hospital)", "Halabyan str. (Fizika cross)", "Halabyan str. (Fizika cross)",
                    "Halabyan str. (TUMO)", "Halabyan str. (Kievyan bridge)", "Kievyan str.(Kievyan bridge)", "Orbeli str.", "Baghramyan Ave. (School after Kamo)",
                    "Baghramyan Ave. (American University of Armenia)", "Baghramyan Ave. (Constitutional Court)", "Moskovyan str. (Cascade)", "Mashtots ave. (Conservatoire)",
                    "Mashtots ave. (Matenadaran)", "Koryun str. (Citadel)", "Medical University", "Charenc str. (RA Police)", "Charenc str. (Yerevan State University)",
                    "Charenc str. (Zigzag)", "Sayat Nova ave. (Aleq Manukyan cross)", "Alek Manukyan str.", "Vardananc str.", "Hanrapetakan stadium", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("28", "M", "Yerablur", "Shahumyan 4th str.", "Arno Babajanyan str.", "Zoravar Andranik str.", "Raffi str.",
                    "Raffi str. (Malatia Market)", "Sebastia str. (Malatia Market)", "Varouzhan str.", "Vantyan str.", "Kurghinyan str.", "Sebastia str. (Kurghinyan cross)",
                    "Bagratunyats Ave. (Isakov cross)", "Bagratunyats Ave. (Yerevan City Supermarket)", "Bagratunyats Ave. (Artashisyan cross)", "Garegin Njdeh square",
                    "Garegin Njdeh str.", "Arshakunyats Ave. (Hayreniq cinema)", "Arshakunyats Ave. (Yerevan Mall)", "Arshakunyats Ave. (Komitas's park)", "Arshakunyats Ave. (Surmalu Mall)",
                    "Arshakunyats Ave. (Circus)", "Agathangeghos str.", "Pedagogical University", "Khanjyan str. (Lunapark)", "Vernisage", "Khanjyan str. (Chess house)",
                    "Moskovyan str. (Camera music house)", "Abovyan str. (Yeritasardakan m/s)", "Abovyan str. (Agrarayin Academy)", "Abovyan str. (Abovyan park)",
                    "Saralanj str.", "Azatutyan Ave. (The Victory Park)", "Azatutyan Ave. (Military Commission)", "Varshavyan str.", "Educational Hostels", "", "", "", "",
                    "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("29", "M", "Aragats str.", "Mayisi 9th str.", "Chekhov str.", "Bagratunyats Ave. (Artashisyan cross)",
                    "Garegin Njdeh square", "Garegin Njdeh str.", "Arshakunyats Ave. (Hayreniq cinema)", "Arshakunyats Ave. (Yerevan Mall)", "Arshakunyats Ave. (Komitas's park)",
                    "Arshakunyats Ave. (Surmalu Mall)", "Arshakunyats Ave. (Circus)", "Agathangeghos str.", "Pedagogical University", "Tigran Mets ave. (Ayrarat cinema)",
                    "Tigran Mets ave. (Tashir Mall)", "Nar-Dos str. (Shilachi cross)", "Charenc str. (Zigzag)", "Charenc str. (Yerevan State University)", "Charenc str. (RA Police)",
                    "Medical University", "Abovyan str. (Agrarayin Academy)", "Abovyan str. (Abovyan park)", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("30", "M", "Davtashen 4th district", "Eghvard highway", "Tigran Petrosyan str.", "Davtashen 1st district",
                    "Komitas ave. (Vagharshyan cross)", "Komitas ave. (Gyulbenkyan cross)", "Kasyan str.", "Baghramyan Ave. (SAS Supermarket)", "Baghramyan Ave. (School after Kamo)",
                    "Baghramyan Ave. (American University of Armenia)", "Baghramyan Ave. (Constitutional Court)", "Moskovyan str. (Cascade)", "Mashtots ave. (Conservatoire)",
                    "Mashtots ave. (Matenadaran)", "Koryun str. (Citadel)", "Medical University", "Nalbandyan str. (Yerevan State Economical University)", "Khanjyan str. (Chess house)", "Yervand Kochar str.",
                    "Tigran Mets ave. (Tashir Mall)", "Tigran Mets ave. (Yerevan Railway Station Management)", "Tigran Mets ave. (Yerevan Railway Station)", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("31", "M", "Davtashen 4th district", "Eghvard highway", "Davtashen 1st district", "Tigran Petrosyan str.", "Iosifyan str.",
                    "Halabyan str. (Fizika cross)", "Halabyan str. (TUMO)", "Halabyan str. (Kievyan bridge)", "Kievyan str.(Kievyan bridge)", "Kievyan str.(Orbeli cross)",
                    "Kievyan str.(Barkamutyun)", "Kasyan str.", "Komitas ave. (Gyulbenkyan cross)", "Komitas ave. (Vagharshyan cross)", "Komitas ave. (Papazyan cross)",
                    "Komitas ave. (Russian-Armenian University)", "Komitas ave. (Vracakan cross)", "Komitas ave. (Komitas Market)", "Komitas ave. (Lambada bridge)",
                    "Davit Anhaght str. (Municipality)", "Davit Anhaght str. (Kerama Marazzi)", "Davit Anhaght str. (Dro str. cross)", "Rubinyants str. (Aharonyan str.)",
                    "Rubinyants str. (Yerevan City Supermarket)", "Rubinyants str. (Almast factory)", "Gayi ave. (Aquatec)", "Gayi ave. (Statue of Gay)", "Gayi ave. (Mersedes Benz Salon)", "Hovhannisyan str.",
                    "Tevosyan str.", "Qochinyan str.", "Jrvezh", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            /////29A soon
            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("31a", "M", "Arax factory", "Eghvard highway", "Anastas Mikoyan str.", "Davtashen 4th district",
                    "Davtashen 3rd district", "Armenia TV", "Halabyan str. (Fizika cross)", "Margaryan str. (Hanrapetakan hospital)", "Margaryan str. (Pegas)", "Bashinjaghyan str.",
                    "Mazmanyan str.", "Shiraz str.", "Grigor Hasratyan str.", "Sebastia str. (Leningradyan cross)", "Sebastia str. (Tichina cross)", "Sebastia str. (Malatia Market)",
                    "Raffi str. (Malatia Market)", "Raffi str.", "Gusan Sheram str.", "Ohanov str.", "Zoravar Andranik str.", "South-Western district", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("32", "M", "Arinj Mall", "Avan-Arinj", "Tashkent str.", "Marshal Babajanyan str.", "Almati str.", "Marshal Khudyakov str.",
                    "Nver Safaryan str.", "Duryan district", "Vakhtangovi str.", "Totovents str.", "Stepanyan str.", "Gayi ave. (Mersedes Benz Salon)", "Badal Muradyan str.", "Artem Mikoyan str.",
                    "Minsk str. (Nor Nork 8th district)", "Nor Norq 8th district", "Vilnus str.", "Nor Norq 7th district", "Hunan Avetisyan str.", "Davit Bek", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("33", "M", "Aeratsia", "Shirak 5th lane", "Geghanist village", "Argavand village",
                    "Isakov ave.", "Arno Babajanyan str.", "Zoravar Andranik str.", "Raffi str.", "Raffi str. (Malatia Market)", "Sebastia str. (Malatia Market)",
                    "Sebastia str. (Kurghinyan cross)", "Isakov ave. (Sebastia cross)", "Kilikia autostation", "Victory bridge", "Mashtots ave. (Fish market)",
                    "Mashtots ave. (Covered market)", "Mashtots ave. (Amiryan cross)", "Mashtots ave. (Margaryan hospital)", "Mashtots ave. (Opera)", "Mashtots ave. (Conservatoire)",
                    "Moskovyan str. (Conservatoire)", "Abovyan str. (Yeritasardakan m/s)", "Abovyan str. (Agrarayin Academy)", "Abovyan str. (Abovyan park)", "Saralanj str.",
                    "Azatutyan Ave. (The Victory Park)", "Azatutyan Ave. (Military Commission)", "Azatutyan Ave. (Nairi Zaryan cross)", "Azatutyan Ave. (Raykom)",
                    "Paruyr Sevak str.", "Ulnetsi str.", "Ezras Hasratyan str.", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            /////10A soon
            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("33a", "M", "Nor Norq 1st district", "Norq cinema", "Jugha str.", "Nerson Safaryan str.",
                    "Gayi ave. (Statue of Gay)", "Gayi ave. (Aquatec)", "Rubinyants str. (Almast factory)", "Rubinyants str. (Yerevan City Supermarket)", "Paruyr Sevak str.",
                    "Ulnetsi str.", "Aharonyan str.", "Azatutyan Ave. (Raykom)", "Azatutyan Ave. (Nairi Zaryan cross)", "Azatutyan Ave. (The Victory Park)", "Azatutyan Ave. (Military Commission)",
                    "Saralanj str.", "Abovyan str. (Abovyan park)", "Abovyan str. (Agrarayin Academy)", "Abovyan str. (Yeritasardakan m/s)", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("34", "M", "Mars factory", "Gusan Sheram str.", "Raffi str.", "Raffi str. (Malatia Market)",
                    "Sebastia str. (Malatia Market)", "Sebastia str. (Tichina cross)", "Sebastia str. (Leningradyan cross)", "Leningradyan str. (Eurowagen)",
                    "Leningradyan str. (Shinararner cross)", "Leningradyan str. (Monte Melkonyan cross)", "Leningradyan str. (Kievyan bridge)", "Kievyan str.(Kievyan bridge)",
                    "Kievyan str.(Orbeli cross)", "Kievyan str.(Barkamutyun)", "Kasyan str.", "Komitas ave. (Gyulbenkyan cross)", "Komitas ave. (Vagharshyan cross)",
                    "Komitas ave. (Papazyan cross)", "Komitas ave. (Russian-Armenian University)", "Komitas ave. (Vracakan cross)", "Komitas ave. (Komitas Market)",
                    "Komitas ave. (Lambada bridge)", "Davit Anhaght str. (Municipality)", "Davit Anhaght str. (Kerama Marazzi)", "Davit Anhaght str. (Dro str. cross)",
                    "Rubinyants str. (Aharonyan str.)", "Rubinyants str. (Yerevan City Supermarket)", "Rubinyants str. (Almast factory)", "Tsarav Aghbyur str.", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("35", "M", "Davtashen 4th district", "Tigran Petrosyan str.", "Davtashen 1st district", "Iosifyan str.",
                    "Halabyan str. (Fizika cross)", "Margaryan str. (Hanrapetakan hospital)", "Margaryan str. (Pegas)", "Bashinjaghyan str.", "Janibekyan str.", "Grigor Hasratyan str.",
                    "Sebastia str. (Leningradyan cross)", "Sebastia str. (Tichina cross)", "Sebastia str. (Malatia Market)", "Raffi str. (Malatia Market)",
                    "Raffi str.", "Gusan Sheram str.", "Ohanov str.", "Shiraz str.", "Grigor Hasratyan str.", "15th district", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("36", "M", "Spandaryan Station", "Silikyan 4th str.", "Silikyan 10th str.", "Silikyan New Highway․",
                    "Sebastia str. (Leningradyan cross)", "Sebastia str. (Tichina cross)", "Sebastia str. (Malatia Market)", "Raffi str. (Malatia Market)",
                    "Raffi str.", "Arno Babajanyan str.", "Argavand village", "Geghanist village", "Aeratsia", "Shirak 5th lane", "Shirak str. (Hippodrome)", "Shirak str. (Charbakh Market)",
                    "Sharur str.", "Electron factory", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("37", "M", "Qasakh village", "Ashtarak road", "16th district", "Norashen district", "Chaush str.", "Melqumov str.",
                    "Fuchik str.", "Margaryan str. (Hanrapetakan hospital)", "Halabyan str. (Fizika cross)", "Halabyan str. (Fizika cross)", "Halabyan str. (TUMO)", "Estonakan str.",
                    "Shinararner str.", "Leningradyan str. (Shinararner cross)", "Leningradyan str. (Eurowagen)", "Sebastia str. (Leningradyan cross)",
                    "Sebastia str. (Tichina cross)", "Sebastia str. (Malatia Market)", "Raffi str. (Malatia Market)", "Raffi str.", "Zoravar Andranik str.",
                    "Arno Babajanyan str.", "Ejmiatsin highway", "Argavand village", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("38", "M", "Prosthetics Center", "Tsarav Aghbyur str.", "Rubinyants str. (Almast factory)",
                    "Rubinyants str. (Yerevan City Supermarket)", "Rubinyants str. (Aharonyan str.)", "Davit Anhaght str. (Dro str. cross)", "Davit Anhaght str. (Kerama Marazzi)",
                    "Davit Anhaght str. (Municipality)", "Azatutyan Ave. (Nairi Zaryan cross)", "Azatutyan Ave. (Military Commission)", "Azatutyan Ave. (The Victory Park)",
                    "Saralanj str.", "Teryan str.", "Koryun str. (Citadel)", "Abovyan str. (Yeritasardakan m/s)", "Sayat Nova ave. (Nalbandyan cross)", "Mashtots ave. (Opera)",
                    "Mashtots ave. (Margaryan hospital)", "Mashtots ave. (Amiryan cross)", "Mashtots ave. (Covered market)", "Mashtots ave. (Fish market)",
                    "Grigor Lusavoritch str. (City Hall)", "Arshakunyats Ave. (Circus)", "Agathangeghos str.", "Pedagogical University", "Tigran Mets ave. (Ayrarat cinema)",
                    "Tigran Mets ave. (Tashir Mall)", "Tigran Mets ave. (Yerevan Railway Station Management)", "Tigran Mets ave. (Yerevan Railway Station)", "Artsakh str.",
                    "Arin Berd 3rd lane", "Thermal Power Plant", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("39", "M", "Shirak str. (Charbakh Market)", "Artashisyan str.", "Bagratunyats Ave. (Artashisyan cross)",
                    "Garegin Njdeh square", "Garegin Njdeh str.", "Arshakunyats Ave. (Hayreniq cinema)", "Arshakunyats Ave. (Yerevan Mall)", "Arshakunyats Ave. (Komitas's park)",
                    "Arshakunyats Ave. (Surmalu Mall)", "Arshakunyats Ave. (Circus)", "Grigor Lusavoritch str. (Circus)", "Grigor Lusavoritch str. (City Hall)", "Paronyan str. (Cesar Palace)",
                    "Paronyan str. (Nairi Medical Center)", "Proshyan str. ", "Baghramyan Ave. (School after Kamo)", "Baghramyan Ave. (SAS Supermarket)", "Kasyan str.",
                    "Komitas ave. (Gyulbenkyan cross)", "Komitas ave. (Vagharshyan cross)", "Komitas ave. (Papazyan cross)", "Komitas ave. (Russian-Armenian University)",
                    "Komitas ave. (Vracakan cross)", "Komitas ave. (Komitas Market)", "Komitas ave. (Lambada bridge)", "Shirvanzade str.", "Kanaz Military Hospital", "Adonts str.", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("40", "M", "Nor Norq 9th district", "Vilnus str.", "Minsk str. (Nor Nork 8th district)", "Artem Mikoyan str.",
                    "Galshoyan str.", "Badal Muradyan str.", "Gayi ave. (Mersedes Benz Salon)", "Gayi ave. (Statue of Gay)", "Gayi ave. (Aquatec)", "Rubinyants str. (Almast factory)",
                    "Rubinyants str. (Yerevan City Supermarket)", "Paruyr Sevak str.", "Ulnetsi str.", "Ezras Hasratyan str.", "Zakarya Kanaqerci str.", "Tbilisyan highway (Radiomast)",
                    "Gasprom Armenia", "Northern autostation", "Arinj Mall", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("41", "M", "Electron factory", "Sharur str.", "Shirak str. (Charbakh Market)", "Artashisyan str.",
                    "Mantashyan str.", "Chekhov str.", "Mayisi 9th str.", "Garegin Njdeh str.", "Arshakunyats Ave. (Hayreniq cinema)", "Arshakunyats Ave. (Yerevan Mall)",
                    "Arshakunyats Ave. (Komitas's park)", "Arshakunyats Ave. (Surmalu Mall)", "Arshakunyats Ave. (Circus)", "Grigor Lusavoritch str. (City Hall)",
                    "Mashtots ave. (Fish market)", "Mashtots ave. (Covered market)", "Mashtots ave. (Amiryan cross)", "Mashtots ave. (Margaryan hospital)", "Mashtots ave. (Opera)",
                    "Teryan str.", "Koryun str. (Citadel)", "Abovyan str. (Yeritasardakan m/s)", "Abovyan str. (Agrarayin Academy)", "Abovyan str. (Abovyan park)", "Saralanj str.",
                    "Azatutyan Ave. (The Victory Park)", "Azatutyan Ave. (Military Commission)", "Azatutyan Ave. (Nairi Zaryan cross)", "Komitas ave. (Lambada bridge)Azatutyan Ave. (Raykom)", "Adonts str.",
                    "Shirvanzade str.", "Mamikonyants str.", "Malkhasyants str.", "Souvenirs combinate", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("42", "M", "South-Western district", "Arno Babajanyan str.", "Zoravar Andranik str.", "Raffi str.",
                    "Raffi str. (Malatia Market)", "Sebastia str. (Malatia Market)", "Varouzhan str.", "Vantyan str.", "Kurghinyan str.", "Sebastia str. (Kurghinyan cross)",
                    "Bagratunyats Ave. (Isakov cross)", "Bagratunyats Ave. (Yerevan City Supermarket)", "Bagratunyats Ave. (Artashisyan cross)", "Garegin Njdeh square",
                    "Garegin Njdeh str.", "Arshakunyats Ave. (Hayreniq cinema)", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("43", "M", "Lepsius str.", "Zeytun 5th str.", "Dro srt.", "Paruyr Sevak str.", "Ulnetsi str.",
                    "Nersisyan str.", "Azatutyan Ave. (Raykom)", "Azatutyan Ave. (Nairi Zaryan cross)", "Azatutyan Ave. (Military Commission)", "Azatutyan Ave. (The Victory Park)",
                    "Saralanj str.", "Abovyan str. (Abovyan park)", "Abovyan str. (Agrarayin Academy)", "Abovyan str. (Yeritasardakan m/s)", "Moskovyan str. (Camera music house)",
                    "Khanjyan str. (Chess house)", "Vernisage", "Khanjyan str. (Lunapark)", "Pedagogical University", "Tigran Mets ave. (Ayrarat cinema)", "Tigran Mets ave. (Tashir Mall)",
                    "Tigran Mets ave. (Yerevan Railway Station Management)", "Tigran Mets ave. (Yerevan Railway Station)", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("44", "M", "Energetikneri banavan", "Ejmiatsin highway", "Arno Babajanyan str.", "Zoravar Andranik str.",
                    "Raffi str.", "Raffi str. (Malatia Market)", "Sebastia str. (Malatia Market)", "Sebastia str. (Kurghinyan cross)", "Bagratunyats Ave. (Isakov cross)",
                    "Bagratunyats Ave. (Yerevan City Supermarket)", "Bagratunyats Ave. (Artashisyan cross)", "Garegin Njdeh square", "Garegin Njdeh str.", "Arshakunyats Ave. (Hayreniq cinema)",
                    "Ashkhatanq square (Worker's statue)", "Noragavit 1st str.", "Marmarashen village", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("45", "M", "Erebuni district ", "Khakhagh Don str.", "Titigradyan str.", "Ayvazovski str.", "Erebuni str.",
                    "Muratsan str.", "Rostovyan str.", "Artsakh str.", "Tigran Mets ave. (Yerevan Railway Station)", "Tigran Mets ave. (Yerevan Railway Station Management)", "Tigran Mets ave. (Tashir Mall)",
                    "Tigran Mets ave. (Ayrarat cinema)", "Pedagogical University", "Khanjyan str. (Lunapark)", "Vernisage", "Khanjyan str. (Chess house)",
                    "Moskovyan str. (Camera music house)", "Abovyan str. (Yeritasardakan m/s)", "Abovyan str. (Agrarayin Academy)", "Abovyan str. (Abovyan park)", "Saralanj str.",
                    "Azatutyan Ave. (The Victory Park)", "Azatutyan Ave. (Military Commission)", "Azatutyan Ave. (Nairi Zaryan cross)", "Azatutyan Ave. (Raykom)",
                    "Tbilisyan highway (Lights factory)", "Zakarya Kanaqerci str.", "Ezras Hasratyan str.", "Ulnetsi str.", "Fanarjyan str.", "Oncology Institute", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("46", "M", "Nazarbekyan district", "Silikyan New Highway․", "15th district", "Shiraz str.", "Janibekyan str.", "Shinararner str.",
                    "Arzumanyan str.", "Halabyan str. (Kievyan bridge)", "Kievyan str.(Kievyan bridge)", "Kievyan str.(Orbeli cross)", "Kievyan str.(Barkamutyun)",
                    "Baghramyan Ave. (SAS Supermarket)", "Baghramyan Ave. (School after Kamo)", "Baghramyan Ave. (American University of Armenia)", "Baghramyan Ave. (Constitutional Court)",
                    "Baghramyan Ave. (Opera House)", "Mashtots ave. (Opera)", "Mashtots ave. (Margaryan hospital)", "Mashtots ave. (Amiryan cross)", "Mashtots ave. (Covered market)",
                    "Mashtots ave. (Fish market)", "Grigor Lusavoritch str. (City Hall)", "Agathangeghos str.", "Pedagogical University", "Khanjyan str. (Lunapark)",
                    "Vernisage", "Vardananc str.", "Yervand Kochar str.", "Saint Gregory Iluminator Church", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("47", "M", "Nubarashen 11th str.", "Nubarashen 9th str.", "Nubarashen 6th str.", "Nubarashen highway",
                    "Khakhagh Don str.", "Titigradyan str.", "Ayvazovski str.", "Erebuni str.", "Muratsan str.", "Rostovyan str.", "Artsakh str.", "Tigran Mets ave. (Yerevan Railway Station)",
                    "Tigran Mets ave. (Yerevan Railway Station Management)", "Qristapor str.", "Petak Mall", "Arshakunyats Ave. (Komitas's park)", "Arshakunyats Ave. (Yerevan Mall)", "Arshakunyats Ave. (Hayreniq cinema)",
                    "Ashkhatanq square (Worker's statue)", "Bagratunyats Ave. (Worker's statue)", "Garegin Njdeh square", "Bagratunyats Ave. (Artashisyan cross)",
                    "Bagratunyats Ave. (Yerevan City Supermarket)", "Bagratunyats Ave. (Isakov cross)", "Sebastia str. (Kurghinyan cross)", "Sebastia str. (Malatia Market)",
                    "Raffi str. (Malatia Market)", "Raffi str.", "Arno Babajanyan str.", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("48", "M", "Grand Candy", "Shahamiryan str.", "Arshakunyats Ave. (Hayreniq cinema)", "Garegin Njdeh str.",
                    "Garegin Njdeh square", "Bagratunyats Ave. (Artashisyan cross)", "Bagratunyats Ave. (Artashisyan cross)", "Bagratunyats Ave. (Yerevan City Supermarket)",
                    "Bagratunyats Ave. (Isakov cross)", "Sebastia str. (Kurghinyan cross)", "Sebastia str. (Malatia Market)", "Sebastia str. (Tichina cross)",
                    "Sebastia str. (Leningradyan cross)", "Leningradyan str. (Eurowagen)", "Leningradyan str. (Shinararner cross)", "Shinararner str.", "Arzumanyan str.",
                    "Halabyan str. (Kievyan bridge)", "Halabyan str. (TUMO)", "Halabyan str. (Fizika cross)", "Margaryan str. (Hanrapetakan hospital)", "Margaryan str. (Pegas)",
                    "Bashinjaghyan str.", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("49", "M", "Nerqin Shengavit 11th str.", "Nerqin Shengavit 9th str.", "Shengavit metro station", "Tarontsi str.",
                    "Bagratunyats Ave. (Worker's statue)", "Garegin Njdeh square", "Garegin Njdeh str.", "Artsakh str.", "Tigran Mets ave. (Yerevan Railway Station)", "Tigran Mets ave. (Yerevan Railway Station Management)",
                    "Tigran Mets ave. (Tashir Mall)", "Tigran Mets ave. (Ayrarat cinema)", "Pedagogical University", "Khanjyan str. (Lunapark)", "Vernisage",
                    "Sayat Nova ave. (Aleq Manukyan cross)", "Charenc str. (Zigzag)", "Charenc str. (Yerevan State University)", "Charenc str. (RA Police)",
                    "Medical University", "Koryun str. (Citadel)", "Mashtots ave. (Matenadaran)", "Mashtots ave. (Conservatoire)", "Mashtots ave. (Opera)", "Baghramyan Ave. (Opera House)",
                    "Baghramyan Ave. (Constitutional Court)", "Baghramyan Ave. (American University of Armenia)", "Baghramyan Ave. (School after Kamo)", "Baghramyan Ave. (SAS Supermarket)",
                    "Kasyan str.", "Mergelyan Intitute", "Hakob Hakobyan str.", "Aram Khachaturyan str.", "Riga str.", "Russian-Armenian University", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("50", "M", "Clock factory", "Aghbyur Serob str.", "Gyulbenkyan str.",
                    "Komitas ave. (Gyulbenkyan cross)", "Komitas ave. (Vagharshyan cross)", "Komitas ave. (Papazyan cross)", "Komitas ave. (Russian-Armenian University)",
                    "Komitas ave. (Vracakan cross)", "Komitas ave. (Komitas Market)", "Komitas ave. (Lambada bridge)", "Azatutyan Ave. (Nairi Zaryan cross)",
                    "Azatutyan Ave. (Military Commission)", "Azatutyan Ave. (The Victory Park)", "Saralanj str.", "Abovyan str. (Abovyan park)", "Abovyan str. (Agrarayin Academy)",
                    "Abovyan str. (Yeritasardakan m/s)", "Moskovyan str. (Camera music house)", "Khanjyan str. (Chess house)", "Vernisage", "Khanjyan str. (Lunapark)",
                    "Pedagogical University", "Tigran Mets ave. (Ayrarat cinema)", "Tigran Mets ave. (Tashir Mall)", "Tigran Mets ave. (Yerevan Railway Station Management)", "Tigran Mets ave. (Yerevan Railway Station)",
                    "Artsakh str.", "Erebuni str.", "Ayvazovski str.", "Titigradyan str.", "Khakhagh Don str.", "Erebuni district", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("52", "M", "Nazarbekyan district", "Silikyan New Highway․", "15th district", "Chaush str.", "Melqumov str.",
                    "Beknazaryan str.", "Mazmanyan str.", "Shiraz str.", "Grigor Hasratyan str.", "Sebastia str. (Leningradyan cross)", "Sebastia str. (Tichina cross)",
                    "Sebastia str. (Malatia Market)", "Sebastia str. (Kurghinyan cross)", "Bagratunyats Ave. (Isakov cross)", "Bagratunyats Ave. (Yerevan City Supermarket)",
                    "Bagratunyats Ave. (Artashisyan cross)", "Garegin Njdeh square", "Bagratunyats Ave. (Worker's statue)", "Ashkhatanq square (Worker's statue)",
                    "Arshakunyats Ave. (To Charbakh)", "Erebuni Airport", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("52a", "M", "Nazarbekyan district", "Chaush str.", "Mazmanyan str.", "Bashinjaghyan str.", "Margaryan str. (Pegas)",
                    "Margaryan str. (Hanrapetakan hospital)", "Halabyan str. (Fizika cross)", "Halabyan str. (TUMO)", "Halabyan str. (Kievyan bridge)", "Kievyan str.(Kievyan bridge)",
                    "Kievyan str.(Orbeli cross)", "Kievyan str.(Barkamutyun)", "Hrachya Kochar str. (Gyulbenkyan cross)", "Hrachya Kochar str. (Vagharshyan cross)",
                    "Hrachya Kochar str. (Papazyan cross)", "Hrachya Kochar str. (Vratsakan cross)", "Exchange building", "Nairi Zaryan str.", "Griboyedov str.",
                    "Komitas ave. (Komitas Market)", "Komitas ave. (Lambada bridge)", "Azatutyan Ave. (Raykom)", "Nersisyan str.", "Ulnetsi str.", "Paruyr Sevak str.",
                    "Rubinyants str. (Yerevan City Supermarket)", "Rubinyants str. (Almast factory)", "Gayi ave. (Aquatec)", "Gayi ave. (Statue of Gay)", "Gayi ave. (Mersedes Benz Salon)",
                    "Gyuliqekhvyan str.", "Nor Norq 4th district", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("53", "M", "Jrvezh", "Qochinyan str.", "Bagrevand str.", "Moldovakan str.", "Gayi ave. (Mersedes Benz Salon)",
                    "Badal Muradyan str.", "Davit Bek", "Rostovyan str.", "Vstrech bridge", "Ashkhatanq square (Worker's statue)", "Bagratunyats Ave. (Worker's statue)",
                    "Garegin Njdeh square", "Manandyan str.", "H.Hovsepyan str.", "Chekhov str.", "Artashisyan str.", "Hovhannisyan str.", "Verin Charbakh", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("54", "M", "Davtashen 4th district", "Eghvard highway", "Tigran Petrosyan str.", "Davtashen 1st district",
                    "Sasna Tsrer str.", "Armenia TV", "Halabyan str. (Fizika cross)", "Halabyan str. (TUMO)", "Halabyan str. (Kievyan bridge)", "Kievyan str.(Kievyan bridge)",
                    "Kievyan str.(Orbeli cross)", "Kievyan str.(Barkamutyun)", "Baghramyan Ave. (SAS Supermarket)", "Baghramyan Ave. (School after Kamo)", "Proshyan str. ",
                    "Paronyan str. (Nairi Medical Center)", "Paronyan str. (Cesar Palace)", "Grigor Lusavoritch str. (City Hall)", "Grigor Lusavoritch str. (Circus)", "Agathangeghos str.",
                    "Tigran Mets ave. (Ayrarat cinema)", "Tigran Mets ave. (Tashir Mall)", "Tigran Mets ave. (Yerevan Railway Station Management)", "Tigran Mets ave. (Yerevan Railway Station)", "Sasuntsi Davit str.",
                    "Azatamartikneri str.", "Erebuni str.", "Erebuni museum", "Mahari str.", "Jrashen village", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("55", "M", "Nor Norq 2nd district", "Moldovakan str.", "Stepanyan str.", "Gayi ave. (Statue of Gay)",
                    "Gayi ave. (Aquatec)", "Myasnikyan ave. (Water world)", "Myasnikyan ave. (Yerevan Zoo)", "Myasnikyan ave. (Heratsi cross)", "Abovyan str. (Abovyan park)",
                    "Abovyan str. (Agrarayin Academy)", "Abovyan str. (Yeritasardakan m/s)", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("56", "M", "Milk combinate", "Haghtanak village 8th str.", "Haghtanak village 3th str.",
                    "Haghtanak village 10th str.", "Haghtanak village 9th str.", "Haghtanak village 2nd str.", "Haghtanak village 1st str.", "Ohanov str.", "Zoravar Andranik str.",
                    "Raffi str.", "Raffi str. (Malatia Market)", "Sebastia str. (Malatia Market)", "Sebastia str. (Tichina cross)", "Sebastia str. (Leningradyan cross)",
                    "Leningradyan str. (Eurowagen)", "Leningradyan str. (Shinararner cross)", "Leningradyan str. (Monte Melkonyan cross)", "Leningradyan str. (Kievyan bridge)",
                    "Kievyan str.(Kievyan bridge)", "Kievyan str.(Orbeli cross)", "Kievyan str.(Barkamutyun)", "Hrachya Kochar str. (Gyulbenkyan cross)",
                    "Hrachya Kochar str. (Vagharshyan cross)", "Hrachya Kochar str. (Papazyan cross)", "Hrachya Kochar str. (Vratsakan cross)", "Exchange building",
                    "Nairi Zaryan str.", "Griboyedov str.", "Komitas ave. (Komitas Market)", "Komitas ave. (Lambada bridge)", "Davit Anhaght str. (Municipality)",
                    "Davit Anhaght str. (Kerama Marazzi)", "Davit Anhaght str. (Dro str. cross)", "Rubinyants str. (Aharonyan str.)", "Rubinyants str. (Yerevan City Supermarket)",
                    "Rubinyants str. (Almast factory)", "Acharyan str.", "Marshal Babajanyan str.", "Tashkent str.", "Avan-Arinj", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("57", "M", "Davtashen 1st district", "Aghababyan str.", "Tigran Petrosyan str.", "Iosifyan str.",
                    "Halabyan str. (Fizika cross)", "Margaryan str. (Hanrapetakan hospital)", "Margaryan str. (Pegas)", "Bashinjaghyan str.", "Janibekyan str.", "Grigor Hasratyan str.",
                    "Sebastia str. (Leningradyan cross)", "Sebastia str. (Tichina cross)", "Sebastia str. (Malatia Market)", "Sebastia str. (Kurghinyan cross)",
                    "Bagratunyats Ave. (Isakov cross)", "Bagratunyats Ave. (Yerevan City Supermarket)", "Bagratunyats Ave. (Artashisyan cross)", "Artashisyan str.",
                    "Shirak str. (Erebuni Airport)", "Arshakunyats Ave. (To Charbakh)", "Noragavit 1st str.", "Artashat road", "Aynthap village", "Masis city", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("58", "M", "Nor Norq 8th district", "Minsk str. (Nor Nork 8th district)", "Artem Mikoyan str.",
                    "Badal Muradyan str.", "Gayi ave. (Mersedes Benz Salon)", "Gayi ave. (Statue of Gay)", "Gayi ave. (Aquatec)", "Rubinyants str. (Almast factory)", "Rubinyants str. (Yerevan City Supermarket)",
                    "Rubinyants str. (Aharonyan str.)", "Davit Anhaght str. (Dro str. cross)", "Davit Anhaght str. (Kerama Marazzi)", "Davit Anhaght str. (Municipality)",
                    "Komitas ave. (Lambada bridge)", "Komitas ave. (Komitas Market)", "Komitas ave. (Vracakan cross)", "Komitas ave. (Russian-Armenian University)",
                    "Komitas ave. (Papazyan cross)", "Komitas ave. (Vagharshyan cross)", "Komitas ave. (Gyulbenkyan cross)", "Kasyan str.", "Kievyan str.(Barkamutyun)",
                    "Kievyan str.(Orbeli cross)", "Kievyan str.(Kievyan bridge)", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("59", "M", "Saint Gregory Iluminator Medical Center", "Gyurjyan str. ", "Baghyan str.",
                    "Gayi ave. (Mersedes Benz Salon)", "Gayi ave. (Statue of Gay)", "Gayi ave. (Aquatec)", "Rubinyants str. (Almast factory)", "Rubinyants str. (Yerevan City Supermarket)", "Paruyr Sevak str.",
                    "Azatutyan Ave. (Raykom)", "Komitas ave. (Lambada bridge)", "Komitas ave. (Komitas Market)", "Komitas ave. (Vracakan cross)",
                    "Komitas ave. (Russian-Armenian University)", "Komitas ave. (Papazyan cross)", "Komitas ave. (Vagharshyan cross)", "Komitas ave. (Gyulbenkyan cross)",
                    "Kasyan str.", "Kievyan str.(Barkamutyun)", "Kievyan str.(Orbeli cross)", "Kievyan str.(Kievyan bridge)", "Leningradyan str. (Kievyan bridge)",
                    "Tsitsarnakaberd higway", "Dalma Garden Mall", "Athens str.", "Hrazdan stadium", "Kilikia autostation", "Isakov ave.", "Isakov ave. (Sebastia cross)",
                    "Sebastia str. (Kurghinyan cross)", "Kurghinyan str.", "Vantyan str.", "Varouzhan str.", "Sebastia str. (Malatia Market)", "Raffi str. (Malatia Market)",
                    "Raffi str.", "Gusan Sheram str.", "Ohanov str.", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("60", "M", "Nubarashen highway (Military unit)", "Khachik Dashtents str.", "Erebuni museum", "Erebuni str.",
                    "Muratsan str.", "Sasuntsi Davit str.", "Tigran Mets ave. (Yerevan Railway Station)", "Qristapor str.", "Nar-Dos str. (Shilachi cross)", "Khorenatsi str. (Shilachi)",
                    "Charenc str. (Zigzag)", "Charenc str. (Yerevan State University)", "Charenc str. (RA Police)", "Medical University", "Abovyan str. (Agrarayin Academy)",
                    "Abovyan str. (Abovyan park)", "Bagratunyats Ave. (Worker's statue)", "Ashkhatanq square (Worker's statue)", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("61", "M", "Vardashen village", "Vardashen 9th str.", "Vardashen 6th str.", "Mahari str.",
                    "Erebuni museum", "Erebuni str.", "Muratsan str.", "Rostovyan str.", "Vstrech bridge", "Garegin Njdeh str.", "Garegin Njdeh square",
                    "Bagratunyats Ave. (Worker's statue)", "Ashkhatanq square (Worker's statue)", "Arshakunyats Ave. (To Charbakh)", "Erebuni Airport", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("62", "M", "Qanaqer 13th str.", "Zakarya Kanaqerci str.", "Tbilisyan highway (Lights factory)",
                    "Azatutyan Ave. (Raykom)", "Komitas ave. (Lambada bridge)", "Komitas ave. (Komitas Market)", "Exchange building", "Hrachya Kochar str. (Vratsakan cross)",
                    "Hrachya Kochar str. (Papazyan cross)", "Hrachya Kochar str. (Vagharshyan cross)", "Hrachya Kochar str. (Gyulbenkyan cross)", "Baghramyan Ave. (SAS Supermarket)",
                    "Baghramyan Ave. (School after Kamo)", "Baghramyan Ave. (American University of Armenia)", "Baghramyan Ave. (Constitutional Court)", "Baghramyan Ave. (Opera House)",
                    "Mashtots ave. (Opera)", "Mashtots ave. (Margaryan hospital)", "Mashtots ave. (Amiryan cross)", "Republic Square", "Vazgen Sargsyan str.",
                    "Khorenatsi str. (Shahumyan square)", "Agathangeghos str.", "Pedagogical University", "Tigran Mets ave. (Ayrarat cinema)", "Tigran Mets ave. (Tashir Mall)",
                    "Yervand Kochar str.", "Saint Gregory Iluminator Church", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("63", "M", "Ohanov str.", "Gusan Sheram str.", "Raffi str.", "Raffi str. (Malatia Market)",
                    "Sebastia str. (Malatia Market)", "Sebastia str. (Tichina cross)", "Sebastia str. (Leningradyan cross)", "Leningradyan str. (Eurowagen)",
                    "Leningradyan str. (Shinararner cross)", "Leningradyan str. (Monte Melkonyan cross)", "Leningradyan str. (Kievyan bridge)", "Kievyan str.(Kievyan bridge)",
                    "Kievyan str.(Orbeli cross)", "Kievyan str.(Barkamutyun)", "Kasyan str.", "Komitas ave. (Gyulbenkyan cross)", "Komitas ave. (Vagharshyan cross)",
                    "Komitas ave. (Papazyan cross)", "Komitas ave. (Russian-Armenian University)", "Komitas ave. (Vracakan cross)", "Komitas ave. (Komitas Market)",
                    "Komitas ave. (Lambada bridge)", "Azatutyan Ave. (Raykom)", "Aharonyan str.", "Ulnetsi str.", "Paruyr Sevak str.", "Rubinyants str. (Yerevan City Supermarket)",
                    "Rubinyants str. (Almast factory)", "Gayi ave. (Aquatec)", "Gayi ave. (Statue of Gay)", "Stepanyan str.", "Moldovakan str.", "Nor Norq 2nd district", "", "", "", "", "", "", "",
                    "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("64", "M", "16th district", "Norashen district", "Melqumov str.", "Beknazaryan str.", "Bashinjaghyan str.",
                    "Margaryan str. (Pegas)", "Margaryan str. (Hanrapetakan hospital)", "Halabyan str. (Fizika cross)", "Halabyan str. (TUMO)", "Halabyan str. (Kievyan bridge)",
                    "Kievyan str.(Kievyan bridge)", "Kievyan str.(Orbeli cross)", "Kievyan str.(Barkamutyun)", "Baghramyan Ave. (SAS Supermarket)", "Baghramyan Ave. (School after Kamo)",
                    "Proshyan str. ", "Paronyan str. (Nairi Medical Center)", "Paronyan str. (Cesar Palace)", "Grigor Lusavoritch str. (City Hall)", "Grigor Lusavoritch str. (Circus)",
                    "Agathangeghos str.", "Tigran Mets ave. (Ayrarat cinema)", "Tigran Mets ave. (Tashir Mall)", "Yervand Kochar str.", "Alek Manukyan str.", "Yerevan State University",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("65", "M", "Aeratsia", "Shirak 5th lane", "Shirak str. (Hippodrome)", "Shirak str. (Charbakh Market)",
                    "Artashisyan str.", "Bagratunyats Ave. (Artashisyan cross)", "Garegin Njdeh square", "Garegin Njdeh str.", "Arshakunyats Ave. (Hayreniq cinema)",
                    "Arshakunyats Ave. (Yerevan Mall)", "Arshakunyats Ave. (Komitas's park)", "Arshakunyats Ave. (Surmalu Mall)", "Arshakunyats Ave. (Circus)", "Agathangeghos str.",
                    "Pedagogical University", "Khanjyan str. (Lunapark)", "Vernisage", "Khanjyan str. (Chess house)", "Moskovyan str. (Camera music house)",
                    "Abovyan str. (Yeritasardakan m/s)", "Abovyan str. (Agrarayin Academy)", "Abovyan str. (Abovyan park)", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("66", "M", "Nor Norq 9th district", "Vilnus str.", "Nor Norq 7th district", "Hunan Avetisyan str.", "Davit Bek",
                    "Badal Muradyan str.", "Gayi ave. (Mersedes Benz Salon)", "Gayi ave. (Statue of Gay)", "Gayi ave. (Aquatec)", "Rubinyants str. (Almast factory)", "Rubinyants str. (Yerevan City Supermarket)",
                    "Rubinyants str. (Aharonyan str.)", "Davit Anhaght str. (Dro str. cross)", "Davit Anhaght str. (Kerama Marazzi)", "Davit Anhaght str. (Municipality)",
                    "Komitas ave. (Lambada bridge)", "Komitas ave. (Komitas Market)", "Komitas ave. (Vracakan cross)", "Komitas ave. (Russian-Armenian University)",
                    "Komitas ave. (Papazyan cross)", "Komitas ave. (Vagharshyan cross)", "Komitas ave. (Gyulbenkyan cross)", "Gyulbenkyan str.",
                    "Hrachya Kochar str. (Gyulbenkyan cross)", "Kasyan str.", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("67", "M", "Araratyan str.", "Shirak str. (Erebuni Airport)", "Artashisyan str.",
                    "Bagratunyats Ave. (Artashisyan cross)", "Bagratunyats Ave. (Yerevan City Supermarket)", "Bagratunyats Ave. (Isakov cross)", "Sebastia str. (Kurghinyan cross)",
                    "Sebastia str. (Malatia Market)", "Raffi str. (Malatia Market)", "Raffi str.", "Zoravar Andranik str.", "Ohanov str.", "Gusan Sheram str.",
                    "Arno Babajanyan str.", "Ejmiatsin highway", "Paraqar village", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("68", "M", "Erebuni district ", "Khakhagh Don str.", "Titigradyan str.", "Ayvazovski str.", "Erebuni str.",
                    "Azatamartikneri str.", "Sasuntsi Davit str.", "Tigran Mets ave. (Yerevan Railway Station)", "Tigran Mets ave. (Yerevan Railway Station Management)", "Tigran Mets ave. (Tashir Mall)",
                    "Tigran Mets ave. (Ayrarat cinema)", "Pedagogical University", "Agathangeghos str.", "Grigor Lusavoritch str. (Circus)", "Grigor Lusavoritch str. (City Hall)",
                    "Victory bridge", "Isakov ave.", "Kilikia autostation", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("69", "M", "Nor Norq 9th district", "Vilnus str.", "Nor Norq 7th district", "Hunan Avetisyan str.", "Davit Bek",
                    "Badal Muradyan str.", "Gayi ave. (Mersedes Benz Salon)", "Gayi ave. (Statue of Gay)", "Gayi ave. (Aquatec)", "Myasnikyan ave. (Water world)",
                    "Myasnikyan ave. (Yerevan Zoo)", "Myasnikyan ave. (Heratsi cross)", "Abovyan str. (Abovyan park)", "Abovyan str. (Agrarayin Academy)",
                    "Abovyan str. (Yeritasardakan m/s)", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("70", "M", "South-Western district", "Zoravar Andranik str.", "Raffi str.", "Raffi str. (Malatia Market)",
                    "Sebastia str. (Malatia Market)", "Sebastia str. (Tichina cross)", "Sebastia str. (Leningradyan cross)", "Leningradyan str. (Eurowagen)",
                    "Leningradyan str. (Shinararner cross)", "Leningradyan str. (Monte Melkonyan cross)", "Tsitsarnakaberd higway", "Dalma Garden Mall", "Athens str.",
                    "Hrazdan stadium", "Victory bridge", "Mashtots ave. (Fish market)", "Mashtots ave. (Covered market)", "Mashtots ave. (Amiryan cross)", "Mashtots ave. (Margaryan hospital)",
                    "Mashtots ave. (Opera)", "Mashtots ave. (Conservatoire)", "Moskovyan str. (Conservatoire)", "Abovyan str. (Yeritasardakan m/s)", "Abovyan str. (Agrarayin Academy)",
                    "Abovyan str. (Abovyan park)", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("71", "M", "South-Western district", "Arno Babajanyan str.", "Zoravar Andranik str.", "Raffi str.",
                    "Raffi str. (Malatia Market)", "Sebastia str. (Malatia Market)", "Sebastia str. (Tichina cross)", "Sebastia str. (Leningradyan cross)",
                    "Leningradyan str. (Eurowagen)", "Leningradyan str. (Shinararner cross)", "Leningradyan str. (Monte Melkonyan cross)", "Leningradyan str. (Kievyan bridge)",
                    "Kievyan str.(Kievyan bridge)", "Kievyan str.(Orbeli cross)", "Kievyan str.(Barkamutyun)", "Kasyan str.", "Komitas ave. (Gyulbenkyan cross)",
                    "Komitas ave. (Vagharshyan cross)", "Komitas ave. (Papazyan cross)", "Komitas ave. (Russian-Armenian University)", "Komitas ave. (Vracakan cross)",
                    "Komitas ave. (Komitas Market)", "Komitas ave. (Lambada bridge)", "Azatutyan Ave. (Nairi Zaryan cross)", "Azatutyan Ave. (Military Commission)",
                    "Azatutyan Ave. (The Victory Park)", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("72", "M", "Mushavan village", "Vardashen village", "Mahari str.", "Erebuni museum", "Erebuni str.",
                    "Azatamartikneri str.", "Sasuntsi Davit str.", "Artsakh str.", "Vstrech bridge", "Garegin Njdeh str.", "Garegin Njdeh square",
                    "Bagratunyats Ave. (Artashisyan cross)", "Bagratunyats Ave. (Yerevan City Supermarket)", "Bagratunyats Ave. (Isakov cross)", "Sebastia str. (Kurghinyan cross)",
                    "Sebastia str. (Malatia Market)", "Raffi str. (Malatia Market)", "Raffi str.", "Gusan Sheram str.", "Tichina str.", "Romanos Melikyan str.", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("73", "M", "Erebuni district ", "Khakhagh Don str.", "Titigradyan str.", "Ayvazovski str.", "Erebuni str.",
                    "Azatamartikneri str.", "Sasuntsi Davit str.", "Tigran Mets ave. (Yerevan Railway Station)", "Tigran Mets ave. (Yerevan Railway Station Management)", "Tigran Mets ave. (Tashir Mall)",
                    "Tigran Mets ave. (Ayrarat cinema)", "Pedagogical University", "Khanjyan str. (Lunapark)", "Vernisage", "Khanjyan str. (Chess house)", "Moskovyan str. (Camera music house)",
                    "Abovyan str. (Yeritasardakan m/s)", "Abovyan str. (Agrarayin Academy)", "Abovyan str. (Abovyan park)", "Myasnikyan ave. (Heratsi cross)",
                    "Myasnikyan ave. (Yerevan Zoo)", "Myasnikyan ave. (Water world)", "Gayi ave. (Statue of Gay)", "Gayi ave. (Mersedes Benz Salon)", "Baghyan str.", "Gyurjyan str.",
                    "Shopron str.", "Davit Bek", "Hunan Avetisyan str.", "Nor Norq 7th district", "Vilnus str.", "Nor Norq 9th district", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("74", "M", "Zovuni village", "Eghvard highway", "Zovuni 6th str.", "Zovuni 39th str.", "Zovuni 8th str.",
                    "Davtashen 4th district", "Tigran Petrosyan str.", "Davtashen 1st district", "Iosifyan str.", "Halabyan str. (Fizika cross)", "Halabyan str. (TUMO)", "Halabyan str. (Kievyan bridge)",
                    "Leningradyan str. (Kievyan bridge)", "Tsitsarnakaberd higway", "Dalma Garden Mall", "Athens str.", "Hrazdan stadium", "Victory bridge",
                    "Grigor Lusavoritch str. (City Hall)", "Grigor Lusavoritch str. (Circus)", "Agathangeghos str.", "Tigran Mets ave. (Ayrarat cinema)", "Tigran Mets ave. (Tashir Mall)",
                    "Tigran Mets ave. (Yerevan Railway Station Management)", "Qristapor str.", "Petak Mall", "Arshakunyats Ave. (Komitas's park)", "Arshakunyats Ave. (Yerevan Mall)", "Arshakunyats Ave. (Hayreniq cinema)",
                    "Vstrech bridge", "Rostovyan str.", "Atoyan str.", "Erebuni str.", "Ayvazovski str.", "Titigradyan str.", "Khakhagh Don str.", "Erebuni district", "", "", "", "", "",
                    "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("75", "M", "Tichina str.", "Zoravar Andranik str.", "Ohanov str.", "Gusan Sheram str.", "Raffi str.",
                    "Raffi str. (Malatia Market)", "Sebastia str. (Malatia Market)", "Sebastia str. (Kurghinyan cross)", "Isakov ave. (Sebastia cross)",
                    "Kilikia autostation", "Victory bridge", "Mashtots ave. (Fish market)", "Mashtots ave. (Covered market)", "Mashtots ave. (Amiryan cross)",
                    "Mashtots ave. (Margaryan hospital)", "Mashtots ave. (Opera)", "Mashtots ave. (Conservatoire)", "Mashtots ave. (Matenadaran)", "Koryun str. (Citadel)",
                    "Medical University", "Charenc str. (RA Police)", "Heratsi str.", "Armenakyan str.", "Norq Gardens 1st lane", "Norq Marash Medical Center", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("76", "M", "South-Western district", "Zoravar Andranik str.", "Raffi str.", "Raffi str. (Malatia Market)",
                    "Sebastia str. (Malatia Market)", "Sebastia str. (Tichina cross)", "Sebastia str. (Leningradyan cross)", "Leningradyan str. (Eurowagen)",
                    "Leningradyan str. (Shinararner cross)", "Leningradyan str. (Monte Melkonyan cross)", "Leningradyan str. (Kievyan bridge)", "Kievyan str.(Kievyan bridge)",
                    "Orbeli str.", "Baghramyan Ave. (School after Kamo)", "Baghramyan Ave. (American University of Armenia)", "Baghramyan Ave. (Constitutional Court)", "Baghramyan Ave. (Opera House)",
                    "Mashtots ave. (Opera)", "Mashtots ave. (Conservatoire)", "Mashtots ave. (Matenadaran)", "Koryun str. (Citadel)", "Medical University",
                    "Charenc str. (RA Police)", "Charenc str. (Yerevan State University)", "Charenc str. (Zigzag)", "Sayat Nova ave. (Aleq Manukyan cross)",
                    "Alek Manukyan str.", "Yervand Kochar str.", "Tigran Mets ave. (Tashir Mall)", "Qristapor str.", "Petak Mall", "Sevan str.", "", "", "", "", "", "", "", "", "", "", "",
                    "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("77", "M", "Avan-Arinj", "Tashkent str.", "Marshal Babajanyan str.", "Marshal Khudyakov str.",
                    "Botanical park", "Myasnikyan ave. (Water world)", "Myasnikyan ave. (Yerevan Zoo)", "Myasnikyan ave. (Heratsi cross)", "Abovyan str. (Abovyan park)",
                    "Abovyan str. (Agrarayin Academy)", "Medical University", "Charenc str. (RA Police)", "Charenc str. (Yerevan State University)", "Charenc str. (Zigzag)",
                    "Sayat Nova ave. (Aleq Manukyan cross)", "Khanjyan str. (Chess house)", "Vernisage", "Khanjyan str. (Lunapark)", "Pedagogical University",
                    "Agathangeghos str.", "Arshakunyats Ave. (Circus)", "Grigor Lusavoritch str. (City Hall)", "Victory bridge", "Hrazdan stadium", "Athens str.",
                    "Dalma Garden Mall", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            //////56A soon
            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("99", "M", "South-Western district", "Yerablur", "Shahumyan 4th str.", "Arno Babajanyan str.", "Raffi str.",
                    "Raffi str. (Malatia Market)", "Sebastia str. (Malatia Market)", "Sebastia str. (Kurghinyan cross)", "Isakov ave.", "Kilikia autostation", "Victory bridge",
                    "Argishti str.", "Grigor Lusavoritch str. (City Hall)", "Arshakunyats Ave. (Circus)", "Agathangeghos str.", "Pedagogical University", "Khanjyan str. (Lunapark)",
                    "Vernisage", "Khanjyan str. (Chess house)", "Moskovyan str. (Camera music house)", "Abovyan str. (Yeritasardakan m/s)", "Abovyan str. (Agrarayin Academy)",
                    "Abovyan str. (Abovyan park)", "Saralanj str.", "Azatutyan Ave. (The Victory Park)", "Azatutyan Ave. (Military Commission)", "Azatutyan Ave. (Nairi Zaryan cross)",
                    "Azatutyan Ave. (Raykom)", "Nersisyan str.", "Qanaqer Zeytun Medical Center", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            ///60A soon
//            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("101", "M", "Northern autostation", "Gasprom Armenia", "Tbilisyan highway (Radiomast)",
//                    "Zakarya Kanaqerci str.", "Azatutyan Ave. (Raykom)", "Komitas ave. (Lambada bridge)","Komitas ave. (Komitas Market)", "Komitas ave. (Vracakan cross)",
//                    "Komitas ave. (Russian-Armenian University)", "Komitas ave. (Papazyan cross)", "Komitas ave. (Vagharshyan cross)", "Komitas ave. (Gyulbenkyan cross)",
//                    "Kasyan str.", "Kievyan str.(Barkamutyun)", "Kievyan str.(Orbeli cross)", "Kievyan str.(Kievyan bridge)", "Leningradyan str. (Kievyan bridge)",
//                    "Leningradyan str. (Monte Melkonyan cross)", "Leningradyan str. (Shinararner cross)", "Leningradyan str. (Eurowagen)", "Sebastia str. (Leningradyan cross)",
//                    "Sebastia str. (Tichina cross)", "Sebastia str. (Malatia Market)", "Raffi str. (Malatia Market)", "Raffi str.", "South-Western district", "", "", "", "", "", "", "", "",
//                    "", "", "", "", "", "", "", "", "", "", ""));

            ///50A soon
//            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("110", "M", "Zoravar Andranik str.", "Ohanov str.", "Gusan Sheram str.", "Raffi str.",
//                    "Raffi str. (Malatia Market)", "Sebastia str. (Malatia Market)", "Sebastia str. (Tichina cross)", "Sebastia str. (Leningradyan cross)",
//                    "Leningradyan str. (Eurowagen)", "Leningradyan str. (Shinararner cross)", "Leningradyan str. (Shinararner cross)", "Leningradyan str. (Monte Melkonyan cross)",
//                    "Tsitsarnakaberd higway", "Dalma Garden Mall", "Athens str.", "Hrazdan stadium", "Victory bridge", "Argishti str.", "Grigor Lusavoritch str. (City Hall)",
//                    "Grigor Lusavoritch str. (Circus)", "Agathangeghos str.", "Tigran Mets ave. (Ayrarat cinema)", "Tigran Mets ave. (Tashir Mall)", "Yervand Kochar str.", "Alek Manukyan str.",
//                    "Sayat Nova ave. (Aleq Manukyan cross)", "Charenc str. (Yerevan State University)", "Charenc str. (Zigzag)", "Charenc str. (RA Police)", "Medical University",
//                    "Koryun str. (Citadel)", "Teryan str.", "Abovyan str. (Abovyan park)", "", "", "", "", "", "", "", "", "", "", "", ""));

            ///25A soon
            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("114", "M", "Davit Anhaght str. (Kerama Marazzi)", "Ulnetsi str. (To Monument)",
                    "General Babayan str.", "Azatutyan Ave. (Military Commission)", "Azatutyan Ave. (Nairi Zaryan cross)", "Komitas ave. (Lambada bridge)",
                    "Komitas ave. (Komitas Market)", "Griboyedov str.", "Nairi Zaryan str.", "Exchange building", "Hrachya Kochar str. (Vratsakan cross)",
                    "Hrachya Kochar str. (Papazyan cross)", "Hrachya Kochar str. (Vagharshyan cross)", "Hrachya Kochar str. (Gyulbenkyan cross)",
                    "Kievyan str.(Barkamutyun)", "Kievyan str.(Orbeli cross)", "Kievyan str.(Kievyan bridge)", "Leningradyan str. (Kievyan bridge)",
                    "Leningradyan str. (Monte Melkonyan cross)", "Leningradyan str. (Shinararner cross)", "Leningradyan str. (Eurowagen)", "Grigor Hasratyan str.",
                    "Shiraz str.", "15th district", "Chaush str.", "Ashtarak road", "Proshyan avan", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            /**
             * Trollybuses
             * */
            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("1", "T", "Ashkhatanq square (Worker's statue)", "Bagratunyats Ave. (Worker's statue)", "Garegin Njdeh square",
                    "Garegin Njdeh str.", "Arshakunyats Ave. (Hayreniq cinema)", "Arshakunyats Ave. (Yerevan Mall)", "Arshakunyats Ave. (Komitas's park)", "Arshakunyats Ave. (Surmalu Mall)",
                    "Arshakunyats Ave. (Circus)", "Grigor Lusavoritch str. (Circus)", "Grigor Lusavoritch str. (City Hall)", "Mashtots ave. (Fish market)", "Mashtots ave. (Covered market)",
                    "Mashtots ave. (Amiryan cross)", "Mashtots ave. (Margaryan hospital)", "Mashtots ave. (Opera)", "Mashtots ave. (Conservatoire)", "Mashtots ave. (Matenadaran)", "Koryun str. (Citadel)",
                    "Koryun str. (Citadel)", "Medical University", "Charenc str. (RA Police)", "Heratsi str.", "Myasnikyan ave. (Heratsi cross)", "Myasnikyan ave. (Yerevan Zoo)",
                    "Myasnikyan ave. (Water world)", "Gayi ave. (Aquatec)", "Gayi ave. (Statue of Gay)", "Gayi ave. (Mersedes Benz Salon)", "Badal Muradyan str.", "Tevosyan str.",
                    "Qochinyan str.", "Jrvezh", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("2", "T", "Artashisyan str.", "Shirak str. (Charbakh Market)", "Chekhov str.", "Bagratunyats Ave. (Artashisyan cross)",
                    "Garegin Njdeh square", "Bagratunyats Ave. (Worker's statue)", "Ashkhatanq square (Worker's statue)", "Arshakunyats Ave. (Hayreniq cinema)", "Arshakunyats Ave. (Yerevan Mall)",
                    "Arshakunyats Ave. (Komitas's park)", "Arshakunyats Ave. (Surmalu Mall)", "Arshakunyats Ave. (Circus)", "Agathangeghos str.", "Tigran Mets ave. (Ayrarat cinema)", "Tigran Mets ave. (Tashir Mall)",
                    "Tigran Mets ave. (Yerevan Railway Station Management)", "Tigran Mets ave. (Yerevan Railway Station)", "Artsakh str.", "Erebuni str.", "Erebuni museum", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", ""));

//            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("3", "T", "Avan", "Marshal Babajanyan str.", "Acharyan str.", "Botanical park", "Myasnikyan ave. (Water world)",
//                    "Myasnikyan ave. (Yerevan Zoo)", "Myasnikyan ave. (Heratsi cross)", "Charenc str. (RA Police)", "Nalbandyan str. (Yerevan State Economical University)", "Sayat Nova ave. (Nalbandyan cross)",
//                    "Vernisage", "Khanjyan str. (Lunapark)", "Pedagogical University", "Tigran Mets ave. (Ayrarat cinema)", "Tigran Mets ave. (Tashir Mall)", "Tigran Mets ave. (Yerevan Railway Station Management)", "Tigran Mets ave. (Yerevan Railway Station)",
//                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("9", "T", "Avan", "Marshal Babajanyan str.", "Acharyan str.", "Botanical park", "Rubinyants str. (Almast factory)",
                    "Rubinyants str. (Yerevan City Supermarket)", "Rubinyants str. (Aharonyan str.)", "Davit Anhaght str. (Dro str. cross)", "Davit Anhaght str. (Kerama Marazzi)", "Davit Anhaght str. (Municipality)",
                    "Komitas ave. (Lambada bridge)", "Komitas ave. (Komitas Market)", "Komitas ave. (Vracakan cross)", "Komitas ave. (Russian-Armenian University)",
                    "Komitas ave. (Papazyan cross)", "Komitas ave. (Vagharshyan cross)", "Komitas ave. (Gyulbenkyan cross)", "Kasyan str.", "Baghramyan Ave. (SAS Supermarket)",
                    "Baghramyan Ave. (School after Kamo)", "Baghramyan Ave. (American University of Armenia)", "Baghramyan Ave. (Constitutional Court)", "Baghramyan Ave. (Opera House)",
                    "Sayat Nova ave. (Nalbandyan cross)", "Vernisage", "Khanjyan str. (Lunapark)", "Pedagogical University", "Agathangeghos str.", "Grigor Lusavoritch str. (Circus)",
                    "Grigor Lusavoritch str. (City Hall)", "Mashtots ave. (Fish market)", "Mashtots ave. (Covered market)", "Mashtots ave. (Amiryan cross)",
                    "Mashtots ave. (Margaryan hospital)", "Mashtots ave. (Opera)", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("10", "T", "Nor Norq 5th district", "Badal Muradyan str.", "Gayi ave. (Mersedes Benz Salon)",
                    "Gayi ave. (Statue of Gay)", "Gayi ave. (Aquatec)", "Rubinyants str. (Almast factory)", "Rubinyants str. (Yerevan City Supermarket)", "Rubinyants str. (Aharonyan str.)",
                    "Davit Anhaght str. (Dro str. cross)", "Davit Anhaght str. (Kerama Marazzi)", "Davit Anhaght str. (Municipality)", "Komitas ave. (Lambada bridge)",
                    "Komitas ave. (Komitas Market)", "Komitas ave. (Vracakan cross)", "Komitas ave. (Russian-Armenian University)", "Komitas ave. (Papazyan cross)",
                    "Komitas ave. (Vagharshyan cross)", "Komitas ave. (Gyulbenkyan cross)", "Kasyan str.", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("15", "T", "15th district", "Mazmanyan str.", "Shiraz str.", "Grigor Hasratyan str.",
                    "Sebastia str. (Leningradyan cross)", "Sebastia str. (Tichina cross)", "Sebastia str. (Malatia Market)", "Sebastia str. (Kurghinyan cross)",
                    "Bagratunyats Ave. (Isakov cross)", "Bagratunyats Ave. (Yerevan City Supermarket)", "Bagratunyats Ave. (Artashisyan cross)", "Garegin Njdeh square",
                    "Bagratunyats Ave. (Worker's statue)", "Ashkhatanq square (Worker's statue)", "Arshakunyats Ave. (To Charbakh)", "Erebuni Airport",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("23", "T", "Jrvezh", "Qochinyan str.", "Tevosyan str.", "Badal Muradyan str.", "Gayi ave. (Mersedes Benz Salon)",
                    "Gayi ave. (Statue of Gay)", "Gayi ave. (Aquatec)", "Myasnikyan ave. (Water world)", "Myasnikyan ave. (Yerevan Zoo)", "Myasnikyan ave. (Heratsi cross)",
                    "Charenc str. (RA Police)", "Sayat Nova ave. (Nalbandyan cross)", "Vernisage", "Pedagogical University", "Khanjyan str. (Lunapark)",
                    "Tigran Mets ave. (Firdus Market)", "Melik-Adamyan str.", "Nalbandyan str. (Yerevan State Economical University)", "Moskovyan str. (Camera music house)", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_EN, null, insertDataToTableTransport("24", "T", "South-Western district", "Raffi str.", "Raffi str. (Malatia Market)", "Sebastia str. (Malatia Market)",
                    "Sebastia str. (Kurghinyan cross)", "Isakov ave.", "Kilikia autostation", "Victory bridge", "Mashtots ave. (Fish market)", "Mashtots ave. (Covered market)", "Mashtots ave. (Amiryan cross)",
                    "Mashtots ave. (Margaryan hospital)", "Mashtots ave. (Opera)",  "Mashtots ave. (Conservatoire)", "Moskovyan str. (Conservatoire)", "Abovyan str. (Yeritasardakan m/s)",
                    "Abovyan str. (Agrarayin Academy)", "Abovyan str. (Abovyan park)", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));


        }

        private void insertIntoTransportRu(SQLiteDatabase db) {

            /**
             * Buses
             * */

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("1", "A", "Эребуни массив", "ул. Хахах Дона", "ул. Титоградян", "ул. Айвазовского",
                    "ул. Эребуни", "ул. Арцаха", "просп. Тиграна Меца (Каяран) (Станция)", "просп. Тиграна Меца (ЮКЖД)", "просп. Тиграна Меца (Ташир т/ц)", "просп. Тиграна Меца (к/т Айрарат)",
                    "Педагогический университет", "просп. Тиграна Меца (ярмарка Фирдуси)", "Площадь Республики", "ул. Амиряна", "просп. Маштоца (перекрёсток Амирян)",
                    "просп. Маштоца (больница им. Маргаряна)", "просп. Маштоца (Опера)", "просп. Баграмян (Опера)", "просп. Баграмян (Конституционный суд)", "просп. Баграмян (Американский университет)",
                    "просп. Баграмян (школа им. Камо)", "просп. Баграмян (SAS)", "ул. Касян", "просп. Комитаса (перекрёсток Гюлбенкян)", "просп. Комитаса (перекрёсток Вагаршян)",
                    "просп. Комитаса (перекрёсток Папазян)", "просп. Комитаса (Славянский университет)", "просп. Комитаса (перекрёсток Врацакан)", "просп. Комитаса (рынок Комитаса)",
                    "просп. Комитаса (мост Ламбада)", "просп. Азатутян (Райком)", "ул. Паруйра Севака", "ул. Дро", "ул. Лепсиус", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("3", "A", "Юго-Западный квартал (Бангладеш)", "ул. Арно Бабаджанян", "ул. Раффи",
                    "ул. Раффи (ярмарка Малатия)","ул. Себастия (ярмарка Малатия)", "ул. Себастия (перекрёсток Тычина)", "ул. Себастия (перекрёсток Ленинградян)",
                    "ул. Ленинградян (Евроваген)", "ул. Ленинградян (перекрёсток Шинарарнер)", "ул. Ленинградян (перекрёсток Монте Мелконян)", "ул. Ленинградян (Киевский мост)",
                    "ул. Киевян (Киевский мост)", "ул. Киевян (перекрёсток Орбели)", "ул. Киевян (Барекамутюн)", "ул. Касян", "просп. Комитаса (перекрёсток Гюлбенкян)", 
                    "просп. Комитаса (перекрёсток Вагаршян)", "просп. Комитаса (перекрёсток Папазян)", "просп. Комитаса (Славянский университет)", 
                    "просп. Комитаса (перекрёсток Врацакан)", "просп. Комитаса (рынок Комитаса)", "просп. Комитаса (мост Ламбада)", "ул. Давида Анахта (Административное деление)",
                    "ул. Давида Анахта (Керама Марацци)", "ул. Давида Анахта (перекрёсток Дро)", "ул. Рубинянц (ул. Агаронян)", "ул. Рубинянц (Ереван Сити)", "ул. Рубинянц (завод Алмаст)",
                    "просп. Гая (Акватек)", "просп. Гая (Памятник Гаю)", "просп. Гая (салон Мерседеса)", "ул. Бадала Мурадяна", "ул. Давид-Бека", "ул. Унана Аветисяна",
                    "Нор-Норк 7-й массив", "ул. Вильнюса", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("5", "A", "Джрвеж", "ул. Кочинян", "ул. Тевосяна", "ул. Оганесяна", "ул. Аксел Бакунца",
                    "ул. Гюликехвян", "просп. Гая (салон Мерседеса)", "просп. Гая (Памятник Гаю)", "просп. Гая (Акватек)", "просп. Мясникяна (Джрашхар)", "просп. Мясникяна (ЗООПАРК)",
                    "просп. Мясникяна (перекрёсток Гераци)", "ул. Абовяна (скверик Абовяна)", "ул. Абовяна (Сельскохозяйственная академия)", "ул. Абовяна (ст/м Еритасардакан (Молодёжная))",
                    "ул. Московян (Консерватория)", "просп. Маштоца (Консерватория)", "просп. Маштоца (Опера)", "просп. Маштоца (больница им. Маргаряна)", "просп. Маштоца (перекрёсток Амирян)",
                    "просп. Маштоца (Крытый рынок)", "просп. Маштоца (магазин РЫБЫ)", "мост Победы", "просп. Исакова", "Киликия автовокзал", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "",
                    "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("7", "A", "Эребуни массив ", "ул. Хахах Дона", "ул. Титоградян", "ул. Айвазовского", "ул. Эребуни",
                    "ул. Атоян", "ул. Белинского", "ул. Сасунци Давид", "просп. Тиграна Меца (Каяран) (Станция)", "просп. Тиграна Меца (ЮКЖД)", "просп. Тиграна Меца (Ташир т/ц)",
                    "просп. Тиграна Меца (к/т Айрарат)", "Педагогический университет", "ул. Ханджяна (Лунапарк)", "Вернисаж", "ул. Туманян", "просп. Маштоца (Опера)",
                    "просп. Маштоца (Консерватория)", "просп. Маштоца (Матенадаран)", "ул. Корюна (Цитадель)", "ул. Абовяна (Сельскохозяйственная академия)", "ул. Абовяна (скверик Абовяна)",
                    "просп. Мясникяна (перекрёсток Гераци)", "ул. Сараландж", "ул. Авет Аветисян", "ул. Вагаршян", "ул. Сасна Црер", "Давидашен 1-й квартал", "ул. Тиграна Петросяна",
                    "Егвардское шс.", "Давидашен 4-й квартал", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("8", "A", "Давидашен 4-й квартал", "ул. Тиграна Петросяна", "Давидашен 1-й квартал", "ул. Иосифян",
                    "ул. Алабян (перекрёсток института физики)", "ул. Алабян (ТУМО)", "ул. Алабян (Киевский мост)", "ул. Киевян (Киевский мост)", "ул. Киевян (перекрёсток Орбели)",
                    "ул. Киевян (Барекамутюн)", "просп. Баграмян (SAS)", "просп. Баграмян (школа им. Камо)", "просп. Баграмян (Американский университет)",
                    "просп. Баграмян (Конституционный суд)", "просп. Баграмян (Опера)", "просп. Маштоца (Консерватория)", "ул. Московян (Консерватория)", "ул. Абовяна (ст/м Еритасардакан (Молодёжная))",
                    "ул. Абовяна (Сельскохозяйственная академия)", "ул. Абовяна (скверик Абовяна)", "просп. Мясникяна (перекрёсток Гераци)", "просп. Мясникяна (ЗООПАРК)",
                    "просп. Мясникяна (Джрашхар)", "просп. Гая (Акватек)", "просп. Гая (Памятник Гаю)", "просп. Гая (салон Мерседеса)", "ул. Бадала Мурадяна",
                    "ул. Давид-Бека", "ул. Унана Аветисяна", "Нор-Норк 7-й массив", "ул. Вильнюса", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("9", "A", "Сари тах", "Сари тах 12-ая улица", "Сари тах 11-ая улица", "Сари тах 5-ая улица",
                    "Сари тах 1-ая улица", "ул. Глинки", "ул. Хоренаци (Силачи)", "ул. Нар-Дос (перекресток Силачи)", "просп. Тиграна Меца (Ташир т/ц)", "Рынок ГУМ",
                    "ул. Заваряна", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("12", "A", "Аэрация", "ул. Ширака (Ипподром)", "ул. Ширака (рынок Чарбаха)", "ул. Арташисян",
                    "просп. Багратуняц (перекрёсток  Арташисян)", "просп. Багратуняц (Ереван Сити)", "просп. Багратуняц (перекрёсток Исаков)", "ул. Себастия (перекрёсток Кургинян)",
                    "ул. Себастия (ярмарка Малатия)", "ул. Себастия (перекрёсток Тычина)", "ул. Себастия (перекрёсток Ленинградян)", "ул. Григор Асратян", "ул. Джанибекян",
                    "ул. Башинджагян", "ул. Маргарян (ПЕГАС)", "ул. Маргарян (Республиканская больница)", "ул. Алабян (перекрёсток института физики)", "Давидашен 1-й квартал", "ул. Иосифян",
                    "ул. Тиграна Петросяна", "Давидашен 4-й квартал", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("13", "A", "Газпром Армения", "Тбилисское шс. (Радиомачта)", "ул. Закария Канакерци",
                    "просп. Азатутян (Райком)", "просп. Комитаса (мост Ламбада)", "просп. Комитаса (рынок Комитаса)", "просп. Комитаса (перекрёсток Врацакан)",
                    "просп. Комитаса (Славянский университет)", "просп. Комитаса (перекрёсток Папазян)", "просп. Комитаса (перекрёсток Вагаршян)", "просп. Комитаса (перекрёсток Гюлбенкян)",
                    "ул. Касян", "просп. Баграмян (SAS)", "просп. Баграмян (школа им. Камо)", "просп. Баграмян (Американский университет)", "просп. Баграмян (Конституционный суд)",
                    "просп. Баграмян (Опера)", "просп. Саят-Нова (перекрёсток Налбандян)", "просп. Саят-Нова (перекрёсток Алек-Манукян)", "Дом Радио", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("14", "A", "ул. Лепсиус", "ул. Дро", "ул. Паруйра Севака", "ул. Улнеци", "ул. Нерсисян",
                    "просп. Азатутян (Райком)", "просп. Азатутян (Наири Зарян перекрёсток)", "просп. Азатутян (Военкомат)", "просп. Азатутян (Парк Победы)", "ул. Сараландж",
                    "ул. Абовяна (скверик Абовяна)", "ул. Абовяна (Сельскохозяйственная академия)", "ул. Абовяна (ст/м Еритасардакан (Молодёжная))", "ул. Московян (дом Камерной музыки)",
                    "ул. Ханджяна (дом Шахмат)", "Вернисаж", "ул. Ханджяна (Лунапарк)", "Педагогический университет", "просп. Тиграна Меца (к/т Айрарат)", "просп. Тиграна Меца (Ташир т/ц)",
                    "просп. Тиграна Меца (ЮКЖД)", "просп. Тиграна Меца (Каяран) (Станция)", "ул. Арцаха", "мост Встреча", "ул. Гарегина Нжде", "просп. Аршакуняц (к/т Айреник)",
                    "пл. Труда (памятник Рабочему)", "просп. Аршакуняц (по напр. Чарбах)", "ул. Ширака (аэропорт Эребуни)", "ул. Араратян", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("15", "A", "Нор-Норк 6-й массив", "ул. Бадала Мурадяна", "ул. Шопрона", "ул. Гюрджян", "ул. Нерсон Сафаряна",
                    "ул. Нансена", "просп. Гая (Памятник Гаю)", "просп. Гая (Акватек)", "просп. Мясникяна (Джрашхар)", "просп. Мясникяна (ЗООПАРК)", "просп. Мясникяна (перекрёсток Гераци)",
                    "ул. Абовяна (скверик Абовяна)", "ул. Абовяна (Сельскохозяйственная академия)", "ул. Абовяна (ст/м Еритасардакан (Молодёжная))", "ул. Московян (дом Камерной музыки)",
                    "ул. Ханджяна (дом Шахмат)", "Вернисаж", "ул. Ханджяна (Лунапарк)", "Педагогический университет", "ул. Агатангехоси", "просп. Аршакуняц (Цирк)",
                    "просп. Аршакуняц (т/ц Сурмалу)", "просп. Аршакуняц (парк им. Комитаса)", "просп. Аршакуняц (Ереван Молл)", "просп. Аршакуняц (к/т Айреник)", "ул. Гарегина Нжде",
                    "пл. Гарегина Нжде", "просп. Багратуняц (перекрёсток  Арташисян)", "ул. Арташисян", "ул. Ширака (рынок Чарбаха)", "ул. Ширака (Ипподром)", "Аэрация", "",
                    "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("16", "A", "Нубарашен 11-ая ул.․", "Нубарашен 9-ая ул.", "Нубарашен 10-ая ул.",
                    "Нубарашен 6-ая ул.", "Нубарашен шс.", "ул. Хачика Даштенца", "музей Эребуни", "ул. Эребуни", "ул. Азатамартикнери", "ул. Сасунци Давид",
                    "просп. Тиграна Меца (Каяран) (Станция)", "просп. Тиграна Меца (ЮКЖД)", "просп. Тиграна Меца (Ташир т/ц)", "просп. Тиграна Меца (к/т Айрарат)", "Педагогический университет",
                    "ул. Ханджяна (Лунапарк)", "Вернисаж", "ул. Ханджяна (дом Шахмат)", "просп. Саят-Нова (перекрёсток Алек-Манукян)", "ул. Чаренца (салон-магазин Zigzag)",
                    "ул. Чаренца (ЕГУ)", "ул. Чаренца (Полиция РА)", "Медицинский университет", "ул. Корюна (Цитадель)", "просп. Маштоца (Матенадаран)",
                    "просп. Маштоца (Консерватория)", "просп. Маштоца (Опера)", "просп. Баграмян (Опера)", "просп. Баграмян (Конституционный суд)", "просп. Баграмян (Американский университет)",
                    "просп. Баграмян (школа им. Камо)", "просп. Баграмян (SAS)", "ул. Касян", "просп. Комитаса (перекрёсток Гюлбенкян)", "просп. Комитаса (перекрёсток Вагаршян)",
                    "просп. Комитаса (перекрёсток Папазян)", "просп. Комитаса (Славянский университет)", "просп. Комитаса (перекрёсток Врацакан)", "просп. Комитаса (рынок Комитаса)",
                    "просп. Комитаса (мост Ламбада)", "просп. Азатутян (Райком)", "ул. Аветис Агаронян", "ул. Дро", "п/о Молока (Молочный завод)", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("18", "A", "сл. Касах", "квартал Ваагни", "Крастный Крест", "поселок Надежды (Уйси аван)",
                    "Новое шоссе Силикян", "Аштаракское шс.", "ул. Чауша", "ул. Мазманян", "ул. Башинджагян", "ул. Джанибекян", "ул. Шинарарнери", "ул. Арзуманян",
                    "ул. Алабян (ТУМО)", "ул. Алабян (Киевский мост)", "ул. Киевян (Киевский мост)", "ул. Киевян (перекрёсток Орбели)", "ул. Киевян (Барекамутюн)",
                    "просп. Баграмян (SAS)" , "просп. Баграмян (школа им. Камо)", "просп. Баграмян (Американский университет)", "просп. Баграмян (Конституционный суд)",
                    "просп. Баграмян (Опера)", "просп. Маштоца (Консерватория)", "просп. Маштоца (Матенадаран)", "ул. Корюна (Цитадель)", "Медицинский университет",
                    "ул. Чаренца (Полиция РА)", "ул. Чаренца (ЕГУ)", "ул. Чаренца (салон-магазин Zigzag)", "просп. Саят-Нова (перекрёсток Алек-Манукян)", "ул. Ханджяна (дом Шахмат)",
                    "Вернисаж", "ул. Ханджяна (Лунапарк)", "Педагогический университет", "просп. Тиграна Меца (к/т Айрарат)", "просп. Тиграна Меца (Ташир т/ц)", "просп. Тиграна Меца (ЮКЖД)",
                    "просп. Тиграна Меца (Каяран) (Станция)", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("20", "A", "Аван ", "кв. Дурян", "ул. Нвер Сафарян․", "ул. Маршал Худяков", "ул. Алматы",
                    "ул. Маршал Бабаджанян", "ул. Ачаряна", "Ботанический сад", "просп. Мясникяна (Джрашхар)", "просп. Мясникяна (ЗООПАРК)", "просп. Мясникяна (перекрёсток Гераци)",
                    "ул. Абовяна (скверик Абовяна)", "ул. Абовяна (Сельскохозяйственная академия)", "Медицинский университет", "ул. Налбандян (ЕПТУ)",
                    "просп. Саят-Нова (перекрёсток Налбандян)", "просп. Маштоца (Опера)", "просп. Маштоца (больница им. Маргаряна)", "просп. Маштоца (перекрёсток Амирян)",
                    "ул. Хоренаци (перекрёсток Маштоц)", "ул. Хоренаци (пл. Шаумяна)", "ул. Бейрут", "Григор Лусаворич (Мэрия Еревана)", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("21", "A", "Сари тах", "Сари тах 20-ая улица", "Сари тах 21-ая улица", "Сари тах 3-ая улица․",
                    "Сари тах 1-ая улица", "ул. Хоренаци (Силачи)", "ул. Нар-Дос (перекресток Силачи)", "просп. Тиграна Меца (Ташир т/ц)", "просп. Тиграна Меца (к/т Айрарат)",
                    "Педагогический университет", "ул. Ханджяна (Лунапарк)", "Вернисаж", "ул. Ханджяна (дом Шахмат)", "ул. Московян (дом Камерной музыки)",
                    "ул. Абовяна (ст/м Еритасардакан (Молодёжная))", "ул. Абовяна (Сельскохозяйственная академия)", "ул. Абовяна (скверик Абовяна)", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("22", "A", "Нор-Норк 9-й массив", "ул. Вильнюса", "Нор-Норк 8-й массив", "ул.Минска  (8-й Норкский массив)",
                    "ул. Артем Микоян", "ул. Бадала Мурадяна", "просп. Мясникяна (Джрашхар)", "просп. Мясникяна (ЗООПАРК)", "просп. Мясникяна (перекрёсток Гераци)",
                    "ул. Абовяна (скверик Абовяна)", "ул. Абовяна (Сельскохозяйственная академия)", "Медицинский университет", "ул. Налбандян (ЕПТУ)", "просп. Саят-Нова (перекрёсток Налбандян)",
                    "просп. Маштоца (Опера)", "просп. Маштоца (больница им. Маргаряна)", "просп. Маштоца (перекрёсток Амирян)", "ул. Амиряна", "Площадь Республики", "просп. Тиграна Меца (ярмарка Фирдуси)",
                    "Педагогический университет", "просп. Тиграна Меца (к/т Айрарат)", "просп. Тиграна Меца (Ташир т/ц)", "просп. Тиграна Меца (ЮКЖД)", "просп. Тиграна Меца (Каяран) (Станция)",
                    "ул. Арцаха", "ул. Эребуни", "ул. Атоян", "ул. Айвазовского", "ул. Аванесова", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("23", "A", "просп. Исакова", "ул. Арно Бабаджанян", "ул. Гусана Шерама", "ул. Оганова",
                    "ул. Зоравар Андраник", "ул. Раффи", "ул. Раффи (ярмарка Малатия)", "ул. Себастия (ярмарка Малатия)", "ул. Себастия (перекрёсток Кургинян)",
                    "просп. Исакова (перекрёсток Себастия)", "Киликия автовокзал", "мост Победы", "просп. Маштоца (магазин РЫБЫ)", "просп. Маштоца (Крытый рынок)",
                    "просп. Маштоца (перекрёсток Амирян)", "просп. Маштоца (больница им. Маргаряна)", "просп. Маштоца (Опера)", "просп. Маштоца (Консерватория)", "просп. Маштоца (Матенадаран)",
                    "ул. Корюна (Цитадель)", "ул. Абовяна (Сельскохозяйственная академия)", "ул. Сараландж", "просп. Азатутян (Парк Победы)", "просп. Азатутян (Военкомат)",
                    "просп. Азатутян (Наири Зарян перекрёсток)", "просп. Азатутян (Райком)", "ул. Паруйра Севака", "ул. Рубинянц (Ереван Сити)", "ул. Рубинянц (завод Алмаст)",
                    "просп. Гая (Акватек)", "просп. Гая (Памятник Гаю)", "просп. Гая (салон Мерседеса)", "ул. Бадала Мурадяна", "Нор-Норк 6-й массив", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("24", "A", "ул. Рубинянц (завод Алмаст)", "ул. Рубинянц (Ереван Сити)",
                    "ул. Рубинянц (ул. Агаронян)", "ул. Давида Анахта (перекрёсток Дро)", "ул. Давида Анахта (Керама Марацци)", "ул. Давида Анахта (Административное деление)",
                    "просп. Азатутян (Наири Зарян перекрёсток)", "просп. Азатутян (Военкомат)", "просп. Азатутян (Парк Победы)", "ул. Сараландж", "ул. Корюна (Цитадель)",
                    "просп. Маштоца (Матенадаран)", "просп. Маштоца (Консерватория)", "просп. Маштоца (Опера)", "просп. Маштоца (больница им. Маргаряна)", "просп. Маштоца (перекрёсток Амирян)",
                    "просп. Маштоца (Крытый рынок)", "просп. Маштоца (магазин РЫБЫ)", "Григор Лусаворич (Мэрия Еревана)", "просп. Аршакуняц (Цирк)",
                    "просп. Аршакуняц (т/ц Сурмалу)", "просп. Аршакуняц (парк им. Комитаса)", "просп. Аршакуняц (Ереван Молл)", "просп. Аршакуняц (к/т Айреник)", "ул. Гарегина Нжде",
                    "пл. Гарегина Нжде", "просп. Багратуняц (перекрёсток  Арташисян)", "просп. Багратуняц (Ереван Сити)", "просп. Багратуняц (перекрёсток Исаков)",
                    "ул. Себастия (перекрёсток Кургинян)", "ул. Кургиняна", "ул. Ванцян", "ул. Варужан", "мед. центр Малатия", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("26", "A", "Юго-Западный квартал (Бангладеш)", "ул. Зоравар Андраник", "ул. Раффи", "ул. Раффи (ярмарка Малатия)",
                    "ул. Себастия (ярмарка Малатия)", "ул. Себастия (перекрёсток Тычина)", "ул. Себастия (перекрёсток Ленинградян)", "ул. Ленинградян (Евроваген)",
                    "ул. Ленинградян (перекрёсток Шинарарнер)", "ул. Ленинградян (перекрёсток Монте Мелконян)", "шоссе Цицернакаберд", "Далма Гарден Молл", "ул. Атенка",
                    "стадион Раздан", "мост Победы", "ул. Аргишти", "Григор Лусаворич (Мэрия Еревана)", "просп. Маштоца (магазин РЫБЫ)", "просп. Маштоца (Крытый рынок)",
                    "просп. Маштоца (перекрёсток Амирян)", "просп. Маштоца (больница им. Маргаряна)", "просп. Маштоца (Опера)", "просп. Маштоца (Консерватория)", "ул. Московян (Консерватория)",
                    "ул. Абовяна (ст/м Еритасардакан (Молодёжная))", "ул. Абовяна (Сельскохозяйственная академия)", "ул. Абовяна (скверик Абовяна)", "просп. Мясникяна (перекрёсток Гераци)",
                    "просп. Мясникяна (ЗООПАРК)", "просп. Мясникяна (Джрашхар)", "просп. Гая (Акватек)", "просп. Гая (Памятник Гаю)", "просп. Гая (салон Мерседеса)",
                    "ул. Бадала Мурадяна", "ул. Давид-Бека", "ул. Унана Аветисяна", "Нор-Норк 7-й массив", "ул. Вильнюса", "Нор-Норк 9-й массив", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("27", "A", "16 квартал", "кв. Норашен", "ул. Мелкумова", "ул. Бекназарян", "ул. Башинджагян",
                    "ул. Маргарян (ПЕГАС)", "ул. Маргарян (Республиканская больница)", "ул. Алабян (перекрёсток института физики)", "ул. Алабян (ТУМО)", "ул. Эстонакан", "ул. Шинарарнери",
                    "ул. Арзуманян", "ул. Алабян (Киевский мост)", "ул. Ленинградян (Киевский мост)", "шоссе Цицернакаберд", "Далма Гарден Молл", "ул. Атенка",
                    "стадион Раздан", "мост Победы", "просп. Маштоца (магазин РЫБЫ)", "просп. Маштоца (Крытый рынок)", "просп. Маштоца (перекрёсток Амирян)", "просп. Маштоца (больница им. Маргаряна)" ,
                    "просп. Маштоца (Опера)", "просп. Маштоца (Консерватория)", "просп. Маштоца (Матенадаран)", "ул. Корюна (Цитадель)", "Медицинский университет",
                    "ул. Чаренца (Полиция РА)", "ул. Гераци", "ул. Арменак Арменакяна", "ул. Г. Овсепян", "Телевышка", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("28", "A", "Нор-Норк 8-й массив", "ул.Минска  (8-й Норкский массив)", "ул. Артем Микоян",
                    "ул. Бадала Мурадяна", "просп. Гая (салон Мерседеса)", "просп. Гая (Памятник Гаю)", "просп. Гая (Акватек)", "ул. Рубинянц (завод Алмаст)", "ул. Рубинянц (Ереван Сити)",
                    "ул. Рубинянц (ул. Агаронян)", "ул. Давида Анахта (перекрёсток Дро)", "ул. Давида Анахта (Керама Марацци)", "ул. Давида Анахта (Административное деление)",
                    "просп. Комитаса (мост Ламбада)", "просп. Комитаса (рынок Комитаса)", "просп. Комитаса (перекрёсток Врацакан)", "просп. Комитаса (Славянский университет)",
                    "просп. Комитаса (перекрёсток Папазян)", "просп. Комитаса (перекрёсток Вагаршян)", "просп. Комитаса (перекрёсток Гюлбенкян)", "ул. Касян", "ул. Киевян (Барекамутюн)",
                    "ул. Киевян (перекрёсток Орбели)", "ул. Киевян (Киевский мост)", "ул. Алабян (Киевский мост)", "ул. Алабян (ТУМО)", "ул. Алабян (перекрёсток института физики)",
                    "ул. Маргарян (Республиканская больница)", "ул. Маргарян (ПЕГАС)", "ул. Башинджагян", "ул. Мазманян", "ул. Чауша", "Аштаракское шс.", "поселок Надежды (Уйси аван)", "", "", "", "",
                    "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("32", "A", "Северный автовокзал", "Газпром Армения", "Тбилисское шс. (Радиомачта)",
                    "ул. Закария Канакерци", "просп. Азатутян (Райком)", "просп. Азатутян (Наири Зарян перекрёсток)", "просп. Азатутян (Военкомат)", "просп. Азатутян (Парк Победы)",
                    "ул. Сараландж", "ул. Терян", "ул. Корюна (Цитадель)", "просп. Маштоца (Матенадаран)", "просп. Маштоца (Консерватория)", "просп. Маштоца (Опера)",
                    "просп. Маштоца (больница им. Маргаряна)", "ул. Амиряна", "Площадь Республики", "просп. Тиграна Меца (ярмарка Фирдуси)", "Педагогический университет", "ул. Агатангехоси",
                    "просп. Аршакуняц (Цирк)", "просп. Аршакуняц (т/ц Сурмалу)", "просп. Аршакуняц (парк им. Комитаса)", "просп. Аршакуняц (Ереван Молл)", "просп. Аршакуняц (к/т Айреник)",
                    "ул. Гарегина Нжде", "пл. Гарегина Нжде", "ул. Манандян", "Аракс стадион", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("33", "A", "Давидашен 4-й квартал", "ул. Тиграна Петросяна", "Давидашен 1-й квартал", "ул. Иосифян",
                    "ул. Алабян (перекрёсток института физики)", "ул. Алабян (ТУМО)", "ул. Алабян (Киевский мост)", "ул. Ленинградян (Киевский мост)", "шоссе Цицернакаберд",
                    "Далма Гарден Молл", "ул. Атенка", "стадион Раздан", "мост Победы", "просп. Маштоца (магазин РЫБЫ)", "просп. Маштоца (Крытый рынок)", "ул. Амиряна",
                    "Площадь Республики", "просп. Тиграна Меца (ярмарка Фирдуси)", "Педагогический университет", "просп. Тиграна Меца (к/т Айрарат)", "просп. Тиграна Меца (Ташир т/ц)",
                    "просп. Тиграна Меца (ЮКЖД)", "просп. Тиграна Меца (Каяран) (Станция)", "ул. Арцаха", "мост Встреча", "ул. Гарегина Нжде", "просп. Аршакуняц (к/т Айреник)",
                    "пл. Труда (памятник Рабочему)", "Норагавит 1-ая ул.", "Арташатское шс.", "сл. Харберд", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("34", "A", "сл. Мушаван", "сл. Вардашен", "ул. Маари", "ул. Нубарашен", "ул. Давид-Бека",
                    "ул. Азатамартикнери", "ул. Сасунци Давид", "просп. Тиграна Меца (Каяран) (Станция)", "просп. Тиграна Меца (ЮКЖД)", "просп. Тиграна Меца (Ташир т/ц)",
                    "просп. Тиграна Меца (к/т Айрарат)", "Педагогический университет", "просп. Тиграна Меца (ярмарка Фирдуси)", "Площадь Республики", "ул. Амиряна",
                    "просп. Маштоца (перекрёсток Амирян)", "просп. Маштоца (больница им. Маргаряна)", "просп. Маштоца (Опера)", "просп. Маштоца (Консерватория)", "просп. Маштоца (Матенадаран)",
                    "ул. Корюна (Цитадель)", "ул. Абовяна (Сельскохозяйственная академия)", "ул. Абовяна (скверик Абовяна)", "ул. Сараландж", "просп. Азатутян (Парк Победы)",
                    "ул. Генерала Бабаяна", "Арабкир ул. 17", "Арабкир ул. 29", "ул. Риги", "ул. Грачья Кочар (перекрёсток Врацакан)", "ул. Грачья Кочар (перекрёсток Папазян)",
                    "ул. Грачья Кочар (перекрёсток Вагаршян)", "ул. Вагаршян", "Давидашенский мост", "Давидашен 1-й квартал", "ул. Тиграна Петросяна", "Давидашен 2-й квартал", "", "",
                    "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("35", "A", "Нор-Норк 4-й массив", "ул. Гюликехвян", "ул. Галшоян", "ул. Артем Микоян",
                    "ул. Бадала Мурадяна", "просп. Гая (салон Мерседеса)", "просп. Гая (Памятник Гаю)", "просп. Гая (Акватек)", "просп. Мясникяна (Джрашхар)",
                    "просп. Мясникяна (ЗООПАРК)", "просп. Мясникяна (перекрёсток Гераци)", "ул. Абовяна (скверик Абовяна)", "ул. Абовяна (Сельскохозяйственная академия)",
                    "ул. Абовяна (ст/м Еритасардакан (Молодёжная))", "ул. Московян (Консерватория)", "просп. Маштоца (Консерватория)", "просп. Маштоца (Опера)", "просп. Баграмян (Опера)",
                    "просп. Баграмян (Конституционный суд)", "просп. Баграмян (Американский университет)", "просп. Баграмян (школа им. Камо)", "просп. Баграмян (SAS)",
                    "ул. Киевян (Барекамутюн)", "ул. Киевян (перекрёсток Орбели)", "ул. Киевян (Киевский мост)", "ул. Ленинградян (Киевский мост)",
                    "ул. Ленинградян (перекрёсток Монте Мелконян)", "ул. Ленинградян (перекрёсток Шинарарнер)", "ул. Ленинградян (Евроваген)",
                    "ул. Себастия (перекрёсток Ленинградян)", "ул. Себастия (перекрёсток Тычина)", "ул. Себастия (ярмарка Малатия)", "ул. Раффи (ярмарка Малатия)",
                    "ул. Раффи", "ул. Зоравар Андраник", "ул. Оганова", "ул. Гусана Шерама", "ул. Арно Бабаджанян", "просп. Исакова", "сл. Аргаванд", "сл. Геханист",
                    "сл. Азаташен", "сл. Хачпар", "", ""));

            ////61A soon -> edit
//            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("36а", "A", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""
//                    , "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("37", "A", "Эребуни массив ", "ул. Титоградян", "ул. Айвазовского", "ул. Эребуни",
                    "ул. Арцаха", "просп. Тиграна Меца (Каяран) (Станция)", "просп. Тиграна Меца (ЮКЖД)", "просп. Тиграна Меца (Ташир т/ц)", "просп. Тиграна Меца (к/т Айрарат)",
                    "Педагогический университет", "просп. Тиграна Меца (ярмарка Фирдуси)", "Площадь Республики", "ул. Амиряна", "просп. Маштоца (перекрёсток Амирян)",
                    "просп. Маштоца (больница им. Маргаряна)", "просп. Маштоца (Опера)", "просп. Баграмян (Опера)", "просп. Баграмян (Конституционный суд)",
                    "просп. Баграмян (Американский университет)", "просп. Баграмян (школа им. Камо)", "просп. Баграмян (SAS)", "ул. Касян",
                    "просп. Комитаса (перекрёсток Гюлбенкян)", "просп. Комитаса (перекрёсток Вагаршян)", "просп. Комитаса (перекрёсток Папазян)",
                    "просп. Комитаса (Славянский университет)", "просп. Комитаса (перекрёсток Врацакан)", "просп. Комитаса (рынок Комитаса)", "просп. Комитаса (мост Ламбада)",
                    "ул. Давида Анахта (Административное деление)", "ул. Давида Анахта (Керама Марацци)", "ул. Давида Анахта (перекрёсток Дро)", "ул. Рубинянц (ул. Агаронян)",
                    "ул. Рубинянц (Ереван Сити)", "ул. Рубинянц (завод Алмаст)", "просп. Гая (Акватек)", "ул. Лвовян", "Нор-Норк 1-й массив", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("38", "A", "сл. Айнтап", "Арташатское шс.", "Норагавит 1-ая ул.", "пл. Труда (памятник Рабочему)",
                    "просп. Багратуняц (памятник Рабочему)", "пл. Гарегина Нжде", "ул. Гарегина Нжде", "просп. Аршакуняц (к/т Айреник)", "просп. Аршакуняц (Ереван Молл)",
                    "просп. Аршакуняц (парк им. Комитаса)", "просп. Аршакуняц (т/ц Сурмалу)", "просп. Аршакуняц (Цирк)", "ул. Агатангехоси", "Педагогический университет",
                    "ул. Ханджяна (Лунапарк)", "Вернисаж", "просп. Саят-Нова (перекрёсток Налбандян)", "просп. Саят-Нова (перекрёсток Алек-Манукян)", "ул. Чаренца (салон-магазин Zigzag)" ,
                    "ул. Чаренца (ЕГУ)", "ул. Чаренца (Полиция РА)", "Медицинский университет", "ул. Абовяна (ст/м Еритасардакан (Молодёжная))", "ул. Абовяна (Сельскохозяйственная академия)",
                    "ул. Абовяна (скверик Абовяна)", "просп. Мясникяна (перекрёсток Гераци)", "просп. Мясникяна (ЗООПАРК)", "просп. Мясникяна (Джрашхар)", "просп. Гая (Акватек)",
                    "просп. Гая (Памятник Гаю)", "ул. Степаняна", "ул. Молдовакан", "Нор-Норк 2-й массив", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("39", "A", "16 квартал", "кв. Норашен", "ул. Мелкумова", "ул. Бекназарян", "15 квартал", "ул. Мазманян",
                    "ул. Шираза", "ул. Григор Асратян", "ул. Себастия (перекрёсток Ленинградян)", "ул. Себастия (перекрёсток Тычина)", "ул. Себастия (ярмарка Малатия)",
                    "ул. Себастия (перекрёсток Кургинян)", "просп. Багратуняц (перекрёсток Исаков)", "просп. Багратуняц (Ереван Сити)", "просп. Багратуняц (перекрёсток  Арташисян)",
                    "пл. Гарегина Нжде", "ул. Гарегина Нжде", "мост Встреча", "ул. Арцаха", "ул. Эребуни", "ул. Айвазовского", "ул. Титоградян", "Эребуни массив", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("41", "A", "Аван ", "ул. Маршал Бабаджанян", "ул. Ачаряна", "Ботанический сад",
                    "просп. Мясникяна (Джрашхар)", "просп. Мясникяна (ЗООПАРК)", "просп. Мясникяна (перекрёсток Гераци)", "ул. Абовяна (скверик Абовяна)",
                    "ул. Абовяна (Сельскохозяйственная академия)", "Медицинский университет", "ул. Налбандян (ЕПТУ)", "просп. Саят-Нова (перекрёсток Налбандян)", "Вернисаж", "ул. Ханджяна (Лунапарк)",
                    "Педагогический университет", "просп. Тиграна Меца (к/т Айрарат)", "просп. Тиграна Меца (Ташир т/ц)", "просп. Тиграна Меца (ЮКЖД)", "просп. Тиграна Меца (Каяран) (Станция)",
                    "ул. Арцаха", "ул. Эребуни", "ул. Айвазовского", "ул. Титоградян", "ул. Хахах Дона", "Эребуни массив", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("42", "A", "Нор-Норк 8-й массив", "ул.Минска  (8-й Норкский массив)", "ул. Артем Микоян",
                    "ул. Бадала Мурадяна", "просп. Гая (салон Мерседеса)", "просп. Гая (Памятник Гаю)", "просп. Гая (Акватек)", "просп. Мясникяна (Джрашхар)", "просп. Мясникяна (ЗООПАРК)",
                    "просп. Мясникяна (перекрёсток Гераци)", "ул. Абовяна (скверик Абовяна)", "ул. Абовяна (Сельскохозяйственная академия)", "Медицинский университет", "ул. Налбандян (ЕПТУ)",
                    "просп. Саят-Нова (перекрёсток Налбандян)", "просп. Саят-Нова (перекрёсток Алек-Манукян)", "ул. Алека Манукяна", "ул. Ерванда Кочара", "просп. Тиграна Меца (Ташир т/ц)",
                    "просп. Тиграна Меца (к/т Айрарат)", "Педагогический университет", "ул. Агатангехоси", "просп. Аршакуняц (Цирк)", "просп. Аршакуняц (т/ц Сурмалу)",
                    "просп. Аршакуняц (парк им. Комитаса)", "просп. Аршакуняц (Ереван Молл)", "просп. Аршакуняц (к/т Айреник)", "ул. Гарегина Нжде", "пл. Гарегина Нжде",
                    "ул. Манандян", "Аракс стадион", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("44", "A", "ул. Тичина", "ул. Зоравар Андраник", "ул. Оганова", "ул. Гусана Шерама",
                    "ул. Раффи", "ул. Раффи (ярмарка Малатия)", "ул. Себастия (ярмарка Малатия)", "ул. Себастия (перекрёсток Кургинян)", "просп. Багратуняц (перекрёсток Исаков)",
                    "просп. Багратуняц (Ереван Сити)", "просп. Багратуняц (перекрёсток  Арташисян)", "пл. Гарегина Нжде", "ул. Гарегина Нжде", "мост Встреча", "ул. Арцаха",
                    "просп. Тиграна Меца (Каяран) (Станция)", "просп. Тиграна Меца (ЮКЖД)", "просп. Тиграна Меца (Ташир т/ц)", "просп. Тиграна Меца (к/т Айрарат)", "Педагогический университет",
                    "просп. Тиграна Меца (ярмарка Фирдуси)", "Площадь Республики", "ул. Амиряна", "просп. Маштоца (перекрёсток Амирян)", "просп. Маштоца (больница им. Маргаряна)",
                    "просп. Маштоца (Опера)", "ул. Московян (Консерватория)", "ул. Абовяна (ст/м Еритасардакан (Молодёжная))", "ул. Абовяна (Сельскохозяйственная академия)", "ул. Абовяна (скверик Абовяна)",
                    "просп. Мясникяна (перекрёсток Гераци)", "просп. Мясникяна (ЗООПАРК)", "просп. Мясникяна (Джрашхар)", "просп. Гая (Акватек)", "просп. Гая (Памятник Гаю)",
                    "ул. Нерсон Сафаряна", "ул. Гюрджян ", "м/р Св. Григор Лусаворич", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("45", "A", "Мараш", "Норк 13-ая ул", "Норк 9-ая ул", "Норк 6-ая ул", "Норк 5-ая ул",
                    "Норк 8-ая ул", "ул. Арменак Арменакяна", "ул. Сараландж", "ул. Гераци", "ул. Чаренца (Полиция РА)", "Медицинский университет", "ул. Корюна (Цитадель)",
                    "просп. Маштоца (Матенадаран)", "просп. Маштоца (Консерватория)", "просп. Маштоца (Опера)", "просп. Баграмян (Опера)", "просп. Баграмян (Конституционный суд)",
                    "просп. Баграмян (Американский университет)", "просп. Баграмян (школа им. Камо)", "просп. Баграмян (SAS)", "ул. Касян", "просп. Комитаса (перекрёсток Гюлбенкян)",
                    "ул. Вагаршян", "ул. Сасна Црер", "Давидашен 1-й квартал", "ул. Тиграна Петросяна", "Давидашен 4-й квартал", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("46", "A", "Ариндж молл", "Северный автовокзал", "Газпром Армения", "Тбилисское шс. (Радиомачта)",
                    "ул. Закария Канакерци", "Тбилисское шс. (электроламповый завод)", "просп. Азатутян (Райком)", "просп. Азатутян (Наири Зарян перекрёсток)", "просп. Азатутян (Военкомат)",
                    "просп. Азатутян (Парк Победы)", "ул. Сараландж", "ул. Абовяна (скверик Абовяна)", "ул. Абовяна (Сельскохозяйственная академия)", "ул. Абовяна (ст/м Еритасардакан (Молодёжная))",
                    "ул. Московян (дом Камерной музыки)", "ул. Ханджяна (дом Шахмат)", "Вернисаж", "ул. Ханджяна (Лунапарк)", "Педагогический университет",
                    "просп. Тиграна Меца (к/т Айрарат)", "просп. Тиграна Меца (Ташир т/ц)", "просп. Тиграна Меца (ЮКЖД)", "просп. Тиграна Меца (Каяран) (Станция)", "ул. Арцаха", "ул. Эребуни",
                    "ул. Айвазовского", "ул. Титоградян", "ул. Хахах Дона", "Эребуни массив", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));
//TODO here
            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("47", "A", "сл. Ариндж", "ул. Ачаряна", "Газпром Армения", "Тбилисское шс. (Радиомачта)",
                    "ул. Закария Канакерци", "Тбилисское шс. (электроламповый завод)", "просп. Азатутян (Райком)", "просп. Комитаса (мост Ламбада)", "просп. Комитаса (рынок Комитаса)",
                    "просп. Комитаса (перекрёсток Врацакан)", "просп. Комитаса (Славянский университет)", "просп. Комитаса (перекрёсток Папазян)", "просп. Комитаса (перекрёсток Вагаршян)",
                    "просп. Комитаса (перекрёсток Гюлбенкян)", "ул. Касян", "просп. Баграмян (SAS)", "просп. Баграмян (школа им. Камо)", "просп. Баграмян (Американский университет)",
                    "просп. Баграмян (Конституционный суд)", "просп. Баграмян (Опера)", "просп. Маштоца (Опера)", "просп. Маштоца (больница им. Маргаряна)", "просп. Маштоца (перекрёсток Амирян)",
                    "просп. Маштоца (Крытый рынок)", "просп. Маштоца (магазин РЫБЫ)", "мост Победы", "просп. Исакова", "Киликия автовокзал", "ул. Себастия (перекрёсток Кургинян)",
                    "ул. Себастия (ярмарка Малатия)", "ул. Раффи (ярмарка Малатия)", "ул. Раффи", "ул. Зоравар Андраник", "ул. Арно Бабаджанян", "4-ая ул. Шаумян", "Ераблур",
                    "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("53", "A", "Нор-Норк 9-й массив", "ул. Вильнюса", "Нор-Норк 7-й массив", "ул. Унана Аветисяна", "ул. Давид-Бека",
                    "ул. Бадала Мурадяна", "просп. Гая (салон Мерседеса)", "просп. Гая (Памятник Гаю)", "просп. Гая (Акватек)", "просп. Мясникяна (Джрашхар)", "просп. Мясникяна (ЗООПАРК)",
                    "просп. Мясникяна (перекрёсток Гераци)", "ул. Абовяна (скверик Абовяна)", "ул. Абовяна (Сельскохозяйственная академия)", "ул. Абовяна (ст/м Еритасардакан (Молодёжная))",
                    "ул. Московян (дом Камерной музыки)", "ул. Ханджяна (дом Шахмат)", "Вернисаж", "ул. Ханджяна (Лунапарк)", "Педагогический университет", "ул. Агатангехоси",
                    "просп. Аршакуняц (Цирк)", "просп. Аршакуняц (т/ц Сурмалу)", "просп. Аршакуняц (парк им. Комитаса)", "просп. Аршакуняц (Ереван Молл)", "просп. Аршакуняц (к/т Айреник)",
                    "ул. Гарегина Нжде", "пл. Гарегина Нжде", "просп. Багратуняц (перекрёсток  Арташисян)", "просп. Багратуняц (Ереван Сити)", "просп. Багратуняц (перекрёсток Исаков)",
                    "ул. Себастия (перекрёсток Кургинян)", "ул. Себастия (ярмарка Малатия)", "ул. Раффи (ярмарка Малатия)", "ул. Раффи", "ул. Зоравар Андраник",
                    "ул. Арно Бабаджанян", "4-ая ул. Шаумян", "Ераблур", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("54", "A", "Аван-Ариндж", "ул. Ташкентская", "ул. Маршал Бабаджанян", "ул. Ачаряна", "Ботанический сад",
                    "просп. Мясникяна (Джрашхар)", "просп. Мясникяна (ЗООПАРК)", "просп. Мясникяна (перекрёсток Гераци)", "ул. Абовяна (скверик Абовяна)", "ул. Абовяна (Сельскохозяйственная академия)",
                    "ул. Абовяна (Сельскохозяйственная академия)", "ул. Абовяна (ст/м Еритасардакан (Молодёжная))", "ул. Московян (Консерватория)", "просп. Маштоца (Консерватория)", "просп. Маштоца (Опера)",
                    "просп. Маштоца (больница им. Маргаряна)", "просп. Маштоца (перекрёсток Амирян)", "ул. Амиряна", "Площадь Республики", "просп. Тиграна Меца (ярмарка Фирдуси)",
                    "Педагогический университет", "ул. Агатангехоси", "просп. Аршакуняц (Цирк)", "просп. Аршакуняц (т/ц Сурмалу)", "просп. Аршакуняц (парк им. Комитаса)",
                    "просп. Аршакуняц (Ереван Молл)", "просп. Аршакуняц (к/т Айреник)", "ул. Гарегина Нжде", "пл. Гарегина Нжде", "просп. Багратуняц (перекрёсток  Арташисян)",
                    "ул. Арташисян", "ул. Ширака (аэропорт Эребуни)", "ул. Араратян", "Неркин (Нижний) Чарбах 1-ая ул.", "сл. Норабац", "сл. Даштаван", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("55", "A", "Армяно-Белорусский торговый дом Ар-Бе", "ул. Ширака (рынок Чарбаха)", "ул. Арташисян",
                    "просп. Багратуняц (перекрёсток  Арташисян)", "просп. Багратуняц (Ереван Сити)", "просп. Багратуняц (перекрёсток Исаков)", "ул. Себастия (перекрёсток Кургинян)",
                    "ул. Кургиняна", "ул. Ванцян", "ул. Варужан", "ул. Себастия (ярмарка Малатия)", "ул. Себастия (перекрёсток Тычина)", "ул. Себастия (перекрёсток Ленинградян)",
                    "ул. Ленинградян (Евроваген)", "ул. Ленинградян (перекрёсток Монте Мелконян)", "ул. Ленинградян (Киевский мост)", "ул. Алабян (Киевский мост)",
                    "ул. Алабян (ТУМО)", "ул. Арзуманян", "ул. Шинарарнери", "ул. Абеляна", "ул. Алабян (перекрёсток института физики)", "ул. Маргарян (Республиканская больница)", "ул. Фучика",
                    "ул. Мелкумова", "кв. Норашен", "16 квартал", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("57", "A", "15 квартал", "ул. Мазманян", "ул. Чауша", "ул. Мелкумова", "ул. Фучика",
                    "ул. Маргарян (Республиканская больница)", "ул. Алабян (перекрёсток института физики)", "ул. Алабян (перекрёсток института физики)", "ул. Алабян (ТУМО)",
                    "ул. Алабян (Киевский мост)", "ул. Киевян (Киевский мост)", "ул. Киевян (перекрёсток Орбели)", "ул. Киевян (Барекамутюн)", "просп. Баграмян (SAS)",
                    "просп. Баграмян (школа им. Камо)", "просп. Баграмян (Американский университет)", "просп. Баграмян (Конституционный суд)", "просп. Баграмян (Опера)",
                    "просп. Саят-Нова (перекрёсток Налбандян)", "просп. Саят-Нова (перекрёсток Алек-Манукян)", "ул. Алека Манукяна", "ул. Ерванда Кочара", "просп. Тиграна Меца (Ташир т/ц)",
                    "ул. Нар-Дос (перекресток Силачи)", "ул. Хоренаци (Силачи)", "ул. Заваряна", "Рынок ГУМ", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));
            
            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("58", "A", "Эребуни массив", "ул. Хахах Дона", "ул. Титоградян", "ул. Айвазовского", "ул. Эребуни",
                    "ул. Атоян", "ул. Белинского", "ул. Сасунци Давид", "просп. Тиграна Меца (Каяран) (Станция)", "просп. Тиграна Меца (ЮКЖД)", "просп. Тиграна Меца (Ташир т/ц)",
                    "просп. Тиграна Меца (к/т Айрарат)", "Педагогический университет", "просп. Тиграна Меца (ярмарка Фирдуси)", "Площадь Республики", "ул. Амиряна",
                    "просп. Маштоца (перекрёсток Амирян)", "просп. Маштоца (больница им. Маргаряна)", "просп. Маштоца (Опера)", "просп. Баграмян (Опера)", "просп. Баграмян (Конституционный суд)",
                    "просп. Баграмян (Американский университет)", "просп. Баграмян (школа им. Камо)", "просп. Баграмян (SAS)", "ул. Касян", "просп. Комитаса (перекрёсток Гюлбенкян)",
                    "просп. Комитаса (перекрёсток Вагаршян)", "просп. Комитаса (перекрёсток Папазян)", "просп. Комитаса (Славянский университет)", "просп. Комитаса (перекрёсток Врацакан)",
                    "просп. Комитаса (рынок Комитаса)", "просп. Комитаса (мост Ламбада)", "просп. Азатутян (Райком)", "ул. Паруйра Севака", "ул. Рубинянц (Ереван Сити)",
                    "ул. Рубинянц (завод Алмаст)", "ул. Худякова", "кв. Туманян", "ул. Маршал Бабаджанян", "ул. Ашхабада", "Аван-Ариндж", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("59", "A", "Аван", "ул. Худякова", "ул. Алматы", "ул. Маршал Бабаджанян", "ул. Ачаряна",
                    "просп. Мясникяна (Джрашхар)", "просп. Мясникяна (ЗООПАРК)", "просп. Мясникяна (перекрёсток Гераци)", "ул. Абовяна (скверик Абовяна)", "ул. Абовяна (Сельскохозяйственная академия)",
                    "ул. Абовяна (ст/м Еритасардакан (Молодёжная))", "просп. Саят-Нова (перекрёсток Абовян)", "просп. Маштоца (Опера)", "просп. Маштоца (больница им. Маргаряна)", "просп. Маштоца (перекрёсток Амирян)",
                    "ул. Хоренаци (перекрёсток Маштоц)", "ул. Хоренаци (пл. Шаумяна)", "ул. Агатангехоси", "просп. Аршакуняц (Цирк)", "просп. Аршакуняц (т/ц Сурмалу)",
                    "ул. Христофора", "т/ц Петак", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            ///Temporary unavailable
//            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("62", "A", "Прошян аван", "Аштаракское шс.", "ул. Мелкумова", "15 квартал", "ул. Бекназарян", "ул. Мазманян",
//                    "ул. Шираза", "ул. Григор Асратян", "ул. Ленинградян (Евроваген)", "ул. Ленинградян (перекрёсток Шинарарнер)", "ул. Ленинградян (перекрёсток Монте Мелконян)",
//                    "шоссе Цицернакаберд", "Далма Гарден Молл", "ул. Атенка", "стадион Раздан", "мост Победы", "просп. Маштоца (Крытый рынок)", "просп. Маштоца (магазин РЫБЫ)",
//                    "ул. Амиряна", "Площадь Республики", "просп. Тиграна Меца (ярмарка Фирдуси)", "Педагогический университет", "просп. Тиграна Меца (к/т Айрарат)",
//                    "просп. Тиграна Меца (Ташир т/ц)", "просп. Тиграна Меца (ЮКЖД)", "просп. Тиграна Меца (Каяран) (Станция)", "ул. Арцаха", "ул. Арин-Берди", "Мяс. комбинат", "", "", "", "", "",
//                    "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("63", "A", "Нор-Норк 9-й массив", "ул. Вильнюса", "Нор-Норк 7-й массив", "ул. Унана Аветисяна",
                    "ул. Давид-Бека", "ул. Бадала Мурадяна", "просп. Гая (салон Мерседеса)", "просп. Гая (Памятник Гаю)", "просп. Гая (Акватек)", "просп. Мясникяна (Джрашхар)",
                    "просп. Мясникяна (ЗООПАРК)", "просп. Мясникяна (перекрёсток Гераци)", "ул. Абовяна (скверик Абовяна)", "ул. Абовяна (Сельскохозяйственная академия)",
                    "ул. Абовяна (ст/м Еритасардакан (Молодёжная))", "ул. Московян (дом Камерной музыки)", "ул. Ханджяна (дом Шахмат)", "Вернисаж", "ул. Ханджяна (Лунапарк)",
                    "Педагогический университет", "просп. Тиграна Меца (ярмарка Фирдуси)", "Площадь Республики", "ул. Амиряна", "просп. Маштоца (Крытый рынок)",
                    "просп. Маштоца (магазин РЫБЫ)", "мост Победы", "стадион Раздан", "ул. Атенка", "Далма Гарден Молл", "шоссе Цицернакаберд",
                    "ул. Ленинградян (перекрёсток Монте Мелконян)", "ул. Алабян (Киевский мост)", "ул. Алабян (ТУМО)", "ул. Алабян (перекрёсток института физики)",
                    "ул. Маргарян (Республиканская больница)", "ул. Маргарян (ПЕГАС)", "ул. Башинджагян", "", "", "", "", "", "", "", ""));

//            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("67", "A", "кв. Назарбекян", "Новое шоссе Силикян", "ул. Григор Асратян",
//                    "ул. Себастия (перекрёсток Ленинградян)", "ул. Себастия (перекрёсток Тычина)", "ул. Себастия (ярмарка Малатия)", "ул. Себастия (перекрёсток Кургинян)",
//                    "просп. Исакова (перекрёсток Себастия)", "Киликия автовокзал", "мост Победы", "просп. Маштоца (магазин РЫБЫ)", "просп. Маштоца (Крытый рынок)", "ул. Амиряна",
//                    "Площадь Республики", "просп. Тиграна Меца (ярмарка Фирдуси)", "Педагогический университет", "просп. Тиграна Меца (к/т Айрарат)", "просп. Тиграна Меца (Ташир т/ц)",
//                    "просп. Тиграна Меца (ЮКЖД)", "просп. Тиграна Меца (Каяран) (Станция)", "ул. Арцаха", "ул. Ростовян", "ул. Мурацан", "ул. Эребуни", "ул. Атоян", "ул. Айвазовского",
//                    "ул. Аванесова", "Эребуни массив ", "ул. Арно Бабаджанян", "ул. Зоравар Андраник", "ул. Раффи", "ул. Раффи (ярмарка Малатия)", "ул. Себастия (ярмарка Малатия)",
//                    "ул. Ванцян", "ул. Кургиняна", "ул. Себастия (перекрёсток Кургинян)", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("68", "A", "Рабочий поселок Энергетиков", "Эчмиадзинское шс.", "просп. Исакова (перекрёсток Себастия)",
                    "Киликия автовокзал", "мост Победы", "просп. Маштоца (магазин РЫБЫ)", "просп. Маштоца (Крытый рынок)", "ул. Амиряна", "Площадь Республики",
                    "просп. Тиграна Меца (ярмарка Фирдуси)", "Педагогический университет", "просп. Тиграна Меца (к/т Айрарат)", "просп. Тиграна Меца (Ташир т/ц)", "просп. Тиграна Меца (ЮКЖД)",
                    "просп. Тиграна Меца (Каяран) (Станция)", "ул. Сасунци Давид", "ул. Кусто", "Городской пантеон", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("259", "A", "Киликия автовокзал", "мост Победы", "просп. Маштоца (магазин РЫБЫ)",
                    "просп. Маштоца (Крытый рынок)", "просп. Маштоца (перекрёсток Амирян)", "просп. Маштоца (больница им. Маргаряна)", "просп. Маштоца (Опера)", "просп. Баграмян (Опера)",
                    "просп. Баграмян (Конституционный суд)", "просп. Баграмян (Американский университет)", "просп. Баграмян (школа им. Камо)", "просп. Баграмян (SAS)",
                    "ул. Касян", "просп. Комитаса (перекрёсток Гюлбенкян)", "просп. Комитаса (перекрёсток Вагаршян)", "просп. Комитаса (перекрёсток Папазян)",
                    "просп. Комитаса (Славянский университет)", "просп. Комитаса (перекрёсток Врацакан)", "просп. Комитаса (рынок Комитаса)", "просп. Комитаса (мост Ламбада)",
                    "просп. Азатутян (Райком)", "Тбилисское шс. (электроламповый завод)", "Тбилисское шс. (электроламповый завод)", "Тбилисское шс. (Высшая школа Айб)",
                    "Тбилисское шс. (Завод шампанских вин)", "Тбилисское шс. (Радиомачта)", "Газпром Армения", "Ариндж молл", "сл. Верин Птгни", "сл. Балаовит", "г. Абовян", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("261", "A", "просп. Тиграна Меца (Каяран) (Станция)", "просп. Тиграна Меца (ЮКЖД)", "просп. Тиграна Меца (Ташир т/ц)",
                    "просп. Тиграна Меца (к/т Айрарат)", "Педагогический университет", "ул. Ханджяна (Лунапарк)", "Вернисаж", "ул. Гераци", "просп. Мясникяна (перекрёсток Гераци)",
                    "просп. Мясникяна (ЗООПАРК)", "просп. Мясникяна (Джрашхар)", "Ботанический сад", "ул. Ачаряна", "сл. Верин Птгни", "сл. Балаовит", "г. Абовян", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            /**
             * Microbuses
             * */

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("1", "M", "Аэропорт Эребуни", "пл. Труда (памятник Рабочему)",
                    "просп. Аршакуняц (по напр. Чарбах)", "просп. Багратуняц (памятник Рабочему)", "пл. Гарегина Нжде", "просп. Багратуняц (перекрёсток  Арташисян)",
                    "просп. Багратуняц (Ереван Сити)", "просп. Багратуняц (перекрёсток Исаков)", "ул. Себастия (перекрёсток Кургинян)", "ул. Себастия (ярмарка Малатия)",
                    "ул. Раффи (ярмарка Малатия)", "ул. Раффи", "ул. Гусана Шерама", "ул. Оганова", "ул. Зоравар Андраник", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("2", "M", "Онкологический институт", "ул. Фанарджян", "ул. Закария Канакерци", "ул. Эзрас Асратян",
                    "ул. Улнеци", "ул. Нерсисян", "просп. Азатутян (Райком)", "просп. Комитаса (мост Ламбада)", "просп. Комитаса (рынок Комитаса)", "просп. Комитаса (перекрёсток Врацакан)",
                    "просп. Комитаса (Славянский университет)", "просп. Комитаса (перекрёсток Папазян)", "просп. Комитаса (перекрёсток Вагаршян)", "просп. Комитаса (перекрёсток Гюлбенкян)",
                    "ул. Касян", "просп. Баграмян (SAS)", "просп. Баграмян (школа им. Камо)", "просп. Баграмян (Американский университет)", "просп. Баграмян (Конституционный суд)",
                    "просп. Баграмян (Опера)", "просп. Маштоца (Опера)", "просп. Маштоца (Консерватория)", "просп. Маштоца (Матенадаран)", "ул. Корюна (Цитадель)", "Медицинский университет",
                    "ул. Чаренца (Полиция РА)", "ул. Чаренца (ЕГУ)", "ул. Чаренца (салон-магазин Zigzag)", "просп. Саят-Нова (перекрёсток Алек-Манукян)", "ул. Алека Манукяна",
                    "ул. Вардананц", "Республиканский стадион", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("3", "M", "15 квартал", "ул. Башинджагян", "ул. Маргарян (ПЕГАС)", "ул. Маргарян (Республиканская больница)",
                    "ул. Алабян (перекрёсток института физики)", "ул. Алабян (ТУМО)", "ул. Алабян (Киевский мост)", "ул. Киевян (Киевский мост)", "ул. Киевян (перекрёсток Орбели)",
                    "ул. Киевян (Барекамутюн)", "ул. Касян", "просп. Комитаса (перекрёсток Гюлбенкян)", "просп. Комитаса (перекрёсток Вагаршян)", "просп. Комитаса (перекрёсток Папазян)",
                    "ул. Папазян", "ул. Арама Хачатуряна", "ул. Риги", "Российско-Армянский университет", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("4", "M", "ул. Рубинянц (Ереван Сити)", "ул. Паруйра Севака", "просп. Азатутян (Райком)", "просп. Комитаса (мост Ламбада)",
                    "просп. Комитаса (рынок Комитаса)", "просп. Комитаса (перекрёсток Врацакан)", "просп. Комитаса (Славянский университет)", "просп. Комитаса (перекрёсток Папазян)",
                    "просп. Комитаса (перекрёсток Вагаршян)", "просп. Комитаса (перекрёсток Гюлбенкян)", "ул. Касян", "просп. Баграмян (SAS)", "просп. Баграмян (школа им. Камо)",
                    "просп. Баграмян (Американский университет)", "просп. Баграмян (Конституционный суд)", "просп. Баграмян (Опера)", "просп. Маштоца (Опера)", "просп. Маштоца (больница им. Маргаряна)",
                    "просп. Маштоца (перекрёсток Амирян)", "просп. Маштоца (Крытый рынок)", "просп. Маштоца (магазин РЫБЫ)", "мост Победы", "ул. Атенка", "стадион Раздан",
                    "Далма Гарден Молл", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("5", "M", "Аван", "кв. Дурян", "ул. Нвер Сафарян․", "ул. Маршал Бабаджанян", "ул. Ачаряна",
                    "ул. Рубинянц (завод Алмаст)", "ул. Рубинянц (Ереван Сити)", "ул. Рубинянц (ул. Агаронян)", "ул. Давида Анахта (перекрёсток Дро)",
                    "ул. Давида Анахта (Керама Марацци)", "ул. Давида Анахта (Административное деление)", "просп. Комитаса (мост Ламбада)", "просп. Комитаса (рынок Комитаса)",
                    "просп. Комитаса (перекрёсток Врацакан)", "просп. Комитаса (Славянский университет)", "просп. Комитаса (перекрёсток Папазян)", "просп. Комитаса (перекрёсток Вагаршян)",
                    "просп. Комитаса (перекрёсток Гюлбенкян)", "ул. Касян", "ул. Киевян (Барекамутюн)", "ул. Киевян (перекрёсток Орбели)", "ул. Киевян (Киевский мост)",
                    "ул. Алабян (Киевский мост)", "ул. Алабян (ТУМО)", "ул. Алабян (перекрёсток института физики)", "ул. Алабян (перекрёсток института физики)",
                    "ул. Маргарян (Республиканская больница)", "ул. Фучика", "ул. Мелкумова", "кв. Норашен", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("6", "M", "Нор-Норк 3-й массив", "ул. Гюрджян", "ул. Шопрона", "ул. Бадала Мурадяна",
                    "просп. Гая (салон Мерседеса)", "просп. Гая (Памятник Гаю)", "просп. Гая (Акватек)", "ул. Рубинянц (завод Алмаст)", "ул. Рубинянц (Ереван Сити)",
                    "ул. Рубинянц (ул. Агаронян)", "ул. Давида Анахта (перекрёсток Дро)", "ул. Давида Анахта (Керама Марацци)", "ул. Давида Анахта (Административное деление)",
                    "просп. Комитаса (мост Ламбада)", "просп. Комитаса (рынок Комитаса)", "просп. Комитаса (перекрёсток Врацакан)", "просп. Комитаса (Славянский университет)",
                    "просп. Комитаса (перекрёсток Папазян)", "просп. Комитаса (перекрёсток Вагаршян)", "просп. Комитаса (перекрёсток Гюлбенкян)", "ул. Касян", "ул. Киевян (Барекамутюн)",
                    "ул. Киевян (перекрёсток Орбели)", "ул. Киевян (Киевский мост)", "ул. Ленинградян (Киевский мост)", "ул. Ленинградян (перекрёсток Монте Мелконян)",
                    "ул. Ленинградян (перекрёсток Шинарарнер)", "ул. Ленинградян (Евроваген)", "ул. Себастия (перекрёсток Ленинградян)", "ул. Себастия (перекрёсток Тычина)",
                    "ул. Себастия (ярмарка Малатия)", "ул. Раффи (ярмарка Малатия)", "ул. Раффи", "ул. Арно Бабаджанян", "Юго-Западный квартал (Бангладеш)", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("6а", "M", "Эребуни массив", "ул. Хахах Дона", "ул. Титоградян", "ул. Айвазовского",
                    "ул. Эребуни", "ул. Арцаха", "просп. Тиграна Меца (Каяран) (Станция)", "просп. Тиграна Меца (ЮКЖД)", "просп. Тиграна Меца (Ташир т/ц)", "просп. Тиграна Меца (к/т Айрарат)",
                    "Педагогический университет", "просп. Тиграна Меца (ярмарка Фирдуси)", "Площадь Республики", "ул. Налбандян (Площадь Республики)", "ул. Туманян",
                    "просп. Маштоца (Опера)", "просп. Маштоца (больница им. Маргаряна)", "просп. Маштоца (перекрёсток Амирян)", "ул. Хоренаци (перекрёсток Маштоц)", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("7", "M", "Нор-Норк 9-й массив", "ул. Вильнюса", "Нор-Норк 7-й массив", "ул. Унана Аветисяна",
                    "ул. Давид-Бека", "ул. Азатамартикнери", "ул. Сасунци Давид", "ул. Арцаха", "мост Встреча", "ул. Гарегина Нжде", "пл. Гарегина Нжде",
                    "просп. Багратуняц (перекрёсток  Арташисян)", "ул. Арташисян", "ул. Чехова", "ул. Г. Овсепян", "ул. Таронцу", "м/с Шенгавит", "Неркин (Нижний) Шенгавит 9-ая ул.",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("8", "M", "Канакерская ГЭС", "ул. Капанцян", "ул. Адонц", "Каназ военный госп.", "ул. Ширванзаде",
                    "просп. Комитаса (мост Ламбада)", "просп. Комитаса (рынок Комитаса)", "просп. Комитаса (перекрёсток Врацакан)", "просп. Комитаса (Славянский университет)",
                    "просп. Комитаса (перекрёсток Папазян)", "просп. Комитаса (перекрёсток Вагаршян)", "просп. Комитаса (перекрёсток Гюлбенкян)", "ул. Касян",
                    "просп. Баграмян (SAS)", "просп. Баграмян (школа им. Камо)", "ул. Прошян ", "ул. Паронян (м/ц Наири)", "ул. Паронян (Цезар палас)",
                    "Григор Лусаворич (Мэрия Еревана)", "Григор Лусаворич (Цирк)", "просп. Аршакуняц (Цирк)", "просп. Аршакуняц (т/ц Сурмалу)", "просп. Аршакуняц (парк им. Комитаса)",
                    "просп. Аршакуняц (Ереван Молл)", "просп. Аршакуняц (к/т Айреник)", "ул. Гарегина Нжде", "пл. Гарегина Нжде", "ул. Манандян", "Аракс стадион", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("9", "M", "Джрвеж", "ул.Минска (Нор-Норк 8-й массив)", "ул. Артем Микоян",
                    "ул. Бадала Мурадяна", "просп. Мясникяна (Джрашхар)", "просп. Мясникяна (ЗООПАРК)", "просп. Мясникяна (перекрёсток Гераци)", "ул. Гераци",
                    "ул. Чаренца (Полиция РА)", "ул. Налбандян (ЕПТУ)", "ул. Ханджяна (дом Шахмат)", "Вернисаж", "ул. Ханджяна (Лунапарк)", "Педагогический университет",
                    "просп. Тиграна Меца (к/т Айрарат)", "просп. Тиграна Меца (Ташир т/ц)", "ул. Христофора", "т/ц Петак", "ул. Севан", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("10", "M", "пл. Труда (памятник Рабочему)", "просп. Багратуняц (памятник Рабочему)",
                    "пл. Гарегина Нжде", "ул. Гарегина Нжде", "просп. Аршакуняц (к/т Айреник)", "просп. Аршакуняц (Ереван Молл)", "просп. Аршакуняц (парк им. Комитаса)",
                    "просп. Аршакуняц (т/ц Сурмалу)", "просп. Аршакуняц (Цирк)", "Григор Лусаворич (Мэрия Еревана)", "просп. Маштоца (магазин РЫБЫ)",
                    "просп. Маштоца (Крытый рынок)", "просп. Маштоца (перекрёсток Амирян)", "просп. Маштоца (больница им. Маргаряна)", "просп. Маштоца (Опера)", "просп. Маштоца (Консерватория)",
                    "просп. Маштоца (Матенадаран)", "ул. Корюна (Цитадель)", "ул. Абовяна (Сельскохозяйственная академия)", "ул. Абовяна (скверик Абовяна)", "ул. Сараландж",
                    "просп. Азатутян (Парк Победы)", "просп. Азатутян (Военкомат)", "просп. Азатутян (Наири Зарян перекрёсток)", "просп. Азатутян (Райком)",
                    "ул. Нерсисян", "ул. Улнеци", "ул. Паруйра Севака", "ул. Рубинянц (Ереван Сити)", "ул. Рубинянц (завод Алмаст)", "ул. Ачаряна", "ул. Ачаряна 2-ой тупик",
                    "Солерудник", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("11", "M", "Вардашен ул. 5-ая", "ул. Маари", "Нор-Ареш 50-ая ул.", "Нор-Ареш 7-ая ул.",
                    "Нор-Ареш 20-ая ул.", "ул. Азатамартикнери", "ул. Сасунци Давид", "просп. Тиграна Меца (Каяран) (Станция)", "просп. Тиграна Меца (ЮКЖД)", "просп. Тиграна Меца (Ташир т/ц)",
                    "просп. Тиграна Меца (к/т Айрарат)", "ул. Агатангехоси", "Григор Лусаворич (Цирк)", "Григор Лусаворич (Мэрия Еревана)", "ул. Закян",
                    "ул. Амиряна", "просп. Маштоца (перекрёсток Амирян)", "просп. Маштоца (Крытый рынок)", "просп. Маштоца (магазин РЫБЫ)", "мост Победы", "стадион Раздан", "ул. Атенка",
                    "Далма Гарден Молл", "шоссе Цицернакаберд", "ул. Мазманян", "ул. Чауша", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("12", "M", "ул. Лепсиус", "ул. Дро", "ул. Паруйра Севака", "просп. Азатутян (Райком)",
                    "просп. Комитаса (мост Ламбада)", "просп. Комитаса (рынок Комитаса)", "просп. Комитаса (перекрёсток Врацакан)", "просп. Комитаса (Славянский университет)",
                    "просп. Комитаса (перекрёсток Папазян)", "просп. Комитаса (перекрёсток Вагаршян)", "просп. Комитаса (перекрёсток Гюлбенкян)", "ул. Касян",
                    "ул. Киевян (Барекамутюн)", "ул. Киевян (перекрёсток Орбели)", "ул. Киевян (Киевский мост)", "ул. Алабян (Киевский мост)", "ул. Алабян (ТУМО)",
                    "ул. Алабян (перекрёсток института физики)", "ул. Маргарян (Республиканская больница)", "ул. Маргарян (ПЕГАС)", "ул. Башинджагян", "ул. Мазманян", "15 квартал",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("13", "M", "Неркин (Нижний) Шенгавит", "ул. Тадевосян", "просп. Багратуняц (памятник Рабочему)",
                    "пл. Гарегина Нжде", "просп. Багратуняц (перекрёсток  Арташисян)", "просп. Багратуняц (Ереван Сити)", "просп. Багратуняц (перекрёсток Исаков)",
                    "просп. Исакова (перекрёсток Себастия)", "Киликия автовокзал", "просп. Исакова", "мост Победы", "просп. Маштоца (магазин РЫБЫ)",
                    "просп. Маштоца (Крытый рынок)", "просп. Маштоца (перекрёсток Амирян)", "просп. Маштоца (больница им. Маргаряна)", "просп. Маштоца (Опера)", "просп. Баграмян (Опера)",
                    "просп. Баграмян (Конституционный суд)", "просп. Баграмян (Американский университет)", "просп. Баграмян (школа им. Камо)", "просп. Баграмян (SAS)",
                    "ул. Киевян (Барекамутюн)", "ул. Киевян (перекрёсток Орбели)", "ул. Киевян (Киевский мост)", "ул. Алабян (Киевский мост)", "ул. Алабян (ТУМО)",
                    "ул. Алабян (перекрёсток института физики)", "ул. Иосифян", "Давидашен 1-й квартал", "ул. Тиграна Петросяна", "ул. Агабабян", "Давидашен 1-й квартал", "", "", "", "", "",
                    "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("14", "M", "Нубарашен шс. (В/Ч)", "ул. Хахах Дона", "ул. Титоградян", "ул. Айвазовского",
                    "ул. Эребуни", "ул. Азатамартикнери", "ул. Сасунци Давид", "ул. Белинского", "ул. Хоренаци (Силачи)", "ул. Нар-Дос (перекресток Силачи)",
                    "просп. Тиграна Меца (Ташир т/ц)", "просп. Тиграна Меца (к/т Айрарат)", "Педагогический университет", "ул. Ханджяна (Лунапарк)", "Вернисаж",
                    "ул. Ханджяна (дом Шахмат)", "ул. Московян (дом Камерной музыки)", "ул. Абовяна (ст/м Еритасардакан (Молодёжная))", "ул. Абовяна (Сельскохозяйственная академия)",
                    "ул. Абовяна (скверик Абовяна)", "ул. Сараландж", "просп. Азатутян (Парк Победы)", "просп. Азатутян (Военкомат)", "просп. Азатутян (Наири Зарян перекрёсток)",
                    "просп. Азатутян (Райком)", "ул. Адонц", "ул. Капанцян", "Канакерская ГЭС", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("15", "M", "Аван ", "ул. Маршал Худяков", "ул. Алматы", "ул. Маршал Бабаджанян",
                    "ул. Ачаряна", "ул. Рубинянц (завод Алмаст)", "ул. Рубинянц (Ереван Сити)", "ул. Паруйра Севака", "просп. Азатутян (Райком)", "просп. Комитаса (мост Ламбада)",
                    "просп. Комитаса (рынок Комитаса)", "ул. Грибоедова", "ул. Наири Зарян", "зд. Биржы", "ул. Грачья Кочар (перекрёсток Врацакан)",
                    "ул. Грачья Кочар (перекрёсток Папазян)", "ул. Грачья Кочар (перекрёсток Вагаршян)", "ул. Вагаршян", "Давидашенский мост", "ул. Сасна Црер", "Давидашен 1-й квартал",
                    "ул. Тиграна Петросяна", "Давидашен 4-й квартал", "ул. Адонц", "просп. Азатутян (Райком)", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("16", "M", "Аван ", "ул. Маршал Худяков", "ул. Алматы", "ул. Маршал Бабаджанян",
                    "ул. Ачаряна", "просп. Гая (Памятник Гаю)", "просп. Гая (салон Мерседеса)", "ул. Бадала Мурадяна", "ул. Давид-Бека", "ул. Унана Аветисяна", "Нор-Норк 7-й массив",
                    "ул. Вильнюса", "Нор-Норк 9-й массив", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("17", "M", "завод Арменал", "ул. Адонц", "просп. Азатутян (Райком)", "просп. Комитаса (мост Ламбада)", "просп. Комитаса (рынок Комитаса)",
                    "просп. Комитаса (перекрёсток Врацакан)", "просп. Комитаса (Славянский университет)", "просп. Комитаса (перекрёсток Папазян)", "просп. Комитаса (перекрёсток Вагаршян)",
                    "просп. Комитаса (перекрёсток Гюлбенкян)", "ул. Касян", "ул. Киевян (Барекамутюн)", "ул. Киевян (перекрёсток Орбели)", "ул. Киевян (Киевский мост)",
                    "ул. Ленинградян (Киевский мост)", "ул. Ленинградян (перекрёсток Монте Мелконян)", "ул. Ленинградян (перекрёсток Шинарарнер)",
                    "ул. Ленинградян (Евроваген)", "ул. Себастия (перекрёсток Ленинградян)", "ул. Себастия (перекрёсток Тычина)", "ул. Себастия (ярмарка Малатия)",
                    "ул. Себастия (перекрёсток Кургинян)", "просп. Исакова (перекрёсток Себастия)", "Эчмиадзинское шс.", "Аэропорт Звартноц", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("18", "M", "ул. Абовяна (скверик Абовяна)", "ул. Абовяна (Сельскохозяйственная академия)",
                    "ул. Абовяна (ст/м Еритасардакан (Молодёжная))", "ул. Московян (дом Камерной музыки)", "ул. Ханджяна (дом Шахмат)", "Вернисаж", "ул. Ханджяна (Лунапарк)",
                    "Педагогический университет", "просп. Тиграна Меца (к/т Айрарат)", "просп. Тиграна Меца (Ташир т/ц)", "просп. Тиграна Меца (ЮКЖД)", "просп. Тиграна Меца (Каяран) (Станция)",
                    "ул. Арцаха", "мост Встреча", "ул. Гарегина Нжде", "просп. Аршакуняц (к/т Айреник)", "пл. Гарегина Нжде", "просп. Багратуняц (перекрёсток  Арташисян)",
                    "просп. Багратуняц (Ереван Сити)", "просп. Багратуняц (перекрёсток Исаков)", "просп. Исакова (перекрёсток Себастия)", "Эчмиадзинское шс.",
                    "Аэропорт Звартноц", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("19", "M", "ул. Гаджегорцнери", "ул. Кусто", "ул. Сасунци Давид", "просп. Тиграна Меца (Каяран) (Станция)",
                    "просп. Тиграна Меца (ЮКЖД)", "просп. Тиграна Меца (Ташир т/ц)", "просп. Тиграна Меца (к/т Айрарат)", "Педагогический университет", "ул. Ханджяна (Лунапарк)", "Вернисаж",
                    "ул. Ханджяна (дом Шахмат)", "ул. Московян (дом Камерной музыки)", "ул. Абовяна (ст/м Еритасардакан (Молодёжная))", "ул. Абовяна (Сельскохозяйственная академия)",
                    "ул. Абовяна (скверик Абовяна)", "ул. Сараландж", "просп. Азатутян (Парк Победы)", "просп. Азатутян (Военкомат)", "просп. Азатутян (Наири Зарян перекрёсток)",
                    "ул. Давида Анахта (Административное деление)", "ул. Давида Анахта (Керама Марацци)", "ул. Давида Анахта (перекрёсток Дро)", "ул. Рубинянц (ул. Агаронян)",
                    "ул. Рубинянц (Ереван Сити)", "ул. Паруйра Севака", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("20", "M", "Аван ", "ул. Маршал Бабаджанян", "ул. Ачаряна", "Ботанический сад",
                    "просп. Мясникяна (Джрашхар)", "просп. Мясникяна (ЗООПАРК)", "просп. Мясникяна (перекрёсток Гераци)", "ул. Абовяна (скверик Абовяна)",
                    "ул. Абовяна (Сельскохозяйственная академия)", "ул. Московян (дом Камерной музыки)", "ул. Ханджяна (дом Шахмат)", "Вернисаж", "ул. Ханджяна (Лунапарк)",
                    "Педагогический университет", "ул. Агатангехоси", "просп. Аршакуняц (Цирк)", "просп. Аршакуняц (т/ц Сурмалу)", "просп. Аршакуняц (парк им. Комитаса)",
                    "просп. Аршакуняц (Ереван Молл)", "просп. Аршакуняц (к/т Айреник)", "ул. Гарегина Нжде", "пл. Гарегина Нжде", "просп. Багратуняц (памятник Рабочему)",
                    "ул. Тадевосян", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("21", "M", "Юго-Западный квартал (Бангладеш)", "ул. Арно Бабаджанян", "ул. Зоравар Андраник", "ул. Тичина",
                    "ул. Себастия (перекрёсток Тычина)", "ул. Себастия (перекрёсток Ленинградян)", "ул. Ленинградян (Евроваген)", "ул. Ленинградян (перекрёсток Шинарарнер)",
                    "ул. Ленинградян (перекрёсток Монте Мелконян)", "ул. Ленинградян (Киевский мост)", "ул. Киевян (Киевский мост)", "ул. Киевян (перекрёсток Орбели)",
                    "ул. Киевян (Барекамутюн)", "просп. Баграмян (SAS)", "просп. Баграмян (школа им. Камо)", "просп. Баграмян (Американский университет)",
                    "просп. Баграмян (Конституционный суд)", "просп. Баграмян (Опера)", "просп. Маштоца (Консерватория)", "ул. Московян (Консерватория)",
                    "ул. Абовяна (ст/м Еритасардакан (Молодёжная))", "ул. Абовяна (Сельскохозяйственная академия)", "ул. Абовяна (скверик Абовяна)", "ул. Сараландж", "просп. Азатутян (Парк Победы)",
                    "просп. Азатутян (Военкомат)", "просп. Азатутян (Наири Зарян перекрёсток)", "просп. Азатутян (Райком)", "Тбилисское шс. (электроламповый завод)",
                    "Тбилисское шс. (электроламповый завод)", "Тбилисское шс. (Высшая школа Айб)", "Тбилисское шс. (Завод шампанских вин)", "", "", "", "", "", "", "", "", "", "",
                    "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("22", "M", "Мараш", "Норк 9-ая ул", "Норк 7-ая ул.", "Норк 8-ая ул", "ул. Арменак Арменакяна",
                    "ул. Сараландж", "ул. Гераци", "ул. Чаренца (Полиция РА)", "ул. Налбандян (ЕПТУ)", "ул. Ханджяна (дом Шахмат)", "Вернисаж", "ул. Ханджяна (Лунапарк)",
                    "Педагогический университет", "просп. Тиграна Меца (к/т Айрарат)", "просп. Тиграна Меца (Ташир т/ц)", "ул. Христофора", "т/ц Петак", "просп. Аршакуняц (парк им. Комитаса)",
                    "просп. Аршакуняц (Ереван Молл)", "просп. Аршакуняц (к/т Айреник)", "ул. Гарегина Нжде", "ул. Маис 9 (ул. 9 мая)", "ул. Мусаелян", "ул. Одессы",
                    "фабрика Восточных сладостей", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("23", "M", "просп. Тиграна Меца (Каяран) (Станция)", "просп. Тиграна Меца (ЮКЖД)", "просп. Тиграна Меца (Ташир т/ц)",
                    "просп. Тиграна Меца (к/т Айрарат)", "Педагогический университет", "ул. Хоренаци (пл. Шаумяна)", "ул. Хоренаци (перекрёсток Маштоц)",
                    "просп. Маштоца (Крытый рынок)", "просп. Маштоца (магазин РЫБЫ)", "мост Победы", "просп. Исакова", "Киликия автовокзал",
                    "просп. Исакова (перекрёсток Себастия)", "ул. Себастия (перекрёсток Кургинян)", "ул. Себастия (ярмарка Малатия)", "ул. Раффи (ярмарка Малатия)",
                    "ул. Раффи", "ул. Гусана Шерама", "ул. Оганова", "сл. Ахтанак ул. 1", "сл. Ахтанак ул. 6", "сл. Ахтанак ул. 9", "сл. Ахтанак ул. 10",
                    "сл. Ахтанак ул. 7", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("24", "M", "Норагюх", "Эчмиадзинское шс. (старое)", "просп. Исакова", "Киликия автовокзал",
                    "мост Победы", "просп. Маштоца (магазин РЫБЫ)", "просп. Маштоца (Крытый рынок)", "просп. Маштоца (перекрёсток Амирян)", "просп. Маштоца (больница им. Маргаряна)",
                    "просп. Маштоца (Опера)", "просп. Баграмян (Опера)", "просп. Баграмян (Конституционный суд)", "просп. Баграмян (Американский университет)", "просп. Баграмян (школа им. Камо)",
                    "просп. Баграмян (SAS)", "ул. Касян", "просп. Комитаса (перекрёсток Гюлбенкян)", "просп. Комитаса (перекрёсток Вагаршян)",
                    "просп. Комитаса (перекрёсток Папазян)", "просп. Комитаса (Славянский университет)", "просп. Комитаса (перекрёсток Врацакан)", "просп. Комитаса (рынок Комитаса)",
                    "просп. Комитаса (мост Ламбада)", "ул. Ширванзаде", "ул. Мамиконянц", "ул. Грибоедова", "ул. Архутян", "ул. Малхасянц", "тупик Малхасянц",
                    "Ереванский государственный гуманитарный колледж", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("25", "M", "Завод Электрон", "ул. Шарури", "ул. Ширака (рынок Чарбаха)", "ул. Арташисян",
                    "просп. Багратуняц (перекрёсток  Арташисян)", "пл. Гарегина Нжде", "ул. Гарегина Нжде", "мост Встреча", "ул. Ростовян", "ул. Азатамартикнери",
                    "ул. Эребуни", "ул. Айвазовского", "ул. Титоградян", "ул. Хахах Дона", "Эребуни массив", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("26", "M", "Нор-Норк 1-й массив", "ул. Джугаи", "ул. Лвовян", "ул. Борян", "ул. Нансена",
                    "просп. Гая (Памятник Гаю)", "просп. Гая (салон Мерседеса)", "ул. Багян", "ул. Гюрджян", "Норк 1-ая ул/пер.", "Норк 2-ая ул/пер.", "ул. Г. Овсепян",
                    "ул. Арменак Арменакяна", "ул. Сараландж", "ул. Арменак Арменакяна", "просп. Мясникяна (перекрёсток Гераци)", "ул. Абовяна (скверик Абовяна)", "ул. Абовяна (Сельскохозяйственная академия)",
                    "ул. Московян (Консерватория)", "ул. Московян (КАСКАД)", "ул. Московян (перекрёсток Туманян)", "ул. Сарьяна (перекрёсток  Туманян)",
                    "ул. Сарьяна (почта Сарьян)", "ул. Сарьяна (перекрёсток  Амирян)", "просп. Маштоца (Крытый рынок)", "просп. Маштоца (магазин РЫБЫ)",
                    "Григор Лусаворич (Мэрия Еревана)", "ул. Аргишти", "мост Победы", "ул. Атенка", "стадион Раздан", "Далма Гарден Молл", "шоссе Цицернакаберд",
                    "ул. Ленинградян (перекрёсток Монте Мелконян)", "ул. Ленинградян (перекрёсток Шинарарнер)", "ул. Ленинградян (Евроваген)", "ул. Григор Асратян",
                    "ул. Мартиросян", "ул. Лукашина", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("27", "M", "Силикян 7-ая улица", "Силикян 10-ая улица", "Новое шоссе Силикян", "ул. Мазманян",
                    "ул. Башинджагян", "ул. Маргарян (ПЕГАС)", "ул. Маргарян (Республиканская больница)", "ул. Алабян (перекрёсток института физики)", "ул. Алабян (перекрёсток института физики)",
                    "ул. Алабян (ТУМО)", "ул. Алабян (Киевский мост)", "ул. Киевян (Киевский мост)", "ул. Орбели", "просп. Баграмян (школа им. Камо)",
                    "просп. Баграмян (Американский университет)", "просп. Баграмян (Конституционный суд)", "ул. Московян (КАСКАД)", "просп. Маштоца (Консерватория)",
                    "просп. Маштоца (Матенадаран)", "ул. Корюна (Цитадель)", "Медицинский университет", "ул. Чаренца (Полиция РА)", "ул. Чаренца (ЕГУ)",
                    "ул. Чаренца (салон-магазин Zigzag)", "просп. Саят-Нова (перекрёсток Алек-Манукян)", "ул. Алека Манукяна", "ул. Вардананц", "Республиканский стадион", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("28", "M", "Ераблур", "4-ая ул. Шаумян", "ул. Арно Бабаджанян", "ул. Зоравар Андраник", "ул. Раффи",
                    "ул. Раффи (ярмарка Малатия)", "ул. Себастия (ярмарка Малатия)", "ул. Варужан", "ул. Ванцян", "ул. Кургиняна", "ул. Себастия (перекрёсток Кургинян)",
                    "просп. Багратуняц (перекрёсток Исаков)", "просп. Багратуняц (Ереван Сити)", "просп. Багратуняц (перекрёсток  Арташисян)", "пл. Гарегина Нжде",
                    "ул. Гарегина Нжде", "просп. Аршакуняц (к/т Айреник)", "просп. Аршакуняц (Ереван Молл)", "просп. Аршакуняц (парк им. Комитаса)", "просп. Аршакуняц (т/ц Сурмалу)",
                    "просп. Аршакуняц (Цирк)", "ул. Агатангехоси", "Педагогический университет", "ул. Ханджяна (Лунапарк)", "Вернисаж", "ул. Ханджяна (дом Шахмат)",
                    "ул. Московян (дом Камерной музыки)", "ул. Абовяна (ст/м Еритасардакан (Молодёжная))", "ул. Абовяна (Сельскохозяйственная академия)", "ул. Абовяна (скверик Абовяна)",
                    "ул. Сараландж", "просп. Азатутян (Парк Победы)", "просп. Азатутян (Военкомат)", "ул. Варшавян", "Студенческое общежитие", "", "", "", "",
                    "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("29", "M", "ул. Арагац", "ул. Маис 9 (ул. 9 мая)", "ул. Чехова", "просп. Багратуняц (перекрёсток  Арташисян)",
                    "пл. Гарегина Нжде", "ул. Гарегина Нжде", "просп. Аршакуняц (к/т Айреник)", "просп. Аршакуняц (Ереван Молл)", "просп. Аршакуняц (парк им. Комитаса)",
                    "просп. Аршакуняц (т/ц Сурмалу)", "просп. Аршакуняц (Цирк)", "ул. Агатангехоси", "Педагогический университет", "просп. Тиграна Меца (к/т Айрарат)",
                    "просп. Тиграна Меца (Ташир т/ц)", "ул. Нар-Дос (перекресток Силачи)", "ул. Чаренца (салон-магазин Zigzag)", "ул. Чаренца (ЕГУ)", "ул. Чаренца (Полиция РА)",
                    "Медицинский университет", "ул. Абовяна (Сельскохозяйственная академия)", "ул. Абовяна (скверик Абовяна)", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("30", "M", "Давидашен 4-й квартал", "Егвардское шс.", "ул. Тиграна Петросяна", "Давидашен 1-й квартал",
                    "просп. Комитаса (перекрёсток Вагаршян)", "просп. Комитаса (перекрёсток Гюлбенкян)", "ул. Касян", "просп. Баграмян (SAS)", "просп. Баграмян (школа им. Камо)",
                    "просп. Баграмян (Американский университет)", "просп. Баграмян (Конституционный суд)", "ул. Московян (КАСКАД)", "просп. Маштоца (Консерватория)",
                    "просп. Маштоца (Матенадаран)", "ул. Корюна (Цитадель)", "Медицинский университет", "ул. Налбандян (ЕПТУ)", "ул. Ханджяна (дом Шахмат)", "ул. Ерванда Кочара",
                    "просп. Тиграна Меца (Ташир т/ц)", "просп. Тиграна Меца (ЮКЖД)", "просп. Тиграна Меца (Каяран) (Станция)", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("31", "M", "Давидашен 4-й квартал", "Егвардское шс.", "Давидашен 1-й квартал", "ул. Тиграна Петросяна", "ул. Иосифян",
                    "ул. Алабян (перекрёсток института физики)", "ул. Алабян (ТУМО)", "ул. Алабян (Киевский мост)", "ул. Киевян (Киевский мост)", "ул. Киевян (перекрёсток Орбели)",
                    "ул. Киевян (Барекамутюн)", "ул. Касян", "просп. Комитаса (перекрёсток Гюлбенкян)", "просп. Комитаса (перекрёсток Вагаршян)", "просп. Комитаса (перекрёсток Папазян)",
                    "просп. Комитаса (Славянский университет)", "просп. Комитаса (перекрёсток Врацакан)", "просп. Комитаса (рынок Комитаса)", "просп. Комитаса (мост Ламбада)",
                    "ул. Давида Анахта (Административное деление)", "ул. Давида Анахта (Керама Марацци)", "ул. Давида Анахта (перекрёсток Дро)", "ул. Рубинянц (ул. Агаронян)",
                    "ул. Рубинянц (Ереван Сити)", "ул. Рубинянц (завод Алмаст)", "просп. Гая (Акватек)", "просп. Гая (Памятник Гаю)", "просп. Гая (салон Мерседеса)", "ул. Оганесяна",
                    "ул. Тевосяна", "ул. Кочинян", "Джрвеж", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            /////29A soon
            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("31а", "M", "завод Аракс", "Егвардское шс.", "ул. Анастаса Микояна", "Давидашен 4-й квартал",
                    "Давидашен 3-й квартал", "Армения ТВ", "ул. Алабян (перекрёсток института физики)", "ул. Маргарян (Республиканская больница)", "ул. Маргарян (ПЕГАС)", "ул. Башинджагян",
                    "ул. Мазманян", "ул. Шираза", "ул. Григор Асратян", "ул. Себастия (перекрёсток Ленинградян)", "ул. Себастия (перекрёсток Тычина)", "ул. Себастия (ярмарка Малатия)",
                    "ул. Раффи (ярмарка Малатия)", "ул. Раффи", "ул. Гусана Шерама", "ул. Оганова", "ул. Зоравар Андраник", "Юго-Западный квартал (Бангладеш)", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("32", "M", "Ариндж молл", "Аван-Ариндж", "ул. Ташкентская", "ул. Маршал Бабаджанян", "ул. Алматы",
                    "ул. Маршал Худяков", "ул. Нвер Сафарян․", "кв. Дурян", "ул. Вахтангова", "ул. Тотовенц", "ул. Степаняна", "просп. Гая (салон Мерседеса)", "ул. Бадала Мурадяна", "ул. Артем Микоян",
                    "ул.Минска  (8-й Норкский массив)", "Нор-Норк 8-й массив", "ул. Вильнюса", "Нор-Норк 7-й массив", "ул. Унана Аветисяна", "ул. Давид-Бека", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("33", "M", "Аэрация", "Ширак 5-й пер.", "сл. Геханист", "сл. Аргаванд", "просп. Исакова",
                    "ул. Арно Бабаджанян", "ул. Зоравар Андраник", "ул. Раффи", "ул. Раффи (ярмарка Малатия)", "ул. Себастия (ярмарка Малатия)",
                    "ул. Себастия (перекрёсток Кургинян)", "просп. Исакова (перекрёсток Себастия)", "Киликия автовокзал", "мост Победы", "просп. Маштоца (магазин РЫБЫ)",
                    "просп. Маштоца (Крытый рынок)", "просп. Маштоца (перекрёсток Амирян)", "просп. Маштоца (больница им. Маргаряна)", "просп. Маштоца (Опера)", "просп. Маштоца (Консерватория)",
                    "ул. Московян (Консерватория)", "ул. Абовяна (ст/м Еритасардакан (Молодёжная))", "ул. Абовяна (Сельскохозяйственная академия)", "ул. Абовяна (скверик Абовяна)", "ул. Сараландж",
                    "просп. Азатутян (Парк Победы)", "просп. Азатутян (Военкомат)", "просп. Азатутян (Наири Зарян перекрёсток)", "просп. Азатутян (Райком)",
                    "ул. Паруйра Севака", "ул. Улнеци", "ул. Эзрас Асратян", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            /////10A soon
            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("33а", "M", "Нор-Норк 1-й массив", "к/т Норк", "ул. Джугаи", "ул. Нерсон Сафаряна",
                    "просп. Гая (Памятник Гаю)", "просп. Гая (Акватек)", "ул. Рубинянц (завод Алмаст)", "ул. Рубинянц (Ереван Сити)", "ул. Паруйра Севака", "ул. Улнеци", "ул. Аветис Агаронян",
                    "просп. Азатутян (Райком)", "просп. Азатутян (Наири Зарян перекрёсток)", "просп. Азатутян (Парк Победы)", "просп. Азатутян (Военкомат)", "ул. Сараландж",
                    "ул. Абовяна (скверик Абовяна)", "ул. Абовяна (Сельскохозяйственная академия)", "ул. Абовяна (ст/м Еритасардакан (Молодёжная))", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("34", "M", "п/о МАРС", "ул. Гусана Шерама", "ул. Раффи", "ул. Раффи (ярмарка Малатия)",
                    "ул. Себастия (ярмарка Малатия)", "ул. Себастия (перекрёсток Тычина)", "ул. Себастия (перекрёсток Ленинградян)", "ул. Ленинградян (Евроваген)",
                    "ул. Ленинградян (перекрёсток Шинарарнер)", "ул. Ленинградян (перекрёсток Монте Мелконян)", "ул. Ленинградян (Киевский мост)", "ул. Киевян (Киевский мост)",
                    "ул. Киевян (перекрёсток Орбели)", "ул. Киевян (Барекамутюн)", "ул. Касян", "просп. Комитаса (перекрёсток Гюлбенкян)", "просп. Комитаса (перекрёсток Вагаршян)",
                    "просп. Комитаса (перекрёсток Папазян)", "просп. Комитаса (Славянский университет)", "просп. Комитаса (перекрёсток Врацакан)", "просп. Комитаса (рынок Комитаса)",
                    "просп. Комитаса (мост Ламбада)", "ул. Давида Анахта (Административное деление)", "ул. Давида Анахта (Керама Марацци)", "ул. Давида Анахта (перекрёсток Дро)",
                    "ул. Рубинянц (ул. Агаронян)", "ул. Рубинянц (Ереван Сити)", "ул. Рубинянц (завод Алмаст)", "ул. Царав Ахбюр", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("35", "M", "Давидашен 4-й квартал", "ул. Тиграна Петросяна", "Давидашен 1-й квартал", "ул. Иосифян",
                    "ул. Алабян (перекрёсток института физики)", "ул. Маргарян (Республиканская больница)", "ул. Маргарян (ПЕГАС)", "ул. Башинджагян", "ул. Джанибекян", "ул. Григор Асратян",
                    "ул. Себастия (перекрёсток Ленинградян)", "ул. Себастия (перекрёсток Тычина)", "ул. Себастия (ярмарка Малатия)", "ул. Раффи (ярмарка Малатия)",
                    "ул. Раффи", "ул. Гусана Шерама", "ул. Оганова", "ул. Шираза", "ул. Григор Асратян", "15 квартал", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("36", "M", "станция Спандарян", "Силикян 4-ая улица", "Силикян 10-ая улица", "Новое шоссе Силикян",
                    "ул. Себастия (перекрёсток Ленинградян)", "ул. Себастия (перекрёсток Тычина)", "ул. Себастия (ярмарка Малатия)", "ул. Раффи (ярмарка Малатия)",
                    "ул. Раффи", "ул. Арно Бабаджанян", "сл. Аргаванд", "сл. Геханист", "Аэрация", "Ширак 5-й пер.", "ул. Ширака (Ипподром)", "ул. Ширака (рынок Чарбаха)",
                    "ул. Шарури", "Завод Электрон", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("37", "M", "сл. Касах", "Аштаракское шс.", "16 квартал", "кв. Норашен", "ул. Чауша", "ул. Мелкумова", "ул. Фучика",
                    "ул. Маргарян (Республиканская больница)", "ул. Алабян (перекрёсток института физики)", "ул. Алабян (перекрёсток института физики)", "ул. Алабян (ТУМО)", "ул. Эстонакан",
                    "ул. Шинарарнери", "ул. Ленинградян (перекрёсток Шинарарнер)", "ул. Ленинградян (Евроваген)", "ул. Себастия (перекрёсток Ленинградян)",
                    "ул. Себастия (перекрёсток Тычина)", "ул. Себастия (ярмарка Малатия)", "ул. Раффи (ярмарка Малатия)", "ул. Раффи", "ул. Зоравар Андраник",
                    "ул. Арно Бабаджанян", "Эчмиадзинское шс.", "сл. Аргаванд", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("38", "M", "Центр Протезирования", "ул. Царав Ахбюр", "ул. Рубинянц (завод Алмаст)",
                    "ул. Рубинянц (Ереван Сити)", "ул. Рубинянц (ул. Агаронян)", "ул. Давида Анахта (перекрёсток Дро)", "ул. Давида Анахта (Керама Марацци)",
                    "ул. Давида Анахта (Административное деление)", "просп. Азатутян (Наири Зарян перекрёсток)", "просп. Азатутян (Военкомат)", "просп. Азатутян (Парк Победы)",
                    "ул. Сараландж", "ул. Терян", "ул. Корюна (Цитадель)", "ул. Абовяна (ст/м Еритасардакан (Молодёжная))", "просп. Саят-Нова (перекрёсток Налбандян)", "просп. Маштоца (Опера)",
                    "просп. Маштоца (больница им. Маргаряна)", "просп. Маштоца (перекрёсток Амирян)", "просп. Маштоца (Крытый рынок)", "просп. Маштоца (магазин РЫБЫ)",
                    "Григор Лусаворич (Мэрия Еревана)", "просп. Аршакуняц (Цирк)", "ул. Агатангехоси", "Педагогический университет", "просп. Тиграна Меца (к/т Айрарат)",
                    "просп. Тиграна Меца (Ташир т/ц)", "просп. Тиграна Меца (ЮКЖД)", "просп. Тиграна Меца (Каяран) (Станция)", "ул. Арцаха", "Арин-Берди 3-й пер.", "ТЭЦ", "", "", "", "", "", "",
                    "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("39", "M", "ул. Ширака (рынок Чарбаха)", "ул. Арташисян", "просп. Багратуняц (перекрёсток  Арташисян)",
                    "пл. Гарегина Нжде", "ул. Гарегина Нжде", "просп. Аршакуняц (к/т Айреник)", "просп. Аршакуняц (Ереван Молл)", "просп. Аршакуняц (парк им. Комитаса)",
                    "просп. Аршакуняц (т/ц Сурмалу)", "просп. Аршакуняц (Цирк)", "Григор Лусаворич (Цирк)", "Григор Лусаворич (Мэрия Еревана)", "ул. Паронян (Цезар палас)",
                    "ул. Паронян (м/ц Наири)", "ул. Прошян ", "просп. Баграмян (школа им. Камо)", "просп. Баграмян (SAS)", "ул. Касян",
                    "просп. Комитаса (перекрёсток Гюлбенкян)", "просп. Комитаса (перекрёсток Вагаршян)", "просп. Комитаса (перекрёсток Папазян)", "просп. Комитаса (Славянский университет)",
                    "просп. Комитаса (перекрёсток Врацакан)", "просп. Комитаса (рынок Комитаса)", "просп. Комитаса (мост Ламбада)", "ул. Ширванзаде", "Каназ военный госп.", "ул. Адонц", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("40", "M", "Нор-Норк 9-й массив", "ул. Вильнюса", "ул.Минска  (8-й Норкский массив)", "ул. Артем Микоян",
                    "ул. Галшоян", "ул. Бадала Мурадяна", "просп. Гая (салон Мерседеса)", "просп. Гая (Памятник Гаю)", "просп. Гая (Акватек)", "ул. Рубинянц (завод Алмаст)",
                    "ул. Рубинянц (Ереван Сити)", "ул. Паруйра Севака", "ул. Улнеци", "ул. Эзрас Асратян", "ул. Закария Канакерци", "Тбилисское шс. (Радиомачта)", "Газпром Армения",
                    "Северный автовокзал", "Ариндж молл", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("41", "M", "Завод Электрон", "ул. Шарури", "ул. Ширака (рынок Чарбаха)", "ул. Арташисян",
                    "ул. Манташян", "ул. Чехова", "ул. Маис 9 (ул. 9 мая)", "ул. Гарегина Нжде", "просп. Аршакуняц (к/т Айреник)", "просп. Аршакуняц (Ереван Молл)",
                    "просп. Аршакуняц (парк им. Комитаса)", "просп. Аршакуняц (т/ц Сурмалу)", "просп. Аршакуняц (Цирк)", "Григор Лусаворич (Мэрия Еревана)",
                    "просп. Маштоца (магазин РЫБЫ)", "просп. Маштоца (Крытый рынок)", "просп. Маштоца (перекрёсток Амирян)", "просп. Маштоца (больница им. Маргаряна)", "просп. Маштоца (Опера)",
                    "ул. Терян", "ул. Корюна (Цитадель)", "ул. Абовяна (ст/м Еритасардакан (Молодёжная))", "ул. Абовяна (Сельскохозяйственная академия)", "ул. Абовяна (скверик Абовяна)", "ул. Сараландж",
                    "просп. Азатутян (Парк Победы)", "просп. Азатутян (Военкомат)", "просп. Азатутян (Наири Зарян перекрёсток)", "просп. Азатутян (Райком)", "ул. Адонц",
                    "ул. Ширванзаде", "ул. Мамиконянц", "ул. Малхасянц", "комбинат Сувениров", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("42", "M", "Юго-Западный квартал (Бангладеш)", "ул. Арно Бабаджанян", "ул. Зоравар Андраник", "ул. Раффи",
                    "ул. Раффи (ярмарка Малатия)", "ул. Себастия (ярмарка Малатия)", "ул. Варужан", "ул. Ванцян", "ул. Кургиняна", "ул. Себастия (перекрёсток Кургинян)",
                    "просп. Багратуняц (перекрёсток Исаков)", "просп. Багратуняц (Ереван Сити)", "просп. Багратуняц (перекрёсток  Арташисян)", "пл. Гарегина Нжде",
                    "ул. Гарегина Нжде", "просп. Аршакуняц (к/т Айреник)", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("43", "M", "ул. Лепсиус", "Зейтун 5-ая ул.", "ул. Дро", "ул. Паруйра Севака", "ул. Улнеци",
                    "ул. Нерсисян", "просп. Азатутян (Райком)", "просп. Азатутян (Наири Зарян перекрёсток)", "просп. Азатутян (Военкомат)", "просп. Азатутян (Парк Победы)",
                    "ул. Сараландж", "ул. Абовяна (скверик Абовяна)", "ул. Абовяна (Сельскохозяйственная академия)", "ул. Абовяна (ст/м Еритасардакан (Молодёжная))", "ул. Московян (дом Камерной музыки)",
                    "ул. Ханджяна (дом Шахмат)", "Вернисаж", "ул. Ханджяна (Лунапарк)", "Педагогический университет", "просп. Тиграна Меца (к/т Айрарат)", "просп. Тиграна Меца (Ташир т/ц)",
                    "просп. Тиграна Меца (ЮКЖД)", "просп. Тиграна Меца (Каяран) (Станция)", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("44", "M", "Рабочий поселок Энергетиков", "Эчмиадзинское шс.", "ул. Арно Бабаджанян", "ул. Зоравар Андраник",
                    "ул. Раффи", "ул. Раффи (ярмарка Малатия)", "ул. Себастия (ярмарка Малатия)", "ул. Себастия (перекрёсток Кургинян)", "просп. Багратуняц (перекрёсток Исаков)",
                    "просп. Багратуняц (Ереван Сити)", "просп. Багратуняц (перекрёсток  Арташисян)", "пл. Гарегина Нжде", "ул. Гарегина Нжде", "просп. Аршакуняц (к/т Айреник)",
                    "пл. Труда (памятник Рабочему)", "Норагавит 1-ая ул.", "сл. Мармарашен", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("45", "M", "Эребуни массив ", "ул. Хахах Дона", "ул. Титоградян", "ул. Айвазовского", "ул. Эребуни",
                    "ул. Мурацан", "ул. Ростовян", "ул. Арцаха", "просп. Тиграна Меца (Каяран) (Станция)", "просп. Тиграна Меца (ЮКЖД)", "просп. Тиграна Меца (Ташир т/ц)",
                    "просп. Тиграна Меца (к/т Айрарат)", "Педагогический университет", "ул. Ханджяна (Лунапарк)", "Вернисаж", "ул. Ханджяна (дом Шахмат)",
                    "ул. Московян (дом Камерной музыки)", "ул. Абовяна (ст/м Еритасардакан (Молодёжная))", "ул. Абовяна (Сельскохозяйственная академия)", "ул. Абовяна (скверик Абовяна)",
                    "ул. Сараландж", "просп. Азатутян (Парк Победы)", "просп. Азатутян (Военкомат)", "просп. Азатутян (Наири Зарян перекрёсток)", "просп. Азатутян (Райком)",
                    "Тбилисское шс. (электроламповый завод)", "ул. Закария Канакерци", "ул. Эзрас Асратян", "ул. Улнеци", "ул. Фанарджян", "Онкологический институт", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("46", "M", "кв. Назарбекян", "Новое шоссе Силикян", "15 квартал", "ул. Шираза", "ул. Джанибекян", "ул. Шинарарнери",
                    "ул. Арзуманян", "ул. Алабян (Киевский мост)", "ул. Киевян (Киевский мост)", "ул. Киевян (перекрёсток Орбели)", "ул. Киевян (Барекамутюн)",
                    "просп. Баграмян (SAS)", "просп. Баграмян (школа им. Камо)", "просп. Баграмян (Американский университет)", "просп. Баграмян (Конституционный суд)",
                    "просп. Баграмян (Опера)", "просп. Маштоца (Опера)", "просп. Маштоца (больница им. Маргаряна)", "просп. Маштоца (перекрёсток Амирян)", "просп. Маштоца (Крытый рынок)",
                    "просп. Маштоца (магазин РЫБЫ)", "Григор Лусаворич (Мэрия Еревана)", "ул. Агатангехоси", "Педагогический университет", "ул. Ханджяна (Лунапарк)",
                    "Вернисаж", "ул. Вардананц", "ул. Ерванда Кочара", "церковь Св. Григория Просветителя", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("47", "M", "Нубарашен 11-ая ул.․", "Нубарашен 9-ая ул.", "Нубарашен 6-ая ул.", "Нубарашен шс.",
                    "ул. Хахах Дона", "ул. Титоградян", "ул. Айвазовского", "ул. Эребуни", "ул. Мурацан", "ул. Ростовян", "ул. Арцаха", "просп. Тиграна Меца (Каяран) (Станция)",
                    "просп. Тиграна Меца (ЮКЖД)", "ул. Христофора", "т/ц Петак", "просп. Аршакуняц (парк им. Комитаса)", "просп. Аршакуняц (Ереван Молл)", "просп. Аршакуняц (к/т Айреник)",
                    "пл. Труда (памятник Рабочему)", "просп. Багратуняц (памятник Рабочему)", "пл. Гарегина Нжде", "просп. Багратуняц (перекрёсток  Арташисян)",
                    "просп. Багратуняц (Ереван Сити)", "просп. Багратуняц (перекрёсток Исаков)", "ул. Себастия (перекрёсток Кургинян)", "ул. Себастия (ярмарка Малатия)",
                    "ул. Раффи (ярмарка Малатия)", "ул. Раффи", "ул. Арно Бабаджанян", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("48", "M", "Гранд Кенди", "ул. Шаамиряна", "просп. Аршакуняц (к/т Айреник)", "ул. Гарегина Нжде",
                    "пл. Гарегина Нжде", "просп. Багратуняц (перекрёсток  Арташисян)", "просп. Багратуняц (перекрёсток  Арташисян)", "просп. Багратуняц (Ереван Сити)",
                    "просп. Багратуняц (перекрёсток Исаков)", "ул. Себастия (перекрёсток Кургинян)", "ул. Себастия (ярмарка Малатия)", "ул. Себастия (перекрёсток Тычина)",
                    "ул. Себастия (перекрёсток Ленинградян)", "ул. Ленинградян (Евроваген)", "ул. Ленинградян (перекрёсток Шинарарнер)", "ул. Шинарарнери", "ул. Арзуманян",
                    "ул. Алабян (Киевский мост)", "ул. Алабян (ТУМО)", "ул. Алабян (перекрёсток института физики)", "ул. Маргарян (Республиканская больница)", "ул. Маргарян (ПЕГАС)",
                    "ул. Башинджагян", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("49", "M", "Неркин (Нижний) Шенгавит 11-ая ул.", "Неркин (Нижний) Шенгавит 9-ая ул.", "м/с Шенгавит", "ул. Таронцу",
                    "просп. Багратуняц (памятник Рабочему)", "пл. Гарегина Нжде", "ул. Гарегина Нжде", "ул. Арцаха", "просп. Тиграна Меца (Каяран) (Станция)", "просп. Тиграна Меца (ЮКЖД)",
                    "просп. Тиграна Меца (Ташир т/ц)", "просп. Тиграна Меца (к/т Айрарат)", "Педагогический университет", "ул. Ханджяна (Лунапарк)", "Вернисаж",
                    "просп. Саят-Нова (перекрёсток Алек-Манукян)", "ул. Чаренца (салон-магазин Zigzag)", "ул. Чаренца (ЕГУ)", "ул. Чаренца (Полиция РА)",
                    "Медицинский университет", "ул. Корюна (Цитадель)", "просп. Маштоца (Матенадаран)", "просп. Маштоца (Консерватория)", "просп. Маштоца (Опера)", "просп. Баграмян (Опера)",
                    "просп. Баграмян (Конституционный суд)", "просп. Баграмян (Американский университет)", "просп. Баграмян (школа им. Камо)", "просп. Баграмян (SAS)",
                    "ул. Касян", "ЕРНИИММ им. Мергеляна", "ул. Акоп Акопян", "ул. Арама Хачатуряна", "ул. Риги", "Российско-Армянский университет", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("50", "M", "Часовой завод", "ул. Ахпюр Сероб", "ул. Гюльбенкяна",
                    "просп. Комитаса (перекрёсток Гюлбенкян)", "просп. Комитаса (перекрёсток Вагаршян)", "просп. Комитаса (перекрёсток Папазян)", "просп. Комитаса (Славянский университет)",
                    "просп. Комитаса (перекрёсток Врацакан)", "просп. Комитаса (рынок Комитаса)", "просп. Комитаса (мост Ламбада)", "просп. Азатутян (Наири Зарян перекрёсток)",
                    "просп. Азатутян (Военкомат)", "просп. Азатутян (Парк Победы)", "ул. Сараландж", "ул. Абовяна (скверик Абовяна)", "ул. Абовяна (Сельскохозяйственная академия)",
                    "ул. Абовяна (ст/м Еритасардакан (Молодёжная))", "ул. Московян (дом Камерной музыки)", "ул. Ханджяна (дом Шахмат)", "Вернисаж", "ул. Ханджяна (Лунапарк)",
                    "Педагогический университет", "просп. Тиграна Меца (к/т Айрарат)", "просп. Тиграна Меца (Ташир т/ц)", "просп. Тиграна Меца (ЮКЖД)", "просп. Тиграна Меца (Каяран) (Станция)",
                    "ул. Арцаха", "ул. Эребуни", "ул. Айвазовского", "ул. Титоградян", "ул. Хахах Дона", "Эребуни массив", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("52", "M", "кв. Назарбекян", "Новое шоссе Силикян", "15 квартал", "ул. Чауша", "ул. Мелкумова",
                    "ул. Бекназарян", "ул. Мазманян", "ул. Шираза", "ул. Григор Асратян", "ул. Себастия (перекрёсток Ленинградян)", "ул. Себастия (перекрёсток Тычина)",
                    "ул. Себастия (ярмарка Малатия)", "ул. Себастия (перекрёсток Кургинян)", "просп. Багратуняц (перекрёсток Исаков)", "просп. Багратуняц (Ереван Сити)",
                    "просп. Багратуняц (перекрёсток  Арташисян)", "пл. Гарегина Нжде", "просп. Багратуняц (памятник Рабочему)", "пл. Труда (памятник Рабочему)",
                    "просп. Аршакуняц (по напр. Чарбах)", "Аэропорт Эребуни", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("52а", "M", "кв. Назарбекян", "ул. Чауша", "ул. Мазманян", "ул. Башинджагян", "ул. Маргарян (ПЕГАС)",
                    "ул. Маргарян (Республиканская больница)", "ул. Алабян (перекрёсток института физики)", "ул. Алабян (ТУМО)", "ул. Алабян (Киевский мост)", "ул. Киевян (Киевский мост)",
                    "ул. Киевян (перекрёсток Орбели)", "ул. Киевян (Барекамутюн)", "ул. Грачья Кочар (перекрёсток Гюльбенкян)", "ул. Грачья Кочар (перекрёсток Вагаршян)",
                    "ул. Грачья Кочар (перекрёсток Папазян)", "ул. Грачья Кочар (перекрёсток Врацакан)", "зд. Биржы", "ул. Наири Зарян", "ул. Грибоедова",
                    "просп. Комитаса (рынок Комитаса)", "просп. Комитаса (мост Ламбада)", "просп. Азатутян (Райком)", "ул. Нерсисян", "ул. Улнеци", "ул. Паруйра Севака",
                    "ул. Рубинянц (Ереван Сити)", "ул. Рубинянц (завод Алмаст)", "просп. Гая (Акватек)", "просп. Гая (Памятник Гаю)", "просп. Гая (салон Мерседеса)", "ул. Гюликехвян",
                    "Нор-Норк 4-й массив", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("53", "M", "Джрвеж", "ул. Кочинян", "ул. Багреванда", "ул. Молдовакан", "просп. Гая (салон Мерседеса)",
                    "ул. Бадала Мурадяна", "ул. Давид-Бека", "ул. Ростовян", "мост Встреча", "пл. Труда (памятник Рабочему)", "просп. Багратуняц (памятник Рабочему)",
                    "пл. Гарегина Нжде", "ул. Манандян", "ул. Г. Овсепян", "ул. Чехова", "ул. Арташисян", "ул. Оганесяна", "Верин Чарбах (Верхний Чарбах)", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("54", "M", "Давидашен 4-й квартал", "Егвардское шс.", "ул. Тиграна Петросяна", "Давидашен 1-й квартал",
                    "ул. Сасна Црер", "Армения ТВ", "ул. Алабян (перекрёсток института физики)", "ул. Алабян (ТУМО)", "ул. Алабян (Киевский мост)", "ул. Киевян (Киевский мост)",
                    "ул. Киевян (перекрёсток Орбели)", "ул. Киевян (Барекамутюн)", "просп. Баграмян (SAS)", "просп. Баграмян (школа им. Камо)", "ул. Прошян ",
                    "ул. Паронян (м/ц Наири)", "ул. Паронян (Цезар палас)", "Григор Лусаворич (Мэрия Еревана)", "Григор Лусаворич (Цирк)", "ул. Агатангехоси",
                    "просп. Тиграна Меца (к/т Айрарат)", "просп. Тиграна Меца (Ташир т/ц)", "просп. Тиграна Меца (ЮКЖД)", "просп. Тиграна Меца (Каяран) (Станция)", "ул. Сасунци Давид",
                    "ул. Азатамартикнери", "ул. Эребуни", "музей Эребуни", "ул. Маари", "сл. Джрашен", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("55", "M", "Нор-Норк 2-й массив", "ул. Молдовакан", "ул. Степаняна", "просп. Гая (Памятник Гаю)",
                    "просп. Гая (Акватек)", "просп. Мясникяна (Джрашхар)", "просп. Мясникяна (ЗООПАРК)", "просп. Мясникяна (перекрёсток Гераци)", "ул. Абовяна (скверик Абовяна)",
                    "ул. Абовяна (Сельскохозяйственная академия)", "ул. Абовяна (ст/м Еритасардакан (Молодёжная))", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("56", "M", "комбинат Молока", "сл. Ахтанак ул. 8", "сл. Ахтанак ул. 3",
                    "сл. Ахтанак ул. 10", "сл. Ахтанак ул. 9", "сл. Ахтанак ул. 2", "сл. Ахтанак ул. 1", "ул. Оганова", "ул. Зоравар Андраник", "ул. Раффи",
                    "ул. Раффи (ярмарка Малатия)", "ул. Себастия (ярмарка Малатия)", "ул. Себастия (перекрёсток Тычина)", "ул. Себастия (перекрёсток Ленинградян)",
                    "ул. Ленинградян (Евроваген)", "ул. Ленинградян (перекрёсток Шинарарнер)", "ул. Ленинградян (перекрёсток Монте Мелконян)", "ул. Ленинградян (Киевский мост)",
                    "ул. Киевян (Киевский мост)", "ул. Киевян (перекрёсток Орбели)", "ул. Киевян (Барекамутюн)", "ул. Грачья Кочар (перекрёсток Гюльбенкян)",
                    "ул. Грачья Кочар (перекрёсток Вагаршян)", "ул. Грачья Кочар (перекрёсток Папазян)", "ул. Грачья Кочар (перекрёсток Врацакан)", "зд. Биржы",
                    "ул. Наири Зарян", "ул. Грибоедова", "просп. Комитаса (рынок Комитаса)", "просп. Комитаса (мост Ламбада)", "ул. Давида Анахта (Административное деление)",
                    "ул. Давида Анахта (Керама Марацци)", "ул. Давида Анахта (перекрёсток Дро)", "ул. Рубинянц (ул. Агаронян)", "ул. Рубинянц (Ереван Сити)",
                    "ул. Рубинянц (завод Алмаст)", "ул. Ачаряна", "ул. Маршал Бабаджанян", "ул. Ташкентская", "Аван-Ариндж", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("57", "M", "Давидашен 1-й квартал", "ул. Агабабян", "ул. Тиграна Петросяна", "ул. Иосифян",
                    "ул. Алабян (перекрёсток института физики)", "ул. Маргарян (Республиканская больница)", "ул. Маргарян (ПЕГАС)", "ул. Башинджагян", "ул. Джанибекян", "ул. Григор Асратян",
                    "ул. Себастия (перекрёсток Ленинградян)", "ул. Себастия (перекрёсток Тычина)", "ул. Себастия (ярмарка Малатия)", "ул. Себастия (перекрёсток Кургинян)",
                    "просп. Багратуняц (перекрёсток Исаков)", "просп. Багратуняц (Ереван Сити)", "просп. Багратуняц (перекрёсток  Арташисян)", "ул. Арташисян",
                    "ул. Ширака (аэропорт Эребуни)", "просп. Аршакуняц (по напр. Чарбах)", "Норагавит 1-ая ул.", "Арташатское шс.", "сл. Айнтап", "г. Масис", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("58", "M", "Нор-Норк 8-й массив", "ул.Минска  (8-й Норкский массив)", "ул. Артем Микоян",
                    "ул. Бадала Мурадяна", "просп. Гая (салон Мерседеса)", "просп. Гая (Памятник Гаю)", "просп. Гая (Акватек)", "ул. Рубинянц (завод Алмаст)", "ул. Рубинянц (Ереван Сити)",
                    "ул. Рубинянц (ул. Агаронян)", "ул. Давида Анахта (перекрёсток Дро)", "ул. Давида Анахта (Керама Марацци)", "ул. Давида Анахта (Административное деление)",
                    "просп. Комитаса (мост Ламбада)", "просп. Комитаса (рынок Комитаса)", "просп. Комитаса (перекрёсток Врацакан)", "просп. Комитаса (Славянский университет)",
                    "просп. Комитаса (перекрёсток Папазян)", "просп. Комитаса (перекрёсток Вагаршян)", "просп. Комитаса (перекрёсток Гюлбенкян)", "ул. Касян", "ул. Киевян (Барекамутюн)",
                    "ул. Киевян (перекрёсток Орбели)", "ул. Киевян (Киевский мост)", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("59", "M", "м/р Св. Григор Лусаворич", "ул. Гюрджян ", "ул. Багян",
                    "просп. Гая (салон Мерседеса)", "просп. Гая (Памятник Гаю)", "просп. Гая (Акватек)", "ул. Рубинянц (завод Алмаст)", "ул. Рубинянц (Ереван Сити)", "ул. Паруйра Севака",
                    "просп. Азатутян (Райком)", "просп. Комитаса (мост Ламбада)", "просп. Комитаса (рынок Комитаса)", "просп. Комитаса (перекрёсток Врацакан)",
                    "просп. Комитаса (Славянский университет)", "просп. Комитаса (перекрёсток Папазян)", "просп. Комитаса (перекрёсток Вагаршян)", "просп. Комитаса (перекрёсток Гюлбенкян)",
                    "ул. Касян", "ул. Киевян (Барекамутюн)", "ул. Киевян (перекрёсток Орбели)", "ул. Киевян (Киевский мост)", "ул. Ленинградян (Киевский мост)",
                    "шоссе Цицернакаберд", "Далма Гарден Молл", "ул. Атенка", "стадион Раздан", "Киликия автовокзал", "просп. Исакова", "просп. Исакова (перекрёсток Себастия)",
                    "ул. Себастия (перекрёсток Кургинян)", "ул. Кургиняна", "ул. Ванцян", "ул. Варужан", "ул. Себастия (ярмарка Малатия)", "ул. Раффи (ярмарка Малатия)",
                    "ул. Раффи", "ул. Гусана Шерама", "ул. Оганова", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("60", "M", "Нубарашен шс. (В/Ч)", "ул. Хачика Даштенца", "музей Эребуни", "ул. Эребуни",
                    "ул. Мурацан", "ул. Сасунци Давид", "просп. Тиграна Меца (Каяран) (Станция)", "ул. Христофора", "ул. Нар-Дос (перекресток Силачи)", "ул. Хоренаци (Силачи)",
                    "ул. Чаренца (салон-магазин Zigzag)", "ул. Чаренца (ЕГУ)", "ул. Чаренца (Полиция РА)", "Медицинский университет", "ул. Абовяна (Сельскохозяйственная академия)",
                    "ул. Абовяна (скверик Абовяна)", "просп. Багратуняц (памятник Рабочему)", "пл. Труда (памятник Рабочему)", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("61", "M", "сл. Вардашен", "Вардашен ул. 9-ая", "Вардашен ул. 6-ая", "ул. Маари",
                    "музей Эребуни", "ул. Эребуни", "ул. Мурацан", "ул. Ростовян", "мост Встреча", "ул. Гарегина Нжде", "пл. Гарегина Нжде",
                    "просп. Багратуняц (памятник Рабочему)", "пл. Труда (памятник Рабочему)", "просп. Аршакуняц (по напр. Чарбах)", "Аэропорт Эребуни", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("62", "M", "Канакер 13-ая ул.", "ул. Закария Канакерци", "Тбилисское шс. (электроламповый завод)",
                    "просп. Азатутян (Райком)", "просп. Комитаса (мост Ламбада)", "просп. Комитаса (рынок Комитаса)", "зд. Биржы", "ул. Грачья Кочар (перекрёсток Врацакан)",
                    "ул. Грачья Кочар (перекрёсток Папазян)", "ул. Грачья Кочар (перекрёсток Вагаршян)", "ул. Грачья Кочар (перекрёсток Гюльбенкян)", "просп. Баграмян (SAS)",
                    "просп. Баграмян (школа им. Камо)", "просп. Баграмян (Американский университет)", "просп. Баграмян (Конституционный суд)", "просп. Баграмян (Опера)", "просп. Маштоца (Опера)",
                    "просп. Маштоца (больница им. Маргаряна)", "просп. Маштоца (перекрёсток Амирян)", "Площадь Республики", "ул. Вазгена Саргсяна", "ул. Хоренаци (пл. Шаумяна)",
                    "ул. Агатангехоси", "Педагогический университет", "просп. Тиграна Меца (к/т Айрарат)", "просп. Тиграна Меца (Ташир т/ц)", "ул. Ерванда Кочара", "церковь Св. Григория Просветителя",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("63", "M", "ул. Оганова", "ул. Гусана Шерама", "ул. Раффи", "ул. Раффи (ярмарка Малатия)",
                    "ул. Себастия (ярмарка Малатия)", "ул. Себастия (перекрёсток Тычина)", "ул. Себастия (перекрёсток Ленинградян)", "ул. Ленинградян (Евроваген)",
                    "ул. Ленинградян (перекрёсток Шинарарнер)", "ул. Ленинградян (перекрёсток Монте Мелконян)", "ул. Ленинградян (Киевский мост)", "ул. Киевян (Киевский мост)",
                    "ул. Киевян (перекрёсток Орбели)", "ул. Киевян (Барекамутюн)", "ул. Касян", "просп. Комитаса (перекрёсток Гюлбенкян)", "просп. Комитаса (перекрёсток Вагаршян)",
                    "просп. Комитаса (перекрёсток Папазян)", "просп. Комитаса (Славянский университет)", "просп. Комитаса (перекрёсток Врацакан)", "просп. Комитаса (рынок Комитаса)",
                    "просп. Комитаса (мост Ламбада)", "просп. Азатутян (Райком)", "ул. Аветис Агаронян", "ул. Улнеци", "ул. Паруйра Севака", "ул. Рубинянц (Ереван Сити)",
                    "ул. Рубинянц (завод Алмаст)", "просп. Гая (Акватек)", "просп. Гая (Памятник Гаю)", "ул. Степаняна", "ул. Молдовакан", "Нор-Норк 2-й массив", "", "", "", "", "", "", "",
                    "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("64", "M", "16 квартал", "кв. Норашен", "ул. Мелкумова", "ул. Бекназарян", "ул. Башинджагян",
                    "ул. Маргарян (ПЕГАС)", "ул. Маргарян (Республиканская больница)", "ул. Алабян (перекрёсток института физики)", "ул. Алабян (ТУМО)", "ул. Алабян (Киевский мост)",
                    "ул. Киевян (Киевский мост)", "ул. Киевян (перекрёсток Орбели)", "ул. Киевян (Барекамутюн)", "просп. Баграмян (SAS)", "просп. Баграмян (школа им. Камо)",
                    "ул. Прошян ", "ул. Паронян (м/ц Наири)", "ул. Паронян (Цезар палас)", "Григор Лусаворич (Мэрия Еревана)", "Григор Лусаворич (Цирк)",
                    "ул. Агатангехоси", "просп. Тиграна Меца (к/т Айрарат)", "просп. Тиграна Меца (Ташир т/ц)", "ул. Ерванда Кочара", "ул. Алека Манукяна", "ЕГУ", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("65", "M", "Аэрация", "Ширак 5-й пер.", "ул. Ширака (Ипподром)", "ул. Ширака (рынок Чарбаха)",
                    "ул. Арташисян", "просп. Багратуняц (перекрёсток  Арташисян)", "пл. Гарегина Нжде", "ул. Гарегина Нжде", "просп. Аршакуняц (к/т Айреник)",
                    "просп. Аршакуняц (Ереван Молл)", "просп. Аршакуняц (парк им. Комитаса)", "просп. Аршакуняц (т/ц Сурмалу)", "просп. Аршакуняц (Цирк)", "ул. Агатангехоси",
                    "Педагогический университет", "ул. Ханджяна (Лунапарк)", "Вернисаж", "ул. Ханджяна (дом Шахмат)", "ул. Московян (дом Камерной музыки)",
                    "ул. Абовяна (ст/м Еритасардакан (Молодёжная))", "ул. Абовяна (Сельскохозяйственная академия)", "ул. Абовяна (скверик Абовяна)", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("66", "M", "Нор-Норк 9-й массив", "ул. Вильнюса", "Нор-Норк 7-й массив", "ул. Унана Аветисяна", "ул. Давид-Бека",
                    "ул. Бадала Мурадяна", "просп. Гая (салон Мерседеса)", "просп. Гая (Памятник Гаю)", "просп. Гая (Акватек)", "ул. Рубинянц (завод Алмаст)", "ул. Рубинянц (Ереван Сити)",
                    "ул. Рубинянц (ул. Агаронян)", "ул. Давида Анахта (перекрёсток Дро)", "ул. Давида Анахта (Керама Марацци)", "ул. Давида Анахта (Административное деление)",
                    "просп. Комитаса (мост Ламбада)", "просп. Комитаса (рынок Комитаса)", "просп. Комитаса (перекрёсток Врацакан)", "просп. Комитаса (Славянский университет)",
                    "просп. Комитаса (перекрёсток Папазян)", "просп. Комитаса (перекрёсток Вагаршян)", "просп. Комитаса (перекрёсток Гюлбенкян)", "ул. Гюльбенкяна",
                    "ул. Грачья Кочар (перекрёсток Гюльбенкян)", "ул. Касян", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("67", "M", "ул. Араратян", "ул. Ширака (аэропорт Эребуни)", "ул. Арташисян",
                    "просп. Багратуняц (перекрёсток  Арташисян)", "просп. Багратуняц (Ереван Сити)", "просп. Багратуняц (перекрёсток Исаков)", "ул. Себастия (перекрёсток Кургинян)",
                    "ул. Себастия (ярмарка Малатия)", "ул. Раффи (ярмарка Малатия)", "ул. Раффи", "ул. Зоравар Андраник", "ул. Оганова", "ул. Гусана Шерама",
                    "ул. Арно Бабаджанян", "Эчмиадзинское шс.", "сл. Паракар", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("68", "M", "Эребуни массив ", "ул. Хахах Дона", "ул. Титоградян", "ул. Айвазовского", "ул. Эребуни",
                    "ул. Азатамартикнери", "ул. Сасунци Давид", "просп. Тиграна Меца (Каяран) (Станция)", "просп. Тиграна Меца (ЮКЖД)", "просп. Тиграна Меца (Ташир т/ц)",
                    "просп. Тиграна Меца (к/т Айрарат)", "Педагогический университет", "ул. Агатангехоси", "Григор Лусаворич (Цирк)", "Григор Лусаворич (Мэрия Еревана)",
                    "мост Победы", "просп. Исакова", "Киликия автовокзал", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("69", "M", "Нор-Норк 9-й массив", "ул. Вильнюса", "Нор-Норк 7-й массив", "ул. Унана Аветисяна", "ул. Давид-Бека",
                    "ул. Бадала Мурадяна", "просп. Гая (салон Мерседеса)", "просп. Гая (Памятник Гаю)", "просп. Гая (Акватек)", "просп. Мясникяна (Джрашхар)",
                    "просп. Мясникяна (ЗООПАРК)", "просп. Мясникяна (перекрёсток Гераци)", "ул. Абовяна (скверик Абовяна)", "ул. Абовяна (Сельскохозяйственная академия)",
                    "ул. Абовяна (ст/м Еритасардакан (Молодёжная))", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("70", "M", "Юго-Западный квартал (Бангладеш)", "ул. Зоравар Андраник", "ул. Раффи", "ул. Раффи (ярмарка Малатия)",
                    "ул. Себастия (ярмарка Малатия)", "ул. Себастия (перекрёсток Тычина)", "ул. Себастия (перекрёсток Ленинградян)", "ул. Ленинградян (Евроваген)",
                    "ул. Ленинградян (перекрёсток Шинарарнер)", "ул. Ленинградян (перекрёсток Монте Мелконян)", "шоссе Цицернакаберд", "Далма Гарден Молл", "ул. Атенка",
                    "стадион Раздан", "мост Победы", "просп. Маштоца (магазин РЫБЫ)", "просп. Маштоца (Крытый рынок)", "просп. Маштоца (перекрёсток Амирян)", "просп. Маштоца (больница им. Маргаряна)",
                    "просп. Маштоца (Опера)", "просп. Маштоца (Консерватория)", "ул. Московян (Консерватория)", "ул. Абовяна (ст/м Еритасардакан (Молодёжная))", "ул. Абовяна (Сельскохозяйственная академия)",
                    "ул. Абовяна (скверик Абовяна)", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("71", "M", "Юго-Западный квартал (Бангладеш)", "ул. Арно Бабаджанян", "ул. Зоравар Андраник", "ул. Раффи",
                    "ул. Раффи (ярмарка Малатия)", "ул. Себастия (ярмарка Малатия)", "ул. Себастия (перекрёсток Тычина)", "ул. Себастия (перекрёсток Ленинградян)",
                    "ул. Ленинградян (Евроваген)", "ул. Ленинградян (перекрёсток Шинарарнер)", "ул. Ленинградян (перекрёсток Монте Мелконян)", "ул. Ленинградян (Киевский мост)",
                    "ул. Киевян (Киевский мост)", "ул. Киевян (перекрёсток Орбели)", "ул. Киевян (Барекамутюн)", "ул. Касян", "просп. Комитаса (перекрёсток Гюлбенкян)",
                    "просп. Комитаса (перекрёсток Вагаршян)", "просп. Комитаса (перекрёсток Папазян)", "просп. Комитаса (Славянский университет)", "просп. Комитаса (перекрёсток Врацакан)",
                    "просп. Комитаса (рынок Комитаса)", "просп. Комитаса (мост Ламбада)", "просп. Азатутян (Наири Зарян перекрёсток)", "просп. Азатутян (Военкомат)",
                    "просп. Азатутян (Парк Победы)", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("72", "M", "сл. Мушаван", "сл. Вардашен", "ул. Маари", "музей Эребуни", "ул. Эребуни",
                    "ул. Азатамартикнери", "ул. Сасунци Давид", "ул. Арцаха", "мост Встреча", "ул. Гарегина Нжде", "пл. Гарегина Нжде",
                    "просп. Багратуняц (перекрёсток  Арташисян)", "просп. Багратуняц (Ереван Сити)", "просп. Багратуняц (перекрёсток Исаков)", "ул. Себастия (перекрёсток Кургинян)",
                    "ул. Себастия (ярмарка Малатия)", "ул. Раффи (ярмарка Малатия)", "ул. Раффи", "ул. Гусана Шерама", "ул. Тичина", "ул. Романос Меликян", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("73", "M", "Эребуни массив ", "ул. Хахах Дона", "ул. Титоградян", "ул. Айвазовского", "ул. Эребуни",
                    "ул. Азатамартикнери", "ул. Сасунци Давид", "просп. Тиграна Меца (Каяран) (Станция)", "просп. Тиграна Меца (ЮКЖД)", "просп. Тиграна Меца (Ташир т/ц)", "просп. Тиграна Меца (к/т Айрарат)",
                    "Педагогический университет", "ул. Ханджяна (Лунапарк)", "Вернисаж", "ул. Ханджяна (дом Шахмат)", "ул. Московян (дом Камерной музыки)",
                    "ул. Абовяна (ст/м Еритасардакан (Молодёжная))", "ул. Абовяна (Сельскохозяйственная академия)", "ул. Абовяна (скверик Абовяна)", "просп. Мясникяна (перекрёсток Гераци)",
                    "просп. Мясникяна (ЗООПАРК)", "просп. Мясникяна (Джрашхар)", "просп. Гая (Памятник Гаю)", "просп. Гая (салон Мерседеса)", "ул. Багян", "ул. Гюрджян",
                    "ул. Шопрона", "ул. Давид-Бека", "ул. Унана Аветисяна", "Нор-Норк 7-й массив", "ул. Вильнюса", "Нор-Норк 9-й массив", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("74", "M", "сл. Зовуни", "Егвардское шс.", "Зовуни 6-ая ул.", "Зовуни 39-ая ул.", "Зовуни 8-ая ул.",
                    "Давидашен 4-й квартал", "ул. Тиграна Петросяна", "Давидашен 1-й квартал", "ул. Иосифян", "ул. Алабян (перекрёсток института физики)", "ул. Алабян (ТУМО)", "ул. Алабян (Киевский мост)",
                    "ул. Ленинградян (Киевский мост)", "шоссе Цицернакаберд", "Далма Гарден Молл", "ул. Атенка", "стадион Раздан", "мост Победы",
                    "Григор Лусаворич (Мэрия Еревана)", "Григор Лусаворич (Цирк)", "ул. Агатангехоси", "просп. Тиграна Меца (к/т Айрарат)", "просп. Тиграна Меца (Ташир т/ц)",
                    "просп. Тиграна Меца (ЮКЖД)", "ул. Христофора", "т/ц Петак", "просп. Аршакуняц (парк им. Комитаса)", "просп. Аршакуняц (Ереван Молл)", "просп. Аршакуняц (к/т Айреник)",
                    "мост Встреча", "ул. Ростовян", "ул. Атоян", "ул. Эребуни", "ул. Айвазовского", "ул. Титоградян", "ул. Хахах Дона", "Эребуни массив", "", "", "", "", "",
                    "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("75", "M", "ул. Тичина", "ул. Зоравар Андраник", "ул. Оганова", "ул. Гусана Шерама", "ул. Раффи",
                    "ул. Раффи (ярмарка Малатия)", "ул. Себастия (ярмарка Малатия)", "ул. Себастия (перекрёсток Кургинян)", "просп. Исакова (перекрёсток Себастия)",
                    "Киликия автовокзал", "мост Победы", "просп. Маштоца (магазин РЫБЫ)", "просп. Маштоца (Крытый рынок)", "просп. Маштоца (перекрёсток Амирян)",
                    "просп. Маштоца (больница им. Маргаряна)", "просп. Маштоца (Опера)", "просп. Маштоца (Консерватория)", "просп. Маштоца (Матенадаран)", "ул. Корюна (Цитадель)",
                    "Медицинский университет", "ул. Чаренца (Полиция РА)", "ул. Гераци", "ул. Арменак Арменакяна", "Норк сады 1-й переход", "мед. центр Норк-Мараш", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("76", "M", "Юго-Западный квартал (Бангладеш)", "ул. Зоравар Андраник", "ул. Раффи", "ул. Раффи (ярмарка Малатия)",
                    "ул. Себастия (ярмарка Малатия)", "ул. Себастия (перекрёсток Тычина)", "ул. Себастия (перекрёсток Ленинградян)", "ул. Ленинградян (Евроваген)",
                    "ул. Ленинградян (перекрёсток Шинарарнер)", "ул. Ленинградян (перекрёсток Монте Мелконян)", "ул. Ленинградян (Киевский мост)", "ул. Киевян (Киевский мост)",
                    "ул. Орбели", "просп. Баграмян (школа им. Камо)", "просп. Баграмян (Американский университет)", "просп. Баграмян (Конституционный суд)", "просп. Баграмян (Опера)",
                    "просп. Маштоца (Опера)", "просп. Маштоца (Консерватория)", "просп. Маштоца (Матенадаран)", "ул. Корюна (Цитадель)", "Медицинский университет",
                    "ул. Чаренца (Полиция РА)", "ул. Чаренца (ЕГУ)", "ул. Чаренца (салон-магазин Zigzag)", "просп. Саят-Нова (перекрёсток Алек-Манукян)",
                    "ул. Алека Манукяна", "ул. Ерванда Кочара", "просп. Тиграна Меца (Ташир т/ц)", "ул. Христофора", "т/ц Петак", "ул. Севан", "", "", "", "", "", "", "", "", "", "", "",
                    "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("77", "M", "Аван-Ариндж", "ул. Ташкентская", "ул. Маршал Бабаджанян", "ул. Маршал Худяков",
                    "Ботанический сад", "просп. Мясникяна (Джрашхар)", "просп. Мясникяна (ЗООПАРК)", "просп. Мясникяна (перекрёсток Гераци)", "ул. Абовяна (скверик Абовяна)",
                    "ул. Абовяна (Сельскохозяйственная академия)", "Медицинский университет", "ул. Чаренца (Полиция РА)", "ул. Чаренца (ЕГУ)", "ул. Чаренца (салон-магазин Zigzag)",
                    "просп. Саят-Нова (перекрёсток Алек-Манукян)", "ул. Ханджяна (дом Шахмат)", "Вернисаж", "ул. Ханджяна (Лунапарк)", "Педагогический университет",
                    "ул. Агатангехоси", "просп. Аршакуняц (Цирк)", "Григор Лусаворич (Мэрия Еревана)", "мост Победы", "стадион Раздан", "ул. Атенка",
                    "Далма Гарден Молл", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            //////56A soon
            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("99", "M", "Юго-Западный квартал (Бангладеш)", "Ераблур", "4-ая ул. Шаумян", "ул. Арно Бабаджанян", "ул. Раффи", "ул. Раффи (ярмарка Малатия)",
                    "ул. Себастия (ярмарка Малатия)", "ул. Себастия (перекрёсток Кургинян)", "просп. Исакова", "Киликия автовокзал", "мост Победы", "ул. Аргишти",
                    "Григор Лусаворич (Мэрия Еревана)", "просп. Аршакуняц (Цирк)", "ул. Агатангехоси", "Педагогический университет", "ул. Ханджяна (Лунапарк)",
                    "Вернисаж", "ул. Ханджяна (дом Шахмат)", "ул. Московян (дом Камерной музыки)", "ул. Абовяна (ст/м Еритасардакан (Молодёжная))", "ул. Абовяна (Сельскохозяйственная академия)",
                    "ул. Абовяна (скверик Абовяна)", "ул. Сараландж", "просп. Азатутян (Парк Победы)", "просп. Азатутян (Военкомат)", "просп. Азатутян (Наири Зарян перекрёсток)",
                    "просп. Азатутян (Райком)", "ул. Нерсисян", "мед. центр Канакер-Зейтун", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            ///60A soon
//            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("101", "M", "Северный автовокзал", "Газпром Армения", "Тбилисское шс. (Радиомачта)",
//                    "ул. Закария Канакерци", "просп. Азатутян (Райком)", "просп. Комитаса (мост Ламбада)","просп. Комитаса (рынок Комитаса)", "просп. Комитаса (перекрёсток Врацакан)",
//                    "просп. Комитаса (Славянский университет)", "просп. Комитаса (перекрёсток Папазян)", "просп. Комитаса (перекрёсток Вагаршян)", "просп. Комитаса (перекрёсток Гюлбенкян)",
//                    "ул. Касян", "ул. Киевян (Барекамутюн)", "ул. Киевян (перекрёсток Орбели)", "ул. Киевян (Киевский мост)", "ул. Ленинградян (Киевский мост)",
//                    "ул. Ленинградян (перекрёсток Монте Мелконян)", "ул. Ленинградян (перекрёсток Шинарарнер)", "ул. Ленинградян (Евроваген)", "ул. Себастия (перекрёсток Ленинградян)",
//                    "ул. Себастия (перекрёсток Тычина)", "ул. Себастия (ярмарка Малатия)", "ул. Раффи (ярмарка Малатия)", "ул. Раффи", "Юго-Западный квартал (Бангладеш)", "", "", "", "", "", "", "", "",
//                    "", "", "", "", "", "", "", "", "", "", ""));

            ///50A soon
//            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("110", "M", "ул. Зоравар Андраник", "ул. Оганова", "ул. Гусана Шерама", "ул. Раффи",
//                    "ул. Раффи (ярмарка Малатия)", "ул. Себастия (ярмарка Малатия)", "ул. Себастия (перекрёсток Тычина)", "ул. Себастия (перекрёсток Ленинградян)",
//                    "ул. Ленинградян (Евроваген)", "ул. Ленинградян (перекрёсток Шинарарнер)", "ул. Ленинградян (перекрёсток Шинарарнер)", "ул. Ленинградян (перекрёсток Монте Мелконян)",
//                    "шоссе Цицернакаберд", "Далма Гарден Молл", "ул. Атенка", "стадион Раздан", "мост Победы", "ул. Аргишти", "Григор Лусаворич (Мэрия Еревана)",
//                    "Григор Лусаворич (Цирк)", "ул. Агатангехоси", "просп. Тиграна Меца (к/т Айрарат)", "просп. Тиграна Меца (Ташир т/ц)", "ул. Ерванда Кочара", "ул. Алека Манукяна",
//                    "просп. Саят-Нова (перекрёсток Алек-Манукян)", "ул. Чаренца (ЕГУ)", "ул. Чаренца (салон-магазин Zigzag)", "ул. Чаренца (Полиция РА)", "Медицинский университет",
//                    "ул. Корюна (Цитадель)", "ул. Терян", "ул. Абовяна (скверик Абовяна)", "", "", "", "", "", "", "", "", "", "", "", ""));

            ///25A soon
            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("114", "M", "ул. Давида Анахта (Керама Марацци)", "ул. Улнеци (по напр. Монумент)",
                    "ул. Генерала Бабаяна", "просп. Азатутян (Военкомат)", "просп. Азатутян (Наири Зарян перекрёсток)", "просп. Комитаса (мост Ламбада)",
                    "просп. Комитаса (рынок Комитаса)", "ул. Грибоедова", "ул. Наири Зарян", "зд. Биржы", "ул. Грачья Кочар (перекрёсток Врацакан)",
                    "ул. Грачья Кочар (перекрёсток Папазян)", "ул. Грачья Кочар (перекрёсток Вагаршян)", "ул. Грачья Кочар (перекрёсток Гюльбенкян)",
                    "ул. Киевян (Барекамутюн)", "ул. Киевян (перекрёсток Орбели)", "ул. Киевян (Киевский мост)", "ул. Ленинградян (Киевский мост)",
                    "ул. Ленинградян (перекрёсток Монте Мелконян)", "ул. Ленинградян (перекрёсток Шинарарнер)", "ул. Ленинградян (Евроваген)", "ул. Григор Асратян",
                    "ул. Шираза", "15 квартал", "ул. Чауша", "Аштаракское шс.", "Прошян аван", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            /**
             * Trollybuses
             * */
            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("1", "T", "пл. Труда (памятник Рабочему)", "просп. Багратуняц (памятник Рабочему)", "пл. Гарегина Нжде",
                    "ул. Гарегина Нжде", "просп. Аршакуняц (к/т Айреник)", "просп. Аршакуняц (Ереван Молл)", "просп. Аршакуняц (парк им. Комитаса)", "просп. Аршакуняц (т/ц Сурмалу)",
                    "просп. Аршакуняц (Цирк)", "Григор Лусаворич (Цирк)", "Григор Лусаворич (Мэрия Еревана)", "просп. Маштоца (магазин РЫБЫ)", "просп. Маштоца (Крытый рынок)",
                    "просп. Маштоца (перекрёсток Амирян)", "просп. Маштоца (больница им. Маргаряна)", "просп. Маштоца (Опера)", "просп. Маштоца (Консерватория)", "просп. Маштоца (Матенадаран)", "ул. Корюна (Цитадель)",
                    "ул. Корюна (Цитадель)", "Медицинский университет", "ул. Чаренца (Полиция РА)", "ул. Гераци", "просп. Мясникяна (перекрёсток Гераци)", "просп. Мясникяна (ЗООПАРК)",
                    "просп. Мясникяна (Джрашхар)", "просп. Гая (Акватек)", "просп. Гая (Памятник Гаю)", "просп. Гая (салон Мерседеса)", "ул. Бадала Мурадяна", "ул. Тевосяна",
                    "ул. Кочинян", "Джрвеж", "", "", "", "", "", "", "", "", "", "", "", ""));
            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("2", "T", "ул. Арташисян", "ул. Ширака (рынок Чарбаха)", "ул. Чехова", "просп. Багратуняц (перекрёсток  Арташисян)",
                    "пл. Гарегина Нжде", "просп. Багратуняц (памятник Рабочему)", "пл. Труда (памятник Рабочему)", "просп. Аршакуняц (к/т Айреник)", "просп. Аршакуняц (Ереван Молл)",
                    "просп. Аршакуняц (парк им. Комитаса)", "просп. Аршакуняц (т/ц Сурмалу)", "просп. Аршакуняц (Цирк)", "ул. Агатангехоси", "просп. Тиграна Меца (к/т Айрарат)", "просп. Тиграна Меца (Ташир т/ц)",
                    "просп. Тиграна Меца (ЮКЖД)", "просп. Тиграна Меца (Каяран) (Станция)", "ул. Арцаха", "ул. Эребуни", "музей Эребуни", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", ""));

//            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("3", "T", "Аван", "ул. Маршал Бабаджанян", "ул. Ачаряна", "Ботанический сад", "просп. Мясникяна (Джрашхар)",
//                    "просп. Мясникяна (ЗООПАРК)", "просп. Мясникяна (перекрёсток Гераци)", "ул. Чаренца (Полиция РА)", "ул. Налбандян (ЕПТУ)", "просп. Саят-Нова (перекрёсток Налбандян)",
//                    "Вернисаж", "ул. Ханджяна (Лунапарк)", "Педагогический университет", "просп. Тиграна Меца (к/т Айрарат)", "просп. Тиграна Меца (Ташир т/ц)", "просп. Тиграна Меца (ЮКЖД)",
//                    "просп. Тиграна Меца (Каяран) (Станция)", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("9", "T", "Аван", "ул. Маршал Бабаджанян", "ул. Ачаряна", "Ботанический сад", "ул. Рубинянц (завод Алмаст)",
                    "ул. Рубинянц (Ереван Сити)", "ул. Рубинянц (ул. Агаронян)", "ул. Давида Анахта (перекрёсток Дро)", "ул. Давида Анахта (Керама Марацци)", "ул. Давида Анахта (Административное деление)",
                    "просп. Комитаса (мост Ламбада)", "просп. Комитаса (рынок Комитаса)", "просп. Комитаса (перекрёсток Врацакан)", "просп. Комитаса (Славянский университет)",
                    "просп. Комитаса (перекрёсток Папазян)", "просп. Комитаса (перекрёсток Вагаршян)", "просп. Комитаса (перекрёсток Гюлбенкян)", "ул. Касян", "просп. Баграмян (SAS)",
                    "просп. Баграмян (школа им. Камо)", "просп. Баграмян (Американский университет)", "просп. Баграмян (Конституционный суд)", "просп. Баграмян (Опера)",
                    "просп. Саят-Нова (перекрёсток Налбандян)", "Вернисаж", "ул. Ханджяна (Лунапарк)", "Педагогический университет", "ул. Агатангехоси", "Григор Лусаворич (Цирк)",
                    "Григор Лусаворич (Мэрия Еревана)", "просп. Маштоца (магазин РЫБЫ)", "просп. Маштоца (Крытый рынок)", "просп. Маштоца (перекрёсток Амирян)",
                    "просп. Маштоца (больница им. Маргаряна)", "просп. Маштоца (Опера)", "", "", "", "", "", "", "", "", "", ""));
            
            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("10", "T", "Нор-Норк 5-й массив", "ул. Бадала Мурадяна", "просп. Гая (салон Мерседеса)",
                    "просп. Гая (Памятник Гаю)", "просп. Гая (Акватек)", "ул. Рубинянц (завод Алмаст)", "ул. Рубинянц (Ереван Сити)", "ул. Рубинянц (ул. Агаронян)",
                    "ул. Давида Анахта (перекрёсток Дро)", "ул. Давида Анахта (Керама Марацци)", "ул. Давида Анахта (Административное деление)", "просп. Комитаса (мост Ламбада)",
                    "просп. Комитаса (рынок Комитаса)", "просп. Комитаса (перекрёсток Врацакан)", "просп. Комитаса (Славянский университет)", "просп. Комитаса (перекрёсток Папазян)",
                    "просп. Комитаса (перекрёсток Вагаршян)", "просп. Комитаса (перекрёсток Гюлбенкян)", "ул. Касян", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));
            
            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("15", "T", "15 квартал", "ул. Мазманян", "ул. Шираза", "ул. Григор Асратян",
                    "ул. Себастия (перекрёсток Ленинградян)", "ул. Себастия (перекрёсток Тычина)", "ул. Себастия (ярмарка Малатия)", "ул. Себастия (перекрёсток Кургинян)",
                    "просп. Багратуняц (перекрёсток Исаков)", "просп. Багратуняц (Ереван Сити)", "просп. Багратуняц (перекрёсток  Арташисян)", "пл. Гарегина Нжде",
                    "просп. Багратуняц (памятник Рабочему)", "пл. Труда (памятник Рабочему)", "просп. Аршакуняц (по напр. Чарбах)", "Аэропорт Эребуни",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("23", "T", "Джрвеж", "ул. Кочинян", "ул. Тевосяна", "ул. Бадала Мурадяна", "просп. Гая (салон Мерседеса)",
                    "просп. Гая (Памятник Гаю)", "просп. Гая (Акватек)", "просп. Мясникяна (Джрашхар)", "просп. Мясникяна (ЗООПАРК)", "просп. Мясникяна (перекрёсток Гераци)",
                    "ул. Чаренца (Полиция РА)", "просп. Саят-Нова (перекрёсток Налбандян)", "Вернисаж", "Педагогический университет", "ул. Ханджяна (Лунапарк)",
                    "просп. Тиграна Меца (ярмарка Фирдуси)", "ул. Мелик-Адамян", "ул. Налбандян (ЕПТУ)", "ул. Московян (дом Камерной музыки)", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME_RU, null, insertDataToTableTransport("24", "T", "Юго-Западный квартал (Бангладеш)", "ул. Раффи", "ул. Раффи (ярмарка Малатия)", "ул. Себастия (ярмарка Малатия)",
                    "ул. Себастия (перекрёсток Кургинян)", "просп. Исакова", "Киликия автовокзал", "мост Победы", "просп. Маштоца (магазин РЫБЫ)", "просп. Маштоца (Крытый рынок)", "просп. Маштоца (перекрёсток Амирян)",
                    "просп. Маштоца (больница им. Маргаряна)", "просп. Маштоца (Опера)", "просп. Маштоца (Консерватория)", "ул. Московян (Консерватория)", "ул. Абовяна (ст/м Еритасардакан (Молодёжная))",
                    "ул. Абовяна (Сельскохозяйственная академия)", "ул. Абовяна (скверик Абовяна)", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

        }


        private void insertIntoStop(SQLiteDatabase db) {

            String[] stops = context.getResources().getStringArray(R.array.stops);

            for (int i = 0; i < stops.length; i++) {
                db.insert(TABLE_STOP_NAME, null, insertDataToTableStop(stops[i], "", ""));
            }

        }

        private void insertIntoStopEn(SQLiteDatabase db) {

            String[] stops = context.getResources().getStringArray(R.array.stops_en);

            for (int i = 0; i < stops.length; i++) {
                db.insert(TABLE_STOP_NAME_EN, null, insertDataToTableStop(stops[i], "", ""));
            }

        }

        private void insertIntoStopRu(SQLiteDatabase db) {

            String[] stops = context.getResources().getStringArray(R.array.stops_ru);

            for (int i = 0; i < stops.length; i++) {
                db.insert(TABLE_STOP_NAME_RU, null, insertDataToTableStop(stops[i], "", ""));
            }

        }

    }
}