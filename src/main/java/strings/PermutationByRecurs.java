package strings;

import java.util.ArrayList;
import java.util.List;

public class PermutationByRecurs {
    public static void main(String[] args) {
        String str = "ABCD";
        permuteString(str, "");


    }

    static List<String> permuteString(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans + "");
            return new ArrayList<>();
        }
        List<String> ls = null;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            String remOfString = str.substring(0, i) +
                    str.substring(i + 1);
            //recursive call
            ls = new ArrayList<>();
            ls.add(permuteString(remOfString, ans + ch).toString());

        }
        return ls;
    }
}
