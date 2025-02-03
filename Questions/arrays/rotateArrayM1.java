package Questions.arrays;

import java.util.Scanner;

public class rotateArrayM1 {
    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // to handle cases where n < k
        int[] temp = new int[n];

        // copying the last k elements to the beginning of temp
        for (int i = 0; i < k; i++) {
            temp[i] = arr[n - k + i];
        }

        // copying the first (n - k) elements to the next positions in temp
        for (int i = k; i < n; i++) {
            temp[i] = arr[i - k];
        }

        // copying back to arr
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.print("Enter the number of rotations: ");
        int k = sc.nextInt();

        rotate(arr, k);

        for (int i : arr) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}