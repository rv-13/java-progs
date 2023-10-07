package strings;

import java.util.Stack;

public class ReverseStringStacks {
    public static void main(String[] args) {
        String str = "My Name is Batman";
        System.out.println("Input:" + str);
        reverseStringStack(str);

    }

    static String reverseStringStack(String str) {
        Stack<Character> stack = new Stack<>();
        String resString = "";
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        while (!stack.isEmpty()) {
            resString += stack.pop();
        }
        System.out.println(resString);
        return resString;
    }
}
