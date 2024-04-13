package com.smerarockey.eshop.utilities;

import com.smerarockey.eshop.models.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryData {
    public  static List<Category> categories = new ArrayList<>();

    public static List<Category> getCategories()
    {
        Category c1=new Category("Phones");
        Category c2=new Category("Laptops");
        Category c3=new Category("Accessories");
        categories.add(c1);
        categories.add(c2);
        categories.add(c3);
        return categories;
    }
}
