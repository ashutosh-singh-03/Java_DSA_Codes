package Recursion.Recursion_Arrays;

public class isSorted {
    static boolean sortedArrayByIteration(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i])
                return false;
        }
        return true;
    }

    static boolean sortedArrayByRecursion(int[] arr, int idx) {
        int n = arr.length;
        if (idx == n - 1) return true;
        return (arr[idx] <= arr[idx + 1]) && sortedArrayByRecursion(arr, idx + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Via Iteration, Sorted: " + sortedArrayByIteration(arr));
        System.out.println("Via Recursion, Sorted: " + sortedArrayByRecursion(arr, 0));
    }
}