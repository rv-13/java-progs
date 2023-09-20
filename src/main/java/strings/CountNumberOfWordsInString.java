package strings;

public class CountNumberOfWordsInString {
    public static void main(String[] args) {
        System.out.println(countWords("This\tis  not   properly formatted\t\tline \");\n"));
        System.out.println(countWords("I Love Java Programming"));


    }

    public static int countWords(String str) {
        String trimmedString = str.trim();
        return (trimmedString.isEmpty()) ? 0 : trimmedString.split("\\s+").length;
    }
}
