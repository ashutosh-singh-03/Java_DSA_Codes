package Questions.Strings;
import java.util.Scanner;

public class occurrenceOfCharBruteForce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        int countMax = 0;
        char charMax = ' ';

        char[] ch = input.toCharArray();

        for(int i = 0; i < ch.length; i++){
            int count = 0;
            for (int j = 0; j < ch.length; j++) {
                if(ch[i] == ch[j]) count++;
            }

            if(count > countMax){
                countMax = count;
                charMax = ch[i];
            }
        }

        System.out.println("Max Character is: " + charMax + " which occurred: " + countMax + " times.");

        sc.close();
    }
}
