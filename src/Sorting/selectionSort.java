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

    public static void selectionSorting(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = Integer.MAX_VALUE, minIdx = -1;
            for (int j = i; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIdx = j;
                }
            }
            swap(arr, i, minIdx);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 13, 2, 1};
        System.out.println("Original Array: ");
        print(arr);
        selectionSorting(arr);
        System.out.println("Sorted Array: ");
        print(arr);
    }
}