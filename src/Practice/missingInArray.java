package Practice;

// You are given an array arr[] of size n - 1 that contains distinct integers in the range from 1 to n (inclusive). This array represents a permutation of the integers from 1 to n with one element missing. Your task is to identify and return the missing element.
public class missingInArray {
    static int missingNum(int arr[]) {
        long n = arr.length + 1;
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        long sum1 = (n * (n + 1)) / 2;
        return (int) (sum1 - sum);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5 };
        System.out.print(missingNum(arr));
    }
}
