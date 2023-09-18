package collection.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIterator2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("cars", 50);
        map.put("choppers", 10);
        map.put("Bikes", 30);

        for (Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
             it.hasNext(); ) {
            Map.Entry<String, Integer> pair = it.next();
            System.out.printf("Key %s Value %d%n", pair.getKey(), pair.getValue());


        }

    }
}
