package Arrays.OneDimensionalArray.PracticeQuestions;

// Write a function named alternate that gets two arrays of integers and returns an array that is
// a combination of the arrays alternating.
public class alternatingArray {
    static int[] alternate(int[] arr1, int[] arr2) {
        int m = arr1.length, n = arr2.length;
        int[] result = new int[m + n];

        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            result[k++] = arr1[i++];
            result[k++] = arr2[j++];
        }

        while (i < m)
            result[k++] = arr1[i++];
        while (j < n)
            result[k++] = arr2[j++];

        return result;
    }

    public static void main(String[] args) {
        int[] a = { 1, 3, 5 };
        int[] b = { 2, 4, 6, 8, 10 };

        int[] combined = alternate(a, b);
        for (int num : combined) {
            System.out.print(num + " ");
        }
    }
}