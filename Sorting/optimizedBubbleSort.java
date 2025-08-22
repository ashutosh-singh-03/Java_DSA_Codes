public class optimizedBubbleSort {
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

        for (int x = 0; x < n - 1; x++) {
            boolean flag = true;
            for (int i = 0; i < n - 1 - x; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    flag = false;
                }
            }
            if (flag)
                break;
        }
        System.out.println("Sorted Array: ");
        printArr(arr);
    }
}
