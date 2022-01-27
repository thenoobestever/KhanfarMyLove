package com.example.demo.Controller;

import com.example.demo.Models.Student;
import com.example.demo.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    StudentRepository studentRepository;

    @PostMapping
    public Student addStudent(@RequestBody Student student){
        Student newStudent = studentRepository.save(student);
        return newStudent;
    }

    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable int id){
        Optional<Student> student = studentRepository.findById(id);

        return student.get();
    }

    @GetMapping("/student/name/{name}")
    public Student getStudent(@PathVariable String name){
        Optional<Student> student = studentRepository.findByName(name);

        return student.get();
    }

}
