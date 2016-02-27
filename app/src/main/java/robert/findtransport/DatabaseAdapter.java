package robert.findtransport;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by robert on 11/15/15.
 */
public class DatabaseAdapter {

    DatabaseHelper databaseHelper;
    Context context;

    public DatabaseAdapter(Context context) {
        databaseHelper = new DatabaseHelper(context);
        this.context = context;
    }

    public String getTransport() {
        SQLiteDatabase db = databaseHelper.getWritableDatabase();
        StringBuffer buffer = new StringBuffer();

        Cursor cursor = db.query(DatabaseHelper.TABLE_TRANSPORT_NAME, null, null, null, null, null, null);

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

        cursor.close();
        return buffer.toString();
    }

    public String getStops() {
        SQLiteDatabase db = databaseHelper.getWritableDatabase();
        StringBuffer buffer = new StringBuffer();

        Cursor cursor = db.query(databaseHelper.TABLE_STOP_NAME, null, null, null, null, null, null);

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
        private static final int DATABASE_VERSION = 14;

        private static final String TABLE_TRANSPORT_NAME = "table_transport";
        private static final String TABLE_STOP_NAME = "table_stop";

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

        private static final String CREATE_TABLE_STOP_NAME = "create table " + TABLE_STOP_NAME + " (" +
                COLUMN_ID + " integer primary key autoincrement, " +
                COLUMN_ALL_STOPS + " varchar(255), " +
                COLUMN_ALL_STOPS_LATITUDE + " varchar(255), " +
                COLUMN_ALL_STOPS_LONGITUDE + " varchar(255));";

        private static final String DROP_TABLE_TRANSPORT_NAME = "drop table if exists " + TABLE_TRANSPORT_NAME;
        private static final String DROP_TABLE_STOP_NAME = "drop table if exists " + TABLE_STOP_NAME;

        public DatabaseHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
            this.context = context;
        }

        @Override
        public void onCreate(SQLiteDatabase db) {

            try {
                db.execSQL(CREATE_TABLE_TRANSPORT_NAME);
                //Toast.makeText(context, "Table transport created", Toast.LENGTH_SHORT).show();
            } catch (SQLException e) {
                e.printStackTrace();
                //Toast.makeText(context, "Table transport not created", Toast.LENGTH_SHORT).show();
            }

            try {
                db.execSQL(CREATE_TABLE_STOP_NAME);
                //Toast.makeText(context, "Table stop created", Toast.LENGTH_SHORT).show();
            } catch (SQLException e) {
                e.printStackTrace();
                //Toast.makeText(context, "Table stop created", Toast.LENGTH_SHORT).show();
            }

            insertIntoTransport(db);
            insertIntoStop(db);

        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

            if (newVersion > oldVersion) {
                try {
                    db.execSQL(DROP_TABLE_TRANSPORT_NAME);
                } catch (SQLException e) {
                    e.printStackTrace();
                    Log.e("TR_NAME", "NOT DROPPED");
                }

                try {
                    db.execSQL(DROP_TABLE_STOP_NAME);
                    onCreate(db);
                } catch (SQLException e) {
                    e.printStackTrace();
                    Log.e("ST_NAME", "NOT DROPPED");
                }
            }

        }

        private ContentValues insertDataToTableTransport(String transportNumber, String transportType, String stop1, String stop2, String stop3, String stop4,
                                                          String stop5,  String stop6,  String stop7,  String stop8,  String stop9,  String stop10,  String stop11,
                                                          String stop12,  String stop13,  String stop14,  String stop15,  String stop16,  String stop17,
                                                          String stop18, String stop19,  String stop20,  String stop21,  String stop22,  String stop23,
                                                          String stop24,  String stop25, String stop26,  String stop27,  String stop28,  String stop29,
                                                          String stop30,  String stop31,  String stop32, String stop33,  String stop34,  String stop35,
                                                          String stop36,  String stop37,  String stop38,  String stop39, String stop40, String stop41,
                                                          String stop42,  String stop43,  String stop44, String stop45) {

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

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("1", "A", "Էրեբունու զ/ծ", "Խաղաղ Դոնի փ․", "Տիտոգրադյան փ․", "Այվազովսկու փ․",
                    "Էրեբունու փ․", "Արցախի պ․", "Տիգրան Մեծի պ․ (Կայարան)", "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)", "Տիգրան Մեծի պ․ (Այրարատ կ/թ)",
                    "Մանկավարժական համալսարան", "Տիգրան Մեծի պ․ (Ֆիրդուսի շուկա)", "Հանրապետության Հրապարակ", "Ամիրյան փ․", "Մաշտոցի պ․ (Ամիրյան խաչմերուկ)",
                    "Մաշտոցի պ․ (Մարգարյան հիվ․)", "Մաշտոցի պ․ (Օպերա)", "Բաղրամյան պ․ (Օպերա)", "Բաղրամյան պ․ (Սահմանադրական դատարան)", "Բաղրամյան պ․ (Ամերիկյան համալսարան)",
                    "Բաղրամյան պ․ (Կամոյի դպրոց)", "Բաղրամյան պ․ (Բարեկամություն)", "Կասյան փ․", "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)", "Կոմիտասի պ․ (Վաղարշյան խաչմերուկ)",
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
                    "Մյասնիկյան պ․ (Հերացի խաչմերուկ)", "Սարալանջի փ․", "Ավետ Ավետիսյան փ․", "Վաղարշյան փ․", "Սասնա Ծռերի փ․", "Տիգրան Պետրոսյան փ․", "Եղվարդի խճ․",
                    "Դավթաշենի 4-րդ թաղ․", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("8", "A", "Դավթաշենի 4-րդ թաղ․", "Տիգրան Պետրոսյան փ․", "Իոսիֆյան փ․",
                    "Հալաբյան փ․ (Ֆիզիկայի խաչմերուկ)", "Հալաբյան փ․ (ԹՈՒՄՈ)", "Հալաբյան փ․ (Կիևյան կամուրջ)", "Կիևյան փ․ (Կիևյան կամուրջ)", "Կիևյան փ․ (Օրբելի խաչմերուկ)",
                    "Կիևյան փ․ (Բարեկամություն)", "Բաղրամյան պ․ (Բարեկամություն)", "Բաղրամյան պ․ (Կամոյի դպրոց)", "Բաղրամյան պ․ (Ամերիկյան համալսարան)",
                    "Բաղրամյան պ․ (Սահմանադրական դատարան)", "Բաղրամյան պ․ (Օպերա)", "Մաշտոցի պ․ (Կոնսերվատորիա)", "Մոսկովյան փ․ (Կոնսերվատորիա)", "Աբովյան փ․ (Երիտասարդական մ/կ)",
                    "Աբովյան փ․ (Գյուղակադեմիա)", "Աբովյան փ․ (Պլանի գլուխ)", "Մյասնիկյան պ․ (Երիտասարդական մ/կ)", "Մյասնիկյան պ․ (Հերացի խաչմերուկ)",
                    "Մյասնիկյան պ․ (Կենդանաբանական այգի)", "Մյասնիկյան պ․ (Ջրաշխարհ)", "Գայի պ․ (Աքվատեք)", "Գայի պ․ (Գայի արձան)", "Գայի պ․ (Մերսեդեսի սրահ)",
                    "Բադալ Մուրադյան փ․", "Դավիթ Բեկի փ․", "Հունան Ավետիսյան փ․", "Նոր Նորքի 7-րդ զ/ծ", "Վիլնյուսի փ․", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("9", "A", "Սարի թաղ", "Սարի թաղի 12-րդ փ․", "Սարի թաղի 11-րդ փ․", "Սարի թաղի 5-րդ փ․",
                    "Սարի թաղի 1-ին փ․", "Գլինկայի փ․", "Խորենացու փ․ (Սիլաչի)", "Նար-Դոսի փ․ (Սիլաչի խաչմերուկ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)", "Գումի շուկա", "Զավարյան փ․",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("12", "A", "Աերացիա", "Շիրակի փ․ (Ձիարշավարան)", "Շիրակի փ․ (Չարբախի շուկա)", "Արտաշիսյան փ․",
                    "Բագրատունյաց պ․ (Արտաշիսյան խաչմերուկ)", "Բագրատունյաց պ․ (Երևան Սիթի)", "Բագրատունյաց պ․ (Իսակով խաչմերուկ)", "Սեբաստիայի փ․ (Կուրղինյան խաչմերուկ)",
                    "Սեբաստիայի փ․ (Մալաթիայի շուկա)", "Սեբաստիայի փ․ (Տիչինայի խաչմերուկ)", "Սեբաստիայի փ․ (Լենինգրադյան խաչմերուկ)", "Գրիգոր Հասրաթյան փ․", "Ջանիբեկյան փ․",
                    "Բաշինջաղյան փ․", "Մարգարյան փ․ (Պեգաս)", "Մարգարյան փ․ (Հանրապետական հիվ․)", "Հալաբյան փ․ (Ֆիզիկայի խաչմերուկ)", "Իոսիֆյան փ․", "Տիգրան Պետրոսյան փ․",
                    "Դավթաշենի 4-րդ թաղ․", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("13", "A", "Գազպրոմ Արմենիա", "Թբիլիսյան խճ․ (Ռադիոկայմ)", "Թբիլիսյան խճ․ (Երևանի Շամպայնի գ/ն)",
                    "Թբիլիսյան խճ․ (Այբ ավագ դպրոց)", "Թբիլիսյան խճ․ (Լամպերի գ/ն)", "Թբիլիսյան խճ․ (Լամպերի լիճ)", "Ազատության պ․ (Ռայկոմ)", "Կոմիտասի պ․ (Լամբադա կամուրջ)",
                    "Կոմիտասի պ․ (Կոմիտասի շուկա)", "Կոմիտասի պ․ (Վրացական խաչմերուկ)", "Կոմիտասի պ․ (Սլավոնական համալսարան)", "Կոմիտասի պ․ (Փափազյան խաչմերուկ)",
                    "Կոմիտասի պ․ (Վաղարշյան խաչմերուկ)", "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)", "Կասյան փ․", "Բաղրամյան պ․ (Բարեկամություն)", "Բաղրամյան պ․ (Կամոյի դպրոց)",
                    "Բաղրամյան պ․ (Ամերիկյան համալսարան)", "Բաղրամյան պ․ (Սահմանադրական դատարան)", "Բաղրամյան պ․ (Օպերա)", "Սայաթ-Նովա պ․ (Նալբանդյան խաչմերուկ)",
                    "Սայաթ-Նովա պ․ (Ալեք Մանուկյան խաչմերուկ)", "Ռադիոտուն", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("14", "A", "Լեփսիուսի փ․", "Դրոյի փ․", "Պարույր Սևակի փ․", "Ուլնեցու փ․", "Ներսիսյան փ․",
                    "Ազատության պ․ (Ռայկոմ)", "Ազատության պ․ (Նաիրի Զարյան խաչմերուկ)", "Ազատության պ․ (Զինկոմիսարիատ)", "Ազատության պ․ (Հաղթանակի այգի)", "Սարալանջի փ․",
                    "Աբովյան փ․ (Պլանի գլուխ)", "Աբովյան փ․ (Գյուղակադեմիա)", "Աբովյան փ․ (Երիտասարդական մ/կ)", "Մոսկովյան փ․ (Կամերային երաժշտության տուն)",
                    "Խանջյան փ․ (Շախմատի տուն)", "Վերնիսաժ", "Խանջյան փ․ (Լունապարկ)", "Մանկավարժական համալսարան", "Տիգրան Մեծի պ․ (Այրարատ կ/թ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)",
                    "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)", "Տիգրան Մեծի պ․ (Կայարան)", "Արցախի փ․", "Վստրեչի կամուրջ", "Գարեգին Նժդեհի փ․", "Արշակունյաց պ․ (Հայրենիք կ/թ)",
                    "Աշխատանքի հրապարակ (Բանվորի արձան)", "Արշակունյաց պ․ (Դեպի Չարբախ)", "Շիրակի փ․ (Էրեբունի օդանավակայան)", "Արարատյան փ․", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("15", "A", "Նոր Նորքի 6-րդ զ/ծ", "Բադալ Մուրադյան փ․", "Շոպրոնի փ․", "Գյուրջյան փ․", "Սաֆարյան փ․",
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
                    "Բաղրամյան պ․ (Կամոյի դպրոց)", "Բաղրամյան պ․ (Բարեկամություն)", "Կասյան փ․", "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)", "Կոմիտասի պ․ (Վաղարշյան խաչմերուկ)",
                    "Կոմիտասի պ․ (Փափազյան խաչմերուկ)", "Կոմիտասի պ․ (Սլավոնական համալսարան)", "Կոմիտասի պ․ (Վրացական խաչմերուկ)", "Կոմիտասի պ․ (Կոմիտասի շուկա)",
                    "Կոմիտասի պ․ (Լամբադա կամուրջ)", "Ազատության պ․ (Ռայկոմ)", "Ահարոնյան փ․", "Դրոյի փ․", "Կաթի գ/ն", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("18", "A", "Սիլիկյան թաղ․", "Սիլիկյան Նոր խճ․", "Մազմանյան փ․", "Բաշինջաղյան փ․",
                    "Մարգարյան փ․ (Պեգաս)", "Մարգարյան փ․ (Հանրապետական հիվ․)", "Հալաբյան փ․ (Ֆիզիկայի խաչմերուկ)", "Հալաբյան փ․ (Ֆիզիկայի խաչմերուկ)", "Հալաբյան փ․ (ԹՈՒՄՈ)",
                    "Հալաբյան փ․ (Կիևյան կամուրջ)", "Կիևյան փ․ (Կիևյան կամուրջ)", "Կիևյան փ․ (Օրբելի խաչմերուկ)", "Կիևյան փ․ (Բարեկամություն)", "Բաղրամյան պ․ (Բարեկամություն)"
                    , "Բաղրամյան պ․ (Կամոյի դպրոց)", "Բաղրամյան պ․ (Ամերիկյան համալսարան)", "Բաղրամյան պ․ (Սահմանադրական դատարան)", "Բաղրամյան պ․ (Օպերա)",
                    "Մաշտոցի պ․ (Կոնսերվատորիա)", "Մաշտոցի պ․ (Մատենադարան)", "Կորյունի փ․ (Ցիտադել)", "Բժշկական համալսարան", "Չարենցի փ․ (ՀՀ Ոստիկանություն)",
                    "Չարենցի փ․ (ԵՊՀ)", "Չարենցի փ․ (Zigzag խանութ-սրահ)", "Սայաթ-Նովա պ․ (Ալեք Մանուկյան խաչմերուկ)", "Խանջյան փ․ (Շախմատի տուն)", "Վերնիսաժ",
                    "Խանջյան փ․ (Լունապարկ)", "Մանկավարժական համալսարան", "Տիգրան Մեծի պ․ (Այրարատ կ/թ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)", "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)",
                    "Տիգրան Մեծի պ․ (Կայարան)", "", "", "", "", "", "", "", "", "", "", ""));

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

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("22", "A", "Նոր Նորքի 9-րդ զ/ծ", "Վիլնյուսի փ․", "Մինսկի փ․", "Միկոյան փ․",
                    "Բադալ Մուրադյան փ․", "Մյասնիկյան պ․ (Ջրաշխարհ)", "Մյասնիկյան պ․ (Կենդանաբանական այգի)", "Մյասնիկյան պ․ (Հերացի խաչմերուկ)", "Աբովյան փ․ (Պլանի գլուխ)",
                    "Աբովյան փ․ (Գյուղակադեմիա)", "Բժշկական համալսարան", "Նալբանդյան փ․ (ԵՊՏՀ)", "Սայաթ-Նովա պ․ (Նալբանդյան խաչմերուկ)", "Մաշտոցի պ․ (Օպերա)",
                    "Մաշտոցի պ․ (Մարգարյան հիվ․)", "Մաշտոցի պ․ (Ամիրյան խաչմերուկ)", "Ամիրյան փ․", "Հանրապետության Հրապարակ", "Տիգրան Մեծի պ․ (Ֆիրդուսի շուկա)",
                    "Մանկավարժական համալսարան", "Տիգրան Մեծի պ․ (Այրարատ կ/թ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)", "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)", "Տիգրան Մեծի պ․ (Կայարան)",
                    "Արցախի պ․", "Էրեբունու փ․", "Աթոյան փ․", "Այվազովսկու փ․", "Ավանեսովի փ․", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

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

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("25", "A", "Դավիթ Անհաղթի փ․ (Կերամա Մարացի)", "Ուլնեցու փ․ (Դեպի Մոնումենտ)",
                    "Գեներալ Բաբայանի փ․", "Ազատության պ․ (Զինկոմիսարիատ)", "Ազատության պ․ (Նաիրի Զարյան խաչմերուկ)", "Կոմիտասի պ․ (Լամբադա կամուրջ)",
                    "Կոմիտասի պ․ (Կոմիտասի շուկա)", "Գրիբոյեդովի փ․", "Նաիրի Զարյան փ․", "Բորսայի շենք", "Հրաչյա Քոչար փ․ (Վրացական խաչմերուկ)",
                    "Հրաչյա Քոչար փ․ (Փափազյան խաչմերուկ)", "Հրաչյա Քոչար փ․ (Վաղարշյան խաչմերուկ)", "Հրաչյա Քոչար փ․ (Գյուլբենկյան խաչմերուկ)",
                    "Կիևյան փ․ (Բարեկամություն)", "Կիևյան փ․ (Օրբելի խաչմերուկ)", "Կիևյան փ․ (Կիևյան կամուրջ)", "Լենինգրադյան փ․ (Կիևյան կամուրջ)",
                    "Լենինգրադյան փ․ (Մոնթե Մելքոնյան խաչմերուկ)", "Լենինգրադյան փ․ (Շինարարների խաչմերուկ)", "Լենինգրադյան փ․ (Եվրովագեն)", "Գրիգոր Հասրաթյան փ․",
                    "Շիրազի փ․", "Չաուշի փ․", "Աշտարակի խճ․", "Պռոշյան ավան", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("26", "A", "ՀԱԹ", "Զորավար Անդրանիկի փ․", "Րաֆֆու փ․", "Րաֆֆու փ․ (Մալաթիայի շուկա)",
                    "Սեբաստիայի փ․ (Մալաթիայի շուկա)", "Սեբաստիայի փ․ (Տիչինայի խաչմերուկ)", "Սեբաստիայի փ․ (Լենինգրադյան խաչմերուկ)", "Լենինգրադյան փ․ (Եվրովագեն)",
                    "Լենինգրադյան փ․ (Շինարարների խաչմերուկ)", "Լենինգրադյան փ․ (Մոնթե Մելքոնյան խաչմերուկ)", "Ծիծեռնակաբերդի խճ․", "Դալմա Գարդեն Մոլ", "Աթենքի փ․",
                    "Հրազդան մ/դ", "Հաղթանակ կամուրջ", "Արգիշտի փ․", "Գրիգոր Լուսավորիչ (Երևանի քաղաքապետարան)", "Մաշտոցի պ․ (Ձկան խանութ)", "Մաշտոցի պ․ (Ծածկած շուկա)",
                    "Մաշտոցի պ․ (Ամիրյան խաչմերուկ)", "Մաշտոցի պ․ (Մարգարյան հիվ․)", "Մաշտոցի պ․ (Օպերա)", "Մաշտոցի պ․ (Կոնսերվատորիա)", "Մոսկովյան փ․ (Կոնսերվատորիա)",
                    "Աբովյան փ․ (Երիտասարդական մ/կ)", "Աբովյան փ․ (Գյուղակադեմիա)", "Աբովյան փ․ (Պլանի գլուխ)", "Մյասնիկյան պ․ (Հերացի խաչմերուկ)",
                    "Մյասնիկյան պ․ (Կենդանաբանական այգի)", "Մյասնիկյան պ․ (Ջրաշխարհ)", "Գայի պ․ (Աքվատեք)", "Գայի պ․ (Գայի արձան)", "Գայի պ․ (Մերսեդեսի սրահ)",
                    "Բադալ Մուրադյան փ․", "Դավիթ Բեկի փ․", "Հունան Ավետիսյան փ․", "Նոր Նորքի 7-րդ զ/ծ", "Վիլնյուսի փ․", "Նոր Նորքի 9-րդ զ/ծ", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("27", "A", "Նորաշեն թաղ.", "Մելքումովի փ.", "Բեկնազարյան փ․", "Բաշինջաղյան փ․",
                    "Մարգարյան փ․ (Պեգաս)", "Մարգարյան փ․ (Հանրապետական հիվ․)", "Հալաբյան փ․ (Ֆիզիկայի խաչմերուկ)", "Հալաբյան փ․ (ԹՈՒՄՈ)", "Էստոնական փ․", "Շինարարների փ․",
                    "Արզումանյան փ․", "Հալաբյան փ․ (Կիևյան կամուրջ)", "Լենինգրադյան փ․ (Կիևյան կամուրջ)", "Ծիծեռնակաբերդի խճ․", "Դալմա Գարդեն Մոլ", "Աթենքի փ․",
                    "Հրազդան մ/դ", "Հաղթանակ կամուրջ", "Մաշտոցի պ․ (Ձկան խանութ)", "Մաշտոցի պ․ (Ծածկած շուկա)", "Մաշտոցի պ․ (Ամիրյան խաչմերուկ)", "Մաշտոցի պ․ (Մարգարյան հիվ․)"
                    , "Մաշտոցի պ․ (Օպերա)", "Մաշտոցի պ․ (Կոնսերվատորիա)", "Մաշտոցի պ․ (Մատենադարան)", "Կորյունի փ․ (Ցիտադել)", "Բժշկական համալսարան",
                    "Չարենցի փ․ (ՀՀ Ոստիկանություն)", "Հերացու փ․", "Արմենակյան փ․", "Հովսեփյան փ․", "Հեռուստակենտրոն", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("28", "A", "Նոր Նորքի 8-րդ զ/ծ", "Մինսկի փ․", "Միկոյան փ․", "Բադալ Մուրադյան փ․",
                    "Գայի պ․ (Մերսեդեսի սրահ)", "Գայի պ․ (Գայի արձան)", "Գայի պ․ (Աքվատեք)", "Ռուբինյանց փ․ (Ալմաստ գ/ն)", "Ռուբինյանց փ․ (Երևան Սիթի)",
                    "Ռուբինյանց փ․ (Ահարոնյան փ․)", "Դավիթ Անհաղթի փ․ (Դրոյի խաչմերուկ)", "Դավիթ Անհաղթի փ․ (Կերամա Մարացի)", "Դավիթ Անհաղթի փ․ (թաղապետարան)",
                    "Կոմիտասի պ․ (Լամբադա կամուրջ)", "Կոմիտասի պ․ (Կոմիտասի շուկա)", "Կոմիտասի պ․ (Վրացական խաչմերուկ)", "Կոմիտասի պ․ (Սլավոնական համալսարան)",
                    "Կոմիտասի պ․ (Փափազյան խաչմերուկ)", "Կոմիտասի պ․ (Վաղարշյան խաչմերուկ)", "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)", "Կասյան փ․", "Կիևյան փ․ (Բարեկամություն)",
                    "Կիևյան փ․ (Օրբելի խաչմերուկ)", "Կիևյան փ․ (Կիևյան կամուրջ)", "Հալաբյան փ․ (Կիևյան կամուրջ)", "Հալաբյան փ․ (ԹՈՒՄՈ)", "Հալաբյան փ․ (Ֆիզիկայի խաչմերուկ)",
                    "Մարգարյան փ․ (Հանրապետական հիվ․)", "Մարգարյան փ․ (Պեգաս)", "Բաշինջաղյան փ․", "Մազմանյան փ․", "Չաուշի փ․", "Աշտարակի խճ․", "Հույսի թաղ․", "", "", "", "",
                    "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("33", "A", "Դավթաշենի 4-րդ թաղ.", "Տիգրան Պետրոսյան փ․", "Իոսիֆյան փ․",
                    "Հալաբյան փ․ (Ֆիզիկայի խաչմերուկ)", "Հալաբյան փ․ (ԹՈՒՄՈ)", "Հալաբյան փ․ (Կիևյան կամուրջ)", "Լենինգրադյան փ․ (Կիևյան կամուրջ)", "Ծիծեռնակաբերդի խճ․",
                    "Դալմա Գարդեն Մոլ", "Աթենքի փ․", "Հրազդան մ/դ", "Հաղթանակ կամուրջ", "Մաշտոցի պ․ (Ձկան խանութ)", "Մաշտոցի պ․ (Ծածկած շուկա)", "Ամիրյան փ․",
                    "Հանրապետության Հրապարակ", "Տիգրան Մեծի պ․ (Ֆիրդուսի շուկա)", "Մանկավարժական համալսարան", "Տիգրան Մեծի պ․ (Այրարատ կ/թ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)",
                    "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)", "Տիգրան Մեծի պ․ (Կայարան)", "Արցախի պ․", "Վստրեչի կամուրջ", "Գարեգին Նժդեհի փ․", "Արշակունյաց պ․ (Հայրենիք կ/թ)",
                    "Աշխատանքի հրապարակ (Բանվորի արձան)", "Ներագավթի 1-ին փ․", "Արտաշատի խճ․", "գ․ Խարբերդ", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("34", "A", "գ. Մուշավան", "գ. Վարդաշեն", "Մահարու փ․", "Նուբարաշենի փ․", "Դավիթ Բեկի փ․",
                    "Ազատամարտիկների փ․", "Սասունցի Դավթի փ․", "Տիգրան Մեծի պ․ (Կայարան)", "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)",
                    "Տիգրան Մեծի պ․ (Այրարատ կ/թ)", "Մանկավարժական համալսարան", "Տիգրան Մեծի պ․ (Ֆիրդուսի շուկա)", "Հանրապետության Հրապարակ", "Ամիրյան փ․",
                    "Մաշտոցի պ․ (Ամիրյան խաչմերուկ)", "Մաշտոցի պ․ (Մարգարյան հիվ․)", "Մաշտոցի պ․ (Օպերա)", "Մաշտոցի պ․ (Կոնսերվատորիա)", "Մաշտոցի պ․ (Մատենադարան)",
                    "Կորյունի փ․ (Ցիտադել)", "Աբովյան փ․ (Գյուղակադեմիա)", "Աբովյան փ․ (Պլանի գլուխ)", "Սարալանջի փ․", "Ազատության պ․ (Հաղթանակի այգի)",
                    "Գեներալ Բաբայանի փ․", "Արաբկիրի 17-րդ փ․", "Արաբկիրի 29-րդ փ․", "Ռիգայի փ․", "Հրաչյա Քոչար փ․ (Վրացական խաչմերուկ)", "Հրաչյա Քոչար փ․ (Փափազյան խաչմերուկ)",
                    "Հրաչյա Քոչար փ․ (Վաղարշյան խաչմերուկ)", "Վաղարշյան փ․", "Դավթաշենի կամուրջ", "Տիգրան Պետրոսյան փ․", "Դավթաշենի 2-րդ թաղ.", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("35", "A", "Նոր Նորքի 4-րդ զ/ծ", "Գյուլիքեխվյան փ․", "Գալշոյան փ․", "Միկոյան փ․",
                    "Բադալ Մուրադյան փ․", "Գայի պ․ (Մերսեդեսի սրահ)", "Գայի պ․ (Գայի արձան)", "Գայի պ․ (Աքվատեք)", "Մյասնիկյան պ․ (Ջրաշխարհ)",
                    "Մյասնիկյան պ․ (Կենդանաբանական այգի)", "Մյասնիկյան պ․ (Հերացի խաչմերուկ)", "Աբովյան փ․ (Պլանի գլուխ)", "Աբովյան փ․ (Գյուղակադեմիա)",
                    "Աբովյան փ․ (Երիտասարդական մ/կ)", "Մոսկովյան փ․ (Կոնսերվատորիա)", "Մաշտոցի պ․ (Կոնսերվատորիա)", "Մաշտոցի պ․ (Օպերա)", "Բաղրամյան պ․ (Օպերա)",
                    "Բաղրամյան պ․ (Սահմանադրական դատարան)", "Բաղրամյան պ․ (Ամերիկյան համալսարան)", "Բաղրամյան պ․ (Կամոյի դպրոց)", "Բաղրամյան պ․ (Բարեկամություն)",
                    "Կիևյան փ․ (Բարեկամություն)", "Կիևյան փ․ (Օրբելի խաչմերուկ)", "Կիևյան փ․ (Կիևյան կամուրջ)", "Լենինգրադյան փ․ (Կիևյան կամուրջ)",
                    "Լենինգրադյան փ․ (Մոնթե Մելքոնյան խաչմերուկ)", "Լենինգրադյան փ․ (Շինարարների խաչմերուկ)", "Լենինգրադյան փ․ (Եվրովագեն)",
                    "Սեբաստիայի փ․ (Լենինգրադյան խաչմերուկ)", "Սեբաստիայի փ․ (Տիչինայի խաչմերուկ)", "Սեբաստիայի փ․ (Մալաթիայի շուկա)", "Րաֆֆու փ․ (Մալաթիայի շուկա)",
                    "Րաֆֆու փ․", "Զորավար Անդրանիկի փ․", "Օհանովի փ․", "Գուսան Շերամի փ․", "Առնո Բաբաջանյան փ․", "Ծովակալ Իսակովի պ․", "գ․ Արգավանդ", "գ․ Գեղանիստ",
                    "գ․ Ազատաշեն", "գ. Խաչփառ", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("37", "A", "Էրեբունու զ/ծ ", "Տիտոգրադյան փ․", "Այվազովսկու փ․", "Էրեբունու փ․",
                    "Արցախի պ․", "Տիգրան Մեծի պ․ (Կայարան)", "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)", "Տիգրան Մեծի պ․ (Այրարատ կ/թ)",
                    "Մանկավարժական համալսարան", "Տիգրան Մեծի պ․ (Ֆիրդուսի շուկա)", "Հանրապետության Հրապարակ", "Ամիրյան փ․", "Մաշտոցի պ․ (Ամիրյան խաչմերուկ)",
                    "Մաշտոցի պ․ (Մարգարյան հիվ․)", "Մաշտոցի պ․ (Օպերա)", "Բաղրամյան պ․ (Օպերա)", "Բաղրամյան պ․ (Սահմանադրական դատարան)",
                    "Բաղրամյան պ․ (Ամերիկյան համալսարան)", "Բաղրամյան պ․ (Կամոյի դպրոց)", "Բաղրամյան պ․ (Բարեկամություն)", "Կասյան փ․",
                    "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)", "Կոմիտասի պ․ (Վաղարշյան խաչմերուկ)", "Կոմիտասի պ․ (Փափազյան խաչմերուկ)",
                    "Կոմիտասի պ․ (Սլավոնական համալսարան)", "Կոմիտասի պ․ (Վրացական խաչմերուկ)", "Կոմիտասի պ․ (Կոմիտասի շուկա)", "Կոմիտասի պ․ (Լամբադա կամուրջ)",
                    "Դավիթ Անհաղթի փ․ (թաղապետարան)", "Դավիթ Անհաղթի պ․ (Կերամա Մարացի)", "Դավիթ Անհաղթի պ․ (Դրոյի խաչմերուկ)", "Ռուբինյանց փ․ (Ահարոնյան փ․)",
                    "Ռուբինյանց փ․ (Երևան Սիթի)", "Ռուբինյանց փ․ (Ալմաստ գ/ն)", "Գայի պ․ (Աքվատեք)", "Լվովյան փ․", "Նոր Նորքի 1-ին զ/ծ", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("38", "A", "գ. Այնթապ", "Արտաշատի խճ․", "Նորագավթի 1-ին փ․", "Աշխատանքի հրապարակ (Բանվորի արձան)",
                    "Բագրատունյաց պ․ (Բանվորի արձան)", "Գարեգին Նժդեհի հրապարակ", "Գարեգին Նժդեհի փ․", "Արշակունյաց պ․ (Հայրենիք կ/թ)", "Արշակունյաց պ․ (Երևան Մոլ)",
                    "Արշակունյաց պ․ (Կոմիտասի այգի)", "Արշակունյաց պ․ (Սուրմալու)", "Արշակունյաց պ․ (Կրկես)", "Ագաթանգեղոսի փ․", "Մանկավարժական համալսարան",
                    "Խանջյան փ․ (Լունապարկ)", "Վերնիսաժ", "Սայաթ-Նովա պ․ (Նալբանդյան խաչմերուկ)", "Սայաթ-Նովա պ․ (Ալեք Մանուկյան խաչմերուկ)", "Չարենցի փ․ (Zigzag խանութ-սրահ)"
                    , "Չարենցի փ․ (ԵՊՀ)", "Չարենցի փ․ (ՀՀ Ոստիկանություն)", "Բժշկական համալսարան", "Աբովյան փ․ (Երիտասարդական մ/կ)", "Աբովյան փ․ (Գյուղակադեմիա)",
                    "Աբովյան փ․ (Պլանի գլուխ)", "Մյասնիկյան պ․ (Հերացի խաչմերուկ)", "Մյասնիկյան պ․ (Կենդանաբանական այգի)", "Մյասնիկյան պ․ (Ջրաշխարհ)", "Գայի պ․ (Աքվատեք)",
                    "Գայի պ․ (Գայի արձան)", "Ստեփանյան փ․", "Մոլդովական փ․", "Նոր Նորքի 2-րդ զ/ծ", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("39", "A", "Նորաշեն թաղ.", "Մելքումովի փ.", "Բեկնազարյան փ․", "Մազմանյան փ․", "Շիրազի փ․",
                    "Գրիգոր Հասրաթյան փ․", "Սեբաստիայի փ․ (Լենինգրադյան խաչմերուկ)", "Սեբաստիայի փ․ (Տիչինայի խաչմերուկ)", "Սեբաստիայի փ․ (Մալաթիայի շուկա)",
                    "Սեբաստիայի փ․ (Կուրղինյան խաչմերուկ)", "Բագրատունյաց պ․ (Իսակով խաչմերուկ)", "Բագրատունյաց պ․ (Երևան Սիթի)", "Բագրատունյաց պ․ (Արտաշիսյան խաչմերուկ)",
                    "Գարեգին Նժդեհի հրապարակ", "Գարեգին Նժդեհի փ․", "Վստրեչի կամուրջ", "Արցախի պ․", "Էրեբունու փ․", "Այվազովսկու փ․", "Տիտոգրադյան փ․", "Էրեբունու զ/ծ", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("41", "A", "Ավան ", "Մարշալ Բաբաջանյան փ․", "Աճառյան փ․", "Բուսաբանական այգի",
                    "Մյասնիկյան պ․ (Ջրաշխարհ)", "Մյասնիկյան պ․ (Կենդանաբանական այգի)", "Մյասնիկյան պ․ (Հերացի խաչմերուկ)", "Աբովյան փ․ (Պլանի գլուխ)",
                    "Աբովյան փ․ (Գյուղակադեմիա)", "Բժշկական համալսարան", "Նալբանդյան փ․ (ԵՊՏՀ)", "Սայաթ-Նովա պ․ (Նալբանդյան խաչմերուկ)", "Վերնիսաժ", "Խանջյան փ․ (Լունապարկ)",
                    "Մանկավարժական համալսարան", "Տիգրան Մեծի պ․ (Այրարատ կ/թ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)", "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)", "Տիգրան Մեծի պ․ (Կայարան)",
                    "Արցախի պ․", "Էրեբունու փ․", "Այվազովսկու փ․", "Տիտոգրադյան փ․", "Խաղաղ Դոնի փ․", "Էրեբունու զ/ծ", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("42", "A", "Նոր Նորքի 8-րդ զ/ծ", "Մինսկի փ․", "Միկոյան փ․", "Բադալ Մուրադյան փ․",
                    "Գայի պ․ (Մերսեդեսի սրահ)", "Գայի պ․ (Գայի արձան)", "Գայի պ․ (Աքվատեք)", "Մյասնիկյան պ․ (Ջրաշխարհ)", "Մյասնիկյան պ․ (Կենդանաբանական այգի)",
                    "Մյասնիկյան պ․ (Հերացի խաչմերուկ)", "Աբովյան փ․ (Պլանի գլուխ)", "Աբովյան փ․ (Գյուղակադեմիա)", "Բժշկական համալսարան", "Նալբանդյան փ․ (ԵՊՏՀ)",
                    "Սայաթ-Նովա պ․ (Նալբանդյան խաչմերուկ)", "Սայաթ-Նովա պ․ (Ալեք Մանուկյան խաչմերուկ)", "Ալեք-Մանուկյան փ․", "Երվանդ Քոչար փ․", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)",
                    "Տիգրան Մեծի պ․ (Այրարատ կ/թ)", "Մանկավարժական համալսարան", "Ագաթանգեղոսի փ․", "Արշակունյաց պ․ (Կրկես)", "Արշակունյաց պ․ (Սուրմալու)",
                    "Արշակունյաց պ․ (Կոմիտասի այգի)", "Արշակունյաց պ․ (Երևան Մոլ)", "Արշակունյաց պ․ (Հայրենիք կ/թ)", "Գարեգին Նժդեհի փ․", "Գարեգին Նժդեհի հրապարակ",
                    "Մանանդյան փ.", "Արաքս մ/դ", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("44", "A", "Տիչինայի փ․", "Զորավար Անդրանիկի փ․", "Օհանովի փ․", "Գուսան Շերամի փ․",
                    "Րաֆֆու փ․", "Րաֆֆու փ․ (Մալաթիայի շուկա)", "Սեբաստիայի փ․ (Մալաթիայի շուկա)", "Սեբաստիայի փ․ (Կուրղինյան խաչմերուկ)", "Բագրատունյաց պ․ (Իսակով խաչմերուկ)",
                    "Բագրատունյաց պ․ (Երևան Սիթի)", "Բագրատունյաց պ․ (Արտաշիսյան խաչմերուկ)", "Գարեգին Նժդեհի հրապարակ", "Գարեգին Նժդեհի փ․", "Վստրեչի կամուրջ", "Արցախի պ․",
                    "Տիգրան Մեծի պ․ (Կայարան)", "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)", "Տիգրան Մեծի պ․ (Այրարատ կ/թ)", "Մանկավարժական համալսարան",
                    "Տիգրան Մեծի պ․ (Ֆիրդուսի շուկա)", "Հանրապետության Հրապարակ", "Ամիրյան փ․", "Մաշտոցի պ․ (Ամիրյան խաչմերուկ)", "Մաշտոցի պ․ (Մարգարյան հիվ․)",
                    "Մաշտոցի պ․ (Օպերա)", "Մոսկովյան փ․ (Կոնսերվատորիա)", "Աբովյան փ․ (Երիտասարդական մ/կ)", "Աբովյան փ․ (Գյուղակադեմիա)", "Աբովյան փ․ (Պլանի գլուխ)",
                    "Մյասնիկյան պ․ (Հերացի խաչմերուկ)", "Մյասնիկյան պ․ (Կենդանաբանական այգի)", "Մյասնիկյան պ․ (Ջրաշխարհ)", "Գայի պ․ (Աքվատեք)", "Գայի պ․ (Գայի արձան)",
                    "Սաֆարյան փ․", "Գյուրջյան փ․ ", "Սուրբ Գրիգոր Լուսավորիչ բ/կ", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("45", "A", "Մարաշ", "Նորքի 13-րդ փ․", "Նորքի 9-րդ փ․", "Նորքի 6-րդ փ․", "Նորքի 5-րդ փ․",
                    "Նորքի 8-րդ փ․", "Արմենակյան փ․", "Սարալանջի փ․", "Հերացու փ․", "Չարենցի փ․ (ՀՀ Ոստիկանություն)", "Բժշկական համալսարան", "Կորյունի փ․ (Ցիտադել)",
                    "Մաշտոցի պ․ (Մատենադարան)", "Մաշտոցի պ․ (Կոնսերվատորիա)", "Մաշտոցի պ․ (Օպերա)", "Բաղրամյան պ․ (Օպերա)", "Բաղրամյան պ․ (Սահմանադրական դատարան)",
                    "Բաղրամյան պ․ (Ամերիկյան համալսարան)", "Բաղրամյան պ․ (Կամոյի դպրոց)", "Բաղրամյան պ․ (Բարեկամություն)", "Կասյան փ․", "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)",
                    "Վաղարշյան փ․", "Սասնա Ծռերի փ․", "Տիգրան Պետրոսյան փ․", "Դավթաշենի 4-րդ թաղ․", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("46", "A", "Առինջ Մոլ", "Հյուսիսային ավտոկայան", "Գազպրոմ Արմենիա", "Թբիլիսյան խճ․ (Ռադիոկայմ)",
                    "Զաքարիա Քանաքեռցու փ․", "Թբիլիսյան խճ․ (Լամպերի լիճ)", "Ազատության պ․ (Ռայկոմ)", "Ազատության պ․ (Նաիրի Զարյան խաչմերուկ)", "Ազատության պ․ (Զինկոմիսարիատ)",
                    "Ազատության պ․ (Հաղթանակի այգի)", "Սարալանջի փ․", "Աբովյան փ․ (Պլանի գլուխ)", "Աբովյան փ․ (Գյուղակադեմիա)", "Աբովյան փ․ (Երիտասարդական մ/կ)",
                    "Մոսկովյան փ․ (Կամերային երաժշտության տուն)", "Խանջյան փ․ (Շախմատի տուն)", "Վերնիսաժ", "Խանջյան փ․ (Լունապարկ)", "Մանկավարժական համալսարան",
                    "Տիգրան Մեծի պ․ (Այրարատ կ/թ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)", "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)", "Տիգրան Մեծի պ․ (Կայարան)", "Արցախի փ․", "Էրեբունու փ․",
                    "Այվազովսկու փ․", "Տիտոգրադյան փ․", "Խաղաղ Դոնի փ․", "Էրեբունու զ/ծ", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("47", "A", "գ.Առինջ", "Աճառյան փ.", "Գազպրոմ Արմենիա", "Թբիլիսյան խճ․ (Ռադիոկայմ)",
                    "Զաքարիա Քանաքեռցու փ․", "Թբիլիսյան խճ․ (Լամպերի լիճ)", "Ազատության պ․ (Ռայկոմ)", "Կոմիտասի պ․ (Լամբադա կամուրջ)", "Կոմիտասի պ․ (Կոմիտասի շուկա)",
                    "Կոմիտասի պ․ (Վրացական խաչմերուկ)", "Կոմիտասի պ․ (Սլավոնական համալսարան)", "Կոմիտասի պ․ (Փափազյան խաչմերուկ)", "Կոմիտասի պ․ (Վաղարշյան խաչմերուկ)",
                    "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)", "Կասյան փ․", "Բաղրամյան պ․ (Բարեկամություն)", "Բաղրամյան պ․ (Կամոյի դպրոց)", "Բաղրամյան պ․ (Ամերիկյան համալսարան)",
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

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("55", "A", "Գարեգին Նժդեհի հրապարակ", "Աշխատանքի հրապարակ (Բանվորի արձան)", "Ներագավթի 1-ին փ․",
                    "գ.Այնթապ", "Նոր Խարբերդ", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("56", "A", "ՀԱԹ", "Առնո Բաբաջանյան փ․", "Րաֆֆու փ․", "Րաֆֆու փ․ (Մալաթիայի շուկա)",
                    "Սեբաստիայի փ․ (Մալաթիայի շուկա)", "Սեբաստիայի փ․ (Կուրղինյան խաչմերուկ)", "Ծովակալ Իսակովի պ․", "Կիլիկիա ավտոկայան", "Հաղթանակ կամուրջ", "Արգիշտի փ․",
                    "Գրիգոր Լուսավորիչ (Երևանի քաղաքապետարան)", "Արշակունյաց պ․ (Կրկես)", "Ագաթանգեղոսի փ․", "Մանկավարժական համալսարան", "Խանջյան փ․ (Լունապարկ)",
                    "Վերնիսաժ", "Խանջյան փ․ (Շախմատի տուն)", "Մոսկովյան փ․ (Կամերային երաժշտության տուն)", "Աբովյան փ․ (Երիտասարդական մ/կ)", "Աբովյան փ․ (Գյուղակադեմիա)",
                    "Աբովյան փ․ (Պլանի գլուխ)", "Սարալանջի փ․", "Ազատության պ․ (Հաղթանակի այգի)", "Ազատության պ․ (Զինկոմիսարիատ)", "Ազատության պ․ (Նաիրի Զարյան խաչմերուկ)",
                    "Ազատության պ․ (Ռայկոմ)", "Ներսիսյան փ․", "Քանաքեռ-Զեյթուն բ/կ", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("57", "A", "15-րդ թաղ.", "Մազմանյան փ․", "Չաուշի փ․", "Մելքումովի փ.", "Ֆուչիկի փ․",
                    "Մարգարյան փ․ (Հանրապետական հիվ․)", "Հալաբյան փ․ (Ֆիզիկայի խաչմերուկ)", "Հալաբյան փ․ (Ֆիզիկայի խաչմերուկ)", "Հալաբյան փ․ (ԹՈՒՄՈ)",
                    "Հալաբյան փ․ (Կիևյան կամուրջ)", "Կիևյան փ․ (Կիևյան կամուրջ)", "Կիևյան փ․ (Օրբելի խաչմերուկ)", "Կիևյան փ․ (Բարեկամություն)", "Բաղրամյան պ․ (Բարեկամություն)",
                    "Բաղրամյան պ․ (Կամոյի դպրոց)", "Բաղրամյան պ․ (Ամերիկյան համալսարան)", "Բաղրամյան պ․ (Սահմանադրական դատարան)", "Բաղրամյան պ․ (Օպերա)",
                    "Սայաթ-Նովա պ․ (Նալբանդյան խաչմերուկ)", "Սայաթ-Նովա պ․ (Ալեք Մանուկյան խաչմերուկ)", "Ալեք-Մանուկյան փ․", "Երվանդ Քոչար փ․", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)",
                    "Նար-Դոսի փ․ (Սիլաչի խաչմերուկ)", "Խորենացու փ․ (Սիլաչի)", "Զավարյան փ․", "Գումի շուկա", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("58", "A", "Էրեբունու զ/ծ ", "Խաղաղ Դոնի փ․", "Տիտոգրադյան փ․", "Այվազովսկու փ․", "Էրեբունու փ․",
                    "Աթոյան փ․", "Բելինսկու փ․", "Սասունցի Դավթի փ․", "Տիգրան Մեծի պ․ (Կայարան)", "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)",
                    "Տիգրան Մեծի պ․ (Այրարատ կ/թ)", "Մանկավարժական համալսարան", "Տիգրան Մեծի պ․ (Ֆիրդուսի շուկա)", "Հանրապետության Հրապարակ", "Ամիրյան փ․",
                    "Մաշտոցի պ․ (Ամիրյան խաչմերուկ)", "Մաշտոցի պ․ (Մարգարյան հիվ․)", "Մաշտոցի պ․ (Օպերա)", "Բաղրամյան պ․ (Օպերա)", "Բաղրամյան պ․ (Սահմանադրական դատարան)",
                    "Բաղրամյան պ․ (Ամերիկյան համալսարան)", "Բաղրամյան պ․ (Կամոյի դպրոց)", "Բաղրամյան պ․ (Բարեկամություն)", "Կասյան փ․", "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)",
                    "Կոմիտասի պ․ (Վաղարշյան խաչմերուկ)", "Կոմիտասի պ․ (Փափազյան խաչմերուկ)", "Կոմիտասի պ․ (Սլավոնական համալսարան)", "Կոմիտասի պ․ (Վրացական խաչմերուկ)",
                    "Կոմիտասի պ․ (Կոմիտասի շուկա)", "Կոմիտասի պ․ (Լամբադա կամուրջ)", "Ազատության պ․ (Ռայկոմ)", "Պարույր Սևակի փ․", "Ռուբինյանց փ․ (Երևան Սիթի)",
                    "Ռուբինյանց փ․ (Ալմաստ գ/ն)", "Խուդյակովի փ․", "Թումանյան թաղ.", "Մարշալ Բաբաջանյան փ․", "Աշխաբադի փ․", "Ավան-Առինջ", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("62", "A", "Պռոշյան ավան", "Աշտարակի խճ․", "Մելքումովի փ․", "Բեկնազարյան փ․", "Մազմանյան փ․",
                    "Շիրազի փ․", "Գրիգոր Հասրաթյան փ․", "Լենինգրադյան փ․ (Եվրովագեն)", "Լենինգրադյան փ․ (Շինարարների խաչմերուկ)", "Լենինգրադյան փ․ (Մոնթե Մելքոնյան խաչմերուկ)",
                    "Ծիծեռնակաբերդի խճ․", "Դալմա Գարդեն Մոլ", "Աթենքի փ․", "Հրազդան մ/դ", "Հաղթանակ կամուրջ", "Մաշտոցի պ․ (Ծածկած շուկա)", "Մաշտոցի պ․ (Ձկան խանութ)",
                    "Ամիրյան փ․", "Հանրապետության Հրապարակ", "Տիգրան Մեծի պ․ (Ֆիրդուսի շուկա)", "Մանկավարժական համալսարան", "Տիգրան Մեծի պ․ (Այրարատ կ/թ)",
                    "Տիգրան Մեծի պ․ (Տաշիր ա/կ)", "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)", "Տիգրան Մեծի պ․ (Կայարան)", "Արցախի պ․", "Արին Բերդի փ.", "Մսի կոմբինատ", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("63", "A", "Նոր Նորքի 9-րդ զ/ծ", "Վիլնյուսի փ․", "Նոր Նորքի 7-րդ զ/ծ", "Հունան Ավետիսյան փ․", "Դավիթ Բեկի փ․",
                    "Բադալ Մուրադյան փ․", "Գայի պ․ (Մերսեդեսի սրահ)", "Գայի պ․ (Գայի արձան)", "Գայի պ․ (Աքվատեք)", "Մյասնիկյան պ․ (Ջրաշխարհ)",
                    "Մյասնիկյան պ․ (Կենդանաբանական այգի)", "Մյասնիկյան պ․ (Հերացի խաչմերուկ)", "Աբովյան փ․ (Պլանի գլուխ)", "Աբովյան փ․ (Գյուղակադեմիա)",
                    "Աբովյան փ․ (Երիտասարդական մ/կ)", "Մոսկովյան փ․ (Կամերային երաժշտության տուն)", "Խանջյան փ․ (Շախմատի տուն)", "Վերնիսաժ", "Խանջյան փ․ (Լունապարկ)",
                    "Մանկավարժական համալսարան", "Տիգրան Մեծի պ․ (Ֆիրդուսի շուկա)", "Հանրապետության Հրապարակ", "Ամիրյան փ․", "Մաշտոցի պ․ (Ծածկած շուկա)",
                    "Մաշտոցի պ․ (Ձկան խանութ)", "Հաղթանակ կամուրջ", "Հրազդան մ/դ", "Աթենքի փ․", "Դալմա Գարդեն Մոլ", "Ծիծեռնակաբերդի խճ․",
                    "Լենինգրադյան փ․ (Մոնթե Մելքոնյան խաչմերուկ)", "Հալաբյան փ․ (Կիևյան կամուրջ)", "Հալաբյան փ․ (ԹՈՒՄՈ)", "Հալաբյան փ․ (Ֆիզիկայի խաչմերուկ)",
                    "Մարգարյան փ․ (Հանրապետական հիվ․)", "Մարգարյան փ․ (Պեգաս)", "Բաշինջաղյան փ․", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("67", "A", "Նազարբեկյան թաղ.", "Սիլիկյան Նոր խճ․", "Գրիգոր Հասրաթյան փ․",
                    "Սեբաստիայի փ․ (Լենինգրադյան խաչմերուկ)", "Սեբաստիայի փ․ (Տիչինայի խաչմերուկ)", "Սեբաստիայի փ․ (Մալաթիայի շուկա)", "Սեբաստիայի փ․ (Կուրղինյան խաչմերուկ)",
                    "Ծովակալ Իսակովի պ․ (Սեբաստիայի խաչմերուկ)", "Կիլիկիա ավտոկայան", "Հաղթանակ կամուրջ", "Մաշտոցի պ․ (Ձկան խանութ)", "Մաշտոցի պ․ (Ծածկած շուկա)", "Ամիրյան փ․",
                    "Հանրապետության Հրապարակ", "Տիգրան Մեծի պ․ (Ֆիրդուսի շուկա)", "Մանկավարժական համալսարան", "Տիգրան Մեծի պ․ (Այրարատ կ/թ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)",
                    "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)", "Տիգրան Մեծի պ․ (Կայարան)", "Արցախի պ․", "Ռոստովյան փ․", "Մուրացանի փ․", "Էրեբունու փ․", "Աթոյան փ․", "Այվազովսկու փ․",
                    "Ավանեսովի փ․", "Էրեբունու զ/ծ ", "Առնո Բաբաջանյան փ․", "Զորավար Անդրանիկի փ․", "Րաֆֆու փ․", "Րաֆֆու փ․ (Մալաթիայի շուկա)", "Սեբաստիայի փ․ (Մալաթիայի շուկա)",
                    "Վանթյան փ․", "Կուրղինյան փ․", "Սեբաստիայի փ․ (Կուրղինյան խաչմերուկ)", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("68", "A", "Էներգետիկների բանավան", "Էջմիածնի խճ.", "Ծովակալ Իսակովի պ․ (Սեբաստիայի խաչմերուկ)",
                    "Կիլիկիա ավտոկայան", "Հաղթանակ կամուրջ", "Մաշտոցի պ․ (Ձկան խանութ)", "Մաշտոցի պ․ (Ծածկած շուկա)", "Ամիրյան փ․", "Հանրապետության Հրապարակ",
                    "Տիգրան Մեծի պ․ (Ֆիրդուսի շուկա)", "Մանկավարժական համալսարան", "Տիգրան Մեծի պ․ (Այրարատ կ/թ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)", "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)",
                    "Տիգրան Մեծի պ․ (Կայարան)", "Սասունցի Դավթի փ․", "Կուստոյի փ․", "Քաղաքային պանթեոն", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("259", "A", "Կիլիկիա ավտոկայան", "Հաղթանակ կամուրջ", "Մաշտոցի պ․ (Ձկան խանութ)",
                    "Մաշտոցի պ․ (Ծածկած շուկա)", "Մաշտոցի պ․ (Ամիրյան խաչմերուկ)", "Մաշտոցի պ․ (Մարգարյան հիվ․)", "Մաշտոցի պ․ (Օպերա)", "Բաղրամյան պ․ (Օպերա)",
                    "Բաղրամյան պ․ (Սահմանադրական դատարան)", "Բաղրամյան պ․ (Ամերիկյան համալսարան)", "Բաղրամյան պ․ (Կամոյի դպրոց)", "Բաղրամյան պ․ (Բարեկամություն)",
                    "Կասյան փ․", "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)", "Կոմիտասի պ․ (Վաղարշյան խաչմերուկ)", "Կոմիտասի պ․ (Փափազյան խաչմերուկ)",
                    "Կոմիտասի պ․ (Սլավոնական համալսարան)", "Կոմիտասի պ․ (Վրացական խաչմերուկ)", "Կոմիտասի պ․ (Կոմիտասի շուկա)", "Կոմիտասի պ․ (Լամբադա կամուրջ)",
                    "Ազատության պ․ (Ռայկոմ)", "Թբիլիսյան խճ․ (Լամպերի լիճ)", "Թբիլիսյան խճ․ (Լամպերի գ/ն)", "Թբիլիսյան խճ․ (Այբ ավագ դպրոց)",
                    "Թբիլիսյան խճ․ (Երևանի Շամպայնի գ/ն)", "Թբիլիսյան խճ․ (Ռադիոկայմ)", "Գազպրոմ Արմենիա", "գ․ Վերին Պտղնի", "գ․ Բալահովիտ", "ք․ Աբովյան", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("261", "A", "Տիգրան Մեծի պ․ (Կայարան)", "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)",
                    "Տիգրան Մեծի պ․ (Այրարատ կ/թ)", "Մանկավարժական համալսարան", "Խանջյան փ․ (Լունապարկ)", "Վերնիսաժ", "Հերացու փ․", "Մյասնիկյան պ․ (Հերացի խաչմերուկ)",
                    "Մյասնիկյան պ․ (Կենդանաբանական այգի)", "Մյասնիկյան պ․ (Ջրաշխարհ)", "Բուսաբանական այգի", "Աճառյան փ․", "գ․ Վերին Պտղնի", "գ․ Բալահովիտ", "ք․ Աբովյան", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("1", "M", "Էրեբունի օդանավակայան", "Աշխատանքի հրապարակ (Բանվորի արձան)",
                    "Արշակունյաց պ․ (Դեպի Չարբախ)", "Բագրատունյաց պ․ (Բանվորի արձան)", "Գարեգին Նժդեհի հրապարակ", "Բագրատունյաց պ․ (Արտաշիսյան խաչմերուկ)",
                    "Բագրատունյաց պ․ (Երևան Սիթի)", "Բագրատունյաց պ․ (Իսակով խաչմերուկ)", "Սեբաստիայի փ․ (Կուրղինյան խաչմերուկ)", "Սեբաստիայի փ․ (Մալաթիայի շուկա)",
                    "Րաֆֆու փ․ (Մալաթիայի շուկա)", "Րաֆֆու փ․", "Գուսան Շերամի փ․", "Օհանովի փ․", "Զորավար Անդրանիկի փ․", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("2", "M", "Ուռուցքաբանության ինստիտուտ", "Ֆանարջյան փ․", "Զաքարիա Քանաքեռցու փ․", "Էզրաս Հասրաթյան փ․",
                    "Ուլնեցու փ․", "Ներսիսյան փ․", "Ազատության պ․ (Ռայկոմ)", "Կոմիտասի պ․ (Լամբադա կամուրջ)", "Կոմիտասի պ․ (Կոմիտասի շուկա)", "Կոմիտասի պ․ (Վրացական խաչմերուկ)",
                    "Կոմիտասի պ․ (Սլավոնական համալսարան)", "Կոմիտասի պ․ (Փափազյան խաչմերուկ)", "Կոմիտասի պ․ (Վաղարշյան խաչմերուկ)", "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)",
                    "Կասյան փ․", "Բաղրամյան պ․ (Բարեկամություն)", "Բաղրամյան պ․ (Կամոյի դպրոց)", "Բաղրամյան պ․ (Ամերիկյան համալսարան)", "Բաղրամյան պ․ (Սահմանադրական դատարան)",
                    "Բաղրամյան պ․ (Օպերա)", "Մաշտոցի պ․ (Օպերա)", "Մաշտոցի պ․ (Կոնսերվատորիա)", "Մաշտոցի պ․ (Մատենադարան)", "Կորյունի փ․ (Ցիտադել)", "Բժշկական համալսարան",
                    "Չարենցի փ․ (ՀՀ Ոստիկանություն)", "Չարենցի փ․ (ԵՊՀ)", "Չարենցի փ․ (Zigzag խանութ-սրահ)", "Սայաթ-Նովա պ․ (Ալեք Մանուկյան խաչմերուկ)", "Ալեք-Մանուկյան փ․",
                    "Վարդանանց փ․", "Հանրապետական մ/դ", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("3", "M", "15-րդ թաղ.", "Բաշինջաղյան փ․", "Մարգարյան փ․ (Պեգաս)", "Մարգարյան փ․ (Հանրապետական հիվ․)",
                    "Հալաբյան փ․ (Ֆիզիկայի խաչմերուկ)", "Հալաբյան փ․ (ԹՈՒՄՈ)", "Հալաբյան փ․ (Կիևյան կամուրջ)", "Կիևյան փ․ (Կիևյան կամուրջ)", "Կիևյան փ․ (Օրբելի խաչմերուկ)",
                    "Կիևյան փ․ (Բարեկամություն)", "Կասյան փ․", "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)", "Կոմիտասի պ․ (Վաղարշյան խաչմերուկ)", "Կոմիտասի պ․ (Փափազյան խաչմերուկ)",
                    "Փափազյան փ․", "Արամ Խաչատրյան փ․", "Ռիգայի փ․", "Ռուս-Հայկական համալսարան", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("4", "M", "Պարույր Սևակի փ․", "Ազատության պ․ (Ռայկոմ)", "Կոմիտասի պ․ (Լամբադա կամուրջ)",
                    "Կոմիտասի պ․ (Կոմիտասի շուկա)", "Կոմիտասի պ․ (Վրացական խաչմերուկ)", "Կոմիտասի պ․ (Սլավոնական համալսարան)", "Կոմիտասի պ․ (Փափազյան խաչմերուկ)",
                    "Կոմիտասի պ․ (Վաղարշյան խաչմերուկ)", "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)", "Կասյան փ․", "Բաղրամյան պ․ (Բարեկամություն)", "Բաղրամյան պ․ (Կամոյի դպրոց)",
                    "Բաղրամյան պ․ (Ամերիկյան համալսարան)", "Բաղրամյան պ․ (Սահմանադրական դատարան)", "Բաղրամյան պ․ (Օպերա)", "Մաշտոցի պ․ (Օպերա)", "Մաշտոցի պ․ (Մարգարյան հիվ․)",
                    "Մաշտոցի պ․ (Ամիրյան խաչմերուկ)", "Մաշտոցի պ․ (Ծածկած շուկա)", "Մաշտոցի պ․ (Ձկան խանութ)", "Հաղթանակ կամուրջ", "Աթենքի փ․", "Հրազդան մ/դ",
                    "Դալմա Գարդեն Մոլ", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("5", "M", "Ավան ", "Դուրյան թաղ․", "Նվեր Սաֆարյան փ․", "Մարշալ Բաբաջանյան փ․", "Աճառյան փ․",
                    "Ռուբինյանց փ․ (Ալմաստ գ/ն)", "Ռուբինյանց փ․ (Երևան Սիթի)", "Ռուբինյանց փ․ (Ահարոնյան փ․)", "Դավիթ Անհաղթի պ․ (Դրոյի խաչմերուկ)",
                    "Դավիթ Անհաղթի պ․ (Կերամա Մարացի)", "Դավիթ Անհաղթի պ․ (թաղապետարան)", "Կոմիտասի պ․ (Լամբադա կամուրջ)", "Կոմիտասի պ․ (Կոմիտասի շուկա)",
                    "Կոմիտասի պ․ (Վրացական խաչմերուկ)", "Կոմիտասի պ․ (Սլավոնական համալսարան)", "Կոմիտասի պ․ (Փափազյան խաչմերուկ)", "Կոմիտասի պ․ (Վաղարշյան խաչմերուկ)",
                    "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)", "Կասյան փ․", "Կիևյան փ․ (Բարեկամություն)", "Կիևյան փ․ (Օրբելի խաչմերուկ)", "Կիևյան փ․ (Կիևյան կամուրջ)",
                    "Հալաբյան փ․ (Կիևյան կամուրջ)", "Հալաբյան փ․ (ԹՈՒՄՈ)", "Հալաբյան փ․ (Ֆիզիկայի խաչմերուկ)", "Հալաբյան փ․ (Ֆիզիկայի խաչմերուկ)",
                    "Մարգարյան փ․ (Հանրապետական հիվ․)", "Ֆուչիկի փ․", "Մելքումովի փ.", "Նորաշեն թաղ․", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("6", "M", "Նոր Նորքի 3-րդ զ/ծ", "Գյուրջյան փ․", "Շոպրոնի փ․", "Բադալ Մուրադյան փ․",
                    "Գայի պ․ (Մերսեդեսի սրահ)", "Գայի պ․ (Գայի արձան)", "Գայի պ․ (Աքվատեք)", "Ռուբինյանց փ․ (Ալմաստ գ/ն)", "Ռուբինյանց փ․ (Երևան Սիթի)",
                    "Ռուբինյանց փ․ (Ահարոնյան փ․)", "Դավիթ Անհաղթի պ․ (Դրոյի խաչմերուկ)", "Դավիթ Անհաղթի պ․ (Կերամա Մարացի)", "Դավիթ Անհաղթի պ․ (թաղապետարան)",
                    "Կոմիտասի պ․ (Լամբադա կամուրջ)", "Կոմիտասի պ․ (Կոմիտասի շուկա)", "Կոմիտասի պ․ (Վրացական խաչմերուկ)", "Կոմիտասի պ․ (Սլավոնական համալսարան)",
                    "Կոմիտասի պ․ (Փափազյան խաչմերուկ)", "Կոմիտասի պ․ (Վաղարշյան խաչմերուկ)", "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)", "Կասյան փ․", "Կիևյան փ․ (Բարեկամություն)",
                    "Կիևյան փ․ (Օրբելի խաչմերուկ)", "Կիևյան փ․ (Կիևյան կամուրջ)", "Լենինգրադյան փ․ (Կիևյան կամուրջ)", "Լենինգրադյան փ․ (Մոնթե Մելքոնյան խաչմերուկ)",
                    "Լենինգրադյան փ․ (Շինարարների խաչմերուկ)", "Լենինգրադյան փ․ (Եվրովագեն)", "Սեբաստիայի փ․ (Լենինգրադյան խաչմերուկ)", "Սեբաստիայի փ․ (Տիչինայի խաչմերուկ)",
                    "Սեբաստիայի փ․ (Մալաթիայի շուկա)", "Րաֆֆու փ․ (Մալաթիայի շուկա)", "Րաֆֆու փ․", "Առնո Բաբաջանյան փ․", "ՀԱԹ", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("7", "M", "Նոր Նորքի 9-րդ զ/ծ", "Վիլնյուսի փ․", "Նոր Նորքի 7-րդ զ/ծ", "Հունան Ավետիսյան փ․", "Դավիթ Բեկի փ․",
                    "Ազատամարտիկների փ․", "Սասունցի Դավթի փ.", "Արցախի պ.", "Վստրեչի կամուրջ", "Գարեգին Նժդեհի փ․", "Գարեգին Նժդեհի հրապարակ",
                    "Բագրատունյաց պ․ (Արտաշիսյան խաչմերուկ)", "Արտաշիսյան փ․", "Չեխովի փ․", "Հ․Հովսեփյան փ․", "Տարոնցու փ․", "Շենգավիթ մ/կ", "Ներքին Շենգավիթի 9-րդ փ.",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("8", "M", "Քանաքեռ ՀԷԿ", "Ղափանցյան փ․", "Ադոնցի փ․", "Կանազ հոսպիտալ", "Շիրվանզադեի փ․",
                    "Կոմիտասի պ․ (Լամբադա կամուրջ)", "Կոմիտասի պ․ (Կոմիտասի շուկա)", "Կոմիտասի պ․ (Վրացական խաչմերուկ)", "Կոմիտասի պ․ (Սլավոնական համալսարան)",
                    "Կոմիտասի պ․ (Փափազյան խաչմերուկ)", "Կոմիտասի պ․ (Վաղարշյան խաչմերուկ)", "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)", "Կասյան փ․",
                    "Բաղրամյան պ․ (Բարեկամություն)", "Բաղրամյան պ․ (Կամոյի դպրոց)", "Պռոշյան փ․ ", "Պարոնյան փ․ (Նաիրի բ/կ)", "Պարոնյան փ․ (Կեսարի պալատ)",
                    "Գրիգոր Լուսավորիչ (Երևանի քաղաքապետարան)", "Արշակունյաց պ․ (Կրկես)", "Արշակունյաց պ․ (Սուրմալու)", "Արշակունյաց պ․ (Կոմիտասի այգի)",
                    "Արշակունյաց պ․ (Երևան Մոլ)", "Արշակունյաց պ․ (Հայրենիք կ/թ)", "Գարեգին Նժդեհի փ․", "Գարեգին Նժդեհի հրապարակ", "Մանանդյան փ.", "Արաքս մ/դ", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("9", "M", "Ջրվեժ", "Մինսկի փ․", "Միկոյան փ․", "Բադալ Մուրադյան փ․", "Մյասնիկյան պ․ (Ջրաշխարհ)",
                    "Մյասնիկյան պ․ (Կենդանաբանական այգի)", "Մյասնիկյան պ․ (Հերացի խաչմերուկ)", "Հերացու փ․", "Չարենցի փ․ (ՀՀ Ոստիկանություն)", "Նալբանդյան փ․ (ԵՊՏՀ)",
                    "Խանջյան փ․ (Շախմատի տուն)", "Վերնիսաժ", "Խանջյան փ․ (Լունապարկ)", "Մանկավարժական համալսարան", "Տիգրան Մեծի պ․ (Այրարատ կ/թ)",
                    "Տիգրան Մեծի պ․ (Տաշիր ա/կ)", "Քրիստափորի փ․", "Փեթակ ա/կ", "Սևանի փ․", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", ""));

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
                    "Խորենացու փ․ (Մաշտոց խաչմերուկ)", "Մաշտոցի պ․ (Ծածկած շուկա)", "Մաշտոցի պ․ (Ձկան խանութ)", "Հաղթանակ կամուրջ", "Հրազդան մ/դ", "Աթենքի փ․",
                    "Դալմա Գարդեն Մոլ", "Ծիծեռնակաբերդի խճ․", "Մազմանյան փ․", "Չաուշի փ․", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("12", "M", "Լեփսիուսի փ․", "Դրոյի փ․", "Պարույր Սևակի փ․", "Ազատության պ․ (Ռայկոմ)",
                    "Կոմիտասի պ․ (Լամբադա կամուրջ)", "Կոմիտասի պ․ (Կոմիտասի շուկա)", "Կոմիտասի պ․ (Վրացական խաչմերուկ)", "Կոմիտասի պ․ (Սլավոնական համալսարան)",
                    "Կոմիտասի պ․ (Փափազյան խաչմերուկ)", "Կոմիտասի պ․ (Վաղարշյան խաչմերուկ)", "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)", "Կասյան փ․",
                    "Կիևյան փ․ (Բարեկամություն)", "Կիևյան փ․ (Օրբելի խաչմերուկ)", "Կիևյան փ․ (Կիևյան կամուրջ)", "Հալաբյան փ․ (Կիևյան կամուրջ)", "Հալաբյան փ․ (ԹՈՒՄՈ)",
                    "Հալաբյան փ․ (Ֆիզիկայի խաչմերուկ)", "Մարգարյան փ․ (Հանրապետական հիվ․)", "Մարգարյան փ․ (Պեգաս)", "Բաշինջաղյան փ․", "Մազմանյան փ․", "15-րդ թաղ.",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("13", "M", "Ներքին Շենգավիթ", "Թադևոսյան փ․", "Բագրատունյաց պ․ (Բանվորի արձան)",
                    "Գարեգին Նժդեհի հրապարակ", "Բագրատունյաց պ․ (Արտաշիսյան խաչմերուկ)", "Բագրատունյաց պ․ (Երևան Սիթի)", "Բագրատունյաց պ․ (Իսակով խաչմերուկ)",
                    "Ծովակալ Իսակովի պ․ (Սեբաստիայի խաչմերուկ)", "Կիլիկիա ավտոկայան", "Ծովակալ Իսակովի պ․", "Հաղթանակ կամուրջ", "Մաշտոցի պ․ (Ձկան խանութ)",
                    "Մաշտոցի պ․ (Ծածկած շուկա)", "Մաշտոցի պ․ (Ամիրյան խաչմերուկ)", "Մաշտոցի պ․ (Մարգարյան հիվ․)", "Մաշտոցի պ․ (Օպերա)", "Բաղրամյան պ․ (Օպերա)",
                    "Բաղրամյան պ․ (Սահմանադրական դատարան)", "Բաղրամյան պ․ (Ամերիկյան համալսարան)", "Բաղրամյան պ․ (Կամոյի դպրոց)", "Բաղրամյան պ․ (Բարեկամություն)",
                    "Կիևյան փ․ (Բարեկամություն)", "Կիևյան փ․ (Օրբելի խաչմերուկ)", "Կիևյան փ․ (Կիևյան կամուրջ)", "Հալաբյան փ․ (Կիևյան կամուրջ)", "Հալաբյան փ․ (ԹՈՒՄՈ)",
                    "Հալաբյան փ․ (Ֆիզիկայի խաչմերուկ)", "Իոսիֆյան փ․", "Տիգրան Պետրոսյան փ․", "Աղաբաբյան փ․", "Դավթաշենի 1-ին թաղ․", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("14", "M", "Նուբարաշենի խճ. (Զորամաս)", "Խաղաղ Դոնի փ․", "Տիտոգրադյան փ․", "Այվազովսկու փ․",
                    "Էրեբունու փ․", "Ազատամարտիկների փ․", "Սասունցի Դավթի փ․", "Բելինսկու փ․", "Խորենացու փ․ (Սիլաչի)", "Նար-Դոսի փ․ (Սիլաչի խաչմերուկ)",
                    "Տիգրան Մեծի պ․ (Տաշիր ա/կ)", "Տիգրան Մեծի պ․ (Այրարատ կ/թ)", "Մանկավարժական համալսարան", "Խանջյան փ․ (Լունապարկ)", "Վերնիսաժ",
                    "Խանջյան փ․ (Շախմատի տուն)", "Մոսկովյան փ․ (Կամերային երաժշտության տուն)", "Աբովյան փ․ (Երիտասարդական մ/կ)", "Աբովյան փ․ (Գյուղակադեմիա)",
                    "Աբովյան փ․ (Պլանի գլուխ)", "Սարալանջի փ․", "Ազատության պ․ (Հաղթանակի այգի)", "Ազատության պ․ (Զինկոմիսարիատ)", "Ազատության պ․ (Նաիրի Զարյան խաչմերուկ)",
                    "Ազատության պ․ (Ռայկոմ)", "Ադոնցի փ․", "Ղափանցյան փ․", "Քանաքեռ ՀԷԿ", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("15", "M", "Ավան ", "Մարշալ Խուդյակովի փ․", "Ալմաթիի փ․", "Մարշալ Բաբաջանյան փ․",
                    "Աճառյան փ․", "Ռուբինյանց փ․ (Ալմաստ գ/ն)", "Ռուբինյանց փ․ (Երևան Սիթի)", "Պարույր Սևակի փ․", "Ազատության պ․ (Ռայկոմ)", "Կոմիտասի պ․ (Լամբադա կամուրջ)",
                    "Կոմիտասի պ․ (Կոմիտասի շուկա)", "Գրիբոյեդովի փ․", "Նաիրի Զարյան փ․", "Բորսայի շենք", "Հրաչյա Քոչար փ․ (Վրացական խաչմերուկ)",
                    "Հրաչյա Քոչար փ․ (Փափազյան խաչմերուկ)", "Հրաչյա Քոչար փ․ (Վաղարշյան խաչմերուկ)", "Վաղարշյան փ․", "Դավթաշենի կամուրջ", "Սասնա Ծռերի փ․",
                    "Տիգրան Պետրոսյան փ․", "Դավթաշենի 4-րդ թաղ․", "Ադոնցի փ․", "Ազատության պ․ (Ռայկոմ)", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("16", "M", "Ավան ", "Մարշալ Խուդյակովի փ․", "Ալմաթիի փ․", "Մարշալ Բաբաջանյան փ․",
                    "Աճառյան փ․", "Գայի պ․ (Գայի արձան)", "Գայի պ․ (Մերսեդեսի սրահ)", "Բադալ Մուրադյան փ․", "Դավիթ Բեկի փ․", "Հունան Ավետիսյան փ․", "Նոր Նորքի 7-րդ զ/ծ",
                    "Վիլնյուսի փ․", "Նոր Նորքի 9-րդ զ/ծ", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("17", "M", "Արմենալ գ/ն", "Կոմիտասի պ․ (Լամբադա կամուրջ)", "Կոմիտասի պ․ (Կոմիտասի շուկա)",
                    "Կոմիտասի պ․ (Վրացական խաչմերուկ)", "Կոմիտասի պ․ (Սլավոնական համալսարան)", "Կոմիտասի պ․ (Փափազյան խաչմերուկ)", "Կոմիտասի պ․ (Վաղարշյան խաչմերուկ)",
                    "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)", "Կասյան փ․", "Կիևյան փ․ (Բարեկամություն)", "Կիևյան փ․ (Օրբելի խաչմերուկ)", "Կիևյան փ․ (Կիևյան կամուրջ)",
                    "Լենինգրադյան փ․ (Կիևյան կամուրջ)", "Լենինգրադյան փ․ (Մոնթե Մելքոնյան խաչմերուկ)", "Լենինգրադյան փ․ (Շինարարների խաչմերուկ)",
                    "Լենինգրադյան փ․ (Եվրովագեն)", "Սեբաստիայի փ․ (Լենինգրադյան խաչմերուկ)", "Սեբաստիայի փ․ (Տիչինայի խաչմերուկ)", "Սեբաստիայի փ․ (Մալաթիայի շուկա)",
                    "Սեբաստիայի փ․ (Կուրղինյան խաչմերուկ)", "Ծովակալ Իսակովի պ․ (Սեբաստիայի խաչմերուկ)", "Էջմիածնի խճ․", "Զվարթնոց օդանավակայան", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

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
                    "Դավիթ Անհաղթի պ․ (թաղապետարան)", "Դավիթ Անհաղթի պ․ (Կերամա Մարացի)", "Դավիթ Անհաղթի պ․ (Դրոյի խաչմերուկ)", "Ռուբինյանց փ․ (Ահարոնյան փ․)",
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
                    "Կիևյան փ․ (Բարեկամություն)", "Բաղրամյան պ․ (Բարեկամություն)", "Բաղրամյան պ․ (Կամոյի դպրոց)", "Բաղրամյան պ․ (Ամերիկյան համալսարան)",
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
                    "Րաֆֆու փ․", "Գուսան Շերամի փ․", "Օհանովի փ․", "գ.Հաղթանակի 1-ին փ․", "գ.Հաղթանակի 6-րդ փ․", "գ.Հաղթանակի 9-րդ փ․", "գ.Հաղթանակի 10-րդ փ․",
                    "գ.Հաղթանակի 7-րդ փ․", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("24", "M", "Նորագյուղ", "Էջմիածնի հին խճ․", "Ծովակալ Իսակովի պ․", "Կիլիկիա ավտոկայան",
                    "Հաղթանակ կամուրջ", "Մաշտոցի պ․ (Ձկան խանութ)", "Մաշտոցի պ․ (Ծածկած շուկա)", "Մաշտոցի պ․ (Ամիրյան խաչմերուկ)", "Մաշտոցի պ․ (Մարգարյան հիվ․)",
                    "Մաշտոցի պ․ (Օպերա)", "Բաղրամյան պ․ (Օպերա)", "Բաղրամյան պ․ (Սահմանադրական դատարան)", "Բաղրամյան պ․ (Ամերիկյան համալսարան)", "Բաղրամյան պ․ (Կամոյի դպրոց)"
                    , "Բաղրամյան պ․ (Բարեկամություն)", "Կասյան փ․", "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)", "Կոմիտասի պ․ (Վաղարշյան խաչմերուկ)",
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

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("28", "M", "Շահումյանի 4-րդ փ․", "Առնո Բաբաջանյան փ․", "Զորավար Անդրանիկի փ․", "Րաֆֆու փ․",
                    "Րաֆֆու փ․ (Մալաթիայի շուկա)", "Սեբաստիայի փ․ (Մալաթիայի շուկա)", "Վարուժանի փ․", "Վանթյան փ․", "Կուրղինյան փ․", "Սեբաստիայի փ․ (Կուրղինյան խաչմերուկ)",
                    "Բագրատունյաց պ․ (Իսակով խաչմերուկ)", "Բագրատունյաց պ․ (Երևան Սիթի)", "Բագրատունյաց պ․ (Արտաշիսյան խաչմերուկ)", "Գարեգին Նժդեհի հրապարակ",
                    "Գարեգին Նժդեհի փ․", "Արշակունյաց պ․ (Հայրենիք կ/թ)", "Արշակունյաց պ․ (Երևան Մոլ)", "Արշակունյաց պ․ (Կոմիտասի այգի)", "Արշակունյաց պ․ (Սուրմալու)",
                    "Արշակունյաց պ․ (Կրկես)", "Ագաթանգեղոսի փ․", "Մանկավարժական համալսարան", "Խանջյան փ․ (Լունապարկ)", "Վերնիսաժ", "Խանջյան փ․ (Շախմատի տուն)",
                    "Մոսկովյան փ․ (Կամերային երաժշտության տուն)", "Աբովյան փ․ (Երիտասարդական մ/կ)", "Աբովյան փ․ (Գյուղակադեմիա)", "Աբովյան փ․ (Պլանի գլուխ)",
                    "Սարալանջի փ․", "Ազատության պ․ (Հաղթանակի այգի)", "Ազատության պ․ (Զինկոմիսարիատ)", "Վարշավյան փ․", "Ուսումնական հանրակացարաններ", "", "", "", "", "",
                    "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("29", "M", "Արագածի փ.", "Մայիսի 9-ի փ․", "Չեխովի փ․", "Բագրատունյաց պ․ (Արտաշիսյան խաչմերուկ)",
                    "Գարեգին Նժդեհի հրապարակ", "Գարեգին Նժդեհի փ․", "Արշակունյաց պ․ (Հայրենիք կ/թ)", "Արշակունյաց պ․ (Երևան Մոլ)", "Արշակունյաց պ․ (Կոմիտասի այգի)",
                    "Արշակունյաց պ․ (Սուրմալու)", "Արշակունյաց պ․ (Կրկես)", "Ագաթանգեղոսի փ․", "Մանկավարժական համալսարան", "Տիգրան Մեծի պ․ (Այրարատ կ/թ)",
                    "Տիգրան Մեծի պ․ (Տաշիր ա/կ)", "Նար-Դոսի փ․ (Սիլաչի խաչմերուկ)", "Չարենցի փ․ (Zigzag խանութ-սրահ)", "Չարենցի փ․ (ԵՊՀ)", "Չարենցի փ․ (ՀՀ Ոստիկանություն)",
                    "Բժշկական համալսարան", "Աբովյան փ․ (Գյուղակադեմիա)", "Աբովյան փ․ (Պլանի գլուխ)", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("30", "M", "Դավթաշենի 4-րդ թաղ.", "Եղվարդի խճ․", "Տիգրան Պետրոսյան փ․",
                    "Կոմիտասի պ․ (Վաղարշյան խաչմերուկ)", "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)", "Կասյան փ․", "Բաղրամյան պ․ (Բարեկամություն)", "Բաղրամյան պ․ (Կամոյի դպրոց)",
                    "Բաղրամյան պ․ (Ամերիկյան համալսարան)", "Բաղրամյան պ․ (Սահմանադրական դատարան)", "Մոսկովյան փ․ (Կասկադ)", "Մաշտոցի պ․ (Կոնսերվատորիա)",
                    "Մաշտոցի պ․ (Մատենադարան)", "Կորյունի փ․ (Ցիտադել)", "Բժշկական համալսարան", "Նալբանդյան փ․ (ԵՊՏՀ)", "Խանջյան փ․ (Շախմատի տուն)", "Երվանդ Քոչար փ․",
                    "Տիգրան Մեծի պ․ (Տաշիր ա/կ)", "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)", "Տիգրան Մեծի պ․ (Կայարան)", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("31", "M", "Դավթաշենի 4-րդ թաղ.", "Եղվարդի խճ․", "Տիգրան Պետրոսյան փ․", "Իոսիֆյան փ․",
                    "Հալաբյան փ․ (Ֆիզիկայի խաչմերուկ)", "Հալաբյան փ․ (ԹՈՒՄՈ)", "Հալաբյան փ․ (Կիևյան կամուրջ)", "Կիևյան փ․ (Կիևյան կամուրջ)", "Կիևյան փ․ (Օրբելի խաչմերուկ)",
                    "Կիևյան փ․ (Բարեկամություն)", "Կասյան փ․", "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)", "Կոմիտասի պ․ (Վաղարշյան խաչմերուկ)", "Կոմիտասի պ․ (Փափազյան խաչմերուկ)",
                    "Կոմիտասի պ․ (Սլավոնական համալսարան)", "Կոմիտասի պ․ (Վրացական խաչմերուկ)", "Կոմիտասի պ․ (Կոմիտասի շուկա)", "Կոմիտասի պ․ (Լամբադա կամուրջ)",
                    "Դավիթ Անհաղթի պ․ (թաղապետարան)", "Դավիթ Անհաղթի պ․ (Կերամա Մարացի)", "Դավիթ Անհաղթի պ․ (Դրոյի խաչմերուկ)", "Ռուբինյանց փ․ (Ահարոնյան փ․)",
                    "Ռուբինյանց փ․ (Երևան Սիթի)", "Ռուբինյանց փ․ (Ալմաստ գ/ն)", "Գայի պ․ (Աքվատեք)", "Գայի պ․ (Գայի արձան)", "Գայի պ․ (Մերսեդեսի սրահ)", "Հովհաննիսյան փ․",
                    "Թևոսյան փ․", "Քոչինյան փ․", "Ջրվեժ", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("32", "M", "Ավան-Առինջ", "Տաշքենդի փ․", "Մարշալ Բաբաջանյան փ․", "Ալմաթիի փ․", "Մարշալ Խուդյակովի փ․",
                    "Նվեր Սաֆարյան փ․", "Դուրյան թաղ․", "Վախթանգովի փ․", "Թոթովենցի փ․", "Ստեփանյան փ․", "Գայի պ․ (Մերսեդեսի սրահ)", "Բադալ Մուրադյան փ․", "Միկոյան փ․",
                    "Մինսկի փ․", "Վիլնյուսի փ․", "Նոր Նորքի 7-րդ զ/ծ", "Հունան Ավետիսյան փ․", "Դավիթ Բեկի փ․", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("33", "M", "Աերացիա", "Շիրակի 5-րդ նրբ․", "գ. Գեղանիստ", "գ. Արգավանդ", "Ծովակալ Իսակովի պ․",
                    "Առնո Բաբաջանյան փ․", "Զորավար Անդրանիկի փ․", "Րաֆֆու փ․", "Րաֆֆու փ․ (Մալաթիայի շուկա)", "Սեբաստիայի փ․ (Մալաթիայի շուկա)",
                    "Սեբաստիայի փ․ (Կուրղինյան խաչմերուկ)", "Ծովակալ Իսակովի պ․ (Սեբաստիայի խաչմերուկ)", "Կիլիկիա ավտոկայան", "Հաղթանակ կամուրջ", "Մաշտոցի պ․ (Ձկան խանութ)",
                    "Մաշտոցի պ․ (Ծածկած շուկա)", "Մաշտոցի պ․ (Ամիրյան խաչմերուկ)", "Մաշտոցի պ․ (Մարգարյան հիվ․)", "Մաշտոցի պ․ (Օպերա)", "Մաշտոցի պ․ (Կոնսերվատորիա)",
                    "Մոսկովյան փ․ (Կոնսերվատորիա)", "Աբովյան փ․ (Երիտասարդական մ/կ)", "Աբովյան փ․ (Գյուղակադեմիա)", "Աբովյան փ․ (Պլանի գլուխ)", "Սարալանջի փ․",
                    "Ազատության պ․ (Հաղթանակի այգի)", "Ազատության պ․ (Զինկոմիսարիատ)", "Ազատության պ․ (Նաիրի Զարյան խաչմերուկ)", "Ազատության պ․ (Ռայկոմ)",
                    "Պարույր Սևակի փ․", "Ուլնեցու փ․", "Էզրաս Հասրաթյան փ․", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("34", "M", "Մարս գ-ն", "Գուսան Շերամի փ․", "Րաֆֆու փ․", "Րաֆֆու փ․ (Մալաթիայի շուկա)",
                    "Սեբաստիայի փ․ (Մալաթիայի շուկա)", "Սեբաստիայի փ․ (Տիչինայի խաչմերուկ)", "Սեբաստիայի փ․ (Լենինգրադյան խաչմերուկ)", "Լենինգրադյան փ․ (Եվրովագեն)",
                    "Լենինգրադյան փ․ (Շինարարների խաչմերուկ)", "Լենինգրադյան փ․ (Մոնթե Մելքոնյան խաչմերուկ)", "Լենինգրադյան փ․ (Կիևյան կամուրջ)", "Կիևյան փ․ (Կիևյան կամուրջ)",
                    "Կիևյան փ․ (Օրբելի խաչմերուկ)", "Կիևյան փ․ (Բարեկամություն)", "Կասյան փ․", "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)", "Կոմիտասի պ․ (Վաղարշյան խաչմերուկ)",
                    "Կոմիտասի պ․ (Փափազյան խաչմերուկ)", "Կոմիտասի պ․ (Սլավոնական համալսարան)", "Կոմիտասի պ․ (Վրացական խաչմերուկ)", "Կոմիտասի պ․ (Կոմիտասի շուկա)",
                    "Կոմիտասի պ․ (Լամբադա կամուրջ)", "Դավիթ Անհաղթի պ․ (թաղապետարան)", "Դավիթ Անհաղթի պ․ (Կերամա Մարացի)", "Դավիթ Անհաղթի պ․ (Դրոյի խաչմերուկ)",
                    "Ռուբինյանց փ․ (Ահարոնյան փ․)", "Ռուբինյանց փ․ (Երևան Սիթի)", "Ռուբինյանց փ․ (Ալմաստ գ/ն)", "Ծարավ Աղբյուրի փ․", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("35", "M", "Դավթաշենի 4-րդ թաղ․", "Տիգրան Պետրոսյան փ․", "Իոսիֆյան փ․",
                    "Հալաբյան փ․ (Ֆիզիկայի խաչմերուկ)", "Մարգարյան փ․ (Հանրապետական հիվ․)", "Մարգարյան փ․ (Պեգաս)", "Բաշինջաղյան փ․", "Ջանիբեկյան փ․", "Գրիգոր Հասրաթյան փ․",
                    "Սեբաստիայի փ․ (Լենինգրադյան խաչմերուկ)", "Սեբաստիայի փ․ (Տիչինայի խաչմերուկ)", "Սեբաստիայի փ․ (Մալաթիայի շուկա)", "Րաֆֆու փ․ (Մալաթիայի շուկա)",
                    "Րաֆֆու փ․", "Գուսան Շերամի փ․", "Օհանովի փ․", "Շիրազի փ․", "Գրիգոր Հասրաթյան փ․", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("36", "M", "Սպանդարյան կայարան", "Սիլիկյան 4-րդ փ․", "Սիլիկյան 10-րդ փ․", "Սիլիկյան Նոր խճ․",
                    "Սեբաստիայի փ․ (Լենինգրադյան խաչմերուկ)", "Սեբաստիայի փ․ (Տիչինայի խաչմերուկ)", "Սեբաստիայի փ․ (Մալաթիայի շուկա)", "Րաֆֆու փ․ (Մալաթիայի շուկա)",
                    "Րաֆֆու փ․", "Առնո Բաբաջանյան փ․", "գ.Արգավանդ", "գ.Գեղանիստ", "Աերացիա", "Շիրակի 5-րդ նրբ.", "Շիրակի փ․ (Ձիարշավարան)", "Շիրակի փ․ (Չարբախի շուկա)",
                    "Շարուրի փ․", "Էլեկտրոն գ/ն", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("37", "M", "գ. Քասախ", "Աշտարակի խճ.", "Նորաշեն թաղ.", "Չաուշի փ․", "Մելքումովի փ.", "Ֆուչիկի փ․",
                    "Մարգարյան փ․ (Հանրապետական հիվ․)", "Հալաբյան փ․ (Ֆիզիկայի խաչմերուկ)", "Հալաբյան փ․ (Ֆիզիկայի խաչմերուկ)", "Հալաբյան փ․ (ԹՈՒՄՈ)", "Էստոնական փ․",
                    "Շինարարների փ․", "Լենինգրադյան փ․ (Շինարարների խաչմերուկ)", "Լենինգրադյան փ․ (Եվրովագեն)", "Սեբաստիայի փ․ (Լենինգրադյան խաչմերուկ)",
                    "Սեբաստիայի փ․ (Տիչինայի խաչմերուկ)", "Սեբաստիայի փ․ (Մալաթիայի շուկա)", "Րաֆֆու փ․ (Մալաթիայի շուկա)", "Րաֆֆու փ․", "Զորավար Անդրանիկի փ․",
                    "Առնո Բաբաջանյան փ․", "Էջմիածնի խճ.", "գ․ Արգավանդ", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("38", "M", "Պրոթեզավորման Կենտրոն", "Ծարավ Աղբյուրի փ․", "Ռուբինյանց փ․ (Ալմաստ գ/ն)",
                    "Ռուբինյանց փ․ (Երևան Սիթի)", "Ռուբինյանց փ․ (Ահարոնյան փ․)", "Դավիթ Անհաղթի պ․ (Դրոյի խաչմերուկ)", "Դավիթ Անհաղթի պ․ (Կերամա Մարացի)",
                    "Դավիթ Անհաղթի պ․ (թաղապետարան)", "Ազատության պ․ (Նաիրի Զարյան խաչմերուկ)", "Ազատության պ․ (Զինկոմիսարիատ)", "Ազատության պ․ (Հաղթանակի այգի)",
                    "Սարալանջի փ․", "Տերյան փ․", "Կորյունի փ․ (Ցիտադել)", "Աբովյան փ․ (Երիտասարդական մ/կ)", "Սայաթ-Նովա պ․ (Նալբանդյան խաչմերուկ)", "Մաշտոցի պ․ (Օպերա)",
                    "Մաշտոցի պ․ (Մարգարյան հիվ․)", "Մաշտոցի պ․ (Ամիրյան խաչմերուկ)", "Մաշտոցի պ․ (Ծածկած շուկա)", "Մաշտոցի պ․ (Ձկան խանութ)",
                    "Գրիգոր Լուսավորիչ (Երևանի քաղաքապետարան)", "Արշակունյաց պ․ (Կրկես)", "Ագաթանգեղոսի փ․", "Մանկավարժական համալսարան", "Տիգրան Մեծի պ․ (Այրարատ կ/թ)",
                    "Տիգրան Մեծի պ․ (Տաշիր ա/կ)", "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)", "Տիգրան Մեծի պ․ (Կայարան)", "Արցախի պ․", "Արին Բերդի 3-րդ նրբ.", "ՋԵԿ", "", "", "", "", "", "",
                    "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("39", "M", "Շիրակի փ․ (Չարբախի շուկա)", "Արտաշիսյան փ․", "Բագրատունյաց պ․ (Արտաշիսյան խաչմերուկ)",
                    "Գարեգին Նժդեհի հրապարակ", "Գարեգին Նժդեհի փ․", "Արշակունյաց պ․ (Հայրենիք կ/թ)", "Արշակունյաց պ․ (Երևան Մոլ)", "Արշակունյաց պ․ (Կոմիտասի այգի)",
                    "Արշակունյաց պ․ (Սուրմալու)", "Արշակունյաց պ․ (Կրկես)", "Գրիգոր Լուսավորիչ (Երևանի քաղաքապետարան)", "Պարոնյան փ․ (Կեսարի պալատ)",
                    "Պարոնյան փ․ (Նաիրի բ/կ)", "Պռոշյան փ․ ", "Բաղրամյան պ․ (Կամոյի դպրոց)", "Բաղրամյան պ․ (Բարեկամություն)", "Կասյան փ․",
                    "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)", "Կոմիտասի պ․ (Վաղարշյան խաչմերուկ)", "Կոմիտասի պ․ (Փափազյան խաչմերուկ)", "Կոմիտասի պ․ (Սլավոնական համալսարան)",
                    "Կոմիտասի պ․ (Վրացական խաչմերուկ)", "Կոմիտասի պ․ (Կոմիտասի շուկա)", "Կոմիտասի պ․ (Լամբադա կամուրջ)", "Շիրվանզադեի փ․", "Կանազ հոսպիտալ", "Ադոնցի փ․", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("40", "M", "Նոր Նորքի 9-րդ զ/ծ", "Վիլնյուսի փ․", "Մինսկի փ․", "Միկոյան փ․", "Գալշոյան փ․",
                    "Բադալ Մուրադյան փ․", "Գայի պ․ (Մերսեդեսի սրահ)", "Գայի պ․ (Գայի արձան)", "Գայի պ․ (Աքվատեք)", "Ռուբինյանց փ․ (Ալմաստ գ/ն)", "Ռուբինյանց փ․ (Երևան Սիթի)",
                    "Պարույր Սևակի փ․", "Ուլնեցու փ․", "Էզրաս Հասրաթյան փ․", "Զաքարիա Քանաքեռցու փ․", "Թբիլիսյան խճ․ (Ռադիոկայմ)", "Գազպրոմ Արմենիա", "Հյուսիսային ավտոկայան",
                    "Առինջ Մոլ", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

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
                    "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)", "Տիգրան Մեծի պ․ (Կայարան)", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "" ));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("44", "M", "Էներգետիկների բանավան", "Էջմիածնի խճ.", "Առնո Բաբաջանյան փ․", "Զորավար Անդրանիկի փ․",
                    "Րաֆֆու փ․", "Րաֆֆու փ․ (Մալաթիայի շուկա)", "Սեբաստիայի փ․ (Մալաթիայի շուկա)", "Սեբաստիայի փ․ (Կուրղինյան խաչմերուկ)", "Բագրատունյաց պ․ (Իսակով խաչմերուկ)",
                    "Բագրատունյաց պ․ (Երևան Սիթի)", "Բագրատունյաց պ․ (Արտաշիսյան խաչմերուկ)", "Գարեգին Նժդեհի հրապարակ", "Գարեգին Նժդեհի փ․", "Արշակունյաց պ․ (Հայրենիք կ/թ)",
                    "Աշխատանքի հրապարակ (Բանվորի արձան)", "Նորագավթի 1-ին փ․", "գ. Մարմարաշեն", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("45", "M", "Էրեբունու զ/ծ ", "Խաղաղ Դոնի փ․", "Տիտոգրադյան փ․", "Այվազովսկու փ․", "Էրեբունու փ․",
                    "Մուրացանի փ․", "Ռոստովյան փ․", "Արցախի պ․", "Տիգրան Մեծի պ․ (Կայարան)", "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)",
                    "Տիգրան Մեծի պ․ (Այրարատ կ/թ)", "Մանկավարժական համալսարան", "Խանջյան փ․ (Լունապարկ)", "Վերնիսաժ", "Խանջյան փ․ (Շախմատի տուն)",
                    "Մոսկովյան փ․ (Կամերային երաժշտության տուն)", "Աբովյան փ․ (Երիտասարդական մ/կ)", "Աբովյան փ․ (Գյուղակադեմիա)", "Աբովյան փ․ (Պլանի գլուխ)", "Սարալանջի փ․",
                    "Ազատության պ․ (Հաղթանակի այգի)", "Ազատության պ․ (Զինկոմիսարիատ)", "Ազատության պ․ (Նաիրի Զարյան խաչմերուկ)", "Ազատության պ․ (Ռայկոմ)",
                    "Թբիլիսյան խճ․ (Լամպերի լիճ)", "Զաքարիա Քանաքեռցու փ․", "Էզրաս Հասրաթյան փ․", "Ուլնեցու փ․", "Ֆանարջյան փ․", "Ուռուցքաբանության ինստիտուտ", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("46", "M", "Նազարբեկյան թաղ.", "Սիլիկյան Նոր խճ․", "Շիրազի փ․", "Ջանիբեկյան փ․", "Շինարարների փ․",
                    "Արզումանյան փ․", "Հալաբյան փ․ (Կիևյան կամուրջ)", "Կիևյան փ․ (Կիևյան կամուրջ)", "Կիևյան փ․ (Օրբելի խաչմերուկ)", "Կիևյան փ․ (Բարեկամություն)",
                    "Բաղրամյան պ․ (Բարեկամություն)", "Բաղրամյան պ․ (Կամոյի դպրոց)", "Բաղրամյան պ․ (Ամերիկյան համալսարան)", "Բաղրամյան պ․ (Սահմանադրական դատարան)",
                    "Բաղրամյան պ․ (Օպերա)", "Մաշտոցի պ․ (Օպերա)", "Մաշտոցի պ․ (Մարգարյան հիվ․)", "Մաշտոցի պ․ (Ամիրյան խաչմերուկ)", "Մաշտոցի պ․ (Ծածկած շուկա)",
                    "Մաշտոցի պ․ (Ձկան խանութ)", "Գրիգոր Լուսավորիչ (Երևանի քաղաքապետարան)", "Ագաթանգեղոսի փ․", "Մանկավարժական համալսարան", "Խանջյան փ․ (Լունապարկ)",
                    "Վերնիսաժ", "Վարդանանց փ․", "Երվանդ Քոչար փ․", "Սբ. Գրիգոր Լուսավորիչ եկեղեցի", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("47", "M", "Նուբարաշենի 11-րդ փ․", "Նուբարաշենի 9-րդ փ․", "Նուբարաշենի 6-րդ փ․", "Նուբարաշենի խճ․",
                    "Խաղաղ Դոնի փ․", "Տիտոգրադյան փ․", "Այվազովսկու փ․", "Էրեբունու փ․", "Մուրացանի փ․", "Ռոստովյան փ․", "Արցախի պ․", "Տիգրան Մեծի պ․ (Կայարան)",
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
                    "Բագրատունյաց պ․ (Բանվորի արձան)", "Գարեգին Նժդեհի հրապարակ", "Գարեգին Նժդեհի փ․", "Արցախի պ․", "Տիգրան Մեծի պ․ (Կայարան)", "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)",
                    "Տիգրան Մեծի պ․ (Տաշիր ա/կ)", "Տիգրան Մեծի պ․ (Այրարատ կ/թ)", "Մանկավարժական համալսարան", "Խանջյան փ․ (Լունապարկ)", "Վերնիսաժ",
                    "Սայաթ-Նովա պ․ (Ալեք Մանուկյան խաչմերուկ)", "Չարենցի փ․ (Zigzag խանութ-սրահ)", "Չարենցի փ․ (ԵՊՀ)", "Չարենցի փ․ (ՀՀ Ոստիկանություն)",
                    "Բժշկական համալսարան", "Կորյունի փ․ (Ցիտադել)", "Մաշտոցի պ․ (Մատենադարան)", "Մաշտոցի պ․ (Կոնսերվատորիա)", "Մաշտոցի պ․ (Օպերա)", "Բաղրամյան պ․ (Օպերա)",
                    "Բաղրամյան պ․ (Սահմանադրական դատարան)", "Բաղրամյան պ․ (Ամերիկյան համալսարան)", "Բաղրամյան պ․ (Կամոյի դպրոց)", "Բաղրամյան պ․ (Բարեկամություն)",
                    "Կասյան փ․", "Մերգելյանի ինստիտուտ", "Հակոբ Հակոբյան փ․", "Արամ Խաչատրյան փ․", "Ռիգայի փ․", "Ռուս-Հայկական համալսարան", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("50", "M", "Ժամացույցի գ/ն", "Աղբյուր Սերոբի փ․", "Գյուլբենկյան փ․",
                    "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)", "Կոմիտասի պ․ (Վաղարշյան խաչմերուկ)", "Կոմիտասի պ․ (Փափազյան խաչմերուկ)", "Կոմիտասի պ․ (Սլավոնական համալսարան)",
                    "Կոմիտասի պ․ (Վրացական խաչմերուկ)", "Կոմիտասի պ․ (Կոմիտասի շուկա)", "Կոմիտասի պ․ (Լամբադա կամուրջ)", "Ազատության պ․ (Նաիրի Զարյան խաչմերուկ)",
                    "Ազատության պ․ (Զինկոմիսարիատ)", "Ազատության պ․ (Հաղթանակի այգի)", "Սարալանջի փ․", "Աբովյան փ․ (Պլանի գլուխ)", "Աբովյան փ․ (Գյուղակադեմիա)",
                    "Աբովյան փ․ (Երիտասարդական մ/կ)", "Մոսկովյան փ․ (Կամերային երաժշտության տուն)", "Խանջյան փ․ (Շախմատի տուն)", "Վերնիսաժ", "Խանջյան փ․ (Լունապարկ)",
                    "Մանկավարժական համալսարան", "Տիգրան Մեծի պ․ (Այրարատ կ/թ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)", "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)", "Տիգրան Մեծի պ․ (Կայարան)",
                    "Արցախի փ․", "Էրեբունու փ․", "Այվազովսկու փ․", "Տիտոգրադյան փ․", "Խաղաղ Դոնի փ․", "Էրեբունու զ/ծ", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("52", "M", "Նազարբեկյան թաղ.", "Սիլիկյան Նոր խճ․", "Չաուշի փ․", "Մելքումովի փ.",
                    "Բեկնազարյան փ․", "Մազմանյան փ․", "Շիրազի փ․", "Գրիգոր Հասրաթյան փ․", "Սեբաստիայի փ․ (Լենինգրադյան խաչմերուկ)", "Սեբաստիայի փ․ (Տիչինայի խաչմերուկ)",
                    "Սեբաստիայի փ․ (Մալաթիայի շուկա)", "Սեբաստիայի փ․ (Կուրղինյան խաչմերուկ)", "Բագրատունյաց պ․ (Իսակով խաչմերուկ)", "Բագրատունյաց պ․ (Երևան Սիթի)",
                    "Բագրատունյաց պ․ (Արտաշիսյան խաչմերուկ)", "Գարեգին Նժդեհի հրապարակ", "Բագրատունյաց պ․ (Բանվորի արձան)", "Աշխատանքի հրապարակ (Բանվորի արձան)",
                    "Արշակունյաց պ․ (Դեպի Չարբախ)", "Էրեբունի օդանավակայան", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

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

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("54", "M", "Դավթաշենի 4-րդ թաղ․", "Եղվարդի խճ․", "Տիգրան Պետրոսյան փ․", "Սասնա Ծռերի փ․",
                    "Արմենիա հ/ը", "Հալաբյան փ․ (Ֆիզիկայի խաչմերուկ)", "Հալաբյան փ․ (ԹՈՒՄՈ)", "Հալաբյան փ․ (Կիևյան կամուրջ)", "Կիևյան փ․ (Կիևյան կամուրջ)",
                    "Կիևյան փ․ (Օրբելի խաչմերուկ)", "Կիևյան փ․ (Բարեկամություն)", "Բաղրամյան պ․ (Բարեկամություն)", "Բաղրամյան պ․ (Կամոյի դպրոց)", "Պռոշյան փ․ ",
                    "Պարոնյան փ․ (Նաիրի բ/կ)", "Պարոնյան փ․ (Կեսարի պալատ)", "Գրիգոր Լուսավորիչ (Երևանի քաղաքապետարան)", "Գրիգոր Լուսավորիչ (Կրկես)", "Ագաթանգեղոսի փ․",
                    "Տիգրան Մեծի պ․ (Այրարատ կ/թ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)", "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)", "Տիգրան Մեծի պ․ (Կայարան)", "Սասունցի Դավթի փ․",
                    "Ազատամարտիկների փ․", "Էրեբունու փ․", "Էրեբունու թ/ն", "Մահարու փ․", "գ. Ջրաշեն", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

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
                    "Նաիրի Զարյան փ․", "Գրիբոյեդովի փ․", "Կոմիտասի պ․ (Կոմիտասի շուկա)", "Կոմիտասի պ․ (Լամբադա կամուրջ)", "Դավիթ Անհաղթի պ․ (թաղապետարան)",
                    "Դավիթ Անհաղթի պ․ (Կերամա Մարացի)", "Դավիթ Անհաղթի պ․ (Դրոյի խաչմերուկ)", "Ռուբինյանց փ․ (Ահարոնյան փ․)", "Ռուբինյանց փ․ (Երևան Սիթի)",
                    "Ռուբինյանց փ․ (Ալմաստ գ/ն)", "Աճառյան փ․", "Մարշալ Բաբաջանյան փ․", "Տաշքենդի փ․", "Ավան-Առինջ", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("57", "M", "Դավթաշենի 1-ին թաղ.", "Աղաբաբյան փ․", "Տիգրան Պետրոսյան փ․", "Իոսիֆյան փ․",
                    "Հալաբյան փ․ (Ֆիզիկայի խաչմերուկ)", "Մարգարյան փ․ (Հանրապետական հիվ․)", "Մարգարյան փ․ (Պեգաս)", "Բաշինջաղյան փ․", "Ջանիբեկյան փ․", "Գրիգոր Հասրաթյան փ․",
                    "Սեբաստիայի փ․ (Լենինգրադյան խաչմերուկ)", "Սեբաստիայի փ․ (Տիչինայի խաչմերուկ)", "Սեբաստիայի փ․ (Մալաթիայի շուկա)", "Սեբաստիայի փ․ (Կուրղինյան խաչմերուկ)",
                    "Բագրատունյաց պ․ (Իսակով խաչմերուկ)", "Բագրատունյաց պ․ (Երևան Սիթի)", "Բագրատունյաց պ․ (Արտաշիսյան խաչմերուկ)", "Արտաշիսյան փ․",
                    "Շիրակի փ․ (Էրեբունի օդանավակայան)", "Արշակունյաց պ․ (Դեպի Չարբախ)", "Նորագավթի 1-ին փ․", "Արտաշատի խճ․", "գ․ Այնթափ", "ք․ Մասիս", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("58", "M", "Նոր Նորքի 8-րդ զ/ծ", "Մինսկի փ․", "Միկոյան փ․", "Բադալ Մուրադյան փ․",
                    "Գայի պ․ (Մերսեդեսի սրահ)", "Գայի պ․ (Գայի արձան)", "Գայի պ․ (Աքվատեք)", "Ռուբինյանց փ․ (Ալմաստ գ/ն)", "Ռուբինյանց փ․ (Երևան Սիթի)",
                    "Ռուբինյանց փ․ (Ահարոնյան փ․)", "Դավիթ Անհաղթի պ․ (Դրոյի խաչմերուկ)", "Դավիթ Անհաղթի պ․ (Կերամա Մարացի)", "Դավիթ Անհաղթի պ․ (թաղապետարան)",
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
                    "Բագրատունյաց պ․ (Բանվորի արձան)", "Աշխատանքի հրապարակ (Բանվորի արձան)", "Արշակունյաց պ․ (Դեպի Չարբախ)", "Էրեբունի օդանավակայան", "Վրացական փ․", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("62", "M", "Քանաքեռի 13- րդ փ.", "Զաքարիա Քանաքեռցու փ․", "Թբիլիսյան խճ․ (Լամպերի լիճ)",
                    "Ազատության պ․ (Ռայկոմ)", "Կոմիտասի պ․ (Լամբադա կամուրջ)", "Կոմիտասի պ․ (Կոմիտասի շուկա)", "Բորսայի շենք", "Հրաչյա Քոչար փ․ (Վրացական խաչմերուկ)",
                    "Հրաչյա Քոչար փ․ (Փափազյան խաչմերուկ)", "Հրաչյա Քոչար փ․ (Վաղարշյան խաչմերուկ)", "Հրաչյա Քոչար փ․ (Գյուլբենկյան խաչմերուկ)", "Բաղրամյան պ․ (Բարեկամություն)",
                    "Բաղրամյան պ․ (Կամոյի դպրոց)", "Բաղրամյան պ․ (Ամերիկյան համալսարան)", "Բաղրամյան պ․ (Սահմանադրական դատարան)", "Բաղրամյան պ․ (Օպերա)", "Մաշտոցի պ․ (Օպերա)",
                    "Մաշտոցի պ․ (Մարգարյան հիվ․)", "Մաշտոցի պ․ (Ամիրյան խաչմերուկ)", "Խորենացու փ․ (Մաշտոց խաչմերուկ)", "Խորենացու փ․ (Շահումյան հրապ․)", "Ագաթանգեղոսի փ․",
                    "Մանկավարժական համալսարան", "Տիգրան Մեծի պ․ (Այրարատ կ/թ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)", "Երվանդ Քոչար փ․", "Սբ. Գրիգոր Լուսավորիչ եկեղեցի", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("63", "M", "Օհանովի փ․", "Գուսան Շերամի փ․", "Րաֆֆու փ․", "Րաֆֆու փ․ (Մալաթիայի շուկա)",
                    "Սեբաստիայի փ․ (Մալաթիայի շուկա)", "Սեբաստիայի փ․ (Տիչինայի խաչմերուկ)", "Սեբաստիայի փ․ (Լենինգրադյան խաչմերուկ)", "Լենինգրադյան փ․ (Եվրովագեն)",
                    "Լենինգրադյան փ․ (Շինարարների խաչմերուկ)", "Լենինգրադյան փ․ (Մոնթե Մելքոնյան խաչմերուկ)", "Լենինգրադյան փ․ (Կիևյան կամուրջ)", "Կիևյան փ․ (Կիևյան կամուրջ)",
                    "Կիևյան փ․ (Օրբելի խաչմերուկ)", "Կիևյան փ․ (Բարեկամություն)", "Կասյան փ․", "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)", "Կոմիտասի պ․ (Վաղարշյան խաչմերուկ)",
                    "Կոմիտասի պ․ (Փափազյան խաչմերուկ)", "Կոմիտասի պ․ (Սլավոնական համալսարան)", "Կոմիտասի պ․ (Վրացական խաչմերուկ)", "Կոմիտասի պ․ (Կոմիտասի շուկա)",
                    "Կոմիտասի պ․ (Լամբադա կամուրջ)", "Ազատության պ․ (Ռայկոմ)", "Ահարոնյան փ․", "Ուլնեցու փ․", "Պարույր Սևակի փ․", "Ռուբինյանց փ․ (Երևան Սիթի)",
                    "Ռուբինյանց փ․ (Ալմաստ գ/ն)", "Գայի պ․ (Աքվատեք)", "Գայի պ․ (Գայի արձան)", "Ստեփանյան փ․", "Մոլդովական փ․", "Նոր Նորքի 2-րդ զ/ծ", "", "", "", "", "", "", "",
                    "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("64", "M", "Նորաշեն թաղ.", "Մելքումովի փ.", "Բեկնազարյան փ․", "Բաշինջաղյան փ․",
                    "Մարգարյան փ․ (Պեգաս)", "Մարգարյան փ․ (Հանրապետական հիվ․)", "Հալաբյան փ․ (Ֆիզիկայի խաչմերուկ)", "Հալաբյան փ․ (ԹՈՒՄՈ)", "Հալաբյան փ․ (Կիևյան կամուրջ)",
                    "Կիևյան փ․ (Կիևյան կամուրջ)", "Կիևյան փ․ (Օրբելի խաչմերուկ)", "Կիևյան փ․ (Բարեկամություն)", "Բաղրամյան պ․ (Բարեկամություն)", "Բաղրամյան պ․ (Կամոյի դպրոց)",
                    "Պռոշյան փ․ ", "Պարոնյան փ․ (Նաիրի բ/կ)", "Պարոնյան փ․ (Կեսարի պալատ)", "Գրիգոր Լուսավորիչ (Երևանի քաղաքապետարան)", "Գրիգոր Լուսավորիչ (Կրկես)",
                    "Ագաթանգեղոսի փ․", "Տիգրան Մեծի պ․ (Այրարատ կ/թ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)", "Երվանդ Քոչար փ․", "Ալեք Մանուկյան փ․", "ԵՊՀ", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("65", "M", "Աերացիա", "Շիրակի 5-րդ նրբ․", "Շիրակի փ․ (Ձիարշավարան)", "Շիրակի փ․ (Չարբախի շուկա)",
                    "Արտաշիսյան փ․", "Բագրատունյաց պ․ (Արտաշիսյան խաչմերուկ)", "Գարեգին Նժդեհի հրապարակ", "Գարեգին Նժդեհի փ․", "Արշակունյաց պ․ (Հայրենիք կ/թ)",
                    "Արշակունյաց պ․ (Երևան Մոլ)", "Արշակունյաց պ․ (Կոմիտասի այգի)", "Արշակունյաց պ․ (Սուրմալու)", "Արշակունյաց պ․ (Կրկես)", "Ագաթանգեղոսի փ․",
                    "Մանկավարժական համալսարան", "Խանջյան փ․ (Լունապարկ)", "Վերնիսաժ", "Խանջյան փ․ (Շախմատի տուն)", "Մոսկովյան փ․ (Կամերային երաժշտության տուն)",
                    "Աբովյան փ․ (Երիտասարդական մ/կ)", "Աբովյան փ․ (Գյուղակադեմիա)", "Աբովյան փ․ (Պլանի գլուխ)", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", ""));

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("66", "M", "Նոր Նորքի 9-րդ զ/ծ", "Վիլնյուսի փ․", "Նոր Նորքի 7-րդ զ/ծ", "Հունան Ավետիսյան փ․", "Դավիթ Բեկի փ․",
                    "Բադալ Մուրադյան փ․", "Գայի պ․ (Մերսեդեսի սրահ)", "Գայի պ․ (Գայի արձան)", "Գայի պ․ (Աքվատեք)", "Ռուբինյանց փ․ (Ալմաստ գ/ն)", "Ռուբինյանց փ․ (Երևան Սիթի)",
                    "Ռուբինյանց փ․ (Ահարոնյան փ․)", "Դավիթ Անհաղթի պ․ (Դրոյի խաչմերուկ)", "Դավիթ Անհաղթի պ․ (Կերամա Մարացի)", "Դավիթ Անհաղթի պ․ (թաղապետարան)",
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
                    "Ազատամարտիկների փ․", "Սասունցի Դավթի փ․", "Արցախի պ․", "Վստրեչի կամուրջ", "Գարեգին Նժդեհի փ․", "Գարեգին Նժդեհի հրապարակ",
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
                    "Դավթաշենի 4-րդ թաղ.", "Տիգրան Պետրոսյան փ․", "Իոսիֆյան փ․", "Հալաբյան փ․ (Ֆիզիկայի խաչմերուկ)", "Հալաբյան փ․ (ԹՈՒՄՈ)", "Հալաբյան փ․ (Կիևյան կամուրջ)",
                    "Լենինգրադյան փ․ (Կիևյան կամուրջ)", "Ծիծեռնակաբերդի խճ․", "Դալմա Գարդեն Մոլ", "Աթենքի փ․", "Հրազդան մ/դ", "Հաղթանակ կամուրջ",
                    "Գրիգոր Լուսավորիչ (Երևանի քաղաքապետարան)", "Գրիգոր Լուսավորիչ (Կրկես)", "Ագաթանգեղոսի փ․", "Տիգրան Մեծի պ․ (Այրարատ կ/թ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)",
                    "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)", "Քրիստափորի փ․", "Փեթակ ա/կ", "Արշակունյաց պ․ (Կոմիտասի այգի)", "Արշակունյաց պ․ (Երևան Մոլ)", "Արշակունյաց պ․ (Հայրենիք կ/թ)",
                    "Վստրեչի կամուրջ", "Ռոստովյան փ․", "Աթոյան փ․", "Էրեբունու փ․", "Այվազովսկու փ․", "Տիտոգրադյան փ․", "Խաղաղ Դոնի փ․", "Էրեբունու զ/ծ", "", "", "", "", "",
                    "", "", "", ""));

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

            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("1", "T", "Աշխատանքի հրապարակ (Բանվորի արձան)", "Բագրատունյաց պ․ (Բանվորի արձան)", "Գարեգին Նժդեհի հրապարակ",
                    "Գարեգին Նժդեհի փ․", "Արշակունյաց պ․ (Հայրենիք կ/թ)", "Արշակունյաց պ․ (Երևան Մոլ)", "Արշակունյաց պ․ (Կոմիտասի այգի)", "Արշակունյաց պ․ (Սուրմալու ա/կ)",
                    "Արշակունյաց պ․ (Կրկես)", "Գրիգոր Լուսավորիչ (Կրկես)", "Գրիգոր Լուսավորիչ (Երևանի քաղաքապետարան)", "Մաշտոցի պ․ (Ձկան խանութ)", "Մաշտոցի պ․ (Ծածկած շուկա)",
                    "Մաշտոցի պ․ (Ամիրյան խաչմերուկ)", "Մաշտոցի պ․ (Մարգարյան հիվ․)", "Մաշտոցի պ․ (Օպերա)", "Մաշտոցի պ․ (Կոնսերվատորիա)", "Մաշտոցի պ․ (Մատենադարան)", "Ցիտադել",
                    "Կորյունի փ․ (Ցիտադել)", "Բժշկական համալսարան", "Չարենցի փ․ (ՀՀ Ոստիկանություն)", "Հերացու փ․", "Մյասնիկյան պ․ (Հերացի խաչմերուկ)", "Մյասնիկյան պ․ (Կենդանաբանական այգի)",
                    "Մյասնիկյան պ․ (Ջրաշխարհ)", "Գայի պ․ (Աքվատեք)", "Գայի պ․ (Գայի արձան)", "Գայի պ․ (Մերսեդեսի սրահ)", "Բադալ Մուրադյան փ․", "Թևոսյան փ․",
                    "Քոչինյան փ․", "Ջրվեժ", "", "", "", "", "", "", "", "", "", "", "", ""));
            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("2", "T", "Արտաշիսյան փ․", "Շիրակի փ․ (Չարբախի շուկա)", "Չեխովի փ․", "Բագրատունյաց պ․ (Արտաշիսյան խաչմերուկ)",
                    "Գարեգին Նժդեհի հրապ․", "Բագրատունյաց պ․ (Բանվորի արձան)", "Աշխատանքի հրապարակ (Բանվորի արձան)", "Արշակունյաց պ․ (Հայրենիք կ/թ)", "Արշակունյաց պ․ (Երևան Մոլ)",
                    "Արշակունյաց պ․ (Կոմիտասի այգի)", "Արշակունյաց պ․ (Սուրմալու ա/կ)", "Արշակունյաց պ․ (Կրկես)", "Ագաթանգեղոսի փ․", "Տիգրան Մեծի պ․ (Այրարատ կ/թ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)",
                    "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)", "Տիգրան Մեծի պ․ (Կայարան)", "Արցախի փ․", "Էրեբունու փ․", "Էրեբունու թ/ն", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", ""));
            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("3", "T", "Ավան", "Մարշալ Բաբաջանյան փ․", "Աճառյան փ․", "Բուսաբանական այգի", "Մյասնիկյան պ․ (Ջրաշխարհ)",
                    "Մյասնիկյան պ․ (Կենդանաբանական այգի)", "Մյասնիկյան պ․ (Հերացի խաչմերուկ)", "Չարենցի փ․ (ՀՀ Ոստիկանություն)", "Նալբանդյան փ․ (ԵՊՏՀ)", "Սայաթ-Նովա պ․ (Նալբանդյան խաչմերուկ)",
                    "Վերնիսաժ", "Խանջյան փ․ (Լունապարկ)", "Մանկավարժական համալսարան", "Տիգրան Մեծի պ․ (Այրարատ կ/թ)", "Տիգրան Մեծի պ․ (Տաշիր ա/կ)", "Տիգրան Մեծի պ․ (ՀԿԵՈՒ)", "Տիգրան Մեծի պ․ (Կայարան)",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));
            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("9", "T", "Ավան", "Մառշալ Բաբաջանյան փ․", "Աճառյան փ․", "Բուսաբանական այգի", "Ռուբինյանց փ․ (Ալմաստ գ/ն)",
                    "Ռուբինյանց փ․ (Երևան Սիթի)", "Ռուբինյանց փ․ (Ահարոնյան փ․)", "Դավիթ Անհաղթի պ․ (Դրոյի խաչմերուկ)", "Դավիթ Անհաղթի պ․ (Կերամա Մարացի)", "Դավիթ Անհաղթի պ․ (թաղապետարան)",
                    "Կոմիտասի պ․ (Լամբադա կամուրջ)", "Կոմիտասի պ․ (Կոմիտասի շուկա)", "Կոմիտասի պ․ (Վրացական խաչմերուկ)", "Կոմիտասի պ․ (Սլավոնական համալսարան)",
                    "Կոմիտասի պ․ (Փափազյան խաչմերուկ)", "Կոմիտասի պ․ (Վաղարշյան խաչմերուկ)", "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)", "Կասյան փ․", "Բաղրամյան պ․ (Բարեկամություն)",
                    "Բաղրամյան պ․ (Կամոյի դպրոց)", "Բաղրամյան պ․ (Ամերիկյան համալսարան)", "Բաղրամյան պ․ (Սահմանադրական դատարան)", "Բաղրամյան պ․ (Օպերա)",
                    "Սայաթ-Նովա պ․ (Նալբանդյան խաչմերուկ)", "Վերնիսաժ", "Խանջյան փ․ (Լունապարկ)", "Մանկավարժական համալսարան", "Ագաթանգեղոսի փ․", "Գրիգոր Լուսավորիչ փ․ (Կրկես)",
                    "Գրիգոր Լուսավորիչ (Երևանի քաղաքապետարան)", "Մաշտոցի պ․ (Ձկան խանութ)", "Մաշտոցի պ․ (Ծածկած շուկա)", "Մաշտոցի պ․ (Ամիրյան խաչմերուկ)",
                    "Մաշտոցի պ․ (Մարգարյան հիվ․)", "Մաշտոցի պ․ (Օպերա)", "", "", "", "", "", "", "", "", "", ""));
            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("10", "T", "Նոր Նորքի 5-րդ զ/ծ", "Բադալ Մուրադյան փ․", "Գայի պ․ (Մերսեդեսի սրահ)",
                    "Գայի պ․ (Գայի արձան)", "Գայի պ․ (Աքվատեք)", "Ռուբինյանց փ․ (Ալմաստ գ/ն)", "Ռուբինյանց փ․ (Երևան Սիթի)", "Ռուբինյանց փ․ (Ահարոնյան փ․)",
                    "Դավիթ Անհաղթի պ․ (Դրոյի խաչմերուկ)", "Դավիթ Անհաղթի պ․ (Կերամա Մարացի)", "Դավիթ Անհաղթի պ․ (թաղապետարան)", "Կոմիտասի պ․ (Լամբադա կամուրջ)",
                    "Կոմիտասի պ․ (Կոմիտասի շուկա)", "Կոմիտասի պ․ (Վրացական խաչմերուկ)", "Կոմիտասի պ․ (Սլավոնական համալսարան)", "Կոմիտասի պ․ (Փափազյան խաչմերուկ)",
                    "Կոմիտասի պ․ (Վաղարշյան խաչմերուկ)", "Կոմիտասի պ․ (Գյուլբենկյան խաչմերուկ)", "Կասյան փ․", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));
            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("15", "T", "15-րդ թաղամաս", "Մազմանյան փ․", "Շիրազի փ․", "Գրիգոր Հասրաթյան փ․",
                    "Սեբաստիայի փ․ (Լենինգրադյան խաչմերուկ)", "Սեբաստիայի փ․ (Տիչինայի խաչմերուկ)", "Սեբաստիայի փ․ (Մալաթիայի շուկա)", "Սեբաստիայի փ․ (Կուրղինյան)",
                    "Բագրատունյաց պ․ (Իսակով խաչմերուկ)", "Բագրատունյաց պ․ (Երևան Սիթի)", "Բագրատունյաց պ․ (Արտաշիսյան խաչմերուկ)", "Գարեգին Նժդեհի հրապ․",
                    "Բագրատունյաց պ․ (Բանվորի արձան)", "Աշխատանքի հրապարակ (Բանվորի արձան)", "Արշակունյաց պ․ (Դեպի Չարբախ)", "Էրեբունի օդանավակայան",
                    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));
            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("23", "T", "Ջրվեժ", "Քոչինյան փ․", "Թևոսյան փ․", "Բադալ Մուրադյան փ․", "Գայի պ․ (Մերսեդեսի սրահ)",
                    "Գայի պ․ (Գայի արձան)", "Գայի պ․ (Աքվատեք)", "Մյասնիկյան պ․ (Ջրաշխարհ)", "Մյասնիկյան պ․ (Կենդանաբանական այգի)", "Մյասնիկյան պ․ (Հերացի խաչմերուկ)",
                    "Չարենցի փ․ (ՀՀ Ոստիկանություն)",  "Սայաթ-Նովա պ․ (Նալբանդյան խաչմերուկ)", "Վերնիսաժ", "Մանկավարժական համալսարան", "Խանջյան փ․ (Լունապարկ)",
                    "Տիգրան Մեծի պ․ (Ֆիրդուսի շուկա)", "Մելիք-Ադամյան փ․", "Նալբանդյան փ․ (ԵՊՏՀ)", "Մոսկովյան փ․ (Կամերային երաժշտության տուն)", "", "", "", "", "", "", "", "", "", "", "", "", "",
                    "", "", "", "", "", "", "", "", "", "", "", "", ""));
            db.insert(TABLE_TRANSPORT_NAME, null, insertDataToTableTransport("24", "T", "ՀԱԹ", "Րաֆֆու փ․", "Րաֆֆու փ․ (Մալաթիայի շուկա)", "Սեբաստիայի փ․ (Մալաթիայի շուկա)",
                    "Սեբաստիայի փ․ (Կուրղինյան)", "Ծովակալ Իսակովի պ․", "Կիլիկիա ավտոկայան", "Հաղթանակի կ/ջ", "Մաշտոցի պ․ (Ձկան խանութ)", "Մաշտոցի պ․ (Ծածկած շուկա)", "Մաշտոցի պ․ (Ամիրյան խաչմերուկ)",
                    "Մաշտոցի պ․ (Մարգարյան հիվ․)", "Մաշտոցի պ․ (Օպերա)", "Օպերա", "Մաշտոցի պ․ (Կոնսերվատորիա)", "Մոսկովյան փ․ (Երիտասարդական մ/կ)", "Աբովյան փ․ (Երիտասարդական մ/կ)",
                    "Աբովյան փ․ (Գյուղակադեմիա)", "Աբովյան փ․ (Պլանի գլուխ)", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));


        }

        private void insertIntoStop(SQLiteDatabase db) {

            String[] stops = context.getResources().getStringArray(R.array.stops);

            for (int i = 0; i < stops.length; i++) {
                db.insert(TABLE_STOP_NAME, null, insertDataToTableStop(stops[i], "", ""));
            }

        }

    }
}