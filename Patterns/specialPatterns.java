package Patterns;

import java.util.*;

public class specialPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        // Pattern 1: Odd Numbers Pyramid
        System.out.println("\nOdd Numbers Pyramid:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j % 2 != 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }

        // Pattern 2: Floyd's Triangle
        System.out.println("\nFloyd's Triangle:");
        int a = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a++ + " ");
            }
            System.out.println();
        }

        // Pattern 3: Star Plus (+)
        System.out.println("\nStar Plus (+):");
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

        // Pattern 4: Cross (X)
        System.out.println("\nCross (X):");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (i == j || (i + j) == (1 + rows))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        // Pattern 5: Binary Right Triangle
        System.out.println("\nBinary Right Triangle:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }

        // Pattern 6: Flipped Right Triangle
        System.out.println("\nFlipped Right Triangle:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (i + j > rows)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        sc.close();
    }
}
