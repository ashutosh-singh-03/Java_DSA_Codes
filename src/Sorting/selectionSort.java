package Sorting;

public class selectionSort {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void selectionSortingSmallFirst(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = Integer.MAX_VALUE, minIdx = -1;
            for (int j = i; j < n; j++) {
                if (arr[j] < min) minIdx = j;
            }
            swap(arr, i, minIdx);
        }
    }

    public static void selectionSortingLargeFirst(int[] arr, int n) {
        for (int i = n - 1; i > 0; i--) {
            int max = Integer.MIN_VALUE, maxIdx = -1;
            for (int j = 0; j <= i; j++) {
                if (arr[j] > max) {
                    maxIdx = j;
                }
            }
            swap(arr, i, maxIdx);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 13, 2, 1};
        int n = arr.length;

        System.out.println("Original Array: ");
        print(arr);

        selectionSortingSmallFirst(arr, n);
        System.out.println("Sorted Array: ");
        print(arr);

        selectionSortingLargeFirst(arr, n);
        System.out.println("Sorted Array: ");
        print(arr);
    }
}