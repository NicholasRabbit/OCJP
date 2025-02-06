package com.ocjp.silver.switch_boolean;

public class SwitchAndBooleanTest {

    public static void main(String[] args) {
        test();
    }

    // boolean couldn't be the condition of 'switch(...)'.
    private static void test() {
        //boolean b = true;
        String b = "true";
        switch (b) {
            case "true":
                System.out.println("True");
                break;
            default:
                System.out.println("***");
        }
        System.out.println("Done");
    }


}
