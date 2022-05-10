package com.app.database;

import com.app.models.Customer;
import com.app.models.Employee;

import java.sql.SQLException;

public interface PersonDAO {

    Customer getOneCustomerInfo(int id) throws SQLException;
    void saveCustomer(Customer customer) throws SQLException;
    void deleteCostumer(int id) throws SQLException;
    void updateCustomer(Customer customer) throws SQLException;
    Employee getOneEmployeeInfo(int id) throws SQLException;
    void saveEmployee(Employee emp) throws SQLException;
    void deleteEmployee(int id) throws SQLException;
    void updateEmployee(Employee employee) throws SQLException;

}
