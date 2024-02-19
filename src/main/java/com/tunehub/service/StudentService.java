package com.tunehub.service;

import java.util.List;

import com.tunehub.entity.Student;

public interface StudentService {
	
	
	String addStudent(Student s);

	 Student getStudent(String id);
	 
	  List<Student> getAll();
	  
	  String update(Student s);
	  
	  String delete(String id);
	
}
