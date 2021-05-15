package controllers;

import entities.Employee;
import entities.ProductType;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import services.EmployeeService;
import services.EmployeeServiceI;
import services.utils.BaseEntityService;
import services.utils.BaseEntityServiceI;


public class LoginController {

    private final EmployeeServiceI employeeServiceI = new EmployeeService();
    private final BaseEntityServiceI baseEntityServiceI = new BaseEntityService();

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
//        EmployeeService employeeService = new EmployeeService();

        String userName = userNameTextField.getText();
        String passWord = passWordPassWordField.getText();

        if (validateUser(userName, passWord)) {
            popupOK();
            ProductType productType = new ProductType();
            productType.setM04Name("Accessories");
            productType.setM04IsMainCategory(1);

            baseEntityServiceI.add(productType);
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

    private boolean validateUser(String userName, String passWord) {

        try {
            if (userName.isEmpty() || passWord.isEmpty() || userName.isBlank() || passWord.isBlank()) {
                return false;
            } else {
                Employee employee = employeeServiceI.getActiveEmployeeByUserName(userName);
                if (employee.equals(null)) {
                    return false;
                } else {
                    return employee.getM01Password().equals(passWord);
                }
            }
        } catch (NullPointerException ex) {
            return false;
        } catch (Exception e) {
            return false;
        }

    }

    public void cancel() {
        Platform.exit();
        System.exit(0);
    }


}
