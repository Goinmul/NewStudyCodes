package com.Exception;

// If you didn't see ExceptionCode first, jump in to that class first.

// 3. user-defined exception

public class MyExceptionCode extends Exception {
	
	MyExceptionCode(String message) // a constructor, getting a String as parameter.
	{
		super(message); // this constructor calls Exception class' constructor.
	}
	
	public void AddedMyMethod()
	{
		// add whatever you want here.
	}
}
