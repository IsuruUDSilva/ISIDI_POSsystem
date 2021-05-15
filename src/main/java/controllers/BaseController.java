package controllers;

import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class BaseController {

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
}
