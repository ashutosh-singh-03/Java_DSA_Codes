package Patterns.CompositePatterns;

import java.util.Scanner;

public class starPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        // Method 1
        System.out.println("\nStar Pyramid (Method 1):");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) { // spaces
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) { // stars
                System.out.print("* ");
            }
            System.out.println();
        }

        // Method 2
        System.out.println("\nStar Pyramid (Method 2):");
        int spaces = rows - 1;
        int stars = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) { // spaces
                System.out.print("  ");
            }
            for (int j = 1; j <= stars; j++) { // stars
                System.out.print("* ");
            }
            System.out.println();
            spaces--;
            stars += 2;
        }
        
        sc.close();
    }
}
