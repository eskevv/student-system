package com.example.studentsystem.controller;

import com.example.studentsystem.model.Student;
import com.example.studentsystem.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
  @Autowired
  private IStudentService studentService;

  @PostMapping("/add")
  public String add(@RequestBody Student student) {
    studentService.saveStudent(student);
    return "New student added";
  }

  @GetMapping("/")
  public List<Student> getAllStudents() {
    return studentService.getAllStudents();
  }
}
