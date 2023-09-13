package core.streams.creatingstreams;

import java.util.Random;
import java.util.stream.Stream;

public class StreamGenerateOrStreamIterate {
    public static void main(String[] args) {
        Stream<Integer> randomNums = Stream.generate(() -> (new Random()).nextInt(100));
        randomNums.limit(20).forEach(System.out::println);

    }
}
