package com.example.demostudentjpa;

import com.example.demostudentjpa.model.Student;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {


    @PostMapping(path = "/student", headers = "Accept=application/json")
    public Student createStudent(@RequestBody Student student) {

    }

    @GetMapping(path = "/student/{id}", headers = "Accept=application/json")
    public Student getStudent(@PathVariable Long id){

    }

    @DeleteMapping(path = "/student/{id}", headers = "Accept=application/json")
    public void deleteStudent(@PathVariable Long id) {

    }

    @PutMapping(path = "/student/{id}", headers = "Accept=application/json")
    public void updateStudent(@PathVariable Long id, @RequestBody Student student) {

    }
}
