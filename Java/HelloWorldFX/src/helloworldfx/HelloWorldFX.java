package helloworldfx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloWorldFX extends Application {
    @Override
    public void start(Stage primaryStage) { // starting point
        Button btn = new Button(); // Button control
        btn.setText("Say 'Hello World FX!'"); // button text
        btn.setOnAction(new EventHandler<ActionEvent>() { // event on button
            @Override
            public void handle(ActionEvent event) { // when button clicked
                System.out.println("Hello World FX!");
            }
        });
        
        StackPane root = new StackPane(); // root node
        root.getChildren().add(btn); // button to the root node
        
        Scene scene = new Scene(root, 300, 150); // root node to the scene
        
        primaryStage.setTitle("Hello World FX!"); // stage title
        primaryStage.setScene(scene); // scen onto the stage
        primaryStage.show(); // show the stage
    }

    public static void main(String[] args) {
        launch(args); // launch JavaFX standalone application
    }
}
