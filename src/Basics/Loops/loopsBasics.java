package Basics.Loops;

import java.util.Scanner;

public class loopsBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Print "Hello World" n times
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) System.out.print(i + " ");

        // Print all nos. from 1 to n which are divisible by both 5 and 3
        System.out.println("-----");
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) System.out.print(i + " ");
        }

        // Print table of m
        System.out.print("Enter the value of m: ");
        int m = sc.nextInt();

        for (int i = 1; i <= 10; i++) System.out.println(m + " * " + i + " = " + (i * m));

        sc.close();
    }
}