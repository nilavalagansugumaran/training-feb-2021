package com.example.demojdbc.service;

import com.example.demojdbc.model.Employee;
import lombok.extern.slf4j.Slf4j;
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

    @Override
    public Employee create(Employee employee) {
        return null;
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public void update(long id, Employee employee) {

    }

    @Override
    public Employee read(long id) {
        return null;
    }

    @Override
    public List<Employee> readAll() {
        return null;
    }
}
