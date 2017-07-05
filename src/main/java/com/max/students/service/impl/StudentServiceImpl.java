package com.max.students.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.max.students.entities.Student;
import com.max.students.service.StudentService;

public class StudentServiceImpl implements StudentService {

	private List<Student> students;
	
	public StudentServiceImpl(){
		this.students = new ArrayList<Student>();

		Student s1 = new Student(1, "Netanel", "male", 16);
		Student s2 = new Student(2, "lea", "female", 29);
		Student s3 = new Student(3, "yuna", "female", 22);

		students.add(s1);
		students.add(s2);
		students.add(s3);
	}
	
	@Override
	public List<Student> getAllStudents() {
		return this.students;
	}

	@Override
	public Student getStudent(Integer index) {
		return this.students.get(index);
	}

	@Override
	public Student addStudent(Student student) {
		students.add(student);
		System.out.println("Added student to the list");
		return student;
	}

}
