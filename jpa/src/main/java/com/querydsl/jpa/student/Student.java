package com.querydsl.jpa.student;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student {
	@Id
	private Long id;
	private String name;
	private String college;
   
	public Student() {
		}
	public Student(String name, String college){
		this.name=name;
		this.college=college;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	@Override
	public String toString() {
		return String.format("students[id=%s,name=%s,college=%s]", id,name,college);
	}

}
