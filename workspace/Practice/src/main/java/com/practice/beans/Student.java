package com.practice.beans;
import lombok.Data;
@Data
public class Student {
	private int rollNo;
	private String stuName;
	private String stuEmail;
	public Student() {}
	public Student(int rollNo, String stuName, String stuEmail) {
		this.rollNo = rollNo;
		this.stuName = stuName;
		this.stuEmail = stuEmail;
	}
}
