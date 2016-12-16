package pe.gob.ign.ignperu.Adaptador;

/**
 * Created by prueba on 15/11/2016.

public class DBHandler extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "usersManager";
    private static final String TABLE_USER = "user";
    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "name";
    private static final String KEY_EMAIL = "email";

    public DBHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);


    @Override
    public void onCreate(SQLiteDatabase db) {
        // Static Variables
            String CREATE_USER_TABLE = "CREATE TABLE " + TABLE_USER + "("
                    + KEY_ID + " INTEGER PRIMARY KEY," + KEY_NAME + " TEXT,"
                    + KEY_EMAIL + " TEXT" + ")";
            db.execSQL(CREATE_USER_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
 */