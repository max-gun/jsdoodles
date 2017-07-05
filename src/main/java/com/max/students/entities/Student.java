package com.max.students.entities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {

	private Integer id;
	private String name;
	private transient String gender;
	private Integer age;

	final private String PATTERN = "yyyy-MM-dd";
	final private String DELETE_USERS="DELETE * FROM users";
	final private String query2="SELECT * FROM";
	final private String query3="SELECT * FROM";
	
	final static private int STRING_SIZE = 64;
	final static private String DELIMETER = " ";
	
	public static void main(String[] args){
		StringBuilder sb = new StringBuilder(STRING_SIZE);
		sb.append("max").append(DELIMETER).append("is")
				.append(DELIMETER).append("great");
		
		System.out.println(sb);
	}
	
	public Student(){
		
	}
	
	public Student(Integer id, String name, String gender, Integer age) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

}
