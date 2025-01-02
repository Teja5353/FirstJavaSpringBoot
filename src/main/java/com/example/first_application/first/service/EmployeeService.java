package com.example.first_application.first.service;

import java.util.List;

import com.example.first_application.first.entities.Employee;

public interface EmployeeService {
    List < Employee > getAllEmployees();
    void saveEmployee(Employee employee);
    void deleteEmployeeById(long id);
    Employee getEmployeeById(long id);
}