package Strings.PracticeQuestions;

public class sumOfSubstringsOfNum {
    public static void main(String[] args) {
        String s = "421";
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                int num = Integer.parseInt(s.substring(i, j + 1));
                sum += num;
            }
        }
        System.out.println(sum);
    }
}