package com.ocjp.test.polymophysm;

public class AbstractionTest {

	public static void main(String[] args){
		
		
	}

}			



abstract class Shape{

	public abstract void draw();

}

abstract class Circle extends Shape{

	//public void draw();  //此处报错，缺少abstract

	//如果子类是抽象类且不想实现父类的方法，下面的方法可以写，也可以不写，如果写一定要加abstract
	//public abstract void draw();

}
