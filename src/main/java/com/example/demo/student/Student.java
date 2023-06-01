package com.example.demo.student;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table
public class Student {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String name;
    private String email;
    private LocalDate dob; //Data of Birth
    private Integer age;

    public Student() {}

    public Student(Long id, String name, String email, LocalDate dob, Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }

    public Student(String name, String email, Integer age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public LocalDate getDob() {
        return this.dob;
    }

    public Integer getAge() {
        return age;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    
}
