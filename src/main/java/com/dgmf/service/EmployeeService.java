package com.dgmf.service;

import com.dgmf.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> fetchAllEmployees();
    Employee addEmployee(Employee employee);
}
