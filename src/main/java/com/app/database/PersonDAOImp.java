package com.app.database;

import com.app.models.Customer;

import java.sql.*;

public class PersonDAOImp implements PersonDAO {
    @Override
    public Customer getOneCustomerInfo(int id) throws SQLException {
        String query = "SELECT * FROM customers where customer_id = ?";
        ResultSet rs = null;
        try (
                Connection conn = getConnection();
                PreparedStatement ps = conn.prepareStatement(query)
        ) {
            ps.setInt(1, id);
            rs = ps.executeQuery();
            Customer customer = new Customer();
            if(rs.next()){
               customer.setName(rs.getString(2));
               customer.setAddress(rs.getString(3));
               customer.setPhone(rs.getString(7));
            }else{
                return null;
            }
            return customer;
        }catch (SQLException e){
            processException(e);
            return null;
        }finally{
            if(rs != null)rs.close();
        }
    }

    @Override
    public void saveCustomer(Customer customer) throws SQLException {
        String query = "insert into ";

    }

    private static Connection getConnection () throws SQLException {
       String USER = "root";
       String PASSWORD = "admin";
       String URI = "jdbc:mysql://localhost:3306/music";
       return DriverManager.getConnection(URI,USER,PASSWORD);
    }

    private static void processException(SQLException e ){
        System.out.println("SQL Error "+ e);
    }
}
