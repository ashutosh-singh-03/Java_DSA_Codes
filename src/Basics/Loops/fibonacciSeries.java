package Basics.Loops;

import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        // WAP to generate and print the first 'n' terms of the fibonacci series
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the endpoint: ");
        int end = sc.nextInt();

        int firstTerm = 0, secondTerm = 1;

        for (int i = 1; i <= end; i++) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}