package controllers;

import entities.Employee;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import services.EmployeeService;
import services.EmployeeServiceI;

import java.io.IOException;


public class LoginController extends BaseController {

    private final EmployeeServiceI employeeServiceI = new EmployeeService();
    private Employee employee;
    @FXML
    private Button loginBtn;
    @FXML
    private Button cancelBtn;
    @FXML
    private TextField userNameTextField;
    @FXML
    private PasswordField passWordPassWordField;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void login(ActionEvent event) {
        String userName = userNameTextField.getText();
        String passWord = passWordPassWordField.getText();

        if (validateUser(userName, passWord)) {
            popup("Access Granted", "You now login ", status());
            hide(event);
            loadHome();
        } else {
            popup("Access Denied", "Check your User Name and Password");
        }

    }

    private boolean validateUser(String userName, String passWord) {
        int status;
        try {
            if (userName.isEmpty() || passWord.isEmpty() || userName.isBlank() || passWord.isBlank()) {
                return false;
            } else {
                setEmployee(employeeServiceI.getActiveEmployeeByUserName(userName));
                if (getEmployee().equals(null)) {
                    return false;
                } else {
                    if (getEmployee().getM01Password().equals(passWord)) {
                        setActiveUser(getEmployee());
                    }
                    return getEmployee().getM01Password().equals(passWord);
                }
            }
        } catch (NullPointerException ex) {
            return false;
        } catch (Exception e) {
            return false;
        }

    }

    private void loadHome() {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            Pane root = fxmlLoader.load(getClass().getResource("/fxml/home.fxml").openStream());
//            HomeController homeController = fxmlLoader.getController();
            showNextStage(root, false);
            System.out.println(getActiveUser());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void cancel() {
        Platform.exit();
        System.exit(0);
    }

    private String status() {
        String status1;
        int employeeStatus = getEmployee().getM01Type();
        if (employeeStatus == 1) {
            status1 = "Admin";
        } else if (employeeStatus == 2) {
            status1 = "Manager";
        } else {
            status1 = "Cashier";
        }
        return status1;
    }

}
