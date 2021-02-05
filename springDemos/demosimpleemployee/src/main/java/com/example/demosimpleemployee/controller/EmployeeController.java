package com.example.demosimpleemployee.controller;

import com.example.demosimpleemployee.model.Employee;
import com.example.demosimpleemployee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    // DI
    @Autowired
    private EmployeeService employeeService;

    // GET http://localhost:9001/employee?id=xxxx
    // headers are representation
    @GetMapping(path = "/employee", headers = "Accept=application/json, application/xml")
    public Employee getEmployee(@RequestParam(name = "id") Long id){ // request param to pass query param

        return employeeService.read(id);
    }

    // GET http://localhost:9001/employees
    // headers are representation
    @GetMapping(path = "/employees", headers = "Accept=application/json, application/xml")
    public List<Employee> getEmployee(){

        return employeeService.readAll();
    }

    // POST http://localhost:9001/employees
    // headers are representation
    @PostMapping(path = "/employee", headers = "Accept=application/json, application/xml")
    @ResponseStatus(HttpStatus.CREATED) // return response status
    public void createEmployee(@RequestBody Employee employee){ // request BODY

        employeeService.create(employee);
    }

    // DELETE http://localhost:9001/employees/123
    // headers are representation
    @DeleteMapping(path = "/employee/{id}", headers = "Accept=application/json, application/xml")
    @ResponseStatus(HttpStatus.NO_CONTENT) // return response status
    public void deleteEmployee(@PathVariable("id")Long id){ // path variable
        employeeService.delete(id);
    }

    // PUT http://localhost:9001/employees/123
    // headers are representation
    @PutMapping(path = "/employee/{id}", headers = "Accept=application/json, application/xml")
    @ResponseStatus(HttpStatus.ACCEPTED) // return response status
    public void updateEmployee(@PathVariable("id")Long id, @RequestBody Employee employee){ // path variable & request body
        employeeService.update(id, employee);
    }
}
