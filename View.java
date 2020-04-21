package sample;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class View {

    public static void newGUI(Stage primaryStage)
    {
        primaryStage.show();
        primaryStage.setTitle("Java FX Exercise GUI");
        Group root = new Group();

        Label text = new Label("Please select an exercise");

        Button button = new Button("Apply");

        ComboBox comboBox = new ComboBox();
        Button applyButton = new Button("Apply");

        comboBox.getItems().addAll("Exercise 1","Exercise 2","Exercise 3" );

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
    }

    public static void start(Stage primaryStage) throws Exception {
        // Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));



    /*    applyButton.setOnAction(event-> {
            // Controller logic here
        });*/

    }


}
