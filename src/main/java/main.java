import com.app.database.PersonDAOImp;
import com.app.models.Customer;

import java.sql.SQLException;

public class main {
    public static void main(String [] rodrigo) throws SQLException {
        PersonDAOImp db = new PersonDAOImp();
        Customer customer = db.getOneCustomerInfo(2);
        if(customer != null) System.out.println(customer.getName() + " and phoneNumber: "+ customer.getPhone());
    }
}
