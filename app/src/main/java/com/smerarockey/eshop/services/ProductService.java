package com.smerarockey.eshop.services;

import com.smerarockey.eshop.daos.ProductDao;
import com.smerarockey.eshop.models.Products;
import com.smerarockey.eshop.utilities.ProductDBHelper;
import com.smerarockey.eshop.utilities.ProductData;

import java.util.List;

public class ProductService {
    ProductDao productDao;



    public ProductService(ProductDao productDao){
        this.productDao=productDao;
    }
    public boolean addProduct(List<Products> products,ProductDBHelper dbHelper){

        return this.productDao.addProduct(products,dbHelper);
    }

    public List<Products> listProducts(){
        return null;
    }
}
