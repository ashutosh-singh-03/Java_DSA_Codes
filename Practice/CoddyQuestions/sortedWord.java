public class sortedWord {
    public static String sort(String s) {
        int[] freq = new int[26];

        for (char c : s.toCharArray())
            freq[c - 'a']++; // c - 'a' converts the letter to an index from 0 to 25.

        StringBuilder sorted = new StringBuilder();
        for (int i = 0; i < freq.length; i++) {
            for (int j = 0; j < freq[i]; j++) {
                sorted.append((char) (i + 'a'));
            }
        }
        return sorted.toString();
    }

    public static void main(String[] args) {
        String word = "banana";
        System.out.println("Original Word: " + word);
        System.out.println("Sorted Word: " + sort(word));
    }
}
