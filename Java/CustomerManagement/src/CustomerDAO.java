import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerDAO {

    public static void insertCustomer(String name, String email, String mobile) {
        String insertSQL = String.format("INSERT INTO Customers (Name, Email, Mobile) VALUES (`%s`, `%s`, `%s`);",
                name, email, mobile);
        int count = DBUtil.excuteUpdate(insertSQL);
    }

    public static ArrayList<Customer> getAllCustomers() {
String query = "SELECT * FROM Customers;";
ArrayList<Customer> allCustomers = new ArrayList<>();

try {
    ResultSet rs = DBUtil.executeQuery(quert);

    while (rs.next()) {
        Customer c = new Customer();
        c.setId(rs.getInt("ID"));
        c.setName(rs.getString("Name"));
        c.setEmail(rs.getString("Email"));
        c.setMobile(rs.getString("Mobile"));
    }

}catch (SQLException ex) {
    System.out.println("SQLException on executeQuery: " + ex.getMessage());
}
return allCustomers;
    }

}