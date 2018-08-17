package com.ArrayList;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListCode {

	// footnote : https://www.callicoder.com/java-arraylist/
	
	public void arrayListExample1() {
		
		// 1. Creating an arraylist
		ArrayList<String> animals = new ArrayList<String>();
		
		// 2. adding and removing elements
		animals.add("First element");
		animals.add("Second element");
		System.out.println(animals); // prints all

		ArrayList<Integer> A = new ArrayList<>();
		A.add(1);
		A.add(2);
		// {1, 2}
		System.out.println(A);

		ArrayList<Integer> B = new ArrayList<>(A);
		B.add(3);
		B.add(4);
		// {1, 2, 3, 4}
		System.out.println(B);

		ArrayList<Integer> C = new ArrayList<>();
		C.add(7);
		C.addAll(B);
		// {7, 1, 2, 3, 4}
		System.out.println(C);
		int getLastElement = C.get(C.size()-1);
		System.out.println("last element : "+ getLastElement);

		C.removeAll(A);
		// {7, 3, 4}
		System.out.println(C);

		C.remove(0); // removing index '0'
		// remove() returns false if the element does not exist in the arraylist.
		System.out.println(C);
		// {3, 4}

		// lambda expression
		animals.removeIf(string_1 -> string_1.startsWith("S"));
		System.out.println(animals);
		// { First element }


		
		// 3. iteration
		ArrayList<String> D = new ArrayList<String>();
		D.add("Apple");
		D.add("Brown");
		D.add("Collision");
		D.add("Drowsy");

		// 1) using lambda expression
		D.forEach(string_2 -> System.out.println(string_2));
		// prints A B C D

		// 2) using while loop & iterator
		Iterator<String> D_iterator = D.iterator();
		while(D_iterator.hasNext())
		{
			String string_3 = D_iterator.next();
			System.out.println(string_3);
		}// prints A B C D

		// 3) iterate, traverse in backward
		ListIterator<String> myIterator = D.listIterator(D.size());
		while(myIterator.hasPrevious())
		{
			String tempString = myIterator.previous();
			System.out.println(tempString);
		}// prints D C B A

		// 4) simple for-each loop
		for (String temp : D)
		{
			// System.out.println(temp);
		}

		// 5) simple for-loop
		for (int i =0;i<D.size();i++)
		{
			// System.out.println(D.get(i));
		}
		/*	iterator and list_iterator are useful when we try to
		 	remove elements while traversing.

		  	Iterator<String> string_Iterator = D.iterator();
		while(string_Iterator.hasNext()){
			String temp = string_Iterator.next();
			if (temp.startsWith("A") == true)
			{ 
				string_Iterator.remove();
			}
		}
		System.out.println(D);
		*/

		
		// 4. reference
		
		// D.contains("Apple")  --> returns true.
		// D.indexOf("Apple") / D.lastIndexOf("Apple") --> if none, returns -1. Else, returns the right index. 

		
		// 5. sorting
		
		Collections.sort(A); // small ~ large number
		
		// implicitly set String type for name1 and name2. Then compare.
		D.sort((name1, name2) -> name1.compareTo(name2));
		// or
		D.sort(Comparator.naturalOrder());
		// this is more concise way
		
	}

}
