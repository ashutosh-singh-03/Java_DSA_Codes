package Strings.PracticeQuestions;

// PS - Given n string array, consisting of digits (0 - 9), return the string with max value.
public class maxIntString {
    public static String max(String a, String b) {
        String s = purify(a), t = purify(b);

        if (s.length() > t.length())
            return a;
        if (s.length() < t.length())
            return b;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                if (s.charAt(i) > t.charAt(i))
                    return a;
                else
                    return b;
            }
        }

        if (a.length() >= b.length())
            return a;
        else
            return b;
    }

    public static String purify(String a) {
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != '0')
                return a.substring(i);
        }
        return a;
    }

    public static void main(String[] args) {
        // Method 1 - by converting the string to integer
        // String[] arr = { "121121", "2323", "00232", "34343" };
        // int max = Integer.MIN_VALUE;

        // for (int i = 0; i < arr.length; i++) {
        // int n = Integer.parseInt(arr[i]);
        // max = Math.max(max, n);
        // }

        // System.out.println("The maximum value is: " + max);

        // Method 2
        String[] arr = { "121121", "2341323", "0023254512", "34343" };
        String maxS = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxS = max(maxS, arr[i]);
        }
        System.out.println(maxS);
    }
}