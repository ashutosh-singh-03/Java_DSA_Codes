package Patterns;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Printing a Rectangle of Stars
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.println("\nRectangle of Stars:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Printing a Square of Stars
        System.out.print("\nEnter the side of the square: ");
        int side = sc.nextInt();

        System.out.println("\nSquare of Stars:");
        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <= side; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Printing a Number Square
        System.out.println("\nNumber Square:");
        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <= side; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Printing an Alphabet Square
        System.out.println("\nAlphabet Square:");
        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <= side; j++) {
                System.out.print((char) (j + 64) + " "); // ASCII conversion for A-Z
            }
            System.out.println();
        }

        sc.close();
    }
}