package Questions.Arrays;

public class mergeSortedArray {
    public static void main(String[] args) {
        int[] a = { 11, 33, 42, 71 };
        int[] b = { 26, 54, 69, 81, 99 };

        int[] arr = new int[a.length + b.length];

        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                arr[k] = a[i];
                i++;
            } else {
                arr[k] = b[j];
                j++;
            }
            k++;
        }
        if (i == a.length) { // now take elements from b only
            while (j < b.length) {
                arr[k] = b[j];
                j++;
                k++;
            }
        }
        if (j == b.length) { // now take elements from a only
            while (i < a.length) {
                arr[k] = a[i];
                i++;
                k++;
            }
        }

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
