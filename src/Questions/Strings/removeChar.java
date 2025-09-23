package Questions.Strings;

// Remove the char at index i in string
public class removeChar {
    static String removeWithArray(String s, int i) {
        int n = s.length();

        if (i < 0 || i >= n)
            return s;

        char[] newCh = new char[n - 1];
        int k = 0;
        for (int j = 0; j < n; j++) {
            if (j == i)
                continue;
            newCh[k++] = s.charAt(j);
        }

        return new String(newCh);
    }

    static String removeWithSB(String s, int i) {
        int n = s.length();
        if (i < 0 || i >= n)
            return s;

        StringBuilder sb = new StringBuilder(s);
        sb.deleteCharAt(i);

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "Ashutosh";
        System.out.println("New String: " + removeWithArray(s, 4));
        System.out.println("New String: " + removeWithSB(s, 4));
    }
}