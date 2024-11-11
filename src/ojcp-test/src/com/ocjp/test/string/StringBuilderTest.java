package com.ocjp.test.string;

public class StringBuilderTest{

	public static void main(String[] args){

		inert();
		String code = maskCC("1234-2234-5678-1101");
		System.out.println("code==>" + code);

	}

	public static void inert(){
		//1, insert(..), Q43(1z0-808)
		StringBuilder builder = new StringBuilder();
		builder.append("world");
		builder.insert(0,"Hello ");
		System.out.println(builder.toString());
		
	}

	//2, append(...) Q105
	public static String maskCC(String creditCard){
		String x = "XXXX-XXXX-XXXX-";
		StringBuilder builder = new StringBuilder(x);
		builder.append(creditCard, 15, 19);
		return builder.toString();
	
	}

}
