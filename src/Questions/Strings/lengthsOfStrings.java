package Questions.Strings;

public class lengthsOfStrings {
    static int[] lens(String[] arr) {
        int[] result = new int[arr.length];
        int k = 0;
        for (String i : arr) {
            result[k++] = i.length();
        }
        return result;
    }

    public static void main(String[] args) {
        String[] arr = { "How", "are", "you", "Ashutosh" };
        int[] result = lens(arr);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}