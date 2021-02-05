package com.example.demojdbc.service;

import com.example.demojdbc.model.Employee;
import com.example.demojdbc.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

@Service
@Slf4j // logging to avoid calling System.out.println()
public class EmployeeServiceImpl implements EmployeeService{

    //DI
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee create(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void delete(long id) {
        Employee employee =  employeeRepository.readById(id);
        if(employee!=null) {
            employeeRepository.deleteById(id);
        }else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Employee not found");
        }
    }

    @Override
    public void update(long id, Employee employee) {
        Employee emp =  employeeRepository.readById(id);
        if(emp!=null) {
            emp.setSalary(employee.getSalary());
            employeeRepository.updateEmployee(id, emp);
        }else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Employee not found");
        }
    }

    @Override
    public Employee read(long id) {
        Employee employee =  employeeRepository.readById(id);
        if(employee!=null) {
            return employee;
        }else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Employee not found");
        }
    }

    @Override
    public List<Employee> readAll() {
        return employeeRepository.readAllEmployees();
    }
}
