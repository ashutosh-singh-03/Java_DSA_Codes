package Basics.Conditionals;

import java.util.Scanner;

public class areaVsPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of rectangle: ");
        int len = sc.nextInt();
        System.out.print("Enter the breadth of rectangle: ");
        int br = sc.nextInt();

        int areaRect = (len * br);
        int perimeterRect = 2 * (len + br);
        if (areaRect > perimeterRect) System.out.println("Area is greater than Perimeter.");
        else System.out.println("Area is smaller than Perimeter.");

        sc.close();
    }
}