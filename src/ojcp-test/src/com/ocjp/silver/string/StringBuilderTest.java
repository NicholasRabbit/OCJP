package com.ocjp.silver.string;


public class StringBuilderTest {

    public static void main(String[] args) {
        testReplace();
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

    public static void testReplace() {
        StringBuilder sb = new StringBuilder();
        /*
        * The end index is exclusive.
        * public AbstractStringBuilder replace(int start, int end, String str) { }
        * */
        sb.append("Hello");
        sb.replace(1, 2, "A");
        System.out.println(sb);

    }



}
