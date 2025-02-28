public class isomorphicString {
    public static boolean isIsomorphic(String s, String t) {
        char[] a = new char[128]; // 128 to store all characters
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            char dh = t.charAt(i);
            int idx = (char) ch;

            if (a[idx] == '\0')
                a[idx] = dh;
            else {
                if (a[idx] != dh)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // 205
        String str1 = "paper";
        String str2 = "titsle";

        boolean flag = isIsomorphic(str1, str2);

        if (flag == false)
            System.out.println("Strings are not isomorphic.");
        else
            System.out.println("Strings are isomorphic.");
    }
}
