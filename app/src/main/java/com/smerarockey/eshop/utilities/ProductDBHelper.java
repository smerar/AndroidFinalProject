package com.smerarockey.eshop.utilities;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.smerarockey.eshop.models.Products;

import java.util.List;

public class ProductDBHelper extends SQLiteOpenHelper {
    static String DBNAME = "ECommerce.db";
    static int VERSION=1;
    //--------------------------------------------------------------TABLES-----------------------------------------------------------
    //
    public static String TABLE_NAME="Products";
    public static String COL1="proId";
    public static String COL2="proName";
    public static String COL3="proDesc";
    public static String COL4="proPrice";
    public static String COL5="proCategory";
    public static String COL6="proImage";


    static final String CREATE_TABLE1="create table " + TABLE_NAME + " (" + COL1 + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COL2 + " TEXT NOT NULL, "
            + COL3 + " TEXT NOT NULL," + COL4 + " INTEGER," + COL5 + " TEXT," + COL6 + " BLOB );";

    static final String DROP_TABLE1="DROP TABLE IF EXISTS " + TABLE_NAME;
    //--------------------->CREATE_TABLE2------------------------
    public ProductDBHelper(Context context) {
        super(context, DBNAME, null, VERSION);
    }

    public void addProducts(Products product)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        System.out.println(product);

        values.put(COL2,product.getProductName());
        values.put(COL3,product.getProductDescription());
        values.put(COL4,product.getProductPrice());
        values.put(COL5,product.getProductCategory());
        values.put(COL6,product.getProductImage());

        long rowId=db.insert(TABLE_NAME,null,values);
    }

    public List<Products> getProducts(){
        return null;
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
