package Recursion.Recursion_Basics;

import java.util.Scanner;

public class practiceRecursion {
    // Count Digits in N
    static int countDigits(int n) {
        if (n == 0)
            return 0;
        return countDigits(n / 10) + 1;
    }

    // Finding Power of Numbers
    static int pow(int base, int power) {
        if (power == 0)
            return 1;
        return pow(base, power - 1) * base;
    }

    // Getting the sum of digits to the countDigits
    static int armstrongSum(int num, int power) {
        if (num == 0)
            return 0;
        return armstrongSum(num / 10, power) + pow(num % 10, power);
    }

    // checking if the number is armstrong
    static boolean isArmstrong(int num) {
        if (num == 0)
            return true;
        int digits = countDigits(num);
        return num == armstrongSum(num, digits);
    }

    // printing all the numbers in range which are armstrong
    static void printArmstrong(int start, int end) {
        if (start > end)
            return;

        if (isArmstrong(start))
            System.out.println(start);
        printArmstrong(start + 1, end);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = sc.nextInt();

        System.out.println("Total Digits: " + countDigits(x));
        if (isArmstrong(x))
            System.out.println("Number is Armstrong.");
        else
            System.out.println("Number is not Armstrong.");

        System.out.println("Enter start value: ");
        int start = sc.nextInt();
        System.out.println("Enter End value: ");
        int end = sc.nextInt();

        System.out.println("Armstrong numbers between " + start + " and " + end + " are:");
        printArmstrong(start, end);

        sc.close();
    }
}
