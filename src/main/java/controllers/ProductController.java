package controllers;
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
}
