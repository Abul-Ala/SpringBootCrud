package com.xadmin.SpringBootCrud.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xadmin.SpringBootCrud.bean.Student;
import com.xadmin.SpringBootCrud.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository studentRepo;
	
  public List<Student> getAllStudents()
  {
	 List<Student> students = new ArrayList<>();
	  studentRepo.findAll().forEach(students::add); 
	  return students;
	  
  }

	public void addStudent(Student subject) {
		studentRepo.save(subject);
		
	}

	public void updateStudent(String id, Student subject) {
		studentRepo.save(subject);
		
	}
	
	
}


