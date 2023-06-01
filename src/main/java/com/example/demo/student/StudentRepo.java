package com.example.demo.student;


import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called studentRepo
// CRUD refers Create, Read, Update, Delete

//Possible issue: pring Data JPA repository beans may not be picked up by component scans since they are only interfaces.

public interface StudentRepo extends CrudRepository<Student, Long> {
//This is where we'll place all our derived query methods.
    Iterable<Student> findByName(String name);
    Optional<Student> findById(Long id);
}
