package controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import java.io.IOException;


public class HomeController extends BaseController {

    public void loadUser() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            Pane root = fxmlLoader.load(getClass().getResource("/fxml/users.fxml").openStream());
            showNextStage(root, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadProduct() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            Pane root = fxmlLoader.load(getClass().getResource("/fxml/product.fxml").openStream());
            showNextStage(root, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadSales() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            Pane root = fxmlLoader.load(getClass().getResource("/fxml/sales.fxml").openStream());
            showNextStage(root, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadOrder() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            Pane root = fxmlLoader.load(getClass().getResource("/fxml/Order.fxml").openStream());
            showNextStage(root, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}