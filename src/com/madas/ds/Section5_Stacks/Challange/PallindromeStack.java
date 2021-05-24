package com.madas.ds.Section5_Stacks.Challange;

public class PallindromeStack {
    public static void main(String[] args) {
        String toCheck = "I did, did I?";
        toCheck = removeNonChar(toCheck);
        System.out.println(isPalindrome(toCheck));
    }

    public static String removeNonChar(String s) {
        return s.replaceAll("\\W", "").toLowerCase();
    }

    public static boolean isPalindrome(String s) {
        int i;
        CharStacks stack = new CharStacks();

        for (i = 0; i < s.length()/2; i++) {
            stack.push(s.charAt(i));
        }
        for (; i < s.length(); i++) {
            if (s.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}
