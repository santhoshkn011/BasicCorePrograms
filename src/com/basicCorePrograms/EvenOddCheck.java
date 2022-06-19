//Java Program to Check Whether a Number is Even or Odd
package com.basicCorePrograms;
import java.util.Scanner; //importing Scanner function

public class EvenOddCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check: ");
        int num = sc.nextInt();
        //Checking if the number is even or odd
        if(num % 2 == 0){
            System.out.println("It is an Even number.");
        }
        else {
            System.out.println("It is an Odd number.");
        }
    }
}
