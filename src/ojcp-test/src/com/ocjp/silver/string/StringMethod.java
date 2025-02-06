package com.ocjp.silver.string;

import org.junit.Test;

public class StringMethod {

	//1，toLowerCase(),concat() don't modify the original string data but return the modified result.
	@Test
	public void concatTest(){
		String product = "Pen";
		product.toLowerCase();
		product.concat(" Ben".toLowerCase());
		System.out.println("product==>" + product);
		System.out.println(product.substring(4,6));   //java.lang.StringIndexOutOfBoundsException: String index out of range: 6
	}

	//2, trim() also doesn't change the value of its caller.
	@Test
	public void trim(){
		String str = " ";  // str hasn't been changed.
		String result = str.trim();  // The result is "".
		System.out.println("trim():" + str.equals("") + "," + str.isEmpty());
		System.out.println("result==>" + result);
	
	}


}
