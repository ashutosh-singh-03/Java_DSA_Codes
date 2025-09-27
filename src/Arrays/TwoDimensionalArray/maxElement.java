package Arrays.TwoDimensionalArray;

public class maxElement {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 15, 6}, {7, 8, 9}};
        int max = Integer.MIN_VALUE, a = 0, b = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    a = i;
                    b = j;
                }
            }
        }
        System.out.print("Largest Element: " + max + " at index: " + a + " " + b);
    }
}