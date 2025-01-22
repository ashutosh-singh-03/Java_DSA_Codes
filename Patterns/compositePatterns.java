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
      sc.close();
   }
}