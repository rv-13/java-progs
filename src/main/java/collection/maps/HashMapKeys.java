package collection.maps;

import java.util.HashMap;
import java.util.Set;

public class HashMapKeys {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("cars", 50);
        map.put("choppers", 10);
        map.put("Bikes", 30);

        Set<String> keySet = map.keySet();

        keySet.forEach(System.out::println);

    }
}

