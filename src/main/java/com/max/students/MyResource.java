package com.max.students;

import java.util.List;

import javax.inject.Singleton;
import javax.servlet.http.Cookie;
import javax.ws.rs.*;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.NewCookie;
import javax.ws.rs.core.Response;

import com.max.students.entities.Student;
import com.max.students.service.StudentService;
import com.max.students.service.impl.StudentServiceImpl;


@Path("myresource")
@Singleton
public class MyResource {

	private StudentService studentService;
	
	public MyResource () {
		this.studentService = new StudentServiceImpl();
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessage() {
		return "Hello world";
	}
	
	@GET
	@Path("/{someNumber}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getStudent(@PathParam("someNumber") Integer number) {
		Integer result = number * number;
		Response.ok().cookie(new NewCookie("numberToPower", number.toString())).build();
		return result.toString();
	}
	
	@GET
	@Path("/allstudents")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getStudents() {
		List<Student> result = this.studentService.getAllStudents();
		return result;
	}

	/*@GET
	@Path("/{indexNumber}")
	@Produces(MediaType.APPLICATION_JSON)
	public Student getStudent(@PathParam("indexNumber") Integer number) {
		Student student = this.studentService.getStudent(number);
		return student;
	}*/
	
	@POST
	@Path("/insert")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getStudents(Student student) {
		this.studentService.addStudent(student);
		return studentService.getAllStudents();
	}

}
