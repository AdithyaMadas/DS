package com.madas.ds.Section6_Queues.Challenge;

public class Main {
    public static void main(String[] args) {
        String s = "I did, did I?";
        s = removeNonChars(s);
        Queue<Character> queue = new Queue<>();
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            queue.add(c);
            stack.add(c);
        }

        while (!queue.isEmpty()) {
            if (queue.remove() != stack.remove()) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }

    public static String removeNonChars(String s) {
        return s.replaceAll("\\W", "");
    }
}
