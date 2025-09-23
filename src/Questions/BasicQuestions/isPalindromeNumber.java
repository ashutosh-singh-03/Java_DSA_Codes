package Practice.CoddyQuestions;

class isPalindromeNumber {
    static boolean isPalindromeUsingString(int num) {
        if (num >= 0 && num < 10)
            return true;

        String s = Integer.toString(num);
        char[] ch = s.toCharArray();

        int left = 0, right = ch.length - 1;
        while (left < right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;

            left++;
            right--;
        }

        String reversed = new String(ch);
        return s.equals(reversed);
    }

    static boolean isPalindrome(int num) {
        if (num < 0)
            return false;

        int original = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(01210));
        System.out.println(isPalindrome(121));
        System.out.println(isPalindromeUsingString(12131));
        System.out.println(isPalindromeUsingString(121));
        System.out.println(isPalindromeUsingString(01210));
    }
}
