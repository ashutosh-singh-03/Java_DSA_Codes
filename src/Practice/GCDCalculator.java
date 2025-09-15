package Practice;

import java.util.*;

public class GCDCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int gcd = 1; // minimum gcd

        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0)
                gcd = i;
        }

        System.out.println("The Greatest Common Divisor of " + num1 + " and " + num2 + " is " + gcd);

        sc.close();
    }
}
