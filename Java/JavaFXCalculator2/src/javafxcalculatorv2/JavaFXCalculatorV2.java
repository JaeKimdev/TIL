package javafxcalculatorv2;

import javafx.application.Application;
import javafx.event.*;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.text.Font;

public class JavaFXCalculatorV2 extends Application {

    private Label firstLabel, secondLabel, resultLabel;
    private TextField firstText, secondText, resultText;
    private Button addButton, subButton, mulButton, divButton;

    @Override
    public void start(Stage primaryStage) {
        final int LABEL_WIDTH = 100;
        firstLabel = new Label("First Numbr:");
        firstLabel.setPrefWidth(LABEL_WIDTH);
        firstLabel.setAlignment(Pos.CENTER_RIGHT);
        secondLabel = new Label("Second Number:");
        secondLabel.setPrefWidth(LABEL_WIDTH);
        secondLabel.setAlignment(Pos.CENTER_RIGHT);
        resultLabel = new Label("Result:");
        resultLabel.setPrefWidth(LABEL_WIDTH);
        resultLabel.setAlignment(Pos.CENTER_RIGHT);

        final int TEXT_WIDTH = 200;
        firstText = new TextField();
        firstText.setPromptText("Enter an int number.");
        firstText.setPrefWidth(TEXT_WIDTH);
        secondText = new TextField();
        secondText.setPromptText("Enter an int number.");
        secondText.setPrefWidth(TEXT_WIDTH);
        resultText = new TextField();
        resultText.setPromptText("Result will be here.");
        resultText.setPrefWidth(TEXT_WIDTH);
//        resultText.setDisable(true);
        resultText.setEditable(false);

        final Font f = new Font("Bold", 18);
        addButton = new Button("+");
        addButton.setFont(f);
        subButton = new Button("-");
        subButton.setFont(f);
        mulButton = new Button("*");
        mulButton.setFont(f);
        divButton = new Button("/");
        divButton.setFont(f);

        BorderPane mainPane = new BorderPane();
        GridPane upperPane = new GridPane();
        FlowPane lowerPane = new FlowPane();

        upperPane.setAlignment(Pos.TOP_CENTER);
        upperPane.setHgap(10);
        upperPane.setVgap(10);
        upperPane.add(firstLabel, 0, 0);
        upperPane.add(firstText, 1, 0);
        upperPane.add(secondLabel, 0, 1);
        upperPane.add(secondText, 1, 1);
        upperPane.add(resultLabel, 0, 2);
        upperPane.add(resultText, 1, 2);

        lowerPane.getChildren().add(addButton);
        lowerPane.getChildren().add(subButton);
        lowerPane.getChildren().add(mulButton);
        lowerPane.getChildren().add(divButton);
        lowerPane.setAlignment(Pos.CENTER);

        mainPane.setCenter(upperPane);
        mainPane.setBottom(lowerPane);

        addButton.setOnAction(buttonEventHandler);
        subButton.setOnAction(buttonEventHandler);
        mulButton.setOnAction(buttonEventHandler);
        divButton.setOnAction(buttonEventHandler);

        Scene scene = new Scene(mainPane, 300, 250);
        primaryStage.setTitle("JavaFX Calculater");
        primaryStage.setMinWidth(350);
        primaryStage.setMinHeight(200);
        primaryStage.setHeight(200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private EventHandler<ActionEvent> buttonEventHandler = new EventHandler<ActionEvent>() {

        @Override
        public void handle(ActionEvent event) {
            int a = Integer.valueOf(firstText.getText());
            int b = Integer.valueOf(secondText.getText());
            Object source = event.getSource();

            if (source == addButton) {
                resultText.setText(a + " + " + b + " = " + (a + b));
            } else if (source == subButton) {
                resultText.setText(a + " - " + b + " = " + (a - b));
            } else if (source == mulButton) {
                resultText.setText(a + " * " + b + " = " + (a * b));
            } else if (source == divButton) {
                if (b != 0) {
                    resultText.setText(a + " / " + b + " = " + (a / (double) b));
                } else {
                    resultText.setText("ERROR: Divide by Zero...");
                }
            }
        }
    };

    public static void main(String[] args) {
        launch(args);
    }
}
