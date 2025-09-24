package Arrays.OneDimensionalArray.PracticeQuestions;

public class mergeSortedArray {
    public static void main(String[] args) {
        int[] a = {11, 33, 42, 71};
        int[] b = {26, 54, 69, 81, 99};

        int[] arr = new int[a.length + b.length];

        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) arr[k++] = a[i++];
            else arr[k++] = b[j++];
        }

        while (j < b.length) arr[k++] = b[j++]; // now take elements from b only
        while (i < a.length) arr[k++] = a[i++]; // now take elements from an only

        for (int ele : arr) System.out.print(ele + " ");
    }
}