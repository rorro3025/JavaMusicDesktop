package com.app.database;

import com.app.models.Outlet;

import java.sql.SQLException;

public interface OutletsDao {
    Outlet getOutletInfo(int id) throws SQLException;
    void saveOutlet(Outlet outlet) throws SQLException;
    void deleteOutlet(int id) throws SQLException;
    void updateOutlet(Outlet outlet) throws SQLException;
}
