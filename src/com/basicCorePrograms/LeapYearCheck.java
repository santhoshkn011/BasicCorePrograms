/*
a. I/P -> Year, ensure it is a 4 digit number.
b. Logic -> Determine if it is a Leap Year.
c. O/P -> Print the year is a Leap Year or not.
*/
package com.basicCorePrograms;
import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        System.out.print("Enter the year: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        //Check for leap year
        if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0){
            System.out.println("It is a leap year");
        }
        else {
            System.out.println("It is not a leap year");
        }
    }
}
