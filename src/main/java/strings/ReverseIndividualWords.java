package strings;

import java.util.Stack;

public class ReverseIndividualWords {
    public static void main(String[] args) {
        String str = "My Name Is Batman";
        reverseWords(str);

    }

    public static void reverseWords(String str) {
        Stack<Character> characterStack = new Stack<>(); //LIFO:-Last In First Out

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);
            if (chr != ' ') {
                characterStack.push(chr);
            } else {
                while (characterStack.isEmpty() == false) {
                    System.out.print(characterStack.pop());
                }
                System.out.print(" ");
            }
        }
        // Since there may not be space after
        // last word.
        while (characterStack.isEmpty() == false) {
            System.out.print(characterStack.pop());
        }
    }
}
