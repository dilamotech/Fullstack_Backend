package com.dilamotech.studentsystem.service;

import com.dilamotech.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
