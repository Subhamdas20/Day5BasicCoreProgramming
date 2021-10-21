package com.bz.basicprograms;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the harmonic value of n");
        int n=sc.nextInt();
        double harmonicSum=0;
        if(n!=0){
           for (double i=1;i<=n;i++){
               harmonicSum=harmonicSum+(1/i);
           }
            System.out.println("Nth harmonic value ="+harmonicSum);
        }
        else
            System.out.println("Invalid Input");
    }
}
