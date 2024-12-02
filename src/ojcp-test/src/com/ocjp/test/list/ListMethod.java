package com.ocjp.test.list;

import java.util.*;
/*
 * 
 * */

public class ListMethod {

	public static void main(String[] args){
		found();

	}

	public static void found(){
		List<Patient> ps = new ArrayList<>();
		Patient p2 = new Patient("Mike");
		
		/*
		 * indexOf(..)方法，返回对象第一次出现的位置。
		 * 因为List集合有序可重复，所以可以添加多个重复对象，但此方法只返回第一个对象的下标。
		 * 如果对象没有重写equals()方法，默认比较hash值。
		 * */
		ps.add(p2);
		int f = ps.indexOf(p2);
		System.out.println("f = " + f);
		if(f >= 0)
			System.out.println("Mike found");
	
		//这里new一个同名字的对象，但是hashCode不同，所以找不到
		int f2 = ps.indexOf(new Patient("Mike"));
		if(f2 >= 0)
			System.out.println("Mike found ??");

	}
	
}

class Patient{
	String name;
	public Patient(String name){
		this.name = name;
	}

}



