package controllers;

import entities.Employee;
import entities.EmployeeView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import services.EmployeeService;
import services.EmployeeServiceI;
import services.db.DBTableColumnsService;
import services.db.DBTableColumnsServiceI;
import utility.Const;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class UsersController extends BaseController {

    private final EmployeeServiceI employeeServiceI = new EmployeeService();
    private DBTableColumnsServiceI dbTableColumnsServiceI = new DBTableColumnsService();
    private Integer selectedEmployee;
    @FXML
    private TableView<EmployeeView> userTable;
    @FXML
    private AnchorPane userAnchorPane;

    public UsersController() {
    }

    public Integer getSelectedEmployee() {
        return selectedEmployee;
    }

    public void setSelectedEmployee(Integer selectedEmployee) {
        this.selectedEmployee = selectedEmployee;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        getUserData();
        createTable();
    }

    public DBTableColumnsServiceI getDbTableColumnsServiceI() {
        return dbTableColumnsServiceI;
    }

    public void setDbTableColumnsServiceI(DBTableColumnsServiceI dbTableColumnsServiceI) {
        this.dbTableColumnsServiceI = dbTableColumnsServiceI;
    }

    public void getUserData() {
       Employee activeEmployee = getActiveUser();
        List<EmployeeView> employees = employeeServiceI.getAllEmployees();
        ObservableList<EmployeeView> data = FXCollections.observableList(employees);
        userTable.setItems(data);

    }

    private void createTable() {
        List<TableColumn> tableColumns = dbTableColumnsServiceI.getTableColumns(Const.EMPLOYEE_TABLE_REFERENCE);
        double tableWidth = 0;
        for (TableColumn column : tableColumns) {
            userTable.getColumns().add(column);
            tableWidth += column.getPrefWidth();
        }
        if (tableWidth > userAnchorPane.getPrefWidth()) {
            //TODO add a scroll bar
        } else {
            userTable.setPrefWidth(tableWidth);
        }
    }


    public void getSelectedRow(MouseEvent mouseEvent) {
        if (userTable.getSelectionModel().getSelectedItem() != null) {
            EmployeeView employeeView = userTable.getSelectionModel().getSelectedItem();
            setSelectedEmployee(employeeView.getM01Id());
        }
    }
}
