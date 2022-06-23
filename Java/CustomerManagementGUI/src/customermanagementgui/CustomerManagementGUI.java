package customermanagementgui;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CustomerManagementGUI extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("design.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Customer Management");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private static void displayCustomers(ArrayList<Customer> customers) {
        if (customers.isEmpty()) {
            System.out.println("!!! No Customer Found!!!");
            return;
        }

        for (Customer c : customers) {
            int id = c.getId();
            String name = c.getName();
            String email = c.getEmail();
            String mobile = c.getMobile();

            System.out.printf("%7s %-11s %20s %10s\n", id, name, email, mobile);
        }
    }

}
