package com.example.demojdbc.repository.mapper;

import com.example.demojdbc.model.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeRowMapper implements RowMapper<Employee> {

    @Override
    public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
        Employee employee = new Employee();
        employee.setId(resultSet.getLong("employeeid"));
        employee.setName(resultSet.getString("name"));
        employee.setSalary(resultSet.getDouble("salary"));
        return employee;
    }
}
