package Basics.Loops;

import java.util.Scanner;

public class countSumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num, count = 0, sum = 0;
        if (num == 0) temp = 1;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
            count++;
        }
        System.out.println("Total Digits in " + num + ": " + count + "\nSum of Digits: " + sum);
    }
}