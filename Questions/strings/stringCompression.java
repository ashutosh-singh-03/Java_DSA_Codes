import java.util.Scanner;

public class stringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        char[] arr = s.toCharArray();
        String ans = "";

        int i = 0, j = 0;
        while (j < arr.length) {
            if (arr[i] == arr[j])
                j++;
            else {
                ans += arr[i];
                int len = j - i;
                if (len > 1)
                    ans += len;
                i = j;
            }
        }
        ans += arr[i];
        int len = j - i;
        if (len > 1)
            ans += len;
        System.out.println("Compressed String: " + ans);

        sc.close();

        // using stringbuilder is more efficient
    }
}
