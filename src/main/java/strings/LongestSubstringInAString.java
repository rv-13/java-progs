package strings;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringInAString {
    public static void main(String[] args) {
//        String str = "TESTLONGESTSSUUBBSSTTRRIINNGG";
        String str = "RASQWERT";
        longestSubstring(str);
    }

    static void longestSubstring(String str) {
        int n = str.length();
        int l = 0, r = 0, maxL = 0, maxR = 0;
        int maxString = 0;
        Set<Character> visited = new HashSet<>();
        while (r < n) {
            if (!visited.contains(str.charAt(r))) {
                visited.add(str.charAt(r));
                if (r - l + 1 > maxString) {
                    maxString = r - l + 1;
                    maxL = l;
                    maxR = r;
                }
                r++;
            } else {
                visited.remove(str.charAt(l));
                l++;
            }
        }
        for (int i = maxL; i <= maxR; i++) {
            System.out.print(str.charAt(i));
        }
        System.out.println();

    }


}
