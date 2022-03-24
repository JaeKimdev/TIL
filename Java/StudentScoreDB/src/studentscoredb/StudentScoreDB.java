package studentscoredb;

import java.util.Scanner;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentScoreDB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userInput;
        boolean pass = true;
        String url = "jdbc:mysql://localhost:3306/"; // 3306 is default port
        String user = "root";
        String password = ""; // you set password when MySQL is installed

        Connection con = null; // JDBC connection
        Statement stmt = null; // SQL statement object
        String query; // SQL query string
        ResultSet result = null; // results after SQL execution

        try {
            con = DriverManager.getConnection(url, user, password); // connect to MySQL
            con.setAutoCommit(false);
            stmt = con.createStatement();

            System.out.println("\n##############################");
            System.out.println(" Database is being created...");
            System.out.println("##############################\n");
            query = "DROP DATABASE IF EXISTS student_management;";
            stmt.executeUpdate(query);
            query = "CREATE DATABASE student_management;";
            stmt.executeUpdate(query);
            query = "USE student_management;";
            stmt.executeUpdate(query);
            query = """
                    CREATE TABLE student_score (
                    ID INTEGER NOT NULL AUTO_INCREMENT,
                    Subject VARCHAR(32),
                    Score INTEGER,
                    PRIMARY KEY(ID)
                    );
                    """;
            stmt.executeUpdate(query);
            query = """
                    INSERT INTO student_score
                    (Subject, Score)
                    VALUES
                    ("English", 95),
                    ("Math", 98),
                    ("Science", 89);
                    """;
            stmt.executeUpdate(query);
            while (pass) {
                System.out.println("\nCHOOSE FROM OPTIONS BELOW:\n 1 --> DISPLAY ALL STUDENT RECORD\n 2 --> ADD STUDENT RECORD\n 3 --> DELETE STUDENT RECORD\n 4 --> UPDATE STUDENT RECORD\n 5 --> COMMIT CHANGES\n 6 --> CLOSE DATABASE/QUIT\n 7 --> EXPORT AS TEXT FILE TO DEFAULT PATH");
                System.out.print("Select Number: ");
                userInput = sc.nextInt();

                switch (userInput) {
                    case 1:
                        query = "SELECT * FROM student_score;";
                        result = stmt.executeQuery(query); // execute the SQL query

                        System.out.printf("%7s %-11s %4s\n", "ID", "Subject", "Score");

                        while (result.next()) { // loop until the end of the results
                            int id = result.getInt("Id");
                            String subject = result.getString("Subject");
                            int score = result.getInt("Score");
                            System.out.printf("%7d %-11s %4d\n", id, subject, score);
                        }
                        break;
                    case 2:
                        System.out.print("Enter Subject: ");
                        String newSb = sc.next();
                        System.out.print("Enter Score: ");
                        int newSc = sc.nextInt();
                        query = "INSERT INTO student_score (Subject, Score) VALUES ('" + newSb + "'," + newSc + ");";
                        stmt.executeUpdate(query);
                        System.out.println("New Student Record Added!");
                        break;
                    case 3:
                        System.out.print("Enter ID: ");
                        int delId = sc.nextInt();
                        query = "DELETE FROM student_score WHERE ID=" + delId + ";";
                        stmt.executeUpdate(query);
                        System.out.println("Student Record Deleted!");
                        break;
                    case 4:
                        System.out.print("Enter ID to Edit: ");
                        int editId = sc.nextInt();
                        System.out.print("Enter Subject to Edit: ");
                        String editSb = sc.next();
                        System.out.print("Enter Score to Edit: ");
                        int editSc = sc.nextInt();
                        query = "UPDATE student_score SET Subject='" + editSb + "' ,Score=" + editSc + " WHERE ID=" + editId + ";";
                        stmt.executeUpdate(query);
                        System.out.println("Student Record Deleted!");
                        break;
                    case 5:
                        con.commit();
                        System.out.println("Data Sucessfully Comitted");
                        break;
                    case 6:
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
                    System.out.println("Application Closed!");
                    pass = false;
                    break;
                    case 7:
                        query = "SELECT * FROM student_score;";
                        result = stmt.executeQuery(query); // execute the SQL query
                        OutputStreamWriter osw = new OutputStreamWriter(System.out);
                        BufferedWriter bw = new BufferedWriter(osw, 1024);
                        PrintWriter pw = new PrintWriter(bw);

                        File f = new File("student_score.txt");
                        FileWriter fw = new FileWriter(f);

                        while (result.next()) { // loop until the end of the results
                            int id = result.getInt("Id");
                            String subject = result.getString("Subject");
                            int score = result.getInt("Score");
                            fw.write(id + "\t");
                            fw.write(subject + "\t");
                            fw.write(score + "\t");
                            fw.write("\n");
                        }
                        fw.flush();
                        fw.close();
                        System.out.println("\"student_score.txt\" file Saved");
                        break;
                    default:
                        System.out.println("Error! Please Select 1 ~ 7");
                }
            }
        } catch (Exception ex) {
            System.out.println("SQLException caught: " + ex.getMessage());
        }
    }
}
