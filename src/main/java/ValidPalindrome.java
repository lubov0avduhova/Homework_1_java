package Homework_1;

public class ValidPalindrome {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String s) {
        String result = "";
        s = s.toLowerCase();
        if (s.length() < 1) {
            return true;
        }
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                result += s.charAt(i);
            }
        }
        for (int j = 0, k = result.length() - 1; j <= k; j++, k--) {
            if ((result.charAt(j) != result.charAt(k))) {
                return false;
            }
        }
        return true;
    }
}
