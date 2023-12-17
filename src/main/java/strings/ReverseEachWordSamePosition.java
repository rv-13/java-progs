package strings;

public class ReverseEachWordSamePosition {
    public static void main(String[] args) {


        String[] str = "My Name Is SRK".split(" ");
        int length = str.length;
        String res = "";
        for (int i = 0; i < length; i++) {
            for (int j = str[i].length() - 1; j >= 0; j--) {
                res += str[i].charAt(j);
            }
            res += " ";
        }
        System.out.println(res);
    }
}
