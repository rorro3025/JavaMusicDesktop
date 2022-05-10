package com.app.database;

import com.app.models.Outlet;

public interface Outlets {
    Outlet getOutletInfo(int id);
    void saveOutlet(Outlet outlet);
    void deleteOutlet(int id);
    void updateOutlet(Outlet outlet);
}
