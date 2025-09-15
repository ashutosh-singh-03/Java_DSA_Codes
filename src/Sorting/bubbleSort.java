package Sorting;
public class bubbleSort {
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

    static void bubbleBruteForce(int[] arr) {
        // n - 1 passes approach, where n is the size of the array
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1])
                    swap(arr, j, j + 1);
            }
        }
        System.out.println("Sorted Array Method 2: ");
        printArr(arr);
    }

    static void bubbleOptimized(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) { // after each pass, comparisons are getting reduced
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }
            // If no swapping occurred, array is already sorted
            if (!swapped)
                break;
        }
        System.out.println("Sorted Array Method 3: ");
        printArr(arr);
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };

        System.out.println("Original Array: ");
        printArr(arr);

        bubbleBruteForce(arr);
        bubbleOptimized(arr);
    }
}
