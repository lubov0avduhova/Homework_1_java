package Homework_1;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String s = "  hello world  ";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        int nextSpaceIndex = 0;
        int wordStartIndex = 0;
        StringBuilder reversedSentence = new StringBuilder();

        while (nextSpaceIndex > -1) {
            nextSpaceIndex = s.indexOf(' ', wordStartIndex);
            if (nextSpaceIndex > -1)
                reversedSentence.insert(0, s.substring(wordStartIndex, nextSpaceIndex)).insert(0, ' ');
            else reversedSentence.insert(0, s.subSequence(wordStartIndex, s.length()));
            wordStartIndex = nextSpaceIndex + 1;
        }

        return reversedSentence.toString();
    }
}




