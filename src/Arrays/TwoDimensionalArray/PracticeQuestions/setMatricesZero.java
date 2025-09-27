package Arrays.TwoDimensionalArray.PracticeQuestions;

// PS: Given an m*n integer matrix, if an element is 0, set its entire row and column to zero.
public class setMatricesZero {
    public static void print(int[][] arr) {
        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    // Method 1: Using a helper array
    public static void method1(int[][] arr) {
        int m = arr.length, n = arr[0].length;

        int[][] helper = new int[m][n];

        // Copy original array to helper array
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                helper[i][j] = arr[i][j];
            }
        }

        // Mark rows and columns to be set to zero
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (helper[i][j] == 0) {
                    // Set entire row and column to 0
                    for (int k = 0; k < n; k++) arr[i][k] = 0;
                    for (int l = 0; l < m; l++) arr[l][j] = 0;
                }
            }
        }

        System.out.println("Method 1: ");
        print(arr);
    }

    // Method 2: Using row and column marker arrays
    public static void method2(int[][] arr1) {
        int m = arr1.length;
        int n = arr1[0].length;

        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        // Mark rows and columns that need to be set to zero
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr1[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        // Set marked rows to zero
        for (int i = 0; i < m; i++) {
            if (row[i]) {
                for (int j = 0; j < n; j++) {
                    arr1[i][j] = 0;
                }
            }
        }

        // Set marked columns to zero
        for (int j = 0; j < n; j++) {
            if (col[j]) {
                for (int i = 0; i < m; i++) {
                    arr1[i][j] = 0;
                }
            }
        }

        System.out.println("Method 2: ");
        print(arr1);
    }

    // Method 3: Constant Space Optimization
    public static void method3(int[][] arr2) {
        int m = arr2.length;
        int n = arr2[0].length;

        boolean zeroRow = false, zeroCol = false;

        // Check if the first column contains zero
        for (int[] ints : arr2) {
            if (ints[0] == 0) {
                zeroCol = true;
                break;
            }
        }

        // Check if the first row contains zero
        for (int j = 0; j < n; j++) {
            if (arr2[0][j] == 0) {
                zeroRow = true;
                break;
            }
        }

        // Mark the first row and first column
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (arr2[i][j] == 0) {
                    arr2[i][0] = 0;
                    arr2[0][j] = 0;
                }
            }
        }

        // Traverse the first row and column to set required cells to zero
        for (int j = 1; j < n; j++) {
            if (arr2[0][j] == 0) {
                for (int i = 1; i < m; i++) {
                    arr2[i][j] = 0;
                }
            }
        }
        for (int i = 1; i < m; i++) {
            if (arr2[i][0] == 0) {
                for (int j = 1; j < n; j++) {
                    arr2[i][j] = 0;
                }
            }
        }

        // If the first row needs to be zero, set it to zero
        if (zeroRow) {
            for (int j = 0; j < n; j++) {
                arr2[0][j] = 0;
            }
        }

        // If the first column needs to be zero, set it to zero
        if (zeroCol) {
            for (int i = 0; i < m; i++) {
                arr2[i][0] = 0;
            }
        }

        System.out.println("Method 3: ");
        print(arr2);
    }

    public static void main(String[] args) {
        int[][] arr1 = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        method1(arr1);

        int[][] arr2 = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        method2(arr2);

        int[][] arr3 = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        method3(arr3);
    }
}