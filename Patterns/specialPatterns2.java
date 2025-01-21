package Patterns;

import java.util.*;

public class specialPatterns2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Printing Star Plus +
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

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
        sc.close();
    }
}