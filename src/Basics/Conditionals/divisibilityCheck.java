package Basics.Conditionals;

import java.util.Scanner;

public class divisibilityCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print("Enter the number to check divisibility for: ");
        int m = sc.nextInt();
        if (num % m == 0) System.out.println(num + " is divisible by " + m);
        else System.out.println(num + " is not divisible by " + m);

        sc.close();
    }
}