package com.ocjp.test.string;

public class StringMethod {

	public static void main(String[] args){
		concatTest();
		trim();
	}

	//1，toLowerCase(),concat()方法得到的返回值是转换或拼接后的结果。原字符串不变！！
	public static void concatTest(){
		String product = "Pen";
		product.toLowerCase();	
		product.concat(" Ben".toLowerCase());
		System.out.println("product==>" + product);
		//System.out.println(product.substring(4,6));   //此行报错，"StringIndexOutOfBoundsException"因为product变量本身没变化。
	}

	//2, trim(),注意trim()方法的返回值是修建后的结果，调用者本身不改变
	public static void trim(){
		String str = " ";
		str.trim();
		System.out.println("trim():" + str.equals("") + "," + str.isEmpty());
	
	}


}
