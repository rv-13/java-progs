package collection.maps;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapIterator3KeySet {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("cars", 50);
        map.put("choppers", 10);
        map.put("Bikes", 30);

        Iterator<String> itr = map.keySet().iterator();
        while (itr.hasNext()) {
            String key = itr.next();
            System.out.printf("Key %s Value %d%n", key, map.get(key));
        }
    }
}
