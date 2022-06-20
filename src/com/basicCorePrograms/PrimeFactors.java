/*
a. Desc -> Computes the prime factorization of N using brute force.
b. I/P -> Number to find the prime factors
c. Logic -> Traverse till i*i <= N instead of i <= N for efficiency.
d. O/P -> Print the prime factors of number N.
 */
package com.basicCorePrograms;
import java.util.Scanner; //Importing Scanner.

public class PrimeFactors {
    public static void main(String args[]){
        System.out.print("Enter the number to find the prime factors: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println("The Prime Factors are: ");
        //Calculating the prime factors of a number.
        for(int i =2; i<=N; i++){
            while(N%i == 0){
                System.out.println(i);
                N = N/i;
            }
        }
    }
}
