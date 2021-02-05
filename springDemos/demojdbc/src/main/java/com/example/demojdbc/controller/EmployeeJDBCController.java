package com.example.demojdbc.controller;

import com.example.demojdbc.model.Employee;
import com.example.demojdbc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeJDBCController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path = "/employee", headers = "Accept=application/json")
    public List<Employee> getAllEmployee() {
        return employeeService.readAll();
    }

    @GetMapping(path = "/employee/{id}", headers = "Accept=application/json")
    public Employee getEmployee(@PathVariable Long id) {
        return employeeService.read(id);
    }

    @PostMapping(path = "/employee", headers = "Accept=application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void createEmployee(@RequestBody Employee employee) {

         employeeService.create(employee);
    }

    @DeleteMapping(path = "/employee/{id}", headers = "Accept=application/json")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteEmployee(@PathVariable Long id) {
        employeeService.delete(id);
    }

    @PutMapping(path = "/employee/{id}", headers = "Accept=application/json")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        employeeService.update(id,employee);
    }

}
