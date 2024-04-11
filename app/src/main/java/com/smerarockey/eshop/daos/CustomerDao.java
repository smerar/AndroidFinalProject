package com.smerarockey.eshop.daos;

import com.smerarockey.eshop.models.CustomerCredentials;
import com.smerarockey.eshop.utilities.DBHelper;

public interface CustomerDao {
    boolean addCredentials(CustomerCredentials credentials, DBHelper dbHelper);
    boolean updateCredentials(CustomerCredentials credentials,DBHelper dbHelper);
    CustomerCredentials getCredentials(CustomerCredentials credentials,DBHelper dbHelper);
    boolean deleteCredentials(String customer_email);
}
