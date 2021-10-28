package com.bz.basicprograms;

import java.util.Scanner;

public class Distance {
    /* Added method to calculate distance  */
    static void  calculateEuclideanDistance(int x,int y){
        double distance=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        System.out.println("Euclidean distance of point (x,y) to the origin (0,0) is = "+distance);

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of x to calculate Euclidean distance");
        int point1= sc.nextInt();
        System.out.println("Enter the value of y to calculate Euclidean distance");
        int point2= sc.nextInt();
        calculateEuclideanDistance(point1,point2);

    }
}
