package Arrays.OneDimensionalArray.PracticeQuestions;

public class sortArray01 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 1};
        int n = arr.length;

        // -------------------- Method 1: Counting Approach --------------------
        int zeros = 0;

        // Count number of 0s and 1s
        for (int num : arr) {
            if (num == 0)
                zeros++;
            else {
            }
        }

        // Overwrite the array based on count
        for (int i = 0; i < n; i++) {
            arr[i] = (i < zeros) ? 0 : 1;
        }

        // Print sorted array (Method 1)
        System.out.println("Method 1 (Counting Approach):");
        printArray(arr);

        // -------------------- Method 2: Two Pointer Approach --------------------
        int[] arr1 = {1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 1};
        int left = 0, right = arr1.length - 1;

        while (left < right) {
            // If left is already 0, move left pointer forward
            if (arr1[left] == 0) {
                left++;
            }
            // If right is already 1, move right pointer backward
            else if (arr1[right] == 1) {
                right--;
            }
            // Swap when left is 1 and right is 0
            else {
                int temp = arr1[left];
                arr1[left] = arr1[right];
                arr1[right] = temp;
                left++;
                right--;
            }
        }

        // Print sorted array (Method 2)
        System.out.println("\nMethod 2 (Two Pointer Approach):");
        printArray(arr1);
    }

    // Utility function to print an array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}