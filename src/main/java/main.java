import com.app.database.PersonDAOImp;
import com.app.models.Customer;
import com.app.models.Employee;

import java.sql.SQLException;

public class main {
    public static void main(String [] rodrigo) throws SQLException {
        PersonDAOImp db = new PersonDAOImp();
        Customer customer = db.getOneCustomerInfo(5);
        if(customer != null) System.out.println(customer.getName() + " and phoneNumber: "+ customer.getPhone());
        Employee employee = db.getOneEmployeeInfo(3);
        if(employee != null) System.out.println(employee.getName()+" is working in the outlet n° "+ employee.getOutletNumber());
        // CREATE A CUSTOMER
        /*
        Customer newCustomer = new Customer();
        newCustomer.setName("Test");
        newCustomer.setAddress("Tests n°12");
        newCustomer.setCity("Coacalco");
        newCustomer.setState("Guadalajara");
        newCustomer.setZip(45634);
        newCustomer.setPhone("44823447");
        db.saveCustomer(newCustomer);
        // DELETE A CUSTOMER
        db.deleteCostumer(7);
       // CREATE A EMPLOYEE
        Employee newEmployee = new Employee();
        newEmployee.setName("Test employee");
        newEmployee.setOutletNumber(4);
        db.saveEmployee(newEmployee);
        // DELETE EMPLOYEE
        db.deleteEmployee(7);
         */
    }
}
