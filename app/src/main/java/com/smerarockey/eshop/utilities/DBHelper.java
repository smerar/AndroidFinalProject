package com.smerarockey.eshop.utilities;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    static String DBNAME = "EShop.db";
    static int VERSION=1;
    //--------------------------------------------------------------TABLES-----------------------------------------------------------
    //    CustomerCredential Table---->CREATE_TABLE1---------
    public static String TBL_CUST_CRED="CustomerCredentials";
    public static String COL_EMAIL="Email";
    public static String COL_PASSWORD="Password";
    public static String COL_TYPE="Type";

    static final String CREATE_TABLE1="create table " + TBL_CUST_CRED + " (" + COL_EMAIL + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COL_PASSWORD + " TEXT NOT NULL, "
            + COL_TYPE+ " TEXT); ";
    static final String DROP_TABLE1="DROP TABLE IF EXISTS " + TBL_CUST_CRED;
    //--------------------->CREATE_TABLE2------------------------
    public DBHelper(Context context) {
        super(context, DBNAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE1);

    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DROP_TABLE1);
        onCreate(db);
    }
}
