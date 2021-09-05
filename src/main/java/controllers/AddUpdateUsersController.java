package controllers;

import entities.Employee;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import services.EmployeeService;
import services.EmployeeServiceI;
import utility.DialogMode;

public class AddUpdateUsersController extends BaseController {

    private final EmployeeServiceI employeeServiceI = new EmployeeService();

    @FXML
    private Button updateBtn;
    @FXML
    private TextField firstNameTextField;
    @FXML
    private TextField lastNameTextField;
    @FXML
    private TextField phoneNumberTextField;
    @FXML
    private TextField addressTextField;
    @FXML
    private TextField nicTextField;
    @FXML
    private TextField userNameTextField;
    @FXML
    private TextField passwordTextField;
    @FXML
    private CheckBox activenessCheckBox;
    @FXML
    private ChoiceBox employeeTypeChoiceBox;

    private Integer selectedEmployee;

    public void initData(DialogMode dialogMode, Integer selectedEmployee) {
        this.selectedEmployee = selectedEmployee;
        if (dialogMode == DialogMode.UPDATE) {
            //TODO: update path
            Employee employee = employeeServiceI.getEmployeeById(selectedEmployee);
            patchValues(employee);
        } else {
            //TODO:add path
            updateBtn.setText("Add");
        }
    }

    private void patchValues(Employee employee) {
        firstNameTextField.setText(employee.getM01FirstName());
        lastNameTextField.setText(employee.getM01LastName());
        phoneNumberTextField.setText(employee.getM01Phone());
        addressTextField.setText(employee.getM01Address());
        nicTextField.setText(employee.getM01Nic());
        userNameTextField.setText(employee.getM01UserName());
        activenessCheckBox.setSelected(employee.getM01Active() != 0);
    }

    public void onBackBtnClicked(ActionEvent event) {
        hide(event);
    }
}
