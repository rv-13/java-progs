package core.streams.streamoperations;

import java.util.ArrayList;
import java.util.List;

public class IntermediateOperations {
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

        System.out.println("Stream.filter():-");
        memberNames.stream().filter((s) -> s.startsWith("R"))
                .forEach(System.out::println);


        System.out.println("Stream.map():-");
        memberNames.stream().filter((s) -> s.startsWith("A"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println("Stream.sorted():-");
        memberNames.stream().sorted().map(String::toUpperCase).forEach(System.out::println);



    }
}
