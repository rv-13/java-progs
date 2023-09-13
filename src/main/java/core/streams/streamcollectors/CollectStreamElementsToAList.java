package core.streams.streamcollectors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectStreamElementsToAList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 500; i++) {
            list.add(i);
        }
        Stream<Integer> stream = list.stream();
        //filtering even nos bby filterofStream
        List<Integer> evenNumberList = stream.filter((i -> i % 2 == 0)).collect(Collectors.toList());
        System.out.println(evenNumberList);
    }
}
