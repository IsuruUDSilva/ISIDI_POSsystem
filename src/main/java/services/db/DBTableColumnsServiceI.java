package services.db;

import javafx.scene.control.TableColumn;

import java.util.List;

public interface DBTableColumnsServiceI {
    List<TableColumn> getTableColumns(String referenceName);

}
