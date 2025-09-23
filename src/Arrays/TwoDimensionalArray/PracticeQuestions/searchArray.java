package Arrays.TwoDimensionalArray.PracticeQuestions;

import java.util.Scanner;

public class searchArray {
    public static void main(String[] args) {
        // Problem Statement:
        // Write an efficient algorithm that searches for a target value in an m × n
        // integer matrix which has the following properties:
        // 1. Integers in each row are sorted in ascending order from left to right.
        // 2. Integers in each column are sorted in ascending order from top to bottom.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target: ");
        int target = sc.nextInt();

        int[][] arr = {
            { 1, 4, 7, 11, 15 },
            { 2, 5, 8, 12, 19 },
            { 3, 6, 9, 16, 22 },
            { 10, 13, 14, 17, 24 },
            { 18, 21, 23, 26, 30 }
        };

        int m = arr.length, n = arr[0].length;

        // -------------------- Method 1: Brute-Force Search (O(m × n)) --------------------
        boolean isFound = false;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == target) {
                    isFound = true;
                    break;
                }
            }
        }

        if (!isFound)
            System.out.println("Element Not Present.");
        else
            System.out.println("Element Present.");

        // -------------------- Method 2: Optimized Search (O(m + n)) --------------------
        int i = 0, j = n - 1; // Start from the top-right corner
        boolean isPresent = false;

        while (i < m && j >= 0) {
            if (arr[i][j] == target) {
                isPresent = true;
                break;
            } else if (arr[i][j] > target) {
                j--; // Move left
            } else {
                i++; // Move down
            }
        }

        if (!isPresent)
            System.out.println("Element Not Found.");
        else
            System.out.println("Element Found.");

        sc.close();
    }
}