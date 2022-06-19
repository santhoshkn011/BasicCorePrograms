//Java Program to Compute Quotient and Remainder
package com.basicCorePrograms;
import java.util.Scanner;

public class QuotientAndRemainderCompute {
    public static void main(String[] args) {
        //Variable declaration
        int divisor, dividend;
//Taking Divisor and dividend from user.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Divisor: ");
        divisor = sc.nextInt();
        System.out.print("Enter Dividend: ");
        dividend = sc.nextInt();
//Calculation of Quotient and Remainder
        int Quotient = divisor / dividend;
        int Remainder = divisor % dividend;
//Printing the Quotient and Remainder.
        System.out.println("Quotient = " + Quotient);
        System.out.println("Remainder = " + Remainder);
    }
}
