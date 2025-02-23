package Questions.TwoDimArray;

import java.util.*;

public class matrixMultiplication {
    public static void input(int[][] arr, int m, int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public static void print(int[][] arr) {
        for (int[] ele : arr) {
            for (int i : ele) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows for Matrix 1: ");
        int m = sc.nextInt();
        System.out.print("Enter Cols for Matrix 1: ");
        int n = sc.nextInt();
        System.out.print("Enter Rows for Matrix 2: ");
        int p = sc.nextInt();
        System.out.print("Enter Cols for Matrix 2: ");
        int q = sc.nextInt();

        int[][] arr1 = new int[m][n];
        int[][] arr2 = new int[p][q];

        if (n != p) {
            System.out.println("Multiplication Not Possible.");
        } else {
            System.out.println("Enter Elements of Matrix 1:");
            input(arr1, m, n);
            System.out.println("Enter Elements of Matrix 2:");
            input(arr2, p, q);

            int[][] ans = new int[m][q];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < q; j++) {
                    // c[i][j] = a[i][0]*b[0][j] + a[i][1]*b[1][j] + ....
                    for (int k = 0; k < arr2.length; k++) {
                        ans[i][j] += arr1[i][k] * arr2[k][j];
                    }
                }
            }
            System.out.println("Matrix 1: ");
            print(arr1);
            System.out.println("Matrix 2: ");
            print(arr2);
            System.out.println("Final Multiplication: ");
            print(ans);
        }
    }
}
