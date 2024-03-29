package com.xadmin.SpringBootCrud.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
	@Id
	private String student_no;
	private String student_name;
	private String student_dob;
	private String student_doj;
	
	
	public Student() {
	}
	public Student(String student_no, String student_name, String student_dob, String student_doj) {
		super();
		this.student_no = student_no;
		this.student_name = student_name;
		this.student_dob = student_dob;
		this.student_doj = student_doj;
	}
	public String getStudent_no() {
		return student_no;
	}
	public void setStudent_no(String student_no) {
		this.student_no = student_no;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getStudent_dob() {
		return student_dob;
	}
	public void setStudent_dob(String student_dob) {
		this.student_dob = student_dob;
	}
	public String getStudent_doj() {
		return student_doj;
	}
	public void setStudent_doj(String student_doj) {
		this.student_doj = student_doj;
	}
	
	

}
