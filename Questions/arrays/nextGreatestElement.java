package Questions.arrays;

public class nextGreatestElement {
    public static void main(String[] args) {
        // Method 1 - Brute Force
        int[] arr1 = { 12, 8, 41, 37, 2, 49, 16, 28, 21 };
        int n = arr1.length;
        int[] ans1 = new int[n];
        ans1[n - 1] = -1;

        for (int i = 0; i < n - 1; i++) {
            int mx = Integer.MIN_VALUE;
            for (int j = i + 1; j < n; j++) {
                mx = Math.max(mx, arr1[j]);
            }
            ans1[i] = mx;
        }
        System.out.println("\nMethod 1:");
        for (int ele : arr1) {
            System.out.print(ele + " ");
        }
        System.out.println();
        for (int ele : ans1) {
            System.out.print(ele + " ");
        }

        // Method 2 - Optimized
        int[] arr2 = { 12, 8, 60, 37, 2, 49, 16, 28, 21 };
        int m = arr2.length;
        int[] ans2 = new int[m];
        ans2[n-1] = -1;
        int nge = arr2[m - 1];
        for (int i = n - 2; i >= 0; i--) {
            ans2[i] = nge;
            nge = Math.max(nge, arr2[i]);
        }

        System.out.println("\nMethod 2:");
        for (int ele : arr2) {
            System.out.print(ele + " ");
        }
        System.out.println();
        for (int ele : ans2) {
            System.out.print(ele + " ");
        }
    }
}
