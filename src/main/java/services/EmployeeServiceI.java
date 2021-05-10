package services;

import entities.Employee;

import java.util.List;

public interface EmployeeServiceI {
    public void setup() ;
    public void exit() ;
    public List<Employee> getAllEmployees();
    public Employee getEmployeeByUserName(String userName);
}
