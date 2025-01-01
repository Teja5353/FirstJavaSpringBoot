package com.example.first_application.first.service;

import java.util.List;

import com.example.first_application.first.entities.Employee;

public interface EmployeeService {
    List < Employee > getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
}