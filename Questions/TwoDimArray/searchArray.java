package Questions.TwoDimArray;

import java.util.Scanner;

public class searchArray {
    public static void main(String[] args) {
        // Write an efficient algorithm that searches for a value target in an m * n
        // integer matrix which has the following properties - 1. integer in each row
        // are sorted in ascending from left to right. 2. Integers in each column are
        // sorted in ascending from top to bottom

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target: ");
        int target = sc.nextInt();
        int[][] arr = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
                { 18, 21, 23, 26, 30 } };
        int m = arr.length, n = arr[0].length;

        boolean flag = false;
        // Not so optimal method
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == target)
                    flag = true;
            }
        }

        if (flag == false)
            System.out.println("Element Not Present");
        else
            System.out.println("Element Present.");

        // More Optimal Method
        int i = 0, j = n - 1;
        boolean ele = false;
        while (i < m && j >= 0) {
            if (arr[i][j] == target) {
                ele = true;
                break;
            } else if (arr[i][j] > target)
                j--; // go left
            else
                i++; // go down
        }

        if (ele == false)
            System.out.println("Element Not Found.");
        else
            System.out.println("Element Found.");
    }
}
