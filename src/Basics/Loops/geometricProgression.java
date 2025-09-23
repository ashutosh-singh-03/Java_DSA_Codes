package Basics.Loops;

import java.util.Scanner;

public class geometricProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input values
        System.out.print("\nEnter the first term: ");
        int firstTerm = sc.nextInt();
        System.out.print("Enter the common ratio: ");
        int r = sc.nextInt();
        System.out.print("Enter the number of terms: ");
        int k = sc.nextInt();

        int currentTerm = firstTerm;

        // Method 1 - Using formula approach
        System.out.println("\nGP using formula approach:");
        for (int i = 1; i <= k; i++) {
            System.out.print(currentTerm + " ");
            currentTerm *= r;
        }

        // Method 2 - Without using formula
        System.out.println("\n\nGP without formula:");
        int temp = firstTerm;
        for (int i = 1; i <= k; i++) {
            System.out.print(temp + " ");
            temp *= r;
        }
    }
}