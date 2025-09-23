package Sorting.PracticeQuestions;

//PS - An array with distinct elements, convert the elements to come in range 0 to N - 1. The
// order of the elements is same, i.e. 0 for smallest, 1 for 2nd smallest.... N - 1 for largest.
public class rankTransformation {
    public static void printArray(int[] arr) {
        for (int i : arr) System.out.print(i + " ");
        System.out.println();
    }

    public static void transformArray(int[] arr) {
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            int min = Integer.MAX_VALUE, minIdx = -1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < min && arr[j] > 0) {
                    min = arr[j];
                    minIdx = j;
                }
            }
            arr[minIdx] = x;
            x--;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] *= -1;
        }
    }

    public static void main(String[] args) {
        int[] arr = {54, 11, 28, 91, 47, 63};
        System.out.print("Original Array: ");
        printArray(arr);

        transformArray(arr);

        System.out.print("Transformed Array: ");
        printArray(arr);
    }
}