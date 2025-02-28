import java.util.Arrays;

public class sortString {
    public static void main(String[] args) {
        // Strings have no funtion to directly sort, we can convert them to char array
        // then use the sort method
        String input = "Ashutosh";
        char[] ch = input.toCharArray();

        System.out.print("Original String: ");
        for (char c : ch) {
            System.out.print(c);
        }
        System.out.println();
        
        Arrays.sort(ch);
        
        System.out.print("Sorted String: ");
        for (char c : ch) {
            System.out.print(c);
        }
        System.out.println();
    }
}
