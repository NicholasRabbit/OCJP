package com.ocjp.silver.questions.q155;

public class WhizLabs {

    // "default" could precede "case"; that not violates syntactic rules in Java.
    public static void main(String[] args) {
        String s = "A";
        switch (s) {
            case "a":
                System.out.println("Simple A");
            default:
                System.out.println("Default");
            case "A":
                System.out.println("Capital A");
        }
    }
}
