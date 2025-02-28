import java.util.Scanner;

public class toggleCharactersSB {
    public static void main(String[] args) {
        // Ques. Input a string and toggle all the characters of it i.e. replace lower
        // case with upper case and vice-versa.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        StringBuilder str = new StringBuilder(sc.nextLine());
        int n = str.length();

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;
            if (ascii >= 65 && ascii <= 90) { // capital letter
                ascii += 32;
            } else if (ascii >= 97 && ascii <= 122) { // capital letter
                ascii -= 32;
            }
            ch = (char) ascii;
            str.setCharAt(i, ch);
        }
        System.out.println("Toggled String: " + str);
        sc.close();
    }
}
