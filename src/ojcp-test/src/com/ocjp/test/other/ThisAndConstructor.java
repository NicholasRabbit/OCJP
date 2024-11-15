package com.ocjp.test.other;

/*
 * 对象实例化，this，构造参数相关
 * */
public class ThisAndConstructor{

	public static void main(String[] args){

		Person p1 = new Person("Jesse");
		Person p2 = new Person("Walter",52);
		
	}
}

class Person{

	String name;
	int age = 25;

	//没有无参构造器，下面的有参构造直接或间接调用了this()，会调用无参构造，因此都会报错。
	public Person(String name){
		//this();   //编译阶段，此行报错
		setName(name);
	}

	public Person(String name,int age){
		//Person(name);   //编译阶段，此行也报错，不止是上面的错报完这里就不检查了，Java编译时会把所有错都检查出来，并报告。
		setAge(age);
	}

	public void setName(String name){
		this.name =name;
	}

	public void setAge(int age){
		this.age =age;
	}
}
