package com.querydsl.jpa.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	@RequestMapping("/students")
	public List<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
	@RequestMapping(method=RequestMethod.POST, value="/addstudents")
	public void addStudent(@RequestBody Student student) {
		studentService.addStudent(student);
	}
	

}
