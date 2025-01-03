package com.ocjp.test.ternary_expression;

public class TernaryExpressionTest{

	//Input the arguments in CLI: java TernaryExpressionTest 100
	public static void main(String[] args){
	
		double d = 0;
		int qty = Integer.valueOf(args[0]);

		//1, The common way to verify the arguments.
		if(qty >= 90){
			d = 0.2;
			System.out.println("d==>" + d);
		}else if(qty >= 80 && qty < 90){
			d = 0.0d;
			System.out.println("d==>" + d);
		
		}else{
			d = 0.8;
			System.out.println("d==>" + d);
		}

		//2, Use the ternary expression instead of 'if' and note that the test comes from left to right.
		//The first test is "qty >= 90" then if 'qty >= 90' failed 'qty < 80' would be executed.
		d = qty >= 90 ? 0.2 : qty < 80 ? 0.8 : 0;
 		System.out.println("ternary==>" + d);


		//3, 1z808: Q22
		int x = 10;
		System.out.println(x > 10 ? ">" : x < 10 ? "<" : "=");

	}

}
