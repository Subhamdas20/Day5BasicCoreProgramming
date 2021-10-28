package com.bz.basicprograms;

import java.util.Scanner;

public class CoinFlipPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times you want to flip coin");
        int flip=sc.nextInt();

        int tails=0,heads=0;
        for(int i=1;i<=flip;i++) {
            Double rand=(double)Math.random();
            if (rand < 0.5) {
                tails = tails + 1;

            } else {
                heads = heads + 1;

            }
        }

        System.out.println("Number of times tails came = "+tails);
        System.out.println("Number of times heads came = "+heads);
        System.out.println("percentage of tails=" + (tails * 100) / flip);
        System.out.println("percentage of heads=" + (heads * 100) / flip);

    }
}
