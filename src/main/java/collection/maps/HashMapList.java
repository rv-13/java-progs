package collection.maps;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapList {
    public static void main(String[] args) {
        ArrayList<String> list = Stream.of("abc", "bcd").collect(Collectors.toCollection(ArrayList::new));
        Map<String, List<String>> map = new HashMap<>();
        map.put("colors", Arrays.asList("red", "black", "blue"));
        map.put("sizes", Arrays.asList("red", "black", "blue"));

        for (Map.Entry<String, List<String>> me : map.entrySet()) {
            String key = me.getKey();
            List<String> values = me.getValue();
            System.out.println("Key:-"+ key);
            System.out.println("Values");
            for (String value : values) {
                System.out.println(value);
            }
        }


    }
}
