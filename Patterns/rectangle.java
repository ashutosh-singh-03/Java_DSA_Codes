package Patterns;

import java.util.*;

public class rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Printing a rectangle
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Printing a square
        System.out.print("Enter the side of the square: ");
        int side = sc.nextInt();

        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <= side; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Print the number square
        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <= side; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Print the alphabet square
        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <= side; j++) {
                System.out.print((char) (j + 64) + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}