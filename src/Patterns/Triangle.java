package Patterns;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Print Star Triangle
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.println("\nStar Triangle:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Print Alternating Number and Alphabet Triangle
        System.out.println("\nAlternating Number and Alphabet Triangle:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 != 0) { // Odd rows print numbers
                    System.out.print(j + " ");
                } else { // Even rows print alphabets
                    System.out.print((char) (j + 64) + " "); // ASCII conversion for A-Z
                }
            }
            System.out.println();
        }

        // Print Reverse Star Triangle
        System.out.println("\nReverse Star Triangle:");
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Alternative Method for Reverse Star Triangle
        System.out.println("\nReverse Star Triangle (Alternative Method):");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows + 1 - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}