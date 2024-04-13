package com.smerarockey.eshop.models;

public class Products {

    private int productId;
    private String productName;
    private String productDescription;
    private int productPrice;
    private String productCategory;
    private byte[] productImage;
    public Products(){

    }
    public Products(int productId,String productName,String productCategory,String productDescription,int productPrice,byte[] productImage){
        this.productId=productId;
        this.productName=productName;
        this.productCategory=productCategory;
        this.productDescription=productDescription;
        this.productPrice=productPrice;
        this.productImage=productImage;
    }

    public int getProductId() {
        return productId;
    }

    public byte[] getProductImage() {
        return productImage;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public void setProductImage(byte[] productImage) {
        this.productImage = productImage;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }
}


