package com.ocjp.silver.exception;

import org.junit.Test;

// Q197
public class MyException197 {

    public static void main(String[] args) {
        try {
            method1();
        } catch (MyException e) {
            System.out.println("A");
        }
    }

    private static void method1() {   // MyException is not thrown out in this method so the caller can not detect it.
        try {
            throw Math.random() > 0.5 ? new MyException() : new RuntimeException();
        } catch (RuntimeException e) {
            System.out.println("B");
        }
    }


}

class MyException extends RuntimeException {

}