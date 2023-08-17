package com.paul.demoproject.repository;

import com.paul.demoproject.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository  extends JpaRepository<Student,Integer> {
    Student findByFirstName(String firstName);
    Student findByLastName(String lastName);
}
