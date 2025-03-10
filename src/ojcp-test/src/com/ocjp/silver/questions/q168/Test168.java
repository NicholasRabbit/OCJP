package com.ocjp.silver.questions.q168;

import com.ocjp.silver.questions.q168.p2.MyString2;

class MyString {
    String msg;
    // A default constructor could be called within the same package.
    MyString(String msg) {
        this.msg = msg;
    }

}


public class Test168 {

    public static void main(String[] args) {
        System.out.println("Hello " + new StringBuilder("Java SE 8"));
        System.out.println("Hello " + new MyString("Java SE 8"));
        // A constructor with default access modifier could not be called outside its package.
//        new MyString2("Java SE 8");

    }

}
