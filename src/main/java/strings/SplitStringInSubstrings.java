package strings;

import java.util.ArrayList;

public class SplitStringInSubstrings {
    public static void main(String[] args) {
        String str = "The car";

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                list.add(str.substring(i, j));
            }
        }
        System.out.println("Total No of Substrings:" + list.size());
        System.out.println(list);
    }
}

