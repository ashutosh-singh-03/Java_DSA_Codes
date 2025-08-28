package Recursion_Strings;

public class reverseOfString {
    static String reverseString(String s, int idx) {
        if (idx == s.length())
            return "";
        return reverseString(s, idx + 1) + s.charAt(idx);
    }

    static String reverseStringNoIdx(String s) {
        if (s.length() == 0)
            return "";
        return reverseStringNoIdx(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        String s = "abcd";
        System.out.println("Reverse: " + reverseString(s, 0));
        System.out.println("Reverse No Idx: " + reverseStringNoIdx(s));
    }
}
