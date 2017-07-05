package com.max.students.service;

import java.util.List;

import com.max.students.entities.Student;

public interface StudentService {

	public List<Student> getAllStudents();
	
	public Student getStudent(Integer index);
	
	public Student addStudent(Student student);
}
