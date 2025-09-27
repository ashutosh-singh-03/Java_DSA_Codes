package Arrays.TwoDimensionalArray.PracticeQuestions;

public class matrixAddition {
    public static void main(String[] args) {
        int[][] mat1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] mat2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        if (mat1.length != mat2.length || mat1[0].length != mat2[0].length) {
            System.out.println("Error: Matrices must have the same dimensions for addition.");
            return;
        }

        int m = mat1.length;
        int n = mat1[0].length;
        // int[][] ans = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat1[i][j] += mat2[i][j];
            }
        }

        System.out.println("Resultant Matrix:");
        for (int[] row : mat1) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}