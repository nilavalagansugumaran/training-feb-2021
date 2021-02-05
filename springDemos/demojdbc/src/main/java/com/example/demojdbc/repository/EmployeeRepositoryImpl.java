package com.example.demojdbc.repository;

import com.example.demojdbc.model.Employee;
import com.example.demojdbc.repository.mapper.EmployeeRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.List;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository{

    @Autowired
    private JdbcTemplate jdbcTemplate; //To connect to DB
            //update
            //query
            //execute

    @Override
    public Employee save(Employee employee) {
        return null;
    }

    @Override
    @Transactional
    public void deleteById(long id) {

    }

    @Override
    @Transactional
    public void updateEmployee(long id, Employee employee) {

    }

    @Override
    public Employee readById(long id) {

        String sql = "SELECT * FROM EMPLOYEES where EMPLOYEEID = ?";
        Employee e =  jdbcTemplate.queryForObject(sql,  new Object[]{id}, new EmployeeRowMapper());
        return e;
    }

    @Override
    public List<Employee> readAllEmployees() {
        return null;
    }

    @PostConstruct
    public void setup(){

        //DDL statements
        jdbcTemplate.execute("create table EMPLOYEES(" +
                "employeeid int auto_increment, " +
                "name varchar(50), " +
                "salary double, " +
                "primary key (employeeid) )");

        // DML statement to insert rows to tables
        jdbcTemplate.update("insert into EMPLOYEES (name, salary) " +
                        "values (?, ?)",
                new Object[]{"James-1", 21000});

        jdbcTemplate.update("insert into EMPLOYEES (name, salary) " +
                        "values (?, ?)",
                new Object[]{"James-2", 22000 });

        jdbcTemplate.update("insert into EMPLOYEES (name, salary) " +
                        "values (?, ?)",
                new Object[]{"James-3", 23000});

    }
}
