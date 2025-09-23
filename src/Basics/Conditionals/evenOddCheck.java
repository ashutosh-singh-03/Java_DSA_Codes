package Basics.Conditionals;

import java.util.Scanner;

public class evenOddCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any positive number: ");
        int num = sc.nextInt();
        if (num % 2 == 0) System.out.println(num + " is even.");
        else System.out.println(num + " is odd.");

        System.out.println((num % 2 == 0) ? "Even" : "Odd");
        // (num%2==0) ? System.out.println(--):System.out.println(--); --> Not possible
        // in JAVA

        sc.close();
    }
}