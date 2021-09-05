package com.xadmin.SpringBootCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xadmin.SpringBootCrud.bean.Student;
import com.xadmin.SpringBootCrud.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	@RequestMapping("/Students")
	public List<Student> getAllStudents()
	{
	return	studentService.getAllStudents();
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/students")
	public void addStudent(@RequestBody Student student)
	{
		studentService.addStudent(student);
	}

	@RequestMapping(method = RequestMethod.PUT, value="/subjects/{student_no}")
	public void updateStudent(@PathVariable String student_no, @RequestBody Student student)
	{
		studentService.updateStudent(student_no,student);
	}

}
