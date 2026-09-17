package Basics.MathProblems;

import java.util.Scanner;

/*
PROBLEMS
1. Print Digits of a Number
2. Count Digits of a Number
3. Sum of Digits of a Number
4. Reverse the Number
5. Factorial Of Number
*/

public class PlayingWithNumbers {
    public static void printDigits(int num) {
        while (num != 0) {
            int digit = num % 10;
            System.out.print(digit + " ");
            num /= 10;
        }
    }

    public static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            int digit = num % 10;
            count++;
            num /= 10;
        }
        return count;
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        return sum;
    }

    public static int reverseNumber(int num) {
        int reversedNum = 0;
        while (num != 0) {
            reversedNum = reversedNum * 10 + num % 10;
            num /= 10;
        }
        return reversedNum;
    }

    public static long factorial(int num) {
        long prod = 1;
        for (int i = 2; i <= num; i++) {
            prod *= i;
        }
        return prod;
    }

    private static void printMenu(int num) {
        System.out.println("\n===== Number Operations (current number: " + num + ") =====");
        System.out.println("1. Print Digits");
        System.out.println("2. Count Digits");
        System.out.println("3. Sum of Digits");
        System.out.println("4. Reverse Number");
        System.out.println("5. Factorial of Number");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to start: ");
        int num = sc.nextInt();

        while (true) {
            printMenu(num);
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Digits of " + num + ": ");
                    printDigits(num);
                    System.out.println();
                }
                case 2 -> System.out.println("Total digits in " + num + ": " + countDigits(num));
                case 3 -> System.out.println("Sum of digits of " + num + ": " + sumOfDigits(num));
                case 4 -> System.out.println("Original: " + num + "\tReversed: " + reverseNumber(num));
                case 5 -> System.out.println("Factorial: " + (factorial(num)));
                case 0 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice. Enter 1-5 or 0 to exit.");
            }
        }
    }
}
