package com.example.demostudentjpa.controller;

import com.example.demostudentjpa.model.Student;
import com.example.demostudentjpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping(path = "/student", headers = "Accept=application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Student createStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    @GetMapping(path = "/student/{id}", headers = "Accept=application/json")
    public Student getStudent(@PathVariable Long id){

        Optional<Student> student = studentRepository.findById(id);

        if(student.isPresent()) {
            return  student.get();
        } else {
            throw  new ResponseStatusException(HttpStatus.NOT_FOUND, "Student not found");
        }
    }

    @DeleteMapping(path = "/student/{id}", headers = "Accept=application/json")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteStudent(@PathVariable Long id) {

        studentRepository.deleteById(id);
    }

    @PutMapping(path = "/student/{id}", headers = "Accept=application/json")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateStudent(@PathVariable Long id, @RequestBody Student updateRequest) {

        Student existingData = getStudent(id);
        existingData.setDepartment(updateRequest.getDepartment());
        studentRepository.save(existingData);
    }
}
