package com.ocjp.silver.exception;

/*
 *Question No : 99
 * */

public class WhichException {

    /*
    * The output is "third".
    * Analyses:
    * At "tag A" IndexOutOfBoundException will be thrown to the upper level while there is no matched exception in "catch(...)".
	*
	* See ExceptionTest005.java in my personal Java code.
    * */
    static void display(int[] num){
        try{
            System.out.println(num[1] / num[1] - num[2]);  //Tag: A
        }catch (ArithmeticException e){
            System.err.println("first");
        }
        System.out.println("done");

    }

    public static void main(String[] args) {
        try {
            int[] arr = {100, 100};
            display(arr);
        }catch (IllegalArgumentException e){
            System.err.println("second");
        }catch (Exception e){
            System.err.println("third");
        }
    }
}
