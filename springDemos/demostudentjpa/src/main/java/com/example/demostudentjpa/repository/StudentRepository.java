package com.example.demostudentjpa.repository;

import com.example.demostudentjpa.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
