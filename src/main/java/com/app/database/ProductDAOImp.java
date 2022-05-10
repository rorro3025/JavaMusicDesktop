package com.app.database;

import com.app.models.Product;
import java.sql.*;

public class ProductDAOImp implements ProductDAO{
    Utils util = new Utils();

    @Override
    public Product getProductInfo(int id) throws SQLException{
        String query = "select * from products where product_code = ?";
        ResultSet rs = null;
        try(
                Connection conn = util.getConnection();
                PreparedStatement ps = conn.prepareStatement(query);
                ){

        }
        return null;
    }

    @Override
    public void saveProduct(Product product) throws SQLException{

    }

    @Override
    public void deleteProduct(int id) throws SQLException{

    }

    @Override
    public void updateProduct(Product product) throws SQLException{

    }
}
