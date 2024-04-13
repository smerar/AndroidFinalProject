package com.smerarockey.eshop.daos;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import com.smerarockey.eshop.models.Products;
import com.smerarockey.eshop.utilities.ProductDBHelper;

import java.util.List;
import java.util.ListIterator;

public class ProductDaoImp implements ProductDao{
    @Override
    public boolean addProduct(List<Products> products, ProductDBHelper dbHelper) {
        Products product=new Products();


        for(int i=0;i<products.size();i++)
        {
            dbHelper.addProducts(products.get(i));
            //System.out.println(rowId);
        }
        return false;
    }

    @Override
    public List<Products> listProduct() {
        return null;
    }

    @Override
    public Products getProductById() {
        return null;
    }

    @Override
    public Products getProductByCategory(String category) {
        return null;
    }
}
