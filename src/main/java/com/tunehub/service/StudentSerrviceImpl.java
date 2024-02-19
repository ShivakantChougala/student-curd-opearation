package com.tunehub.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tunehub.entity.Student;
import com.tunehub.repository.StudentRepository;

@Service
public class StudentSerrviceImpl  implements StudentService{
	
	 StudentRepository srepo;
	 
	 public StudentSerrviceImpl(StudentRepository srepo) {
		 
		 super();
		 this.srepo=srepo;
	 }

	@Override
	public String addStudent(Student s) {
		 srepo.save(s);
		return "data is added";
	}

	@Override
	public Student getStudent(String id) {
		 Student s1= srepo.findById( id).get();
		
		return s1;
	}

	@Override
	public List<Student> getAll() {
		List<Student> l1=srepo.findAll();
		return l1;
	}

	@Override
	public String update(Student s) {
		srepo.save(s);
		return "updated";
	}

	@Override
	public String delete(String id) {
		srepo.deleteById(id);
		return "deleated";
	}

}
