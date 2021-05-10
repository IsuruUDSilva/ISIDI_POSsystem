package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class loginController {

    @FXML
    private Button loginB;

    @FXML
    private Button cancelB;

    @FXML
    private TextField uNametxtField;

    @FXML
    private PasswordField pWordpwField;

    private void login(){
        //TODO
        /*
        check user availability by using EmployeeService ->  getEmployeeByUserName(String userName)
        then check if the employee is active after that check the password is correct
        *** PUT EVERY MESSAGES,TITTLES ETC. TO THE Const.java ***
        */
        if (uNametxtField.getText().equals("") && pWordpwField.getText().equals("")) {
            System.out.println("Username and Password fields are empty");
        } else if (uNametxtField.getText().equals("user") && pWordpwField.getText().equals("password")) {
            popup();
        } else {
            System.out.println("User name or Password is wrong");
        }
    }

    private void popup(){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Access Granted");
        alert.setHeaderText("You now login as Admin");

        alert.showAndWait();
    }
}
