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
    View view = new View();


    public void handleButtonAction(ActionEvent event, ComboBox comboBox)
    {
        Stage primaryStage = new Stage();
        System.out.println("You clicked me!");
        String selected = (String)comboBox.getValue();
        if (selected == "Exercise 1")
        {
            view.newGUI(primaryStage);
        }
    }

}
