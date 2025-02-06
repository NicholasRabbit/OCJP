package com.ocjp.silver.static_test;

/*
 * Q76
 * */
public class TriangleTest{
	
	static double area;
	int b = 2, h = 3;

	public static void main(String[] args){
		double p, b, h;
		if(area == 0){
			b = 3;
			h = 4;
			p = 0.5;
		}

//		area = p * b * h;  //报错：未初始化变量，因为if语句有可能不执行，这种情况下局部变量不能保证初始化。
		
	}
}
