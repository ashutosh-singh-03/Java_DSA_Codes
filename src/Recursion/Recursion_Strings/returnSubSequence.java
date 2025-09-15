package Recursion.Recursion_Strings;

import java.util.*;

public class returnSubSequence {
    static ArrayList<String> getSubSequence(String s) {
        ArrayList<String> ans = new ArrayList<>();
        if (s.length() == 0) {
            ans.add("");
            return ans;
        }

        ArrayList<String> smallAns = getSubSequence(s.substring(1));

        for (String ss : smallAns) {
            ans.add(ss);
            ans.add(s.charAt(0) + ss);
        }
        return ans;
    }

    static void printSubSequence(String s, String currSS) {
        if (s.length() == 0) {
            System.out.print(currSS + " ");
            return;
        }
        
        char curr = s.charAt(0);
        String remString = s.substring(1);
        // if the current character chooses to come in the String
        printSubSequence(remString, currSS + curr);
        // if the current character does not choose to come in the String
        printSubSequence(remString, currSS);
    }

    public static void main(String[] args) {
        System.out.println(getSubSequence("abc"));
        printSubSequence("abc", "");
    }
}
