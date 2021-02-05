package com.example.demosimpleemployee.service;

import com.example.demosimpleemployee.model.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

@Service
@Slf4j // logging to avoid calling System.out.println()
public class EmployeeServiceImpl implements EmployeeService{

    //Mock DB
    private static Map<Long, Employee> mockEmployeeDB = new ConcurrentHashMap();


    @PostConstruct // called after object is created. use it to initialise values
    public void setup(){

        log.info("Mock db getting initialised...");
        // pre-populate mock db
        mockEmployeeDB.put(101L, new Employee(101,"Nila 1", 2000.50d));
        mockEmployeeDB.put(102L, new Employee(102,"Nila 2", 3000.60d));
        mockEmployeeDB.put(103L, new Employee(103,"Nila 3", 5000.00d));
        mockEmployeeDB.put(104L, new Employee(104,"Nila 4", 2500.00d));
        mockEmployeeDB.put(105L, new Employee(105,"Nila 5", 8000.50d));

    }

    @Override
    public Employee create(Employee employee) {
        return mockEmployeeDB.put(employee.getId(), employee);
    }

    @Override
    public void delete(long id) {
        // checking employee before deleting
        Employee employee = mockEmployeeDB.get(id);
        if(employee !=null) {
            mockEmployeeDB.remove(id);
        } else {
            log.error("Employee {} not found, can not be deleted", id);
            // return failure response
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Employee " + id + " is not found, can not be deleted");
        }
    }

    @Override
    public void update(long id, Employee employee) {

    }

    @Override
    public Employee read(long id) {

        // fetching employee from DB
       Employee employee = mockEmployeeDB.get(id);
       if(employee !=null) {
           return employee;
       } else {
           log.error("Employee {} not found", id);
           // return failure response
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Employee " + id + " is not found");
       }
    }

    @Override
    public List<Employee> readAll() {

        // read only values from map, use stream api and collect the entries as list
        return mockEmployeeDB.values().stream().collect(Collectors.toList());
    }
}
