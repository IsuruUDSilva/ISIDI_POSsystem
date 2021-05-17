package services;

import entities.Employee;
import entities.EmployeeView;

import java.util.List;

public interface EmployeeServiceI {
    public List<EmployeeView> getAllEmployees();
    public Employee getEmployeeByUserName(String userName);
    public Employee getActiveEmployeeByUserName(String userName);
    public boolean addEmployee(Employee employee);

}
