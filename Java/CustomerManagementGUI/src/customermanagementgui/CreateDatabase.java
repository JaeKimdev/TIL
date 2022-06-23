package customermanagementgui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class CreateDatabase {

    public static void createCustomerDB() {
        String url = "jdbc:mysql://localhost:3306/"; // no database yet
        String user = "root";
        String password = "1234";
        Connection con = null;
        Statement stmt = null;
        String query;
        ResultSet result = null;

        try {
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            System.out.println("\n##############################");
            System.out.println(" Database is being created...");
            System.out.println("##############################\n");
            query = "DROP DATABASE IF EXISTS smtbiz;";
            stmt.executeUpdate(query);
            query = "CREATE DATABASE smtbiz;";
            stmt.executeUpdate(query);
            query = "USE smtbiz;";
            stmt.executeUpdate(query);
            query = """
                    CREATE TABLE Customer (
                    Id INTEGER NOT NULL AUTO_INCREMENT,
                    Name VARCHAR(50) NOT NULL,
                    Email VARCHAR(255) NULL,
                    Mobile VARCHAR(20) NULL,
                    PRIMARY KEY(ID));
                    """;
            stmt.executeUpdate(query);
            query = """
                    INSERT INTO Customer
                        (Name, Email, Mobile)
                    VALUES
                    ("James", "james@smtafe.com.au", "0400-000-000"),
                    ("Jae", "jae@smtafe.com.au", "0422-222-222"),
                    ("Kyle", "kyle@smtafe.com.au", "0433-333-333"),
                    ("Kris", "kris@smtafe.com.au", "0444-444-444"),
                    ("Ally", "ally@smtafe.com.au", "0455-555-555");
                    """;
            stmt.executeUpdate(query);
            query = "SELECT * FROM Customer;";
            result = stmt.executeQuery(query); // execute the SQL query
        } catch (SQLException ex) {
            System.out.println("SQLException on database creation: " + ex.getMessage());
        } finally {
            try {
                if (result != null) {
                    result.close();
                }

                if (stmt != null) {
                    stmt.close();
                }

                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                System.out.println("SQLException caught: " + ex.getMessage());
            }
        }
    }
}
