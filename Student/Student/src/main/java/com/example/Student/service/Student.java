package com.example.Student.service;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    private Integer id;
    private String name;
    private String branch;
    private Integer age;
    private Long phno;
}
