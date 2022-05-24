import com.app.database.PersonDAOImp;
import com.app.database.ProductDAOImp;
import com.app.database.Sell;
import com.app.models.*;

import java.sql.SQLException;
import java.util.ArrayList;

public class main {
    public static void main(String[] rodrigo) throws SQLException {
        PersonDAOImp db = new PersonDAOImp();
        Customer customer = db.getOneCustomerInfo(5);
        if (customer != null) System.out.println(customer.getName() + " and phoneNumber: " + customer.getPhone());
        Employee employee = db.getOneEmployeeInfo(1);
        if (employee != null)
            System.out.println(employee.getName() + " is working in the outlet n° " + employee.getOutletNumber());
        ProductDAOImp productDB = new ProductDAOImp();
        Product product = productDB.getProductInfo(3);
        if (product != null) System.out.println(product.getId() + " - " + product.getTitle().toUpperCase());
        // GET PRODUCT LIST
        Sell dbSells = new Sell();
        ArrayList<Product> listP = dbSells.getAllProductsByStore(2);
        if (listP.size() > 0) {
            for (Product p : listP) {
                System.out.println("The stores has " + p.getQuantity() + " copies of album '" + p.getTitle().toUpperCase() + "' by " + p.getArtist() + " and its value $" + p.getSale_price() + " p/U");
            }
        } else {
            System.out.print("No items available");
        }
        System.out.print("______________________ ");
        System.out.println("Adding new sales");
//        ArrayList<Sale> salesList = new ArrayList<>();
//        Sale itemS = new Sale();
//        itemS.setProductCode(listP.get(0).getId());
//        itemS.setStock(listP.get(0).getQuantity());
//        itemS.setQuantity(2);
//        itemS.getDate();
//        itemS.getTime();
//        salesList.add(itemS);
//        Sale itemS1 = new Sale();
//        itemS1.setProductCode(listP.get(1).getId());
//        itemS1.setStock(listP.get(1).getQuantity());
//        itemS1.setQuantity(4);
//        itemS1.getDate();
//        itemS1.getTime();
//        salesList.add(itemS1);
//        Sale itemS2 = new Sale();
//        itemS2.setProductCode(listP.get(2).getId());
//        itemS2.setStock(listP.get(2).getQuantity());
//        itemS2.setQuantity(2);
//        itemS2.getDate();
//        itemS2.getTime();
//        salesList.add(itemS2);
//        dbSells.processSales(2,2,1,salesList);
//        System.out.print("______________________ ");
//        System.out.println("Adding new sales");
        ArrayList<Sale> salesList = new ArrayList<>();
        Sale itemS = new Sale();
        itemS.setProductCode(listP.get(0).getId());
        itemS.setQuantity(3);
        itemS.getDate();
        itemS.getTime();
        itemS.setReason("It doesn't fit");
        salesList.add(itemS);
        Sale itemS1 = new Sale();
        itemS1.setProductCode(listP.get(1).getId());
        itemS1.setQuantity(4);
        itemS1.getDate();
        itemS1.getTime();
       itemS1.setReason("It is not i wanted");
        salesList.add(itemS1);
        Sale itemS2 = new Sale();
        itemS2.setProductCode(listP.get(2).getId());
        itemS2.setQuantity(7);
        itemS2.getDate();
        itemS2.getTime();
        itemS2.setReason("It is not i wanted");
        salesList.add(itemS2);
        dbSells.processReturn(2, 5,  salesList);
        //dbSells.discountInventory(listP.get(2).getQuantity()-1,listP.get(2).getId(),2);
        //dbSells.addASale(2,3,0,listP.get(2).getId(),3);
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
