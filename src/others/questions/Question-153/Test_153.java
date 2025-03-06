
import java.util.*;

abstract class Animal {

}

interface Hunter {

}

class Cat extends Animal implements Hunter {

}

class Tiger extends Cat {

}

public class Test_153 {
	public static void main(String[] args){
		ArrayList<Tiger> list = new ArrayList<>();
		list.add(new Cat());  // compile failure occurs; Cat is a supperclass of Tiger
		
	}
}
