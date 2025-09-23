package Basics.Conditionals;

import java.util.Scanner;

public class checkTriangle {
    public static boolean isTriangle(int a, int b, int c) {
        boolean ans = true;
        if ((a + b) > c && (b + c) > a && (a + c) > b)
            return ans;
        else {
            ans = false;
            return ans;
        }
    }

    public static void main(String[] args) {
        // Q. Check if the triangle is equilateral, isosceles, or scalene.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sides of the triangle: ");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        boolean ans = isTriangle(side1, side2, side3);

        if (ans) {
            if (side1 == side2 && side2 == side3)
                System.out.println("Equilateral Triangle.");
            else if (side1 == side2 || side2 == side3 || side3 == side1)
                System.out.println("Isosceles Triangle.");
            else
                System.out.println("Scalene Triangle.");
        } else {
            System.out.print("Sides entered do not form a triangle.");
        }
    }
}