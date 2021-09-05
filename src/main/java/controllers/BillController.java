package controllers;

import javafx.event.ActionEvent;

public class BillController  extends BaseController{

    public void loadExit(ActionEvent event) {
        try {
            hide(event);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
