package Questions.Sorting;

// PS - to sort the array in decreasing order using bubble sort
public class sortDecreasingOrder {
    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = arr.length;

        print(arr);

        for (int x = 0; x < n - 1; x++) {
            boolean flag = true;
            for (int i = 0; i < n - 1 - x; i++) {
                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = false;
                }
            }
            if (flag == true)
                break;
        }

        print(arr);
    }
}
