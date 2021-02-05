package com.example.demojdbc.repository;

import com.example.demojdbc.model.Employee;
import com.example.demojdbc.repository.mapper.EmployeeRowMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.List;

@Repository
@Slf4j
public class EmployeeRepositoryImpl implements EmployeeRepository{

    @Autowired
    private JdbcTemplate jdbcTemplate; //To connect to DB
            //update
            //query
            //execute

    @Override
    public void save(Employee employee) {
        jdbcTemplate.update("insert into EMPLOYEES (name, salary) " +
                        "values (?, ?)",
                new Object[]{employee.getName(), employee.getSalary()});
    }

    @Override
    @Transactional
    public void deleteById(long id) {
        String sql = "delete * FROM EMPLOYEES where EMPLOYEEID = ?";
        try {
            jdbcTemplate.update(sql, new Object[]{id}, new EmployeeRowMapper());

        }catch (Exception e) {
            log.error("Exception {}", e.getMessage());
        }
    }

    @Override
    @Transactional
    public void updateEmployee(long id, Employee employee) {
        String sql = "update EMPLOYEES set salary = ? where EMPLOYEEID = ?";
        try {
            jdbcTemplate.update(sql, new Object[]{employee.getSalary(), id}, new EmployeeRowMapper());
        }catch (Exception e) {
            log.error("Exception {}", e.getMessage());
        }
    }

    @Override
    public Employee readById(long id) {

        String sql = "SELECT * FROM EMPLOYEES where EMPLOYEEID = ?";
        try {
            Employee e = jdbcTemplate.queryForObject(sql, new Object[]{id}, new EmployeeRowMapper());
            return e;
        }catch (Exception e) {
            log.error("Exception {}", e.getMessage());
            return null;
        }
    }

    @Override
    public List<Employee> readAllEmployees() {
        String sql = "SELECT * FROM EMPLOYEES";
        try {
            List<Employee> e = jdbcTemplate.query(sql, new EmployeeRowMapper());
            return e;
        }catch (Exception e) {
            log.error("Exception {}", e.getMessage());
            return null;
        }
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
