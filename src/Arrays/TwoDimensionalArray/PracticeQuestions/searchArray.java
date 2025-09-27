package Arrays.TwoDimensionalArray.PracticeQuestions;

import java.util.Scanner;

// PS: Write an efficient algo that searches for a target value in an m × n integer matrix which
// has the following properties:
// 1. Integers in each row are sorted in ascending order from left to right.
// 2. Integers in each column are sorted in ascending order from top to bottom.
public class searchArray {
    //    Method 1: Brute-Force Search (O(m × n))
    public static void method1(int[][] arr, int target) {
        boolean isFound = false;
        for (int[] ints : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                if (ints[j] == target) {
                    isFound = true;
                    break;
                }
            }
        }

        if (!isFound)
            System.out.println("Element Not Present.");
        else
            System.out.println("Element Present.");
    }

    //    Method 2: Optimized Search (O(m + n))
    public static void method2(int[][] arr, int target) {
        int i = 0, j = arr[0].length - 1; // Start from the top-right corner
        boolean isPresent = false;

        while (i < arr.length && j >= 0) {
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
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target: ");
        int target = sc.nextInt();

        int[][] arr = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        System.out.println("Method 1: ");
        method1(arr, target);

        System.out.println("Method 1: ");
        method2(arr, target);

    }
}