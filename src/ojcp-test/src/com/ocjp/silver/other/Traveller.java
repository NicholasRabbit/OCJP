package com.ocjp.silver.other;

//Q132
class Tour {
    public static void main(String[] args) {
        System.out.println("Happy journey! " + args[1]);
    }
}

public class Traveller {

    public static void main(String[] args) {
        Tour.main(args);
    }
}
