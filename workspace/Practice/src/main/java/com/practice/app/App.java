package com.practice.app;
import java.util.Arrays;

import com.practice.beans.Student;

public class App {

	public static void main(String[] args) {
		Student st= new Student();
		st.setStuName("gurpreet");
		st.setRollNo(100);
		st.setStuEmail("Gurpreet@gmail.com");
		System.out.println(st);
		
		Student st1= new Student();
		st1.setStuName("gur");
		st1.setRollNo(101);
		st1.setStuEmail("Gur@gmail.com");
		System.out.println(st1);
		Student st2 = new Student(103,"preet","peet@gmail.com");
		System.out.println(st2);
		Student stu[]=new Student[5];
		stu[1]=new Student(105,"kushal","ks@gmail");
		stu[2]=new Student(106,"kus","ks@gmail");
		for(int i=1;i<=2;i++) {
			System.out.println("student:"+i+" "+stu[i]);
		}
		
		

	}

}
