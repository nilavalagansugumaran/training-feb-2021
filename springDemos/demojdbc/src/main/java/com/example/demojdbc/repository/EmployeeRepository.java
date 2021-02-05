package com.example.demojdbc.repository;

import com.example.demojdbc.model.Employee;

import java.util.List;

public interface EmployeeRepository {

    Employee save(Employee employee);
    void deleteById(long id);
    void updateEmployee(long id, Employee employee);
    Employee readById(long id);
    List<Employee> readAllEmployees();

}
