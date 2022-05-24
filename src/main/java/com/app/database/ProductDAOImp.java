package com.app.database;

import com.app.models.Product;

import java.sql.*;

public class ProductDAOImp implements ProductDAO {
    Utils util = new Utils();

    @Override
    public Product getProductInfo(int id) throws SQLException {
        String query = "select * from products where product_code = ?";
        ResultSet rs = null;
        try (
                Connection conn = util.getConnection();
                PreparedStatement ps = conn.prepareStatement(query);
        ) {
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                Product product = new Product();
                product.setId(rs.getInt("Product_code"));
                product.setTitle(rs.getString("title"));
                product.setArtist(rs.getString("artist"));
                product.setCost(rs.getFloat("cost"));
                product.setSale_price(rs.getFloat("sale_price"));
                return product;
            } else {
                System.out.print("No results found");
                return null;
            }
        } catch (SQLException e) {
            util.processException(e);
            return null;
        } finally {
            if (rs != null) rs.close();
        }
    }

    @Override
    public void saveProduct(Product product) throws SQLException {
        String query = "insert into products (artist,title,cost,sale_price) values (?,?,?,?)";
        try (
                Connection conn = util.getConnection();
                PreparedStatement ps = conn.prepareStatement(query);
        ) {
            ps.setString(1, product.getArtist());
            ps.setString(2, product.getTitle());
            ps.setFloat(3, product.getCost());
            ps.setFloat(4, product.getSale_price());
            if (ps.executeUpdate() == 1) {
                System.out.println("Product saved");
            } else {
                System.out.println("No rows affected");
            }
        } catch (SQLException e) {
            util.processException(e);
        }
    }

    @Override
    public void deleteProduct(int id) throws SQLException {
        String query = "DELETE FROM products where product_code = ?";
        try (
                Connection conn = util.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)
        ) {
            ps.setInt(1, id);
            if (ps.executeUpdate() == 1) {
                System.out.println("Product saved");
            } else {
                System.out.println("NO ROWS AFFECTED");
            }
        } catch (SQLException e) {
            util.processException(e);
        }
    }

    @Override
    public void updateProduct(Product product) throws SQLException {
        String query = "UPDATE products SET artist = ?, title = ?,cost=?,sale_price=? WHERE product_code = ?";
        try (
                Connection conn = util.getConnection();
                PreparedStatement ps = conn.prepareStatement(query);
        ) {
            ps.setString(1, product.getArtist());
            ps.setString(2, product.getTitle());
            ps.setFloat(3, product.getCost());
            ps.setFloat(4, product.getSale_price());
            ps.setInt(5, product.getId());
            if (ps.executeUpdate() == 1) {
                System.out.println("Product updated");
            } else {
                System.out.println("NO ROWS AFFECTED");
            }
        }
    }
}
