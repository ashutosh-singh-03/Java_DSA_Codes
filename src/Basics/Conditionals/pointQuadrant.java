package Basics.Conditionals;

import java.util.Scanner;

public class pointQuadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the abscissa: ");
        int x = sc.nextInt();
        System.out.print("Enter the ordinate: ");
        int y = sc.nextInt();
        System.out.println("Coordinate: (" + x + ", " + y + ").");

        if (x == 0 && y == 0) System.out.println("Point: Origin");
        else if (x == 0 && y > 0) System.out.println("Point: Y-Axis");
        else if (x > 0 && y == 0) System.out.println("Point: X-Axis");
        else if (x > 0 && y > 0) System.out.println("Point: 1st Quadrant");
        else if (x < 0 && y > 0) System.out.println("Point: 2nd Quadrant");
        else if (x < 0 && y < 0) System.out.println("Point: 3rd Quadrant");
        else if (x > 0) System.out.println("Point: 4th Quadrant");
        else System.out.println("Enter correct co-ordinates.");

        sc.close();
    }
}