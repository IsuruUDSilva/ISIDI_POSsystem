package services;

import entities.Employee;

import java.util.List;

public interface EmployeeServiceI {
    public List<Employee> getAllEmployees();
    public Employee getEmployeeByUserName(String userName);
    public Employee getActiveEmployeeByUserName(String userName);
    public boolean addEmployee(Employee employee);

}
