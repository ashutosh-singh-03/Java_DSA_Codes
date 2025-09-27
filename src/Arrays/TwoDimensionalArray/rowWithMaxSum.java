package Arrays.TwoDimensionalArray;


public class rowWithMaxSum {
    public static void main(String[] args) {
        int[][] arr = {{111, 22, 39}, {4, 5, 68}, {7, 8, 219}};
        int maxSum = Integer.MIN_VALUE, row = -1;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[0].length; j++) sum += arr[i][j];
            if (sum > maxSum) {
                maxSum = sum;
                row = i;
            }
        }
        System.out.println("Row Number: " + row + "\nSum: " + maxSum);
    }
}