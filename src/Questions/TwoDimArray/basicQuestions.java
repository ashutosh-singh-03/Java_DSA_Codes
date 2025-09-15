package Questions.TwoDimArray;

public class basicQuestions {
    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void swap(int[][] matrix, int i, int j, int x, int y) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[x][y];
        matrix[x][y] = temp;
    }

    public static void main(String[] args) {
        int[][] arr = { { 12, 13 }, { 15, 66 }, { 18, 19 } };
        int m = arr.length;
        int n = arr[0].length;

        // 1. Largest element in array
        // 2. Sum of all elements
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int a = 0, b = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                max = Math.max(max, arr[i][j]);
                sum += arr[i][j];

                a = i;
                b = j;
            }
        }

        System.out.print("Largest Element: " + max + " at index: " + a + " " + b);
        System.out.print("\nSum of all elements: " + sum);

        // Matrix Transpose
        System.out.println("Original Array: ");
        print(arr);

        System.out.println("Transpose Of array: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }

        // Storing the transpose into new matrix
        System.out.println("Transpose in new matrix: ");
        int[][] trans = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                trans[i][j] = arr[j][i];
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }

        // Transforming the matrix to its transpose
        int[][] sq_matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println("Original Array: ");
        print(sq_matrix);

        for (int i = 0; i < sq_matrix.length; i++) {
            for (int j = 0; j <= i; j++) {
                swap(sq_matrix, i, j, j, i);
            }
        }
        System.out.println("Transpose: ");
        print(sq_matrix);
    }
}
