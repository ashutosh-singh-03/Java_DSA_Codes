package Questions;

import java.util.Scanner;

public class rotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int n = arr.length;
        int res[] = new int[n];

        System.out.print("Enter the number of rotations: ");
        int k = sc.nextInt();

        // Method 1
        for (int i = n - k; i <= n; i++) {
            for (int j = 0; j < k; j++) {
                res[j] = arr[i];
            }
        }

        for (int i : res) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}
