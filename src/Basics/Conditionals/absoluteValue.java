package Basics.Conditionals;

import java.util.Scanner;

public class absoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any integer: ");
        int num1 = sc.nextInt();
        if (num1 < 0) System.out.println("Absolute value: " + (-num1));
        else System.out.println("Absolute Value: " + num1);

//        We can also use Math.abs(num)
        sc.close();
    }
}