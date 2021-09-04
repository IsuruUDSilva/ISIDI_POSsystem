package services;

import entities.Employee;
import entities.EmployeeView;

import java.util.List;

public interface EmployeeServiceI {

    List<EmployeeView> getAllEmployees();

    Employee getEmployeeByUserName(String userName);

    Employee getActiveEmployeeByUserName(String userName);

    boolean addEmployee(Employee employee);



}
