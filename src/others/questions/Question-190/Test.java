package p2;

import p1.Acc;


public class Test extends Acc {
	
	public static void main(String[] args){
		Acc obj = new Test();
		int p = obj.p;
		int q = obj.q;
		int r = obj.r;
		int s = obj.s;


		Test test = new Test();
		int t1 = test.p;
		int t2 = test.q;
		int t3 = test.r;
		int t4 = test.s;

	}

}
