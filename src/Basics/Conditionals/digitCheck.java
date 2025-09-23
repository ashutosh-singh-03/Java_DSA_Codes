package Basics.Conditionals;

import java.util.Scanner;

public class digitCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();

        if (num1 > 99 && num1 < 1000) System.out.println("Number is three digit.");
        else if (num1 > 0 && num1 < 100) System.out.println("Number is 2 digit.");
        else System.out.println("Number is not three digit.");

        sc.close();
    }
}