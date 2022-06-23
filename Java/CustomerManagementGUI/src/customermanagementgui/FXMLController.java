package customermanagementgui;

import com.mysql.jdbc.PreparedStatement;
import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class FXMLController implements Initializable {

    static ObservableList<Customer> CustomerList = FXCollections.observableArrayList();
    static Connection con = null;
    static Statement stmt = null;
    static PreparedStatement pst = null;
    static ResultSet result = null;
    static String url = "jdbc:mysql://localhost:3306/"; // no database yet
    static String user = "root";
    static String password = "1234";
    static String query = null;

    @FXML
    TextField newName, newEmail, newMobile, idDelOrSearch, editId, editName, editEmail, editMobile;
    @FXML
    Button btnCreateDB, btnAdd, btnDel, btnSearch, btnUpdate, btnShowAllCustomers;

    @FXML
    Text statusLable;
    @FXML
    TableView<Customer> tableCustomer;

    @FXML
    TableColumn<Customer, Integer> tableID;
    @FXML
    TableColumn<Customer, String> tableName;
    @FXML
    TableColumn<Customer, String> tableEmail;
    @FXML
    TableColumn<Customer, String> tableMobile;

    int index = -1;

    @FXML
    private void btnCreateDBClick(ActionEvent event) {
        try {
            CreateDatabase.createCustomerDB();
            statusLable.setFill(Color.BLACK);
            statusLable.setText("Database is being created...");

        } catch (Exception ex) {
            statusLable.setFill(Color.RED);
            statusLable.setText("Error! Cannot Create DataBase");
        }
    }

    @FXML
    private void btnAddClick(ActionEvent event) {

        if (newName.getText().isEmpty()) {
            statusLable.setFill(Color.RED);
            statusLable.setText("Error! Please input Name");
        } else {
            try {
                DBUtil.connectDatabase();
                String insertSQL = String.format("INSERT INTO Customer (Name, Email, Mobile) VALUES ('%s', '%s', '%s');",
                        newName.getText(), newEmail.getText(), newMobile.getText());
                int count = DBUtil.executeUpdate(insertSQL);
                if (count == 0) {
                    statusLable.setFill(Color.RED);
                    statusLable.setText("Failed to add a new Customer!!!");
                } else {
                    statusLable.setFill(Color.BLACK);
                    statusLable.setText("A New Customer Successfully Added!!!");
                }
            } catch (Exception ex) {
                statusLable.setFill(Color.RED);
                statusLable.setText("Invalid Input. Integer please.");
            }
        }
        newName.clear();
        newEmail.clear();
        newMobile.clear();
    }

    @FXML
    private void btnDelClick(ActionEvent event) {
        try {
            int id = Integer.parseInt(idDelOrSearch.getText());

            String deleteSQL = "DELETE FROM Customer WHERE ID='" + id + "';";
            int count = DBUtil.executeUpdate(deleteSQL);
            if (count == 0) {
                statusLable.setFill(Color.RED);
                statusLable.setText("!!! Customer NOT found!!!");
            } else {
                statusLable.setFill(Color.BLACK);
                statusLable.setText("No. " + id + " Customer Successfully Deleted!!!");
            }

        } catch (Exception ex) {
            statusLable.setFill(Color.RED);
            statusLable.setText("Invalid Input. Integer please.");
        }
    }

    @FXML
    private void btnSearchClick(ActionEvent event) {
        try{
        int id = Integer.valueOf(idDelOrSearch.getText());

        CustomerList.clear();
        try {
            con = DBUtil.getConnect();
            result = con.createStatement().executeQuery("SELECT * FROM Customer WHERE ID=" + id + ";");

            if (result.next()) {
                CustomerList.add(new Customer(
                        result.getInt("id"),
                        result.getString("name"),
                        result.getString("email"),
                        result.getString("mobile")));
                statusLable.setFill(Color.BLACK);
                statusLable.setText("No. " + id + " Customer Found!");
            } else {
                statusLable.setFill(Color.RED);
                statusLable.setText("Customer Not Found!");
            }

        } catch (SQLException ex) {
            Logger.getLogger(FXMLController.class.getName()).log(Level.SEVERE, null, ex);
        }

        tableID.setCellValueFactory(new PropertyValueFactory<>("id"));
        tableName.setCellValueFactory(new PropertyValueFactory<>("name"));
        tableEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        tableMobile.setCellValueFactory(new PropertyValueFactory<>("mobile"));

        tableCustomer.setItems(CustomerList);
        } catch (Exception ex) {
            statusLable.setFill(Color.RED);
            statusLable.setText("Invalid Input. Integer please.");
        }
    }

    @FXML
    private void btnUpdateClick(ActionEvent event) {
        try {
            int id = Integer.valueOf(editId.getText());
            String name = editName.getText();
            String email = editEmail.getText();
            String mobile = editMobile.getText();

            if (editId.getText().isEmpty() || editName.getText().isEmpty()) {
                statusLable.setFill(Color.RED);
                statusLable.setText("Error! Please input ID & Name");
            } else {

                String updateSQL = String.format("UPDATE Customer SET Name = '%s', Email = '%s', Mobile = '%s' WHERE id = %d;",
                        name, email, mobile, id);
                int count = DBUtil.executeUpdate(updateSQL);
                if (count == 0) {
                    statusLable.setFill(Color.RED);
                    statusLable.setText("!!! Failed to Edit Customer!!!");
                } else {
                    statusLable.setFill(Color.BLACK);
                    statusLable.setText("No. " + id + " Customer Successfully Edited!!!");
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(FXMLController.class.getName()).log(Level.SEVERE, null, ex);
            statusLable.setFill(Color.RED);
            statusLable.setText("!!! Error!!!");
        }
    }

    @FXML
    private void btnShowAllCustomersClick(ActionEvent event) {

        CustomerList.clear();
        try {
            con = DBUtil.getConnect();
            result = con.createStatement().executeQuery("SELECT * FROM CUSTOMER;");

            while (result.next()) {
                CustomerList.add(new Customer(
                        result.getInt("id"),
                        result.getString("name"),
                        result.getString("email"),
                        result.getString("mobile")));
            }

        } catch (SQLException ex) {
            Logger.getLogger(FXMLController.class.getName()).log(Level.SEVERE, null, ex);
        }

        tableID.setCellValueFactory(new PropertyValueFactory<>("id"));
        tableName.setCellValueFactory(new PropertyValueFactory<>("name"));
        tableEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        tableMobile.setCellValueFactory(new PropertyValueFactory<>("mobile"));

        tableCustomer.setItems(CustomerList);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
}
