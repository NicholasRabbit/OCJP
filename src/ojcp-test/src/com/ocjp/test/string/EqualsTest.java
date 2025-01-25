package com.ocjp.test.string;

public class EqualsTest {

    public static void main(String[] args) {
        char[] chars = {'J', 'a', 'v', 'a'};
        String str1 = "";
        String str2 = "Java";
        for (char c : chars) {
            str1 += c;
        }
        /*
        * Even though "str1" and "str2" have the same "hasCode",
        * they don't equals because the result of "==" is true
        * if and only if their references are identical.
        * Namely the "memory addresses".
        * */

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str1 == str2);

    }

}

