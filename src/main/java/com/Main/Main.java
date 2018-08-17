package com.Main;

import java.io.File;

import com.ArrayList.ArrayListCode;
import com.Exception.ExceptionCode;

public class Main {

	public static void main(String[] args) {

		ArrayListCode arrayList = new ArrayListCode();
		ExceptionCode exception = new ExceptionCode();

		// run

		//arrayList.arrayListExample1();
		//exception.try_catch_example1();
		//exception.throw_catch_example1();
		
		File file = new File("d:/my_file_test.csv");
		if(file.exists())
		{
			System.out.println("path exists.");
		}
		else
			System.out.println("path doesn't exist.");
	}
	
}
