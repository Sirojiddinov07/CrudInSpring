package com.savron.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.savron.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
