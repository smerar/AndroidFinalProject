package com.smerarockey.eshop.models;

public class Category {
    private String type;

    public Category(){}
    public Category(String _type)
    {
        this.type=_type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

