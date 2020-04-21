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
import javafx.event.*;
import java.awt.event.MouseEvent;
import java.beans.EventHandler;


public class Controller {
    /**
     * Defines the methods responsible for controlling the main user interface
     */

    View view = new View();

    public void handleButtonAction(ActionEvent event, ComboBox comboBox)
    /**
     * Called when the user wants to launch the exercise they selected.
     *
     * @param event identifies the button click event
     * @param comboBox identifies the ComboBox item corresponding to the exercise to launch
     */
    {
        Stage primaryStage = new Stage();
        String selected = (String)comboBox.getValue();

        if (selected == "Exercise 1") {
            // Launch new duplicate window when "Exercise 1" is selected
            view.newGUI(primaryStage);
        }

        else {
            //Leaving blank to add future exercises
            System.out.println("Exercise not available. Please select another");
        }
    }
}
