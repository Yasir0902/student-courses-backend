package com.example.studentcourse.controller;

import com.example.studentcourse.entity.Student;
import com.example.studentcourse.repository.StudentRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class StudentController {

    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @QueryMapping
    public List<Student> allStudents() {
        return studentRepository.findAll();
    }

    @QueryMapping
    public Student studentById(@Argument Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    @MutationMapping
    public Student addStudent(@Argument String name) {
        Student student = new Student();
        student.setName(name);
        return studentRepository.save(student);
    }

}
