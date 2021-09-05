package controllers;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import java.io.IOException;

public class ProductController extends BaseController {

    public void loadAddUpdateProduct() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            Pane root = fxmlLoader.load(getClass().getResource("/fxml/addUpdateProduct.fxml").openStream());
            showNextStage(root, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void loadAddUpdateCategory() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            Pane root = fxmlLoader.load(getClass().getResource("/fxml/add_update_product_category.fxml").openStream());
            showNextStage(root, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void loadExit(ActionEvent event) {
        try {
            hide(event);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void deleteProduct(ActionEvent actionEvent) {

    }
}
