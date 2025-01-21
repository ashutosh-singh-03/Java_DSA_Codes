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
        sc.close();
    }
}