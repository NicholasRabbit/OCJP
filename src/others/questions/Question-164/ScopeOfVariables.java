public class ScopeOfVariables {

	public static void main(String[] args){
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum += i;
		}

		System.out.println("i = " + i);  // Compilation fails due to not finding the variable "i";
		System.out.println("sum = " + sum);
		
	}

}
