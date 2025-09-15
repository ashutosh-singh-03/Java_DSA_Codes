package Questions.Arrays;

import java.util.Scanner;

public class rotateArrayM2 {
    public static void swap(int[] arr, int i, int j) {
        if (i != j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            while (i < j) {
                swap(arr, i++, j--);
            }
        }
    }

    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k %= n;

        if (k == 0)
            return;

        reverse(arr, 0, n - k - 1); // Reverse first part
        reverse(arr, n - k, n - 1); // Reverse second part
        reverse(arr, 0, n - 1); // Reverse entire array
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rotations: ");
        int k = sc.nextInt();

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        rotate(arr, k);

        for (int i : arr) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}
