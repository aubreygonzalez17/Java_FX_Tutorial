package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.xml.soap.Text;
import java.awt.event.MouseEvent;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        primaryStage.show();
        primaryStage.setTitle("Java FX Exercise GUI");
        // primaryStage.setWidth(600);
        // primaryStage.setHeight(300);
        Group root = new Group();

        Label text = new Label("Please select an exercise");

        Button button = new Button("Apply");

        ComboBox comboBox = new ComboBox();
        Button applyButton = new Button("Apply");
        // Text text = new Text();
        comboBox.getItems().add("Exercise 1");
        comboBox.getItems().add("Exercise 2");
        comboBox.getItems().add("Exercise 3");
        comboBox.setLayoutX(10);
        comboBox.setLayoutY(50);
        text.setLayoutX(10);
        text.setLayoutY(30);
        applyButton.setLayoutX(10);
        applyButton.setLayoutY(150);


        root.getChildren().add(comboBox);
        root.getChildren().add(text);
        root.getChildren().add(applyButton);
        Scene scene = new Scene(root, 500, 200);
        primaryStage.setScene(scene);
        primaryStage.show();

        applyButton.setOnAction(event-> {
          //  launch();
        });

    }

    public static void main(String[] args) {
        launch(args);
    }
}
