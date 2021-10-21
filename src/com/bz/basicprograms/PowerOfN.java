package com.bz.basicprograms;

import java.util.Scanner;

public class PowerOfN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N between o to 31");
        int n=sc.nextInt();
        if((n>=0)&(n<31)){
            for (int i=0;i<=n;i++)
            {
//               int table=(int)Math.pow(2,i);
                System.out.println("Power of 2^"+i+"="+Math.pow(2,i));
            }
        }
        else
            System.out.println("Invalid input from user");

    }
}
