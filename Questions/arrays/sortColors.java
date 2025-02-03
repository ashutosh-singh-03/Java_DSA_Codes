// Dutch Flag Algorithm
package Questions.arrays;

public class sortColors {
    public static void main(String[] args) {
        // Method 1 -> two pass solution
        int[] arr = { 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2 };
        int n = arr.length;
        int zeros = 0, ones = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                zeros++;
            if (arr[i] == 1)
                ones++;
        }

        for (int i = 0; i < n; i++) {
            if (i < zeros)
                arr[i] = 0;
            else if (i < zeros + ones)
                arr[i] = 1;
            else
                arr[i] = 2;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
