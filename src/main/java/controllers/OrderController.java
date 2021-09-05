package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class OrderController extends BaseController {

    public void loadExit(ActionEvent event) {
        try {
            hide(event);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loadBill() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            Pane root = fxmlLoader.load(getClass().getResource("/fxml/Bill.fxml").openStream());
            showNextStage(root, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
