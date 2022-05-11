package com.app.database;

import com.app.models.Product;

import java.sql.Connection;
import java.sql.SQLException;

public class Sell {
    Utils util = new Utils();

    public Product[] getAllProductsByStore() throws SQLException {
        String query = "SELECT ";
        Connection conn = util.getConnection();
       return null;
    }
}
