package com.ocjp.test.exception_test;

//验证抛出异常真题 (1z808: 16题)
public class ExceptionTest {
	
	/*
	 * 运行时异常可以不处理抛出，也可以使用try...catch处理
	 * catch捕获异常时范围从小到大。
	 * */
	public static void main(String[] args) throws Exception{
		Candidate c1 = new Candidate("Tom",20);
		System.out.println("c1: " + c1);

		try{
			new Candidate("Jerry",30);
		}catch(Exception e){  
			
		}
//		catch(MissingInfoException e){   //此行报错，因为上面已捕捉更大范围的异常，把本行的异常包括了。
//
//		}
	}


}

class MissingInfoException extends Exception {

}

class AgeOutOfRangeException extends Exception {

}

class Candidate {
	String name;
	int age;
	public Candidate(String name,int age) throws Exception{
		if(name == null)
			throw new MissingInfoException();
		else if(age < 10 || age > 150)
			throw new AgeOutOfRangeException();
		else {
			this.name = name;
			this.age =age;
		}
	}

	public String toString(){
		return this.name + ":" + this.age;
	}
}

