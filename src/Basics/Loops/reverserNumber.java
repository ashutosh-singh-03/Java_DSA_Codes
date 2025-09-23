package Basics.Loops;

import java.util.Scanner;

public class reverserNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num, rev = 0;

        while (temp != 0) {
            rev = (rev * 10) + (temp % 10);
            temp /= 10;
        }
        System.out.println("Reverse of " + "num: " + rev);
        System.out.println("Sum of " + rev + " and " + num + ": " + (rev + num));
    }
}