package Patterns.Composite_Patterns;

import java.util.Scanner;

public class starRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.println("\nStar Rhombus:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) { // spaces
                System.out.print("  ");
            }
            for (int j = 1; j <= rows; j++) { // stars
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
