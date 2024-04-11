package com.smerarockey.eshop.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.smerarockey.eshop.R;
import com.smerarockey.eshop.models.CustomerCredentials;
import com.smerarockey.eshop.utilities.DBHelper;

public class MainActivity extends AppCompatActivity {

    DBHelper dbHelper=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Sample Code
        String email="smera.rockey3@gmail.com";
        String password="smera123";
        CustomerCredentials credentials=new CustomerCredentials(email,password);

    }
}