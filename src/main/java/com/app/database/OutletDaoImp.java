package com.app.database;

import com.app.models.Outlet;
import com.app.database.Utils;

import java.sql.*;

public class OutletDaoImp implements OutletsDao {

    private Utils util = new Utils();

    @Override
    public Outlet getOutletInfo(int id) throws SQLException {
        String query = "SELECT * FROM outlets WHERE outlet_number = " + id;
        ResultSet rs = null;
        try (
                Connection conn = util.getConnection();
                PreparedStatement stmt = conn.prepareStatement(query);
        ) {
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            Outlet outlet = new Outlet();
            if (rs.next()) {
                outlet.setId(rs.getInt("outlet_number"));
                outlet.setAddress(rs.getString("address"));
                outlet.setCity(rs.getString("city"));
                outlet.setState(rs.getString("state"));
                outlet.setZip(Integer.parseInt(rs.getString("zip")));
                outlet.setPhone(rs.getString("phone"));
                return outlet;
            } else {
                return null;
            }
        } catch (SQLException e) {
            util.processException(e);
            return null;
        }finally {
            if (rs != null) rs.close();
        }
    }

    @Override
    public void saveOutlet(Outlet outlet) throws SQLException {

    }

    @Override
    public void deleteOutlet(int id) throws SQLException {

    }

    @Override
    public void updateOutlet(Outlet outlet) throws SQLException {

    }

}
