package com.example.studentsystem.service;

import com.example.studentsystem.model.Student;

import java.util.List;

public interface IStudentService {
  public Student saveStudent(Student student);
  public List<Student> getAllStudents();
}
