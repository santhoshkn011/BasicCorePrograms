//Java Program to Check Whether an Alphabet is Vowel or Consonant
package com.basicCorePrograms;
import java.util.Scanner; //Importing Scanner function

public class VowelConsonantCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Alphabet: ");

        char ch = sc.next().charAt(0); //syntax for char input

        switch(ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(ch + " is vowel.");
                break;
            default :
                System.out.println(ch + " is consonant.");
        }
    }
}
