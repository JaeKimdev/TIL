package customermanagement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerDAO {

    public static void insertCustomer(String name, String email, String mobile) {
        String insertSQL = String.format("INSERT INTO Customer (Name, Email, Mobile) VALUES ('%s', '%s', '%s');",
                name, email, mobile);
        int count = DBUtil.executeUpdate(insertSQL);
        if (count == 0) {
            System.out.println("!!! Failed to add a new Customer!!!");
        } else {
            System.out.println("\n>>> A New Customer Successfully Added!!!");
        }
    }

    public static void deleteCustomerByID(int id) {
        String deleteSQL = "DELETE FROM Customer WHERE ID='" + id + "';";
        int count = DBUtil.executeUpdate(deleteSQL);
        if (count == 0) {
            System.out.println("!!! Customer NOT found!!!");
        } else {
            System.out.println("\n>>> Customer Successfully Deleted!!!");
        }
    }

    public static Customer searchCustomerByID(int id) {
        String query = "SELECT * FROM Customer WHERE ID=" + id + ";";
        Customer c = null;
        try {
            ResultSet rs = DBUtil.executeQuery(query);
            if (rs.next()) {
                c = new Customer();
                c.setId(rs.getInt("ID"));
                c.setName(rs.getString("Name"));
                c.setEmail(rs.getString("Email"));
                c.setMobile(rs.getString("Mobile"));
                System.out.println("Customer Found!");
                System.out.printf("%7s %11s %20s %10s\n", "ID", "Name", "Email", "Mobile");
                System.out.printf("%7s %11s %20s %10s\n", c.getId(), c.getName(), c.getEmail(), c.getMobile());
            }
            else {
                System.out.println("Customer Not Found!");
            }
        } catch (SQLException ex) {
            System.out.println("SQLException on executeQuery: " + ex.getMessage());
        }
        return c;
    }

    public static ArrayList<Customer> getAllCustomers() {
        String query = "SELECT * FROM customer;";
        ArrayList<Customer> customers = new ArrayList<>();
        
        try {
            ResultSet rs = DBUtil.executeQuery(query);
            
            while (rs.next()) {
                Customer c = new Customer();
                c.setId(rs.getInt("ID"));
                c.setName(rs.getString("Name"));
                c.setEmail(rs.getString("Email"));
                c.setMobile(rs.getString("Mobile"));
                customers.add(c);
            }
        } catch (SQLException ex) {
            System.out.println("SQLException on executeQuery: " + ex.getMessage());
        }
        return customers;
    }
}
