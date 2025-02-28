import java.util.Scanner;

public class reverseWordsOfSentence {
    public static void reverse(StringBuilder sb, int i, int j) {
        while (i <= j) {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Sentence: ");
        StringBuilder sentence = new StringBuilder(sc.nextLine());
        int n = sentence.length();

        int i = 0, j = 0;
        while (j < n) {
            if (sentence.charAt(j) != ' ')
                j++;
            else {
                reverse(sentence, i, j - 1);
                i = j + 1;
                j = i;
            }
        }
        reverse(sentence, i, j - 1); // for last word
        System.out.println(sentence);

        sc.close();
    }
}
