package com.ocjp.silver.questions.q154;

public class TestLoop {

    public static void main(String[] args) {
        float myarray[] = {10.20f, 20.30f, 30.40f, 50.60f};
        int index = 0;
        boolean isFound = false;
        float key = 30.40f;
        while (index++ < 5) {
            if (key == myarray[index]) {
                // There is no break when the key is found; it will throw ArrayIndexOutOfBoundsException.
                // Thus println() will not be executed.   C is the correct answer.
                isFound = true;
            }
        }

        System.out.println(isFound);
    }

}
