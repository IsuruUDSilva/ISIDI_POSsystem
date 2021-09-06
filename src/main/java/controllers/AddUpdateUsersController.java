package controllers;

import entities.Employee;
import entities.EmployeeType;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import services.EmployeeService;
import services.EmployeeServiceI;
import services.EmployeeTypeService;
import services.EmployeeTypeServiceI;
import utility.DialogMode;
import utility.EmployeeTypeEnum;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class AddUpdateUsersController extends BaseController {

    private final EmployeeServiceI employeeServiceI = new EmployeeService();
    private final EmployeeTypeServiceI employeeTypeServiceI = new EmployeeTypeService();

    @FXML
    private Button saveBtn;
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
    private DialogMode dialogMode;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.setEmployeeTypeChoiceBox();
    }

    public void initData(DialogMode dialogMode, Integer selectedEmployee) {
        this.selectedEmployee = selectedEmployee;
        this.dialogMode = dialogMode;
        if (dialogMode == DialogMode.UPDATE) {
            //TODO: update path
            Employee employee = employeeServiceI.getEmployeeById(selectedEmployee);
            patchValues(employee);
        }
    }

    public void setEmployeeTypeChoiceBox() {
        List<EmployeeType> employeeTypes = employeeTypeServiceI.getAllEmployeeType();
        for (EmployeeType employeeType : employeeTypes) {
            employeeTypeChoiceBox.getItems().add(employeeType.getM02Name());
        }
    }

    private void patchValues(Employee employee) {
        firstNameTextField.setText(employee.getM01FirstName());
        lastNameTextField.setText(employee.getM01LastName());
        phoneNumberTextField.setText(employee.getM01Phone());
        addressTextField.setText(employee.getM01Address());
        nicTextField.setText(employee.getM01Nic());
        userNameTextField.setText(employee.getM01UserName());
        passwordTextField.setText(employee.getM01Password());
        activenessCheckBox.setSelected(employee.getM01Active() != 0);
    }

    public Employee getFormValues() {
        Employee employee = new Employee();
        employee.setM01FirstName(firstNameTextField.getText());
        employee.setM01LastName(lastNameTextField.getText());
        employee.setM01Phone(phoneNumberTextField.getText());
        employee.setM01Address(addressTextField.getText());
        employee.setM01Nic(nicTextField.getText());
        employee.setM01UserName(userNameTextField.getText());
        employee.setM01Password(passwordTextField.getText());
        employee.setM01Active(activenessCheckBox.isSelected() ? 1 : 0);
        employee.setM01Type(EmployeeTypeEnum.getEnum(employeeTypeChoiceBox.getValue().toString()).getValue());

        return employee;
    }

    public void onBackBtnClicked(ActionEvent event) {
        hide(event);
    }


    public void onSaveBtnClicked(ActionEvent event) {

        Employee employee = getFormValues();
        if (this.dialogMode == DialogMode.ADD) {
            employeeServiceI.addEmployee(employee);
        } else {
        }
    }
}
