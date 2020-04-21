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

/**
 * This is the main class for the JavaFX exercise Launch Pad
 */

public class Main extends Application {

    /**
     *  Entry point.
     *
     * No parameters expected
     */

    Model model = new Model();
    View view = new View();
    Controller controller = new Controller();

    @Override
    public void start(Stage primaryStage) throws Exception {
        view.newGUI(primaryStage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
