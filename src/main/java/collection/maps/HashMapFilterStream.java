package collection.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapFilterStream {
    public static void main(String[] args) {
        Map<String, String> capitals = new HashMap<>();
        capitals.put("svk", "Bratislava");
        capitals.put("ger", "Berlin");
        capitals.put("hun", "Budapest");
        capitals.put("czk", "Prague");
        capitals.put("pol", "Warsaw");
        capitals.put("ita", "Rome");
        Map<String, String> filteringCapitals = capitals.entrySet().stream().filter(map -> map.getValue().startsWith("B"))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        filteringCapitals.entrySet().forEach(System.out::println);

    }
}