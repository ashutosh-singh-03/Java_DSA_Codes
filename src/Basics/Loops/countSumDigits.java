package Basics.Loops;

import java.util.Scanner;

public class countDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num, count = 0;
        if (num == 0) temp = 1;
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        System.out.println(count);
    }
}