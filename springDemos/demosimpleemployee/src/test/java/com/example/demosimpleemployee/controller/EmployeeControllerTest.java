package com.example.demosimpleemployee.controller;

import com.example.demosimpleemployee.model.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.lang.reflect.ParameterizedType;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class EmployeeControllerTest {

    @Autowired
    TestRestTemplate restTemplate;

    @Test
    public void testSomething(){

        ResponseEntity<String> response = restTemplate.exchange("/employee?id=101", HttpMethod.GET, null, new ParameterizedTypeReference<String>(){});
        assertTrue(response.getStatusCode() == HttpStatus.OK);
    }
}