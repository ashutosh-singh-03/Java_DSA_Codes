package Basics.Conditionals;

import java.util.Scanner;

public class findGreatestAndLeast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 3 positive integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int greatest = a;
        int least = a;

        if (b > greatest) greatest = b;
        if (c > greatest) greatest = c;
        System.out.println(greatest + " is the greatest.");

        if (b < least) least = b;
        if (c < least) least = c;
        System.out.println(least + " is the least of all.");


        // Method2: Finding the greatest using nested if
        if (a > b) {
            if (a > c) System.out.println(a + " is the greatest.");
            else System.out.println(c + " is the greatest.");
        } else {
            if (b > c) System.out.println(b + " is the greatest.");
            else System.out.println(c + " is greatest.");
        }

        sc.close();
    }
}