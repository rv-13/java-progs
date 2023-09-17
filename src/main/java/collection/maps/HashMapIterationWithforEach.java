package collection.maps;

import java.util.HashMap;

public class HashMapIterationWithforEach {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("cars", 50);
        map.put("choppers", 10);
        map.put("Bikes", 30);
        map.forEach((k, v) -> {
            System.out.println("keys:-" + k + "values:-" + v);
        });

    }
}
