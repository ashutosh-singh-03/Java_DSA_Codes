package Patterns.Composite_Patterns;

import java.util.Scanner;

public class flippedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        // Flipped Star Triangle - Method 1
        System.out.println("\nFlipped Star Triangle 1:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (i + j > rows)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        // Flipped Star Triangle - Method 2
        System.out.println("\nFlipped Star Triangle 2: ");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) { // spaces
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) { // stars
                System.out.print("* ");
            }
            System.out.println();
        }

        // Flipped Number Triangle
        System.out.println("\nFlipped Number Triangle:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) { // spaces
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) { // numbers
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
