package collection.maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapEnhancedForLoop {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("cars", 50);
        map.put("choppers", 10);
        map.put("Bikes", 30);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.printf("Key %s,Value %d%n", pair.getKey(), pair.getValue());

        }
    }


}
