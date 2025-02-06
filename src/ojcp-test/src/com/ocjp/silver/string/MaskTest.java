package com.ocjp.silver.string;

public class MaskTest {

    public static void main(String[] args) {
        // The last index of it is "18" so the "substring(15, 19)" is correct.
        String code = maskCC("1234-2234-5678-1101");
        System.out.println("code==>" + code);

        System.out.println("substring(15, 19): " + substring(code));
    }

    //1, substring
    public static String substring(String creditCard) {
        String x = "XXXX-XXXX-XXXX-";
        return x + creditCard.substring(15, 19);
    }

    //2, append(...) Q105
    public static String maskCC(String creditCard){
        String x = "XXXX-XXXX-XXXX-";
        StringBuilder builder = new StringBuilder(x);
        builder.append(creditCard, 15, 19);
        return builder.toString();
    }
}
