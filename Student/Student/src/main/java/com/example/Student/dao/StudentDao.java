package com.example.Student.dao;

import com.example.Student.service.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface StudentDao extends JpaRepository <Student, Integer> {
    List<Student> findStudentByBranch(String branch);
}
