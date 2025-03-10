package com.ocjp.silver.questions.q165;

public class Test165 {

	public static void main(String[] args){
		Test165 test = new Test165();
		System.out.print(isAvailable + " ");
		// An instance can call a static method, but not vice versa.
		// Conventionally, this instance is equivalent to a Class in compilation of Java class.
		isAvailable = test.doStuff();
		System.out.println(isAvailable);
		
	}

	private static boolean doStuff() {
		return !isAvailable;
	}

	static boolean isAvailable = false;

}
