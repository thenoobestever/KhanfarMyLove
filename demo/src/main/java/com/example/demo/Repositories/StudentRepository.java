package com.example.demo.Repositories;

import com.example.demo.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends  JpaRepository<Student, Integer> {
    public Optional<Student> findByName(String name);
}
