package Patterns;

import java.util.*;

public class specialPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j % 2 != 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }

        // Floid's Triangle
        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        System.out.println("Floid's Triangle");
        int a = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a++ + " ");
            }
            System.out.println();
        }

        // Printing Star Plus +
        int mid = (1 + rows) / 2;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (i == mid || j == mid)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        // Printing Cross X
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (i == j || (i + j) == (1 + rows))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        // Printing Binary Right Traingle
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0)
                    System.out.print(1 + " ");
                else
                    System.out.print(0 + " ");
            }
            System.out.println();
        }

        // Printing Flip Right Triangle
        // Method 1
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (i + j > rows)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}