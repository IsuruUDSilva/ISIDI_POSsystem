package controllers;

import utility.DialogMode;

public class AddUpdateUsersController extends BaseController {

    private Integer selectedEmployee;

    public void initData(DialogMode dialogMode, Integer selectedEmployee) {
        this.selectedEmployee = selectedEmployee;
        if (dialogMode == DialogMode.UPDATE) {
            //TODO: update path
        } else {
            //TODO:add path
        }
    }
}
