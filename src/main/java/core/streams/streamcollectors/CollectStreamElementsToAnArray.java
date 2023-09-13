package core.streams.streamcollectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectStreamElementsToAnArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 23; i++) {
            list.add(i);
        }
        Stream<Integer> stream = list.stream();
        Integer[] intArray = stream.filter(i -> i % 2 == 0).toArray(Integer[]::new);
        System.out.println(Arrays.toString(intArray));
    }
}
