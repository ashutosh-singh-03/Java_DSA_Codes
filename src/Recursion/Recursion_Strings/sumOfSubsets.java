package Recursion.Recursion_Strings;

public class sumOfSubsets {
    static void sumSubsets(int[] arr, int sum, int idx) {
        if (idx >= arr.length) {
            System.out.print(sum + " ");
            return;
        }

        // adding the current index to the sum
        sumSubsets(arr, sum + arr[idx], idx + 1);
        // not adding the current index to the sum
        sumSubsets(arr, sum, idx + 1);
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 5};
        System.out.print("Subset Sum: ");
        sumSubsets(arr, 0, 0);
    }
}