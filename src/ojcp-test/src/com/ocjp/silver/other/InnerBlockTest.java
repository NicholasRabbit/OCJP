package com.ocjp.silver.other;

public class InnerBlockTest {


    /*
    * 1z808 Q116
    * */
    public static void main(String[] args) {
        doSome();
    }


    public static int doSome() {
        int i = 3;
        if (!(i > 3)) {
            System.out.println("square");
        }
        // {...} could be in a method as an inner block.
        {
            int j;
            i = 100;
            j = 200;
            System.out.println("inner block");
        }

        System.out.println("....");
        return i;
    }



}
