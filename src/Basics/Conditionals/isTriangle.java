package Basics.Conditionals;

import java.util.Scanner;

public class isTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Side1: ");
        int side1 = sc.nextInt();
        System.out.print("Enter Side2: ");
        int side2 = sc.nextInt();
        System.out.print("Enter Side3: ");
        int side3 = sc.nextInt();
        if ((side1 + side2) > side3 && (side2 + side3) > side1 && (side1 + side3) > side2)
            System.out.println("Triangle can be formed.");
        else System.out.println("Triangle cannot be formed.");

        sc.close();
    }
}