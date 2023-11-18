package strings;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "sTress";
        for (char c : str.toCharArray()) {
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                System.out.println(Character.toString(c));
                break;
            }
        }
    }
}
