package com.bz.basicprograms;

import java.util.Scanner;

public class LargestAmongThreeNumbers {
    /* Added method to find largest of three numbers */
    public static void findLargest(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int number1=sc.nextInt();
        System.out.println("Enter the second number");
        int number2=sc.nextInt();
        System.out.println("Enter the third number");
        int number3=sc.nextInt();
        if((number1>number2)&(number1>number3))
            System.out.println(number1+" is largest among three");
        else if ((number2>number1)&(number2>number3))
            System.out.println(number2+" is largest among three");
        else
            System.out.println(number3+" is largest among three");
    }
    public static void main(String[] args) {
      findLargest();

    }
}
