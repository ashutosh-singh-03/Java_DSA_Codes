package Basics.MathProblems;

import java.util.Scanner;

// GCD - find the Largest Number which is the factor of both the numbers

public class GCDCalculator {
    public static int gcdBruteForce(int a, int b) {
        int gcd = 1; // minimum gcd

        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) gcd = i;
        }
        return gcd;
    }

    public static int gcdEuclidean(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcdEuclidean(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("The GCD(by BruteForce) of " + num1 + " and " + num2 + " is " + gcdBruteForce(num1, num2));
        System.out.println("The GCD(by Euclid) of " + num1 + " and " + num2 + " is " + gcdEuclidean(num1, num2));
        System.out.println("LCM: " + lcm(num1, num2));

        sc.close();
    }
}