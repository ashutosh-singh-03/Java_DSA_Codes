package Arrays.TwoDimensionalArray;

import java.util.Scanner;

public class basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int n = sc.nextInt();

        // declaration and initialization
        int[][] arr = new int[m][n];

        // Assigning values manually
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[1][0] = 3;
        arr[1][1] = 4;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Assigning values using loop
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter element " + i + " " + j + ": ");
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nPrinting Using For Each - ");
        // Printing array using foreach
        for (int[] ele : arr) {
            for (int i : ele) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        // Length of the array
        System.out.print("Rows: " + arr.length);
        System.out.print("\nCols: " + arr[0].length);

        sc.close();
    }
}
