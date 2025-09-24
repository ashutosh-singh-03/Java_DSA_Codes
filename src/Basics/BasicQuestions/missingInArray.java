package Basics.BasicQuestions;

// An array arr[] of size n - 1 with distinct integers in the range 1 to n (inclusive) is given.
// There is one number missing from the range 1 to n, return the missing number.
public class missingInArray {
    static int missingNum(int[] arr) {
        long n = arr.length + 1;
        long sum = 0;
        for (int j : arr) {
            sum += j;
        }

        long sum1 = (n * (n + 1)) / 2;
        return (int) (sum1 - sum);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        System.out.print(missingNum(arr));
    }
}