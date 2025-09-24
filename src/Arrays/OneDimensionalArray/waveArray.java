package Arrays.OneDimensionalArray;

public class waveArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 8, 9, 10};

//        If given that the array is already sorted, if not, then sort the array first
        for (int i = 1; i < arr.length; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i - 1];
            arr[i - 1] = temp;
        }

        for (int i : arr) System.out.print(i + " ");
    }
}