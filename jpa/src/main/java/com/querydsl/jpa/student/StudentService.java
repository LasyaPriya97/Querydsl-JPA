package com.querydsl.jpa.student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;
	
	 public List<Student> getAllStudents(){
		 
		List<Student> students = new ArrayList<Student>();
		studentRepository.findAll()
		.forEach(students::add);
		return students;
	}
	public void addStudent(Student student) {
		studentRepository.save(student);
	}
   
  

}
