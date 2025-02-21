package Questions.TwoDimArray;

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

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int m = arr.length;

        System.out.println("Original Array: ");
        print(arr);

        // Transpose
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <= i; j++) {
                swap(arr, i, j, j, i);
            }
        }
        System.out.println("Transposed Array: ");
        print(arr);

        // Rotation
        for (int i = 0; i < m; i++) {
            int a = 0, b = m - 1;
            while (a < b) {
                swap(arr, i, a, i, b);
                a++;
                b--;
            }
        }

        System.out.println("Rotated Array: ");
        print(arr);
    }
}
