package Basics.BasicQuestions;

import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int lcm = 1;
        int i = 2;

        while (a > 1 || b > 1 || c > 1) {
            boolean divisible = false;

            if (a % i == 0) {
                a /= i;
                divisible = true;
            }
            if (b % i == 0) {
                b /= i;
                divisible = true;
            }
            if (c % i == 0) {
                c /= i;
                divisible = true;
            }

            if (divisible) lcm *= i;
            else i++;

        }
        System.out.println("LCM: " + lcm);

        sc.close();
    }
}