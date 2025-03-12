package com.ocjp.silver.questions.q206;

public class Test206 {

    /*
    * The following code causes endless loop because x is a primitive type of data and decrementing x doesn't affect the
    * value in the main method. Thus, the argument x is always 5.
    * */
    public static void main(String[] args) {
        int x = 5;
        while (isAvailable(x)) {
            System.out.print(x);
            // x--;   // A solution.
        }
    }

    public static boolean  isAvailable (int x) {
        return x-- > 0 ? true : false;
    }
}
