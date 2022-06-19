//Java Program to Find the Largest Among Three Numbers
package com.basicCorePrograms;
import java.util.Scanner;

public class CheckLargestOfThreeNumbers {
    public static void main(String[] args) {
//Declaring three values.
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: "); //User input
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a > b){
            System.out.println("a is greatest of three numbers.");
        }
        else if (b > c){
            System.out.println("b is greatest of three numbers.");
        }
        else {
            System.out.println("c is greatest of three numbers.");
        }
    }
}
