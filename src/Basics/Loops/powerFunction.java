package Basics.Loops;

import java.util.Scanner;

public class powerFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two values: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int pow = 1;
        for (int i = 1; i <= b; i++) {
            pow *= a;
        }
        System.out.println(pow);
    }
}