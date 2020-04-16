package com.ex.defstaticmethintrfc;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		MyInterface c = new MainClass();
		List<Student> studentList =new ArrayList<Student>();
		studentList.add(new Student("Ayan", 38));
		studentList.add(new Student("Arna", 3));
		studentList.add(new Student("Sujata", 32));
		studentList.add(new Student("Kalpana Mukherjee", 62));
		studentList.add(new Student("Atindra", 71));
		
		List<Student> sortedStudentList = c.sortStudents(studentList);
		for(Student lS:sortedStudentList) {
			System.out.println(lS.getName()+"-----"+lS.getAge());
		}
		MyInterface.greet("Ayan");
		
		System.out.println("----------------");
		List<Integer> intList =new ArrayList<Integer>();
		intList.add( 38);
		intList.add( 3);
		intList.add(32);
		intList.add( 62);
		intList.add(71);
		Integer getmin=c.getMinNumber(intList);
		System.out.println("Minimum "+getmin);
	
	}
}
