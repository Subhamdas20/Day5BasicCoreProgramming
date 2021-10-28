package com.bz.basicprograms;

import java.util.Scanner;

public class PrimeFactorization {
    /* Printing prime factors */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check its prime factors");
        int number = sc.nextInt();
        int i = 2;
        while (number > 0) {
            if (number % i == 0) {
                System.out.println(i);
                number = number / i;
            } else {
                i++;
            }
        }
    }
}
