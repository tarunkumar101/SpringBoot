package com.example.Student.controller;

import com.example.Student.service.Student;
import com.example.Student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
@RequestMapping("student")

public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("allStudents")

    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("Branch/{branch}")
    public List<Student> getStudentByBranch(@PathVariable String branch){
        return studentService.getStudentByBranch(branch);
    }
}
