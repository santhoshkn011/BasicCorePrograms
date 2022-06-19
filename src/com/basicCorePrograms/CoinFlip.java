/*
a. I/P -> The number of times to Flip Coin. Ensure it is a positive integer.
b. Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or
heads
c. O/P -> Percentage of Head vs Tails
 */
package com.basicCorePrograms;
import java.util.Scanner; //importing Scanner

public class CoinFlip {
    public static void main(String[] args) {
        int coinFlip;
        int heads = 0;
        int tails = 0;
        System.out.print("Enter the number of times to flip the coin(Positive number): ");
        Scanner sc = new Scanner(System.in);
        coinFlip = sc.nextInt();
        for(int i = 0; i < coinFlip; i++){
            if(Math.random() < 0.5) {
                heads++;
            }
            else {
                tails++;
            }
        }
        System.out.println("Number of Head flips: "+heads+"\nNumber of Tail flips: "+tails);
        //Calculating percentage
        double tailCount = tails / (double) coinFlip* 100 ;
        double headCount = heads/ (double) coinFlip* 100 ;
        System.out.println("Head Percentage: "+headCount+"\nTail Percentage: "+tailCount);
    }
}

