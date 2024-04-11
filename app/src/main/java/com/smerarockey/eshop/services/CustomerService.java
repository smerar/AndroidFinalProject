package com.smerarockey.eshop.services;

import com.smerarockey.eshop.daos.CustomerDao;
import com.smerarockey.eshop.models.CustomerCredentials;
import com.smerarockey.eshop.utilities.DBHelper;

public class CustomerService {

    private CustomerDao customerDao;
    public CustomerService(CustomerDao _customerDao){
        this.customerDao=_customerDao;//Dependency injection
    }

    public boolean registerCustomer(CustomerCredentials credentials, DBHelper dbHelper){

        //Write the code to register the customer.
        //Write any logic that need to be implemented
        //To add the customer to database use CustomerDao method addCredentials()
        return true;
    }
}
