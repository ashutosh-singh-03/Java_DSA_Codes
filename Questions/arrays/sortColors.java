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

        // Method 2 - Dutch Flag Algorithm -- one pass
        // 3 pointer approach -- low, mid, high
        int[] arr1 = { 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2 };

        int low = 0, mid = 0, high = n - 1;
        while (mid <= high) {
            if (arr1[mid] == 0) {
                swap(arr1, low, mid);
                low++;
                mid++;
            } else if (arr1[mid] == 1)
                mid++;
            else {
                swap(arr1, mid, high);
                high--;
            }
        }

        System.out.println("\nMethod 2");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
