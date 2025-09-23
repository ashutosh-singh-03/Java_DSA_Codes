package Basics.Loops;

import java.util.Scanner;

public class getSumTillCondition {
    public static void main(String[] args) {
        // WAP to find to take input and do the sum until a given condition
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Condition: ");
        int n = sc.nextInt();

        int k = 1;
        int sum = 0;
        while (k <= n) {
            int num = sc.nextInt();
            sum += num;
            System.out.println("Sum: " + sum);
            k++;
        }
    }
}