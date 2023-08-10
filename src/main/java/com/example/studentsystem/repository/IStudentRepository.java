package com.example.studentsystem.repository;

import com.example.studentsystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepository extends JpaRepository<Student, Integer> {
}
