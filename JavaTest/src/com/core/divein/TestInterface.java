package com.core.divein;

public interface TestInterface {

	// public abstract method
	void absMethod();

	// static method
	static void stMethod() {
		System.out.println("In the Static method - interface");
	}
 
	// default method
	default void defMethod() {
		System.out.println("In the Default method - interface");
	}

	class Test implements TestInterface {
		@Override
		public void absMethod() {
			System.out.println("In the implemented method - class");
		}

		public static void main(String args[]) {
			TestInterface t = new Test();
			t.absMethod();
			t.defMethod();
			TestInterface.stMethod();
		}
	}
}
