package com.greatlearning.lab.spring.security.repository;

import com.greatlearning.lab.spring.security.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    Student getByStudentId(int id);

    void deleteByStudentId(int id);
}
