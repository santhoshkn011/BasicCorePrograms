/*
a. Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
(http://users.encs.concordia.ca/~chvatal/notes/harmonic.html).
b. I/P -> The Harmonic Value N. Ensure N != 0
c. Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N
d. O/P -> Print the Nth Harmonic Value.
*/
package com.basicCorePrograms;
import java.util.Scanner; //importing the Scanner function.

public class HarmonicNumber {

    public static void main(String args[]) {
        int N;
        double nthHarmonicValue = 1;
        System.out.print("Enter Nth Harmonic number: ");
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        System.out.printf("The %dth harmonic series: ",N);
        System.out.print("1");
        //printing the series and calculating the value of nth Harmonic number.
        for(int i=2; i<=N; i++){
            System.out.print(" + 1/"+i);
            nthHarmonicValue += (double)1/i;
        }
        System.out.printf("\nThe %dth harmonic value H%d: ",N,N);
        System.out.println(nthHarmonicValue);
    }
}
