package com.smerarockey.eshop.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;

import com.smerarockey.eshop.R;
import com.smerarockey.eshop.daos.ProductDao;
import com.smerarockey.eshop.daos.ProductDaoImp;
import com.smerarockey.eshop.models.Products;
import com.smerarockey.eshop.services.ProductService;
import com.smerarockey.eshop.utilities.CategoryData;
import com.smerarockey.eshop.utilities.ProductDBHelper;
import com.smerarockey.eshop.utilities.ProductData;

import java.io.ByteArrayOutputStream;
import java.util.List;

public class SplashScreenActivity extends AppCompatActivity {
    private static int TIMELIMIT=1000;
    byte[] imageByteArray;

    ProductDBHelper dbHelper=null;
    Bitmap iphone13Bitmap ;
    Bitmap iphone14Bitmap ;
    Bitmap iphone15Bitmap ;
    Bitmap iphone15ProBitmap ;
    Bitmap macbookairBitmap ;
    Bitmap macbookproBitmap ;
    Bitmap appleWatchBitmap ;
    ProductData pdata=new ProductData();;
    ProductService productService;

    boolean productstatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        //To display splash screen for few seconds
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                    Intent intent =new Intent(SplashScreenActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
            }
        },TIMELIMIT);

    }

}