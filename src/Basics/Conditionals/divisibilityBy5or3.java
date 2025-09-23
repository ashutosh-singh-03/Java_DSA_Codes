package Basics.Conditionals;

import java.util.Scanner;

public class divisibilityBy5or3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 5 == 0 || num % 3 == 0) System.out.println(num + " is divisible.");
        else System.out.println(num + " is not divisible.");

        sc.close();
    }
}