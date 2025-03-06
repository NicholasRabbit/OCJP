package com.ocjp.silver.other;


// Question 152
public class Access {
    private int x = 0;
    private int y = 0;

    public static void main(String[] args) {
        Access accApp = new Access();
        accApp.printThis(1, 2);
        accApp.printThat(3, 4);

    }


    private void printThis(int x, int y) {
        // The variable x on the left-hand side is treated as its closest variable with the same name,
        // namely the parameter x not the instance variable x. That's a convention in JavaSE.
        x = x;
        y = y;
        System.out.println("x: " + this.x + ", y: " + this.y);
    }
    private void printThat(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("x: " + this.x + ", y: " + this.y);
    }

}
