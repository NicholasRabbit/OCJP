public class PrivateConstructor {

	public static void main(String[] args){
		Car.getInstance();
	}
}


/*
 * A class can have only one private constructor. It doesn't mean that it only can have one.
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
