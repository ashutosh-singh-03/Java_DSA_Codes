package Arrays.TwoDimensionalArray.PracticeQuestions;

import java.util.Scanner;

public class matrixMultiplication {

    // Function to take input for a matrix
    public static void input(int[][] arr, int m, int n, Scanner sc) {
        System.out.println("Enter " + m * n + " elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    // Function to print a matrix
    public static void print(int[][] arr) {
        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("Enter Rows for Matrix 1: ");
        int m = sc.nextInt();
        System.out.print("Enter Cols for Matrix 1: ");
        int n = sc.nextInt();
        System.out.print("Enter Rows for Matrix 2: ");
        int p = sc.nextInt();
        System.out.print("Enter Cols for Matrix 2: ");
        int q = sc.nextInt();

        // Check if matrix multiplication is possible
        if (n != p) {
            System.out.println("Multiplication Not Possible. (Cols of Matrix 1 must match Rows of Matrix 2)");
        } else {
            int[][] arr1 = new int[m][n];
            int[][] arr2 = new int[p][q];

            // Input matrices
            System.out.println("Enter Elements of Matrix 1:");
            input(arr1, m, n, sc);
            System.out.println("Enter Elements of Matrix 2:");
            input(arr2, p, q, sc);

            // Matrix Multiplication
            int[][] result = new int[m][q];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < q; j++) {
                    for (int k = 0; k < n; k++) { // Use 'n' instead of arr2.length for better clarity
                        result[i][j] += arr1[i][k] * arr2[k][j];
                    }
                }
            }

            // Print matrices and result
            System.out.println("Matrix 1:");
            print(arr1);
            System.out.println("Matrix 2:");
            print(arr2);
            System.out.println("Final Multiplication Result:");
            print(result);
        }

        sc.close(); // Close Scanner to prevent resource leaks
    }
}