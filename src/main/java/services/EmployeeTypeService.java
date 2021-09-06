package services;

import entities.EmployeeType;
import entities.EmployeeView;
import services.utils.BaseEntityService;
import utility.Const;

import java.util.List;

public class EmployeeTypeService extends BaseEntityService implements EmployeeTypeServiceI{
    @Override
    public List<EmployeeType> getAllEmployeeType() {
        try {
            List<EmployeeType> employeeTypes = executeQuery(Const.EMPLOYEE_TYPE_SELECT_ALL, null);
            return employeeTypes;
        } catch (Exception ex) {
            return null;
        } finally {
            exit();
        }
    }
}
