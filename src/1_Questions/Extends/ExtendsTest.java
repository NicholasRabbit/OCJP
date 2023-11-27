
import java.util.*;


public class ExtendsTest{

	//1z808 Q42
	//个人测试结果为C
	public static void main(String[] args){
	
		List<Alpha> list = new ArrayList<>();

		list.add(new Alpha());
		list.add(new Beta());
		list.add(new Gama());

		for(Alpha a : list){
			System.out.println(a.doStuff("Java")); 
		}


	}

}

class Alpha{
	public String doStuff(String msg){
		return msg;
	}
}

class Beta extends Alpha{
	public String doStuff(String msg){
		return msg.replace('a','e');
	}

}

class Gama extends Beta {
	public String doStuff(String msg){
		return msg.substring(2);
	}

}
