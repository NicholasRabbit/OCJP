package com.ocjp.test.constructor;

public class PrivateConstructor {

	public static void main(String[] args){
		Car car = Car.getInstance();
		System.out.println(car.name);
	}
}


/*
 * Private constructors.
 * They are two different expressions.
 * */
class Car {
	String name;
	int num;

	private Car(){
		this("tom",25);
		System.out.println("private constructor");
	}

	private Car(String name,int num){
		this.name = name;
		this.num = num;
	}

	public static Car getInstance(){
		return new Car();
	}

}
