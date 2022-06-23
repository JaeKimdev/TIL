package customermanagement;

import java.util.Scanner;
import java.util.ArrayList;

public class CustomerManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int userInput;
        boolean pass = true;

        System.out.println("\n#############################");
        System.out.println(" Create Customer database...");
        System.out.println("#############################");
        CreateDatabase.createCustomerDB();

        ArrayList<Customer> customers = CustomerDAO.getAllCustomers();
        displayCustomers(customers);

        while (pass) {
            System.out.println("\nCHOOSE FROM OPTIONS BELOW:\n 1 --> DISPLAY ALL CUSTOMER RECORD\n 2 -->"
                    + " ADD CUSTOMER RECORD\n 3 --> DELETE CUSTOMER RECORD\n 4 --> SEARCH CUSTOMER\n 5 -->"
                    + " COMMIT CHANGES\n 6 --> QUIT PROGRAM\n");
            System.out.print("Select Number: ");
            userInput = sc.nextInt();

            switch (userInput) {
                case 1:
                    displayCustomers(CustomerDAO.getAllCustomers());
                    break;
                case 2:
                    System.out.print("Enter Name: ");
                    String newName = sc.next();
                    System.out.print("Enter Email: ");
                    String newEmail = sc.next();
                    System.out.print("Enter Mobile: ");
                    String newMobile = sc.next();
                    CustomerDAO.insertCustomer(newName, newEmail, newMobile);
                    break;
                case 3:
                    System.out.print("Enter ID to Delete: ");
                    int delId = sc.nextInt();
                    CustomerDAO.deleteCustomerByID(delId);
                    break;
                case 4:
                    System.out.print("Enter ID to Search: ");
                    int searchId = sc.nextInt();
                    CustomerDAO.searchCustomerByID(searchId);
                    break;
                case 5:
                    DBUtil.commitDatabase();
                    System.out.println("Data Sucessfully Comitted");
                    break;
                case 6:
                    pass = false;
                    break;
                default:
                    System.out.println("Error! Please Select 1 ~ 6");
            }
        }
    }

    private static void displayCustomers(ArrayList<Customer> customers) {
        if (customers.isEmpty()) {
            System.out.println("!!! No Customer Found!!!");
            return;
        }

        System.out.println("\n############################");
        System.out.println("##    All Customers...    ##");
        System.out.println("############################");
        System.out.printf("%7s %-11s %20s %10s\n", "ID", "Name", "Email", "Mobile");
        for (Customer c : customers) {
            int id = c.getId();
            String name = c.getName();
            String email = c.getEmail();
            String mobile = c.getMobile();

            System.out.printf("%7s %-11s %20s %10s\n", id, name, email, mobile);
        }
    }

}
