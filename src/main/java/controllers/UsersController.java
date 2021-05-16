package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import services.db.DBTableColumnsService;
import services.db.DBTableColumnsServiceI;
import utility.Const;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class UsersController extends BaseController {

    private DBTableColumnsServiceI dbTableColumnsServiceI = new DBTableColumnsService();

    @FXML
    private TableView userTable;

    @FXML
    private AnchorPane userAnchorPane;

    public UsersController() {
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        createTable();
    }

    public DBTableColumnsServiceI getDbTableColumnsServiceI() {
        return dbTableColumnsServiceI;
    }

    public void setDbTableColumnsServiceI(DBTableColumnsServiceI dbTableColumnsServiceI) {
        this.dbTableColumnsServiceI = dbTableColumnsServiceI;
    }

    private void createTable() {
        List<TableColumn> tableColumns = dbTableColumnsServiceI.getTableColumns(Const.EMPLOYEE_TABLE_REFERENCE);
        double tableWidth = 0;
        for (TableColumn column : tableColumns) {
            userTable.getColumns().add(column);
            tableWidth += column.getPrefWidth();
        }
        if(tableWidth>userAnchorPane.getPrefWidth()){
            //TODO add a scroll bar
        }else{
            userTable.setPrefWidth(tableWidth);
        }
    }

}
