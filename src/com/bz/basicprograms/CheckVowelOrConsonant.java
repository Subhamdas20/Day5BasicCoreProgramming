package com.bz.basicprograms;


import java.util.Scanner;

public class CheckVowelOrConsonant {
    public static void checkVowels() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character to check whether it is vowel or consonant");
        char character = sc.next().charAt(0);
        if ((character == 'a') || (character == 'e') || (character == 'i') || (character == 'o') || (character == 'u') || (character == 'A') || (character == 'E') || (character == 'I') ||
                (character == 'O') || (character == 'U'))
            System.out.println("Entered character is a vowel");
        else
            System.out.println("Entered character is consonant");

    }

    public static void main(String[] args) {
        checkVowels();
    }
}
