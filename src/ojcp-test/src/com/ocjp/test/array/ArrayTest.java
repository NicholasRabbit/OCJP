package com.ocjp.test.array;

public class ArrayTest {

    public static void main(String[] args) {
        int[] numbers = new int[2];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers = new int[4];
        numbers[2] = 3;
        numbers[3] = 4;
        for (int x : numbers) {
            System.out.print(" " + x);
        }
    }

}
