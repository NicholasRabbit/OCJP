package p2;

import p1.*;
import p3.*;


public class Test141 {
	
	public static void main(String[] args) {
		// A compilation error occurs here; it is "DoClass()" is not public and could not be accessed outside of its package.
		// The reason is the modifier of the default constructor in DoClass is "default", thus it can only be visited inside "p1".
		DoInterface doi = new DoClass(); // line n3
		doi.m1(100);
		doi.m2(200);
	}

}
