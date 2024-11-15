package com.ocjp.test.primitive;

//自动转型测试真题: 50 (1z0-808)
public class IntAndCharTest {

	public static String doMsg(char x){
		return "Good Day";
	}
	
	public static String doMsg(int c){
		return "Good luck";
	}

	public static void main(String[] args){
		
		char x = 8;
		int c = '8';
		System.out.println(doMsg(x));
		System.out.print(doMsg(c));


	}

}
