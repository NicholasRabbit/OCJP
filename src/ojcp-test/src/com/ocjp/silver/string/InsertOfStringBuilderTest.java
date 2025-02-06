package com.ocjp.silver.string;

public class InsertOfStringBuilderTest {

	public static void main(String[] args){
		inert();
	}

	public static void inert(){
		//1, insert(..), Q43(1z0-808)
		StringBuilder builder = new StringBuilder();
		builder.append("world");
		builder.insert(0,"Hello ");
		System.out.println(builder.toString());
		
	}


}
