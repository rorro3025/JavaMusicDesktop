package com.app.database;

import com.app.models.Product;
import com.app.models.Sale;

import java.sql.*;
import java.util.ArrayList;

public class Sell {
    Utils util = new Utils();

    public ArrayList<Product> getAllProductsByStore(int id) throws SQLException {
        String query = "select p.product_code,p.title,p.artist,t.quantity,p.sale_price from products p, (select i.product_code,i.quantity from inventory i where outlet_number = ?) as t where t.product_code = p.product_code;";
        ArrayList<Product> productsList = new ArrayList<>();
        ResultSet rs = null;
        try (
                Connection conn = util.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)
        ) {
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                Product product = new Product();
                product.setId(rs.getInt(1));
                product.setTitle(rs.getString(2));
                product.setArtist(rs.getString(3));
                product.setQuantity(rs.getInt(4));
                product.setSale_price(rs.getFloat(5));
                productsList.add(product);
            }
        } catch (SQLException e) {
            util.processException(e);
        } finally {
            if (rs != null) rs.close();
        }
        return productsList;
    }

    public void processSales(int outlet, int empNumber, int customerId, ArrayList<Sale> list) throws SQLException {
        String query = "insert into sales (outlet_number,emp_number,customer_id,product_code,sale_date,sale_time,quantity) values (?,?,?,?,?,?,?)";
        String query2 = "UPDATE inventory set quantity = ? where product_code = ? and outlet_number = ? ";
        try (
                Connection conn = util.getConnection();
                PreparedStatement statement = conn.prepareStatement(query);
                PreparedStatement statement2 = conn.prepareStatement(query2)
        ) {
            for (Sale item : list) {
                statement.setInt(1, outlet);
                statement.setInt(2, empNumber);
                statement.setInt(3, customerId);
                statement.setInt(4, item.getProductCode());
                statement.setDate(5, item.getDate());
                statement.setTime(6, item.getTime());
                statement.setInt(7, item.getQuantity());
                statement.addBatch();
                statement2.setInt(1, item.getStock() - item.getQuantity());
                statement2.setInt(2, item.getProductCode());
                statement2.setInt(3, outlet);
                statement2.addBatch();
            }
            statement.executeBatch();
            statement2.executeBatch();
            System.out.print("Sales added");
        } catch (SQLException e) {
            util.processException(e);
        }
    }

    public void processReturn(int outlet,int customerId,ArrayList<Sale> list) throws SQLException {
        String query = "insert into returns (outlet_number,product_code,customer_id,return_date,return_time,quantity,reason) values (?,?,?,?,?,?,?)";
        String query2 = "UPDATE inventory set quantity = quantity + ? where product_code = ? and outlet_number = ? ";
        try (
                Connection conn = util.getConnection();
                PreparedStatement statement = conn.prepareStatement(query);
                PreparedStatement statement2 = conn.prepareStatement(query2)
        ) {
            for(Sale item:list){
                statement.setInt(1, outlet);
                statement.setInt(2, item.getProductCode());
                statement.setInt(3, customerId);
                statement.setDate(4, item.getDate());
                statement.setTime(5, item.getTime());
                statement.setInt(6, item.getQuantity());
                statement.setString(7, item.getReason());
                statement.addBatch();
                statement2.setInt(1, item.getQuantity());
                statement2.setInt(2, item.getProductCode());
                statement2.setInt(3, outlet);
                statement2.addBatch();
            }
            statement.executeBatch();
            statement2.executeBatch();
            System.out.print("Returns added");
        }catch (SQLException e){
            util.processException(e);
        }
    }
}
