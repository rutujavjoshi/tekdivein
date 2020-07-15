package com.core.divein;

import java.util.Arrays;
import java.util.List;

public class TestMethodReference {

	@FunctionalInterface
	interface MyInterface {
		void interfaceMethod();
	}

	public TestMethodReference()
	{
		System.out.println("Constructor");
	}
	
	public TestMethodReference(String temp)
	{
		
	}
	
	public void insMethod() {
		System.out.println("Instance Method");
	}
	
	public static void staticMethod() {
		System.out.println("Static Method");
	}

	public static void main(String[] args) {
		TestMethodReference obj = new TestMethodReference("temp");
		
		// Simple Lambda Expression without method reference
		MyInterface myinterface = ()->System.out.println("Lambda Expression without method reference");
		myinterface.interfaceMethod();
		
		//Calling instance method of the object
		myinterface = obj::insMethod;
		myinterface.interfaceMethod();
		
		//Calling static method of the object
		myinterface = TestMethodReference::staticMethod;
		myinterface.interfaceMethod();
		
		//Instance methods of an arbitrary object of a particular type
		Integer[] numArray = {53, 13, 150, 44, 47, 4, 67};
		System.out.println("Instance methods of an arbitrary object");
		Arrays.sort(numArray, Integer::compareTo);
		for(Integer str: numArray)
			System.out.println(str);
		
	    //Constructor
		myinterface = TestMethodReference::new;
        myinterface.interfaceMethod();
		
		
		}
}
