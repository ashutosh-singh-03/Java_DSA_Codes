package Arrays.TwoDimensionalArray;

//Find the min element from all the max elements of each row
public class minOfMaxElements {
    public static void main(String[] args) {
        int[][] arr = {{2, 8, 3, 4, 7}, {7, 2, 1, 6, 3}, {5, 5, 4, 1, 4}, {3, 1, 8, 2, 6}};
        int minEle = Integer.MAX_VALUE;

        for (int[] ints : arr) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < arr[0].length; j++) {
                if (ints[j] > max) max = ints[j];
            }
            minEle = Math.min(minEle, max);
        }
        System.out.println("Min Element: " + minEle);
    }
}