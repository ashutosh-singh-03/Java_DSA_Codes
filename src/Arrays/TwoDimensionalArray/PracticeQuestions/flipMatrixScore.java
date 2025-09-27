package Arrays.TwoDimensionalArray.PracticeQuestions;

public class flipMatrixScore {
    public static void print(int[][] arr) {
        for (int[] ele : arr) {
            for (int i : ele) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // We have to maximize the sum of the binary values of the matrix
        int[][] arr = {{0, 0, 1, 1}, {1, 0, 1, 0}, {1, 1, 0, 0}};
        int m = arr.length, n = arr[0].length;

        System.out.println("Original Array: ");
        print(arr);

        // Make the 0th position as 1
        for (int i = 0; i < m; i++) {
            if (arr[i][0] == 0) { // flip that row
                for (int j = 0; j < n; j++) {
                    arr[i][j] = 1 - arr[i][j];
                }
            }
        }

        System.out.println("After Row Flipping: ");
        print(arr);

        // flip those columns where no of 0s > 1s
        for (int j = 1; j < n; j++) {
            int zeroCount = 0;
            for (int[] ints : arr) {
                if (ints[j] == 0)
                    zeroCount++;

            }
            if (zeroCount > m / 2) {
                for (int i = 0; i < m; i++) {
                    arr[i][j] = 1 - arr[i][j];
                }
            }
        }

        System.out.println("Final Array: ");
        print(arr);

        int score = 0;
        for (int[] ints : arr) {
            int rowValue = 0;
            for (int j = 0; j < n; j++) {
                rowValue = rowValue * 2 + ints[j]; // Convert row to decimal
                // OR
                // rowValue += arr[i][j] * Math.pow(2, n - j - 1);
            }
            score += rowValue;
        }

        System.out.println("Final Score: " + score);
    }
}