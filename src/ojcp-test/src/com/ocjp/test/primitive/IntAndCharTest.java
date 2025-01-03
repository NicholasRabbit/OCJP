package com.ocjp.test.primitive;

/*
* Q50 (1z0-808)
* */
public class IntAndCharTest {

	public static String doMsg(char x){
		return "Good Day";
	}
	
	public static String doMsg(int c){
		return "Good luck";
	}

	public static void main(String[] args){
		/*
		* Overload.
		* "x" is char so the method with a parameter of char will be called. Because 8 in the range between -128 and 127,
		* it will be automatically cast to a char.
		* Apparently, '8' is automatically cast to a longer data type, too.
		* */
		char x = 8;
		int c = '8';
		System.out.println(doMsg(x));  // calling the method with the parameter of char.
		System.out.println(doMsg(c));  // parameter of int.


	}

}
