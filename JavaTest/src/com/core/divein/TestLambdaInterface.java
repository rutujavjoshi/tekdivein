package com.core.divein;

@FunctionalInterface
public interface TestLambdaInterface {

	// public abstract method
	String absMethod();

		class TestLambda  {
	
		public void absMethod() {
			System.out.println("In the implemented method - class");
		} 

		public static void main(String args[]) {
			TestLambdaInterface t =	() -> "Test Lambda Interface";
			System.out.println(t.absMethod());
		}
	}
}
