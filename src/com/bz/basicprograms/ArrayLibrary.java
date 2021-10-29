package com.bz.basicprograms;

import java.util.Scanner;

public class ArrayLibrary {
    /*Added 3 methods to store 2D arrays of integer double and boolean */

    Scanner sc = new Scanner(System.in);
    public void arrayIntPrint() {

        System.out.println("Enter the number of rows");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns");
        int column = sc.nextInt();
        int[][] array = new int[row][column];
        int i, j, k, l;
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
                System.out.println("Enter the  array elements of row " + i + " and column " + j);
                array[i][j] = sc.nextInt();
            }
        }

        for (k = 0; k < array.length; k++) {
            for (l = 0; l < array[k].length; l++) {
                System.out.print(array[k][l] + " ");
            }
            System.out.println();
        }
    }

    public void arrayDoublePrint() {
        System.out.println("Enter the number of rows");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns");
        int column = sc.nextInt();

        Double[][] array = new Double[row][column];
        int i, j, k, l;
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
                System.out.println("Enter the  array elements of row " + i + " and column " + j);
                array[i][j] = sc.nextDouble();
            }
        }

        for (k = 0; k < array.length; k++) {
            for (l = 0; l < array[k].length; l++) {
                System.out.print(array[k][l] + " ");
            }
            System.out.println();
        }
    }

    public void arrayBooleanPrint() {

        System.out.println("Enter the number of rows");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns");
        int column = sc.nextInt();
        Boolean[][] array = new Boolean[row][column];
        int i, j, k, l;
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
                System.out.println("Enter the  array elements of row " + i + " and column " + j);
                array[i][j] = sc.nextBoolean();
            }
        }

        for (k = 0; k < array.length; k++) {
            for (l = 0; l < array[k].length; l++) {
                System.out.print(array[k][l] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayLibrary obj = new ArrayLibrary();
        System.out.println("Enter 1 for integer 2 for Double 3 for boolean");
        int userChoice = sc.nextInt();
        switch (userChoice) {
            case 1:
                obj.arrayIntPrint();
                break;
            case 2:
                obj.arrayDoublePrint();
                break;
            case 3:
                obj.arrayBooleanPrint();
                break;
            default:
                System.out.println("Invalid  input");
        }
    }
}
