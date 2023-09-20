package strings;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DistinctCharactersCount {
    public static void main(String[] args) {
        printDistinctCharWithCountByMap("raviiii");
        printDistinctCharWithCountByStreamOps("llaalalalalala");

    }

    static void printDistinctCharWithCountByMap(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (Character c : str.toCharArray()) {
            map.merge(c, 1, Integer::sum);
        }
        System.out.println(map);

    }

    static void printDistinctCharWithCountByStreamOps(String str) {
        Map<Character, Integer> map = new HashMap<>();
        List<Character> list = str.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        list.stream().forEach((c -> map.merge(c, 1, Integer::sum)));
        System.out.println(map);

    }
}
