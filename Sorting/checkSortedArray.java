public class checkSortedArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5};
        boolean isSorted = true;

        int i = 0;
        while (i + 1 < arr.length) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
            i++;
        }

        if (isSorted)
            System.out.print("The array is sorted.");
        else
            System.out.print("The array is not sorted.");
    }
}
