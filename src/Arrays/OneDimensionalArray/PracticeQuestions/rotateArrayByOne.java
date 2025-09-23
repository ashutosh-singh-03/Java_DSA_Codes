package Arrays.OneDimensionalArray.PracticeQuestions;

public class rotateArrayByOne {
    static int[] rotate(int[] arr) {
        int n = arr.length;
        if (n == 0)
            return arr;

        int last = arr[n - 1];
        for (int i = n - 1; i > 0; i--)
            arr[i] = arr[i - 1];
        arr[0] = last;

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        System.out.println("Original Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        int[] rotated = rotate(arr);
        System.out.println("\nRotated Array: ");
        for (int num : rotated) {
            System.out.print(num + " ");
        }
    }
}