package com.smerarockey.eshop.activities;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.navigation.NavigationView;
import com.smerarockey.eshop.R;
import com.smerarockey.eshop.daos.ProductDaoImp;
import com.smerarockey.eshop.databinding.ActivityMainBinding;
import com.smerarockey.eshop.models.Products;
import com.smerarockey.eshop.services.ProductService;
import com.smerarockey.eshop.utilities.ProductDBHelper;
import com.smerarockey.eshop.utilities.ProductData;

import java.io.ByteArrayOutputStream;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    byte[] imageByteArray;
    ActivityMainBinding mainBinding=null;
    View rootView;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private Toolbar toolbar;
    ActionBarDrawerToggle toggle;
    Fragment categoryFragment;

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
    boolean result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Convert the images in drawable folders to Bitmap
        iphone13Bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.iphone13);
        iphone14Bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.iphone14);
        iphone15Bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.iphone15);
        iphone15ProBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.iphone15pro);
        macbookairBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.macbookair);
        macbookproBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.macbookpro);
        appleWatchBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.applewatch);
        //Adding products to database
        productService=new ProductService(new ProductDaoImp());
        this.dbHelper=new ProductDBHelper(this);
        System.out.println(this.createProducts());
        result=productService.addProduct(createProducts(),this.dbHelper);
        System.out.println(result);

       setContentView(R.layout.activity_main);
       toolbar=findViewById(R.id.mainToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(R.string.mainTitle);

        navigationView=findViewById(R.id.navigationView);
        drawerLayout=findViewById(R.id.homeContainer);

        toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(item -> {
            // Handle navigation item clicks here
            drawerLayout.closeDrawer(GravityCompat.START);
            return true;
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.toolbar_menu_items, menu);
        return true;
    }

    // Override onOptionsItemSelected to handle clicks on the toggle button
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (toggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void setNavigationDrawer(){



    }


    //To convert image into byte array
    private  byte[] convertImage(Bitmap imageBitmap)
    {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        imageBitmap.compress(Bitmap.CompressFormat.PNG, 100, stream);
        imageByteArray = stream.toByteArray();
        return imageByteArray ;
    }

    //Create product list and save it to an arraylist
    private List<Products> createProducts()
    {
        Products iphone13 = new Products(
                101,
                "IPhone13",
               "Phones",
                "A15 Bionic with 4-core GPU for lightning-fast performance.",
                549,
                this.convertImage(iphone13Bitmap));

        Products iphone14 = new Products(
                102,
                "IPhone14",
                "Phones",
                "Vital safety features like Emergency SOS via satellite and Crash Detection.",
                549,
               this.convertImage(iphone14Bitmap));

        Products iphone15 = new Products(
                103,
                "IPhone15",
                "Phones",
                "Dynamic Island bubbles up alerts and Live Activities — so you don’t miss them while you’re doing something else.",
                549,
                this.convertImage(iphone15Bitmap));

        Products iphone15Pro = new Products(
                104,
                "IPhone15 Pro",
                "Phones",
                "Strong and light titanium design with Action button — a fast track to your favourite feature.",
                549,
                this.convertImage(iphone15ProBitmap));

        Products macbookAir = new Products(
                201,
                "Macbook Air",
                "Laptops",
                " Lightweight and less than two centimeters thin, so you can take MacBook Air anywhere you go.",
                1299,
                this.convertImage(macbookairBitmap));

        Products macbookpro = new Products(
                202,
                "Macbook Pro",
                "laptops",
                "Strong and light titanium design with Action button — a fast track to your favourite feature.",
                1299,
                this.convertImage(macbookproBitmap));

        Products appleWatch = new Products(
                203,
                "Apple watch",
                "Accessories",
                "Get deep insights into your physical and mental health including heart rate,  footnote  1 blood oxygen levels,  footnote  2 mood and more",
                549,
                this.convertImage(macbookairBitmap));

                pdata.productsList.add(iphone13);
                pdata.productsList.add(iphone14);
                pdata.productsList.add(iphone15);
                pdata.productsList.add(iphone15Pro);
                pdata.productsList.add(macbookpro);
                pdata.productsList.add(macbookAir);
                pdata.productsList.add(appleWatch);
                System.out.println("-------");

                return pdata.productsList;


    }
}