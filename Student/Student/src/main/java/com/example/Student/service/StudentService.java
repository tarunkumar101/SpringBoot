package com.example.Student.service;

import com.example.Student.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentDao studentDao;

    public List<Student> getAllStudents() {
        return studentDao.findAll();
    }

    public List<Student> getStudentByBranch(String branch) {
        return studentDao.findStudentByBranch(branch);
    }
}
