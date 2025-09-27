package Sorting;

public class bubbleSortReverse {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void bubbleOptimizedDescending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) { // For descending order
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }
            // If no swapping occurred, array is already sorted
            if (!swapped)
                break;
        }
        System.out.println("Sorted Array (Descending): ");
        printArr(arr);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 5, 7};

        System.out.println("Original Array: ");
        printArr(arr);

        bubbleOptimizedDescending(arr);
    }
}