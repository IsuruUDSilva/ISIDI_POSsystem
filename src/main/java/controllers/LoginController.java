package controllers;

import entities.Employee;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import services.EmployeeService;
import services.EmployeeServiceI;

import java.util.List;


public class LoginController {

    @FXML
    private Button loginBtn;

    @FXML
    private Button cancelBtn;

    @FXML
    private TextField userNameTextField;

    @FXML
    private PasswordField passWordPassWordField;

    private EmployeeServiceI employeeServiceI = new EmployeeService();

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

        if (validateUser(userName,passWord)){
            popupOK();
        }
        else{
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

    private boolean validateUser(String userName, String passWord){

        try {
            if(userName.isEmpty()||passWord.isEmpty()||userName.isBlank()|| passWord.isBlank()){
                return false;
            }
            else if(employeeServiceI.getActiveEmployeeByUserName(userName).equals(null)){
                return false;
            }
            else if (employeeServiceI.getActiveEmployeeByUserName(userName).getM01UserName().equals(userName) && employeeServiceI.getActiveEmployeeByUserName(userName).getM01Password().equals(passWord)){
                return true;
            }
            else{
                return false;
            }
        }
        catch(NullPointerException ex) {
            return false;
        }
        catch(Exception e){
            return false;
        }

    }

    public void cancel(){
        Platform.exit();
        System.exit(0);
    }



}
