package Questions.arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int n = arr.length;

        System.out.println("Original Array:");
        output(arr);

        // Method 1
        for (int i = 0; i < n / 2; i++) {
            int j = n - 1 - i;
            swap(arr, i, j);
        }

        System.out.println("\nReversed Array with method 1: ");
        output(arr);

        // Method 2 - Using Pointers
        int i = 0, j = n - 1;
        while (i <= j) {
            swap(arr, i, j);
            i++;
            j--;
        }

        System.out.println("\nReversed Array after Method 2: ");
        output(arr);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void output(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
