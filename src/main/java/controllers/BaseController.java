package controllers;

import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class BaseController implements Initializable {

    public void popup(String title, String headerText, String status) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(headerText + " as " + status);

        alert.showAndWait();
    }

    public void popup(String title, String headerText) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(headerText);

        alert.showAndWait();
    }

    public Stage showNextStage(Pane root, boolean isResizable) {
        Stage primaryStage = new Stage();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setResizable(isResizable);
        primaryStage.show();
        return primaryStage;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
