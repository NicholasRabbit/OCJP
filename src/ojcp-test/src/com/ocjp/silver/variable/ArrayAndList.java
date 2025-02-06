package com.ocjp.silver.variable;

import java.util.ArrayList;

// Q113
public class ArrayAndList {

    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        String[] myArray;  // A local variable could be declared without being initialised if it is not used anywhere.
        try {
            while (true) {
                myList.add("My String");  // Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
            }
        } catch (RuntimeException e) {
            System.out.println("Caught a RuntimeException");
        } catch (Exception e) {
            System.out.println("Caught an Exception.");
        }
        System.out.println("Ready to use");
    }
}
