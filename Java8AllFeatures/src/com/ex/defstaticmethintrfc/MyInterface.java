package com.ex.defstaticmethintrfc;

import java.util.Collections;
import java.util.List;

public interface MyInterface {
		default public List<Student> sortStudents(List<Student> list){
			Collections.sort(list);
			return list;
		}
		public static void greet(String name) {
			System.out.println("greetings for the day to "+name);
		}
		public abstract Integer getMinNumber(List<Integer> listOfIntegers)  ;
}
