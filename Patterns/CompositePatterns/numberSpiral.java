package Patterns.CompositePatterns;

import java.util.Scanner;

public class numberSpiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Pattern 1: ");
        for (int i = 1; i <= 2 * n - 1; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                int a = i, b = j;
                if (i > n)
                    a = 2 * n - i;
                if (j > n)
                    a = 2 * n - j;
                System.out.print(Math.min(a, b) + " ");
            }
            System.out.println();
        }

        System.out.println("\nPattern 2: ");
        for (int i = 1; i <= 2 * n - 1; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                int a = i, b = j;
                if (i > n)
                    a = 2 * n - i;
                if (j > n)
                    a = 2 * n - j;
                System.out.print(n + 1 - Math.min(a, b) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
