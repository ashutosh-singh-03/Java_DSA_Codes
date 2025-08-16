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

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        int n = arr.length;

        System.out.println("Original Array: ");
        printArr(arr);

        // One Pass Approach - not always gives the sorted array
        // for (int i = 0; i < n - 1; i++) {
        // if (arr[i] > arr[i + 1])
        // swap(arr, i, i + 1);
        // }

        // n - 1 passes approach, where n is the size of the array
        // for (int i = 0; i < n - 1; i++) {
        // for (int j = 0; j < n - 1; j++) {
        // if (arr[j] > arr[j + 1])
        // swap(arr, j, j + 1);
        // }
        // }

        // n - 1 passes outside but reduced the number of passes inside the loop
        for (int x = 0; x < n - 1; x++) {
            for (int i = 0; i < n - 1 - x; i++) {
                if (arr[i] > arr[i + 1])
                    swap(arr, i, i + 1);
            }
        }
        System.out.println("Sorted Array: ");
        printArr(arr);
    }
}
