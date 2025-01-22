package com.ocjp.test.extends_test;

public class ExtendsTest2 {
	public static void main(String[] args){
		
	}
}

abstract class Planet {
	protected void revolve () {
	}

	abstract void rotate ();
}

class Earth extends Planet {
	// make the metod "public" or "protected"
//	void revolve () {
//
//	}

	protected void rotate () {
	
	}

}
