package com.smerarockey.eshop.daos;

import com.smerarockey.eshop.models.CustomerCredentials;
import com.smerarockey.eshop.utilities.DBHelper;

public class CustomerDaoImpl implements CustomerDao{

    @Override
    public boolean addCredentials(CustomerCredentials credentials, DBHelper dbHelper) {
        //Here write method to add the data to database.Use the dbhelper object passed as argument when this method is called
        //
        return false;
    }

    @Override
    public boolean updateCredentials(CustomerCredentials credentials, DBHelper dbHelper) {
        return false;
    }

    @Override
    public CustomerCredentials getCredentials(CustomerCredentials credentials, DBHelper dbHelper) {
        return null;
    }

    @Override
    public boolean deleteCredentials(String customer_email) {
        return false;
    }
}
