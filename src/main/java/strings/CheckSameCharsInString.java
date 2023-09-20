package strings;

import java.util.Set;
import java.util.stream.Collectors;

public class CheckSameCharsInString {
    public static void main(String[] args) {
        sameCharsSet("abc", "bcsa");
        sameCharsSet("abc", "bca");
        sameCharsSet("222", "222");
    }

    public static void sameCharsSet(String s1, String s2) {

        Set<Character> set1 = s1.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
        Set<Character> set2 = s2.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
        System.out.println(set1.equals(set2));
    }

}
