package com.core.divein;

public class TestLambda {
	
	public static void main(String args[]) {
		TestLambdaInterface t =	() -> System.out.println("Test Lambda Interface No Parameters");
		t.absMethod();
		
		TestLambdaOneVarInterface t1 = (age) -> System.out.println("Test Lambda Interface one Parameter: AGE IS -"+ age);
		t1.absAge(30);
		
		TestLambaTwoVarInterface t2 = (a,b) -> System.out.println("Test Lambda Interface Two Parameters: SUM IS -"+ (a+b));
		t2.absMath(20,30);
		
		TestLambaTwoVarInterface t3 = (a,b) -> System.out.println("Test Lambda Interface Two Parameters: MULTIPLICATION IS -"+ (a*b));
		t3.absMath(20,30);
	}
	
	interface TestLambdaInterface {
		void absMethod();
	}
	
	interface TestLambdaOneVarInterface {
		void absAge(int age);
	}
	
	interface TestLambaTwoVarInterface {
		void absMath(int a,int b);
	}

}
