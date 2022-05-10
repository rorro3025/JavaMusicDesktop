package com.app.database;

import com.app.models.Product;

import java.sql.SQLException;

public interface ProductDAO {
    Product getProductInfo(int id) throws SQLException;
    void saveProduct(Product product)throws SQLException;
    void deleteProduct(int id)throws SQLException;
    void updateProduct(Product product)throws SQLException;

}
