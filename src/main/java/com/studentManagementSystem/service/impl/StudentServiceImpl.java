package com.studentManagementSystem.service.impl;

import com.studentManagementSystem.entity.Student;
import com.studentManagementSystem.repository.StudentRepository;
import com.studentManagementSystem.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
