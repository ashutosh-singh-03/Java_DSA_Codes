package Arrays.OneDimensionalArray.PracticeQuestions;

import java.util.Scanner;

public class rotateArrayByK {
    public static void print(int[] arr) {
        for (int i : arr) System.out.print(i + " ");
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j) {
        if (i != j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            while (i < j) swap(arr, i++, j--);
        }
    }

    public static void rotateMethod1(int[] arr, int k) {
        int n = arr.length;
        k %= n;

        if (k == 0) return;

        reverse(arr, 0, n - k - 1); // Reverse first part
        reverse(arr, n - k, n - 1); // Reverse second part
        reverse(arr, 0, n - 1); // Reverse entire array
    }

    public static void rotateMethod2(int[] arr, int k) {
        int n = arr.length;
        k %= n; // to handle cases where n < k
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
        System.out.print("Enter the number of rotations: ");
        int k = sc.nextInt();

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        rotateMethod1(arr, k);
        print(arr);

        int[] arr1 = {1, 2, 4, 5, 16, 7, 81, 19};
        rotateMethod2(arr1, k);
        print(arr1);

        sc.close();
    }
}