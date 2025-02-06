package com.ocjp.silver.inherantance;

public class ThisSuperTest {

	public static void main(String[] args){
		new Child();
	}

}


class Parent {
	
	public Parent () {
		System.out.println("Parent");
	}

}

class Child extends Parent {
	// When "super()" is explicitly stated, this() could not be written after it
	// since they all must be the first statement in a constructor.
	public Child () {
		super();
		//this("Child");  // this() method must be the first statement in the constructor.
	}

	public Child (String str) {
		System.out.println(str);
	}

}
