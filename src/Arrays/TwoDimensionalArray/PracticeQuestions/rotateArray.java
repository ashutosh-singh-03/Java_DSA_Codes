package Arrays.TwoDimensionalArray.PracticeQuestions;

public class rotateArray {
    public static void print(int[][] arr) {
        for (int[] ele : arr) {
            for (int i : ele) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void swap(int[][] arr, int i, int j, int x, int y) {
        int temp = arr[i][j];
        arr[i][j] = arr[x][y];
        arr[x][y] = temp;
    }

    public static int[][] transpose(int[][] arr) {
        int n = arr.length;
        int[][] trans = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                trans[j][i] = arr[i][j]; // just flip row & column
            }
        }
        return trans;
    }

    public static void rotateClockWise(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int a = 0, b = arr.length - 1;
            while (a < b) {
                swap(arr, i, a, i, b);
                a++;
                b--;
            }
        }
    }

    public static void rotateCounterClockWise(int[][] arr) {
        for (int j = 0; j < arr.length; j++) {
            int a = 0, b = arr.length - 1;
            while (a < b) {
                swap(arr, a, j, b, j);
                a++;
                b--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr1 = {{0, 1, 2}, {3, 4, 7}, {6, 7, 8}};
        int[][] arr2 = {{0, 1, 2}, {3, 4, 7}, {6, 7, 8}};

        System.out.println("Original Array 1: ");
        print(arr1);
        System.out.println("Rotated Array ClockWise: ");
        rotateClockWise(arr1);
        print(arr1);


        System.out.println("Original Array 2: ");
        print(arr2);
        System.out.println("Rotated Array Counter Clockwise: ");
        rotateCounterClockWise(arr2);
        print(arr2);
    }
}