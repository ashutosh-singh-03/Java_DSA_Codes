package Patterns;

import java.util.Scanner;

// Composite Patterns - Combining Multiple Patterns
public class compositePatterns {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter the number of rows: ");
      int rows = sc.nextInt();

      // Pattern 1: Right-Aligned Star Triangle
      System.out.println("\nRight-Aligned Star Triangle:");
      for (int i = 1; i <= rows; i++) {
         for (int j = 1; j <= rows - i; j++) { // spaces
            System.out.print("  ");
         }
         for (int j = 1; j <= i; j++) { // stars
            System.out.print("* ");
         }
         System.out.println();
      }

      // Pattern 2: Vertically Flipped Number Triangle
      System.out.println("\nVertically Flipped Number Triangle:");
      for (int i = 1; i <= rows; i++) {
         for (int j = 1; j <= rows - i; j++) { // spaces
            System.out.print("  ");
         }
         for (int j = 1; j <= i; j++) { // numbers
            System.out.print(j + " ");
         }
         System.out.println();
      }

      // Pattern 3: Star Rhombus
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

      // Pattern 4: Star Pyramid (Method 1)
      System.out.println("\nStar Pyramid (Method 1):");
      for (int i = 1; i <= rows; i++) {
         for (int j = 1; j <= rows - i; j++) { // spaces
            System.out.print("  ");
         }
         for (int j = 1; j <= 2 * i - 1; j++) { // stars
            System.out.print("* ");
         }
         System.out.println();
      }

      // Pattern 4: Star Pyramid (Method 2)
      System.out.println("\nStar Pyramid (Method 2):");
      int spaces = rows - 1;
      int stars = 1;

      for (int i = 1; i <= rows; i++) {
         for (int j = 1; j <= spaces; j++) { // spaces
            System.out.print("  ");
         }
         for (int j = 1; j <= stars; j++) { // stars
            System.out.print("* ");
         }
         System.out.println();
         spaces--;
         stars += 2;
      }

      sc.close();
   }
}