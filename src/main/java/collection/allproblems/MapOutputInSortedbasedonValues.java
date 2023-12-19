package collection.allproblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapOutputInSortedbasedonValues {

    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('B', 87);
        map.put('A', 5);
        map.put('G', 99);
        map.put('Z', 888);
        map.put('R', 94);

        map.forEach((key, value) -> System.out.println("Key:" + key+"\sValue:" + value));
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        System.out.println("After Sorting Output is:");
        list.forEach((x) -> System.out.println("Key:" + x.getKey() + "\sValue:" + x.getValue()));
    }
}
