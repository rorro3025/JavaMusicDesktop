package com.app.database;

import com.app.models.Customer;

import java.sql.SQLException;

public interface PersonDAO {

    Customer getOneCustomerInfo(int id) throws SQLException;
    void saveCustomer(Customer customer) throws SQLException;

}
