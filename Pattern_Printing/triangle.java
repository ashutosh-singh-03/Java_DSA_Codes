package Pattern_Printing;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Print star triangle
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Print
        // 1
        // A B
        // 1 2 3
        // A B C D
        // 1 2 3 4 5

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 != 0)
                    System.out.print(j + " ");
                else
                    System.out.print((char) (j + 64) + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
