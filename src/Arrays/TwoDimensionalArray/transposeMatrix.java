package Arrays.TwoDimensionalArray;

public class transposeMatrix {
    public static void print(int[][] arr) {
        for (int[] ele : arr) {
            for (int i : ele) System.out.print(i + " ");
            System.out.println();
        }
    }

    public static void swap(int[][] matrix, int i, int j, int x, int y) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[x][y];
        matrix[x][y] = temp;
    }

    public static void main(String[] args) {
        int[][] arr = {{12, 13}, {15, 66}, {18, 19}};
        int m = arr.length;
        int n = arr[0].length;

        // Matrix Transpose
        System.out.println("Original Array: ");
        print(arr);

        System.out.println("Transpose Of array: ");
        for (int j = 0; j < n; j++) {
            for (int[] ints : arr) System.out.print(ints[j] + " ");
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
        int[][] sq_matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Original Array: ");
        print(sq_matrix);

        for (int i = 0; i < sq_matrix.length; i++) {
            for (int j = 0; j <= i; j++) swap(sq_matrix, i, j, j, i);
        }
        System.out.println("Transpose: ");
        print(sq_matrix);
    }
}