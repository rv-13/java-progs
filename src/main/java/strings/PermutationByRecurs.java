package strings;

public class PermutationByRecurs {
    public static void main(String[] args) {
        String str = "ABCDEF";
        permuteString(str, "");

    }

    static void permuteString(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans + "");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            String remOfString = str.substring(0, i) +
                    str.substring(i + 1);
            //recursive call
            permuteString(remOfString, ans + ch);
        }

    }
}
