package Recursion.Recursion_Arrays;

class recursionArray {
    static void printArray(int[] arr, int idx) {
        if (idx == arr.length)
            return;
        System.out.print(arr[idx] + " ");
        printArray(arr, idx + 1);
    }

    static int maximumElement(int[] arr, int idx) {
        if (idx == arr.length - 1)
            return arr[idx];
        return Math.max(arr[idx], maximumElement(arr, idx + 1));
    }

    static int minimumElement(int[] arr, int idx) {
        if (idx == arr.length - 1)
            return arr[idx];
        return Math.min(arr[idx], minimumElement(arr, idx + 1));
    }

    static int sumOfElements(int[] arr, int idx) {
        if (idx == arr.length)
            return 0;
        return arr[idx] + sumOfElements(arr, idx + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5};
        printArray(arr, 0);
        System.out.print("\nMaximum Element: " + maximumElement(arr, 0));
        System.out.print("\nMinimum Element: " + minimumElement(arr, 0));
        System.out.print("\nSum of Elements: " + sumOfElements(arr, 0));
    }
}