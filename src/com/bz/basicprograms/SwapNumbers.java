package com.bz.basicprograms;

public class SwapNumbers {
    /* Added a method to swap numbers without using third variable*/
    public static void swapNumbers(int number1, int number2) {
        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;
        System.out.println("After swapping value of number1 =" + number1);
        System.out.println("After swapping value of number2 =" + number2);
    }
    public static void main(String[] args) {
        swapNumbers(8, 9);
    }
}
