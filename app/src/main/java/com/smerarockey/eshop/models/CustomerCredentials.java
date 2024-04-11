package com.smerarockey.eshop.models;

public class CustomerCredentials {
    private String customerEmail;
    private String password;

    public CustomerCredentials(){

    }
    public CustomerCredentials(String _customerEmail,String _password)
    {
        this.customerEmail=_customerEmail;
        this.password=_password;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
