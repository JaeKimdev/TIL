package loginfxdemo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginFXDemo extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Welcome"); // set title

        // GridPane is for columns and rows grid
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER); // grid settings
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        // Label, TextField and PasswordField controls
        Text sceneTitle = new Text("Welcome"); // Welcome title
        sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(sceneTitle, 0, 0, 2, 1); // col, row, colspan, rowspan

        Label userName = new Label("User Name");
        grid.add(userName, 0, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label password = new Label("Password");
        grid.add(password, 0, 2);

        PasswordField passwordField = new PasswordField();
        grid.add(passwordField, 1, 2);

        // Button
        Button button = new Button("Sign in"); // Sign in button
        HBox hBox = new HBox(10); // Horizontal Box layout pane
        hBox.setAlignment((Pos.BOTTOM_RIGHT)); // align to bottom right
        hBox.getChildren().add(button);
        grid.add(hBox, 1, 4);

        final Text messageText = new Text(); // message to display
        grid.add(messageText, 1, 6);

        // Event Handler
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                messageText.setFill(Color.FIREBRICK);
                messageText.setText("Sign in button pressed");
            }
        });

        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
