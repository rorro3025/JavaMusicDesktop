package com.app.database;

import com.app.models.Customer;
import com.app.models.Employee;

import java.sql.*;

public class PersonDAOImp implements PersonDAO {
    Utils util = new Utils();
    @Override
    public Customer getOneCustomerInfo(int id) throws SQLException {
        String query = "SELECT * FROM customers where customer_id = ?";
        ResultSet rs = null;
        try (
                Connection conn = util.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)
        ) {
            ps.setInt(1, id);
            rs = ps.executeQuery();
            Customer customer = new Customer();
            if (rs.next()) {
                customer.setId(rs.getInt(1));
                customer.setName(rs.getString(2));
                customer.setAddress(rs.getString(3));
                customer.setCity(rs.getString(4));
                customer.setState(rs.getString(5));
                customer.setZip(rs.getInt(6));
                customer.setPhone(rs.getString(7));
            } else {
                return null;
            }
            return customer;
        } catch (SQLException e) {
            util.processException(e);
            return null;
        } finally {
            if (rs != null) rs.close();
        }
    }

    @Override
    public void saveCustomer(Customer customer) throws SQLException {
        String query = "insert into customers (customer_name, address,city,state,zip,phone) values (?,?,?,?,?,?)";
        try (
                Connection conn = util.getConnection();
                PreparedStatement ps = conn.prepareStatement(query);
        ) {
            ps.setString(1, customer.getName());
            ps.setString(2, customer.getAddress());
            ps.setString(3, customer.getCity());
            ps.setString(4, customer.getState());
            ps.setInt(5, customer.getZip());
            ps.setString(6, customer.getPhone());

            if (ps.executeUpdate() == 1) {
                System.out.print("User saved");
            } else {
                System.out.print("No rows affected");
            }
        } catch (SQLException e) {
            util.processException(e);
        }

    }

    @Override
    public void deleteCostumer(int id) throws SQLException {
        String query = "DELETE FROM customers where customer_id = ?";
        try (
                Connection conn = util.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)
        ) {
            ps.setInt(1, id);
            if (ps.executeUpdate() == 1) {
                System.out.println("user deleted");
            } else {
                System.out.println("No rows affected");
            }
        } catch (SQLException e) {
            util.processException(e);
        }
    }

    @Override
    public void updateCustomer(Customer customer) throws SQLException {
        String query = "";
    }

    @Override
    public Employee getOneEmployeeInfo(int id) throws SQLException {
        String query = "SELECT * FROM employees where emp_number = ?";
        ResultSet rs = null;
        try (
                Connection conn = util.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)
        ) {
            ps.setInt(1, id);
            rs = ps.executeQuery();
            Employee employee = new Employee();
            if (rs.next()) {
                employee.setId(rs.getInt(2));
                employee.setOutletNumber(rs.getInt(1));
                employee.setName(rs.getString(3));
            } else {
                return null;
            }
            return employee;
        } catch (SQLException e) {
            util.processException(e);
            return null;
        } finally {
            if (rs != null) rs.close();
        }
    }

    @Override
    public void saveEmployee(Employee emp) throws SQLException {
        String query = "insert into employees (outlet_number, emp_name) values (?,?)";
        try (
                Connection conn = util.getConnection();
                PreparedStatement ps = conn.prepareStatement(query);
        ) {
            ps.setInt(1, emp.getOutletNumber());
            ps.setString(2, emp.getName());
            if (ps.executeUpdate() == 1) {
                System.out.print("User saved");
            } else {
                System.out.print("No rows affected");
            }
        } catch (SQLException e) {
            util.processException(e);
        }
    }

    @Override
    public void deleteEmployee(int id) throws SQLException {
        String query = "DELETE FROM employees where emp_number = ?";
        try (
                Connection conn = util.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)
        ) {
            ps.setInt(1, id);
            if (ps.executeUpdate() == 1) {
                System.out.println("user deleted");
            } else {
                System.out.println("No rows affected");
            }
        } catch (SQLException e) {
            util.processException(e);
        }
    }

    @Override
    public void updateEmployee(Employee employee) throws SQLException {
        String query = "";
    }

}
