package com.ClassAndInheritance;

interface Age
{
	int age = 24;
	void getAge();
}
// footnote : 
// https://www.geeksforgeeks.org/anonymous-inner-class-java/
public class AnonymousInnerClass {
	
	// Anonymous inner class
	// : inner class without a name, where only a single object is created.
	// it is useful when making an instance of an object with certain "extras"
	// such as overloading methods of a class, or inheritance,
	// without having to actually subclass a class.
	
	// anonymous inner class is mainly created in 2 ways
	// Class / interface

	// 1) Example : this a-i(anonymous inner class) is an interface
	void anonymousInnerClassExample1() 
	{
		Age anonymous = new Age()
		{
			@Override
			public void getAge()
			{
				System.out.println("Age is : " + age);
			}
		};
		anonymous.getAge();
	}
	
	// 2) three types of a-i 
	
	// 2-1) anonymous inner class that extends a class
	// Java program to illustrate creating an immediate thread
	// Using anonymous inner class that extends a Class
	class MyThread
	{
		public void main(String[] args)
	    {
	        // using anonymous inner class 't' that extends a class
	        Thread t = new Thread()
	        {
	            public void run()
	            {
	                System.out.println("Child Thread");
	            }
	        };
	        t.start();
	        System.out.println("Main Thread");
	    }
		
	}
	
	
	
	// 2-2) anonymous inner class that implements an interface
	class MyThread_2 
	{
	    public void main_2(String[] args)
	    {
	    	// anonymous inner class that implements an (runnable) interface
	        Runnable r = new Runnable()
	        {
	            public void run()
	            {
	                System.out.println("Child Thread");
	            }
	        };
	        Thread t = new Thread(r);
	        t.start();
	        System.out.println("Main Thread");
	    }
	    
	}
	
	
	
	// 2-3) anonymous inner class that defines method/constructor arguments in the body
	class MyThread_3
	{
	    public void main_3(String[] args)
	    {
	    	// anonymous inner class
	        Thread t = new Thread(new Runnable()
	        {
	            public void run()
	            {
	                System.out.println("Child Thread");
	            }
	        });
	         
	        t.start();
	         
	        System.out.println("Main Thread");
	    }
	}

	
	
	
	
	
	
	
}

