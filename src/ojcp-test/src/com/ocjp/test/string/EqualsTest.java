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
        * though "str1" and "str2" have the same "hasCode",
        * they don't equal to each other because the result of "==" is true
        * if and only if their references are identical, namely the "memory location".
        * Apparently, they hold distinct references.
        * */
        System.out.println("str1 ==> " + str1.hashCode());
        System.out.println("str2 ==> " + str2.hashCode());
        System.out.println(str1 == str2);  // false.  "==" checks for reference equality
        System.out.println(str1.equals(str2)); // true.  "equals(...)" checks for value equality

    }

}

