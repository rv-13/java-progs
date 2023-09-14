package core.streams.terminaloperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamTerminalOps {
    public static void main(String[] args) {
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");

        System.out.println("============================");
        System.out.println("Stream.forEach()");
        memberNames.forEach(System.out::println);

        System.out.println("============================");
        System.out.println("Stream.collect()");

        List<String> memNameinUpper = memberNames.stream().sorted().map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(memNameinUpper);

        System.out.println("============================");
        System.out.println("Stream.match()");

        boolean matchedResult = memberNames.stream().anyMatch((s) -> s.startsWith("A"));
        System.out.println(matchedResult); //true

        matchedResult = memberNames.stream().allMatch((s) -> s.startsWith("A"));
        System.out.println(matchedResult); //false

        matchedResult = memberNames.stream().noneMatch((s) -> s.startsWith("A"));
        System.out.println(matchedResult);


        System.out.println("============================");
        System.out.println("Stream.count()");
        long totalMatched = memberNames.stream().filter((s) -> s.startsWith("A")).count();
        System.out.println(totalMatched);
        System.out.println("============================");
        System.out.println("Stream.reduce()");

        Optional<String> reduced = memberNames.stream().reduce((s1, s2) -> s1 + "#" + s2);
        System.out.println(reduced);


    }
}
