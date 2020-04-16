package com.ex.defstaticmethintrfc;

import java.util.Comparator;

public class Student implements Comparable<Student>{
	private Integer age;
	private String name;
	public Student(String name, Integer age) {
		super();
		this.name = name; 	
		this.age = age;
		
	}
	@Override
	public int compareTo(Student student) {
		// TODO Auto-generated method stub
		return this.name.compareTo(student.getName());
	}
	public String getName() {
		// TODO Auto-generated method stub
		return  name;
	}
	
	public Integer getAge() {
		// TODO Auto-generated method stub
		return  age;
	}
	
}
