package com.ocjp.silver.string;

public class CharToString {

    public static void main(String[] args) {
        String str1 = "Java";
        char str2[] = {'J', 'a', 'v', 'a'};
        String str3 = null;

        for (char c : str2) {
            str3 = str3 + c;
        }
        // The final result is: str3 = "nullJava".
        if (str1.equals(str3))
            System.out.println("Successful");
        else
            System.out.println("Unsuccessful");   // This statement will be executed.

        String s = null;
        String n = String.valueOf(s);
        System.out.println("null==>" + n);
    }

}
