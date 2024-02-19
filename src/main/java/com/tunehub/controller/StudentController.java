package com.tunehub.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tunehub.entity.Student;
import com.tunehub.service.StudentService;


@RestController
@RequestMapping("/stu")
public class StudentController {
	
	StudentService ss;
	
	public StudentController(StudentService ss) {
		super();
		this.ss=ss;
	}
	
	@PostMapping
		public String addStudent(@RequestBody Student s) {
			
			String msg=ss.addStudent(s);
			return msg;
			
	}
	@GetMapping(value="{id}")
	
	public Student getStudent(@PathVariable String id) {
	
		Student sts=ss.getStudent(id);
		return sts;
		
	}
	
	@GetMapping
	public List<Student> getAll(){
		 List<Student> l1=ss.getAll();
		
		return l1;
		
	}
	@PutMapping
	public String update(@RequestBody Student s) {
		String s3=ss.update(s);
		return s3;
	}
	@DeleteMapping(value="{id}")
	public String delete(@PathVariable String id) {
		String s2=ss.delete(id);
		return s2;
	}

}
