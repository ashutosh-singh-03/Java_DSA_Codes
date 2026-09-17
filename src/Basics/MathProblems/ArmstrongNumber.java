package Basics.MathProblems;

import java.util.Scanner;

// Check if the number is Armstrong --> Sum of (digit)^(total no. if digits) == number

public class ArmstrongNumber {
    public static Boolean isArmstrong(int num) {
        int originalNum = num;
        int len = Integer.toString(originalNum).length();
        int sum = 0;
        while (num != 0) {
            sum = (int) (sum + Math.pow(num % 10, len));
            num /= 10;
        }
        return originalNum == sum;
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Is " + num + " armstrong: " + isArmstrong(num));

        sc.close();
    }
}
