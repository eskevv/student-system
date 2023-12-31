package com.example.studentsystem.service;

import com.example.studentsystem.model.Student;
import com.example.studentsystem.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {
  @Autowired
  private IStudentRepository studentRepository;

  @Override
  public Student saveStudent(Student student) {
    return studentRepository.save(student);
  }

  @Override
  public List<Student> getAllStudents() {
    return studentRepository.findAll();
  }
}
