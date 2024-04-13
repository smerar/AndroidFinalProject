package com.smerarockey.eshop.daos;

import com.smerarockey.eshop.models.Products;
import com.smerarockey.eshop.utilities.ProductDBHelper;

import java.util.List;

public interface ProductDao {
    public boolean addProduct(List<Products> products, ProductDBHelper dbHelper);
    List<Products> listProduct();
    public Products getProductById();
    public Products getProductByCategory(String category);
}


