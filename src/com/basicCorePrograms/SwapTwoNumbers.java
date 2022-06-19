//Java Program to Swap Two Numbers
package com.basicCorePrograms;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        //declaring variables
        int a = 11;
        int b = 55;
        int swap;
        System.out.println("Current values of a and b: ");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        //Swapping two numbers
        swap = a;
        a = b;
        b = swap;
        System.out.println("After swapping the two numbers: ");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

    }
}
