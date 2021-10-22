package com.bz.basicprograms;

import java.util.Scanner;

public class ComputingQuotientAndRemainder {
    public void compute() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int number = sc.nextInt();
        System.out.println("Enter the divisor");
        int divisor = sc.nextInt();
        int quotient, remainder;
        quotient = number / divisor;
        remainder = number % divisor;
        System.out.println("The quotient is " + quotient);
        System.out.println("The remainder is " + remainder);
    }

    public static void main(String[] args) {
        ComputingQuotientAndRemainder comp = new ComputingQuotientAndRemainder();
        comp.compute();
    }
}
