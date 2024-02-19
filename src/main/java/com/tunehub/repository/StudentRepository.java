package com.tunehub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tunehub.entity.Student;

public interface StudentRepository extends JpaRepository<Student , String> {

}
