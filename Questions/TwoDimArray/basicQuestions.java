package Questions.TwoDimArray;

public class basicQuestions {
    public static void main(String[] args) {
        int[][] arr = { { 12, 13, 14 }, { 15, 66, 17 }, { 18, 19, 20 } };
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
    }
}
