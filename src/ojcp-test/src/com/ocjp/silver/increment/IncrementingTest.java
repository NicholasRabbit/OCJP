package com.ocjp.silver.increment;

public class IncrementingTest {

    public static void main(String[] args) {
        int aVar = 9;
        // Note that the comparison is less than-"<".
        if (aVar++ < 10) {
            System.out.println(aVar + " Hello world!");  // this statement will be executed.
        } else {
            System.out.println(aVar + " Hello universe!");
        }
    }


}
