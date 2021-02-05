package com.example.demojdbc.service;

import com.example.demojdbc.model.Employee;

import java.util.List;

public interface EmployeeService {

   Employee create(Employee employee);
   void delete(long id);
   void update(long id, Employee employee);
   Employee read(long id);
   List<Employee> readAll();
}
