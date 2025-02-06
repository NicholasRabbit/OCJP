package com.ocjp.silver.modifiers;

class Caller {
    private void init() {
        System.out.println("Initialized");
    }

    public void start() {
        init();
        System.out.println("Started");
    }
}


public class TestCaller {
    public static void main(String[] args) {
        Caller caller = new Caller();
        caller.start();
        //caller.init();  // Compilation Error: 'init()' has private access in 'com.ocjp.test.modifiers.Caller'
    }
}
