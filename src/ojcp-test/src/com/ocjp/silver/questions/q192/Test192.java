package com.ocjp.silver.questions.q192;

public class Test192 {

    public static void main(String[] args) {
        StringBuilder message = new StringBuilder("hello java!");
        int pos = 0;
        try {
            for (pos = 0; pos < 12; ++pos) {
                switch (message.charAt(pos)) {
                    case 'a':
                    case 'e':
                    case 'o':
                        String uc = Character.toString(message.charAt(pos)).toUpperCase();
                        message.replace(pos, pos + 1, uc);
                }
            }
        } catch (Exception e) {
            System.out.println("Out of limit!");
        }
        // The following code is still executed after an exception caught in the "try...catch".
        System.out.println(message);
    }


}
