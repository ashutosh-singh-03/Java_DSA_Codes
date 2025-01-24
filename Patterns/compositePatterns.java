package Patterns;

import java.util.Scanner;

//Composite Patterns - combining two patterns
public class compositePatterns {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter the number of rows: ");
      int rows = sc.nextInt();

      // Printing The Following
      // # # # * # # # *
      // # # * * === # # + * *
      // # * * * # * * *
      // * * * * * * * *

      for (int i = 1; i <= rows; i++) {
         for (int j = 1; j <= rows - i; j++) { // spaces
            System.out.print("  ");
         }
         for (int j = 1; j <= i; j++) { // stars
            System.out.print("* ");
         }
         System.out.println();
      }

      // Vertically Flipped Number Triangle
      for (int i = 1; i <= rows; i++) {
         for (int j = 1; j <= rows - i; j++) { // spaces
            System.out.print("  ");
         }
         for (int j = 1; j <= i; j++) { // stars
            System.out.print(j + " ");
         }
         System.out.println();
      }

      // Star Rhombus -- //

      for (int i = 1; i <= rows; i++) {
         for (int j = 1; j <= rows - i; j++) {
            System.out.print("  ");
         }
         for (int j = 1; j <= rows; j++) {
            System.out.print("* ");
         }
         System.out.println();
      }

      // Star Pyramid
      // Method 1
      for (int i = 1; i <= rows; i++) {
         for (int j = 1; j <= rows - i; j++) {
            System.out.print("  ");
         }
         for (int j = 1; j <= 2 * i - 1; j++) {
            System.out.print("* ");
         }
         System.out.println();
      }

      // Method 2
      int spaces = rows - 1;
      int stars = 1;

      for (int i = 1; i <= rows; i++) {
         for (int j = 1; j <= spaces; j++) {
            System.out.print("  ");
         }
         for (int j = 1; j <= stars; j++) {
            System.out.print("* ");
         }
         System.out.println();
         spaces--;
         stars += 2;
      }
      sc.close();
   }
}