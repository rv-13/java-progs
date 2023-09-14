package strings;

public class ReverseWords {

    public static void main(String[] args) {
        String s[] = "My name is Iron Man".split(" ");
        int length = s.length;
        String ans = "";
        for (int i = length - 1; i >= 0; i--) {
            ans += s[i] + " ";
        }
        System.out.println(ans.substring(0, ans.length() - 1));
    }

}
