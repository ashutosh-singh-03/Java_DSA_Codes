package Questions.arrays;

public class sortArray01 {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 1 };
        int n = arr.length;

        // Method 1
        int ones = 0, zeros = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                zeros++;
            else
                ones++;
        }

        for (int i = 0; i < n; i++) {
            if (i < zeros)
                arr[i] = 0;
            else
                arr[i] = 1;
        }

        System.out.println("Method 1");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        // method 2
        int[] arr1 = { 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 1 };
        int m = arr1.length;

        int i = 0, j = m - 1;

        while (i < j) {
            // If left is 0, move i forward
            if (arr1[i] == 0) {
                i++;
            }
            // If right is 1, move j backward
            else if (arr1[j] == 1) {
                j--;
            }
            // If left is 1 and right is 0, swap
            else {
                int temp = arr1[i];
                arr1[i] = arr1[j];
                arr1[j] = temp;
                i++;
                j--;
            }
        }

        System.out.println("\nMethod 2");
        for (int k : arr1) {
            System.out.print(k + " ");
        }
    }
}
