package com.bz.basicprograms;

import java.util.Scanner;

public class CheckEvenOrOdd {
    public static void checkEvenOdd(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to check even or odd");
        int number=sc.nextInt();
        if(number%2==0)
            System.out.println(number+" is an even number");
        else
            System.out.println(number+" is an odd number");
    }
    public static void main(String[] args) {
        checkEvenOdd();
    }
}
