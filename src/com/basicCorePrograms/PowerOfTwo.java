/*
a. Desc -> This program takes a command-line argument N and prints a table of the
powers of 2 that are less than or equal to 2^N.
b. I/P -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
c. Logic -> repeat until i equals N.
 */
package com.basicCorePrograms;
import java.util.Scanner; //imported Scanner function

public class PowerOfTwo {
    public static void main(String[] args) {
        //Variable declaration
        int num = 2;
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the power: ");
        N = sc.nextInt();
        for(int i=1; i<=N; i++){
            //printing the table of power of 2.
            System.out.println("2^" + i + ": " + (int)Math.pow(num , i)); //typecasting
        }
        double powerValue = (double)Math.pow(num , N);
        System.out.println(num + " to the power of " + N + " is " + powerValue);
    }
}
