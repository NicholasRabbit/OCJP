public class TernaryExpressionTest{

	//注意CLI运行时输入args参数:java TernaryExpressionTest 100
	public static void main(String[] args){
	
		double d = 0;
		int qty = Integer.valueOf(args[0]);

		//1，一般if写法
		if(qty >= 90){
			d = 0.2;
			System.out.println("d==>" + d);
		}else if(qty < 80 && qty > 90){
			d = 0.8;
			System.out.println("d==>" + d);
		
		}

		//2,同等的三元表达式，三元表达式是从前向后开始判断的
		d = qty >= 90 ? 0.2 : qty < 80 ? 0.8 : 0;
 		System.out.println("ternary==>" + d);


	
	}
}
