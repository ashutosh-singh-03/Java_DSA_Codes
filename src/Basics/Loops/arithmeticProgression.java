package Basics.Loops;

import java.util.Scanner;

public class arithmeticProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Print an AP
        // Method - 1
        System.out.print("Enter the first term: ");
        int a = sc.nextInt();
        System.out.print("Enter the number of terms: ");
        int k = sc.nextInt();
        System.out.print("Enter the common difference: ");
        int d = sc.nextInt();

        for (int i = a; i <= (a + (k - 1) * d); i += d) {
            System.out.print(i + " ");
        }

        // Method - 2 - without maths
        System.out.print("\nEnter the value: ");
        int l = sc.nextInt();

        for (int i = 1; i <= l; i++) {
            System.out.print(a + " ");
            a += d;
        }
    }
}