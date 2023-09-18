package collection.maps;

import java.util.Collection;
import java.util.HashMap;

public class HashMapValues {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("cars", 50);
        map.put("choppers", 10);
        map.put("Bikes", 30);

        Collection<Integer> values = map.values();
        values.forEach(System.out::println);
    }
}