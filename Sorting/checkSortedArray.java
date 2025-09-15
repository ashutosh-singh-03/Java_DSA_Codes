public class checkSortedArray {
    static boolean sortedM1(int[] arr) {
        boolean isSorted = true;
        int i = 0;
        while (i + 1 < arr.length) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
            i++;
        }
        return isSorted;
    }

    static boolean sortedM2(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] arr1 = { 15, 2, 3, 4, 5 };

        System.out.println("Method 1");
        if (sortedM1(arr))
            System.out.print("The array is sorted.");
        else
            System.out.print("The array is not sorted.");

        System.out.println("\nMethod 2");
        if (sortedM2(arr1))
            System.out.print("The array is sorted.");
        else
            System.out.print("The array is not sorted.");
    }
}
