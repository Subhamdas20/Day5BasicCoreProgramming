package com.bz.basicprograms;

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 4 digit year");
        int year=sc.nextInt();
        if ((year>=1000)&(year<10000)){
            if(year%4==0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0)
                        System.out.println("Leap Year");
                    else
                        System.out.println("Not leap year");
                }
                else
                    System.out.println("Leap Year");

            }
            else
                System.out.println("Not leap year");
        }
        else
            System.out.println("Invalid entry");
    }

}

