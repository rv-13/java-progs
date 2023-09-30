package strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseIndividualWordsStreams {
    public static void main(String[] args) {
        String str = "My Name Is SuperMan";
        String res = Arrays.asList(str.split(" ")).stream().map(s -> new StringBuilder(s).reverse())
                .collect(Collectors.joining(" "));
        System.out.println("Input:" + str);
        System.out.println("Output:" + res);

    }
}
