package Arrays.TwoDimensionalArray.PracticeQuestions;

public class wavePrint {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int m = arr.length;
        int n = arr[0].length;

        System.out.println("Original Array: ");
        for (int[] ele : arr) {
            for (int i : ele) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nVariation One: ");
        for (int i = 0; i < m; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }

        System.out.println("\nVariation Two: ");
        for (int i = 0; i < m; i++) {
            if (i % 2 == 0) {
                for (int j = n - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }

        System.out.println("\nVariation Three: ");
        for (int j = 0; j < n; j++) {
            if (j % 2 == 0) {
                for (int i = m - 1; i >= 0; i--) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                for (int[] ints : arr) {
                    System.out.print(ints[j] + " ");
                }
            }
        }

        System.out.println("\nVariation Four: ");
        for (int j = 0; j < n; j++) {
            if (j % 2 == 0) {
                for (int[] ints : arr) {
                    System.out.print(ints[j] + " ");
                }
            } else {
                for (int i = m - 1; i >= 0; i--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}