package com.ex.defstaticmethintrfc;

import java.util.Collections;
import java.util.List;

public class MainClass implements MyInterface{

	@Override
	public Integer getMinNumber(List<Integer> listOfIntegers) {
		// TODO Auto-generated method stub
		Integer min = Collections.min(listOfIntegers);
		return min;
	}

}
