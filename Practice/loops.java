package Practice;

import java.util.*;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Program to count the number of digits in a given number
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        System.out.println("Given Number: " + num);

        int digit = 0;
        int i = num;
        while (i != 0) {
            i /= 10;
            digit++;
        }
        System.out.print("Number of digits: " + digit);

        // WAP to print the sum of the digits of the number
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("\nSum of the digits: " + sum);

        // WAP to find the sum of the natural numbers up to given positive integer n
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        int sum1 = 0;
        for (int j = 1; j <= n; j++) {
            sum1 += j;
        }
        System.out.println("Total Sum: " + sum1);

        // WAP to find the greatest common divisor of two numbers using a loop

        // WAP to generate and print the first 'n' terms of the fibonacci series
        System.out.println("\nEnter the endpoint: ");
        int end = sc.nextInt();

        int firstTerm = 0, secondTerm = 1;

        for (int l = 1; l <= end; l++) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        // WAP to find to take input and do the sum until a given condition
        int k = 1;
        int sum2 = 0;
        while (k <= n) {
            int num1 = sc.nextInt();
            sum2 += num1;
            System.out.println("Sum: " + sum2);
            k++;
        }
        sc.close();
    }
}
