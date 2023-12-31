package core.streams.creatingstreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ListStream {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        Stream<Integer> stream = list.stream();
        stream.forEach(p -> System.out.println(p));
    }
}
