package Practice;

import java.util.*;

public class conditionals {

    public static boolean isTriangle(int side1, int side2, int side3) {
        boolean ans = false;

        if ((side1 + side2) > side3 && (side2 + side3) > side1 && (side1 + side3) > side2)
            ans = true;
        else
            ans = false;

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Q. Create a Java method to find and print the absolute value of an integer
        // without using the built-in Math.abs() function.
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Absolute Value: " + Math.abs(num));

        // Q. Implement a Java function to determine if a given year is a leap year or
        // not. Print "Leap Year" if true, otherwise print "Not a Leap Year.
        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        if (year > 0) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        } else {
            System.out.println("Enter correct year.");
        }

        // Q. Create a Java function that takes three integer parameters representing
        // the sides of a triangle and prints whether it's equilateral, isosceles, or
        // scalene.
        System.out.print("Enter the sides of the triangle: ");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        boolean ans = isTriangle(side1, side2, side3);

        if (ans == true) {
            if (side1 == side2 && side2 == side3)
                System.out.println("Equilateral Triangle.");
            else if (side1 == side2 || side2 == side3 || side3 == side1)
                System.out.println("Isosceles Triangle.");
            else
                System.out.println("Scalene Triangle.");
        } else {
            System.out.print("Sides entered do not form a triangle.");
        }

        // Q. Write a Java program to find and print the greatest of three numbers
        // entered by the user.
        System.out.print("Enter three numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int greatest = n1;

        if (n2 > greatest)
            greatest = n2;
        else if (n3 > greatest)
            greatest = n3;

        System.out.println(greatest + " is the greatest.");

        // Q. Develop a Java program to find and print the least of three numbers using
        // nested if-else statements.
        if (n1 < n2) {
            if (n1 < n3)
                System.out.println(n1 + " is the least.");
            else
                System.out.println(n3 + " is the least.");
        } else {
            if (n2 < n3)
                System.out.println(n2 + " is the least.");
            else
                System.out.println(n3 + " is the least.");
        }

        sc.close();
    }
}
