package collection.maps;

import java.util.HashMap;

public class HashMapIterationWithStreams {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("cars", 50);
        map.put("choppers", 10);
        map.put("Bikes", 30);

        map.entrySet().stream().forEach(e -> {
            System.out.format("key: %s, value: %d%n", e.getKey(), e.getValue());
            System.out.println(e.getKey() + e.getValue());
        });
    }
}
