package strings;

import java.util.Arrays;

public class LongestCommonPrefix {
    //
//    public String longestCommonPrefix(String[] a) {
//
//        int size = a.length;
//        if (size == 0)
//            return "";
//        if (size == 1)
//            return a[0];
//        Arrays.sort(a);
//        int end = Math.min(a[0].length(), a[size - 1].length());
//
//        /* find the common prefix between the first and
//           last string */
//        int i = 0;
//        while (i < end && a[0].charAt(i) == a[size - 1].charAt(i))
//            i++;
//
//        String pre = a[0].substring(0, i);
//        return pre;
//
//    }
    public String longestCommonPrefix(String[] str) {

        int length = str.length;
        String result = str[0];
        for (int i = 1; i < length; i++) {
            while (str[i].indexOf(result) != 0) {
                result = result.substring(0, result.length() - 1);
                if (result.isEmpty()) {
                    return "";
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {

        LongestCommonPrefix obj = new LongestCommonPrefix();
        String[] input = {"raviraviravi", "rav", "ravii", "ravii"};
        System.out.println("commonprefix:-" + obj.longestCommonPrefix(input));

    }
}
