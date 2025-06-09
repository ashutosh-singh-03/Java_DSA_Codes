package Patterns.Composite_Patterns;

import java.util.Scanner;

public class numberPyramidPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) { // spaces
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= i; j++) { // number pattern
                System.out.print(j + " ");
            }
            for (int j = i - 1; j >= 1; j--) { // reverse number pattern
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
