public class stringMultiplier {
    static String mulWordWithoutSB(String s, int n) {
        if (n <= 0)
            return "";
        String result = "";
        for (int i = 0; i < n; i++) {
            result += s;
            if (i != n - 1)
                result += " ";
        }
        return result;
    }

    static String mulWordWithSB(String s, int n) {
        if (n <= 0)
            return "";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(s);
            if (i != n - 1)
                result.append(" ");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "Ashutosh";
        System.out.println("Without String Builder: " + mulWordWithoutSB(s, 4));
        System.out.println("Without String Builder: " + mulWordWithSB(s, 4));
    }
}
