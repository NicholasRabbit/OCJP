package com.ocjp.silver.string;


public class StringBuilderTest {

    public static void main(String[] args) {

    }

    // empty a StringBuilder object
    public void empty() {
        StringBuilder builder = new StringBuilder();
        builder.append("world");
//        builder.deleteAll();   // No such method in StringBuilder.
//        builder.delete(0, builder.size());  // No such method in StringBuilder, either.

        builder.delete(0, builder.length());
        System.out.println(builder.toString());
    }

}
