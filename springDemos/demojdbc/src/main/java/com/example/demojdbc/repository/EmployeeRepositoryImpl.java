package com.example.demojdbc.repository;

import com.example.demojdbc.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository{

    @Override
    public Employee save(Employee employee) {
        return null;
    }

    @Override
    public void deleteById(long id) {

    }

    @Override
    public void updateEmployee(long id, Employee employee) {

    }

    @Override
    public Employee readById(long id) {
        return null;
    }

    @Override
    public List<Employee> readAllEmployees() {
        return null;
    }
}
