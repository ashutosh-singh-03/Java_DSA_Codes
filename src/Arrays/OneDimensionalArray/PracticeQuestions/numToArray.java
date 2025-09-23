package Arrays.OneDimensionalArray.PracticeQuestions;

import java.util.Arrays;

public class numToArray {
    static int[] convertUsingString(int n) {
        if (n == 0)
            return new int[] { 0 };

        String s = "" + n;
        int len = s.length();

        int[] result = new int[len];
        int k = len - 1;

        while (n != 0) {
            result[k--] = n % 10;
            n /= 10;
        }
        return result;
    }

    static int[] convertUsingCount(int n) {
        if (n == 0)
            return new int[] { 0 };

        int temp = n, count = 0;
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        int[] result = new int[count];
        int index = count - 1;

        while (n != 0) {
            result[index] = n % 10;
            n /= 10;
            index--;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Using String: " + Arrays.toString(convertUsingString(1234)));
        System.out.println("Using String: " + Arrays.toString(convertUsingCount(12344)));
    }
}