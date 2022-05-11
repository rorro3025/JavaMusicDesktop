package com.app.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Utils {
    public Connection getConnection() throws SQLException {
        String USER = "admin";
        String PASSWORD = "admin1234";
        String URI = "jdbc:mysql://localhost:3306/music";
        return DriverManager.getConnection(URI, USER, PASSWORD);
    }

    public void processException(SQLException e) {
        System.out.println("SQL Error " + e);
    }

    public void printResults(ResultSet results) throws SQLException {
        while(results.next()){
           System.out.println(results.getInt(1));
            System.out.println(results.getString(2));
        }
    }
}
