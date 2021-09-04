package controllers;

import entities.Employee;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class BaseController implements Initializable {
    private static Employee activeUser;

    public Employee getActiveUser() {
        return activeUser;
    }

    public void setActiveUser(Employee activeUser) {
        BaseController.activeUser = activeUser;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

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

    public void switchScene(ActionEvent event, Scene scene, URL url) {
        Stage currentStage = getCurrentStage(event);
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(url);
        currentStage.setScene(scene);
        currentStage.show();
    }

    public Stage getCurrentStage(ActionEvent event) {
        return (Stage) ((Node) event.getSource()).getScene().getWindow();
    }

    public void hide(ActionEvent event) {
        ((Node) event.getSource()).getScene().getWindow().hide();
    }

}
