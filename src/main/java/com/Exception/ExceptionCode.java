package com.Exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionCode {

	public void try_catch_example1()
	{
		// 0. basic usage of try_catch
		int c = 0;

		try {
			c = 4/0;
		}catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException occurred.");
			c = -1; // line that actually handles the exception

			// below are 3 ways to see information about the error.

			// System.out.println(e.getMessage()); // gives simple information about the error : "/ by zero"
			// System.out.println(e.toString()); // gives a little bit more detailed info about the error : "java.lang.ArithmeticException: / by zero"
			// e.printStackTrace(); // gives the most detailed info about the error

		}finally {
			// finally{} is executed regardless of the errors.
		}


		// 0-1. FileNotFound and IO Exception examples
		try {
			BufferedReader A = new BufferedReader(new FileReader("NOT_EXISITNG_FILE"));
			A.readLine();
			A.close();
		} catch(FileNotFoundException e)
		{
			// for BufferedReader
			// FileNotFoundException occurs, when file is not found. :-)
			System.out.println("FileNotFoundException occurred.");
		} catch (IOException e) {

			/* there are two main kinds of I/O : to and from files, and to and from networks.
			 * details)
			 * 1) EOFException : try to read characters from a file, but you hit the end of the file
			 * 2) SSLException : try to make a SSL connection across a network, and you have problems like expired certificates.
			 */
			System.out.println("IOException occurred.");
			e.printStackTrace();
		} finally {
			// blank
		}

	}
	
	// 1. try_with_resources statement
	// https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html
	void try_catch_example2() throws FileNotFoundException, IOException
	{
		// in try(  ) block, auto-closable resources should be put.
		try ( BufferedReader K = new BufferedReader(new FileReader("file_path")))
		{
			String temp = K.readLine();
		}
	} // by doing this, you can skip K.close(); line.
	
	// this method is try_without_resources statement. (bad example)
	String try_catch_example3() throws IOException
	{
		BufferedReader J = new BufferedReader(new FileReader("file_path"));
				try {
					return J.readLine();
				} finally {
					if (J != null) J.close();
				}
	}




	// 2. throwing exception and catching(handling) exception basic usage

	void throw_method1() throws FileNotFoundException {

		// writing syntax #1
		// FileNotFoundException a = new FileNotFoundException("my message");
		// throw a;

		//writing syntax #2
		throw new FileNotFoundException("my message");
		//when this method is invoked, it will throw a baseball. (catcher should exist)
	}

	void catch_method1() {
		try {

			throw_method1(); // THROWING BASEBALL !!
		}catch (FileNotFoundException e)
		{
			// Catching the baseball !!
		}
	}




	// 3. throw_catch example, explaining the execution procedure step by step

	// to be executed first.
	public void throw_catch_example1() 
	{
		try {
			method_1();
		} catch (Exception e1)
		{
			System.out.println("Exception is caught at throw_catch_example1 method.");
		}

	}

	// to be executed second. (will be called by throw_catch_example1())
	static void method_1() throws Exception {
		try {
			throw new Exception();
		} catch(Exception e) {
			System.out.println("Exception is caught at method_1.");
			throw e;
		}

	}
	/* explanation step by step : 
	 * 
	 * 1) in Main method, throw_catch_example1() will be invoked.
	 * 2) in throw_catch_example1() method's try block, method_1() will be invoked.
	 * 
	 * 3) in method_1()'s try block, it throws a new Exception().
	 * 4) then method_1() catches the new Exception(), which is made by itself,
	 * 	  and prints out the "Exception is caught at method_1." messages. 
	 * 5) then it throws an exception.(this exception is same exception at method_1()'s catch block.)
	 * 
	 * 6) coming back to throw_catch_example1() method's try block,
	 * 	  there is the exception "e", which is thrown by method_1(). (5th step)
	 * 7) now in throw_catch_example1() method's catch block, the thrown exception is caught,
	 * 	  printing out the message "Exception is caught at throw_catch_example1 method.".
	 */

	

}
