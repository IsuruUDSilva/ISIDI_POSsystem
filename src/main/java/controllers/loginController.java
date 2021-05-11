package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import services.EmployeeService;


public class loginController {

    @FXML
    private Button loginBtn;

    @FXML
    private Button cancelBtn;

    @FXML
    private TextField userNameTextField;

    @FXML
    private PasswordField passWordPassWordField;

    public void login() {
        //TODO
        /*
        check user availability by using EmployeeService ->  getEmployeeByUserName(String userName)
        then check if the employee is active after that check the password is correct
        *** PUT EVERY MESSAGES,TITTLES ETC. TO THE Const.java ***
        */
        EmployeeService employeeService = new EmployeeService();

        String userName = userNameTextField.toString();

        if (userNameTextField.getText().equals("") && passWordPassWordField.getText().equals("")) {
            System.out.println("Username and Password fields are empty");
        } else if (employeeService.getEmployeeByUserName(userName) != null) {
            if (passWordPassWordField.getText().equals("password")) {
                popupOK();
            } else {
                popupWrong();
            }

        } else {
            popupWrong();
        }
    }

    private void popupOK() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Access Granted");
        alert.setHeaderText("You now login as Admin");

        alert.showAndWait();
    }

    private void popupWrong() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Access denied");
        alert.setHeaderText("Check your User Name and Password");

        alert.showAndWait();
    }
}
