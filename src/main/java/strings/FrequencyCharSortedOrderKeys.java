package strings;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class FrequencyCharSortedOrderKeys {

    public static void main(String[] args) {
        String str = "naggaro";
        int temp = 0;
        char[] chars = str.toCharArray();

        //Sorting if using Hashmap , else in TREEMAP No need to Sort
//        for (int i = 0; i <= chars.length - 1; i++) {
//            for (int j = i + 1; j <= chars.length - 1; j++) {
//                if (chars[i] > chars[j]) {
//                    temp = chars[i];
//                    chars[i] = chars[j];
//                    chars[j] = (char) temp;
//                }
//            }
//        }

        String newStr = Arrays.toString(chars);
        System.out.println(newStr);
        //Treemap coz maintains Key insertion order in ascending
        TreeMap<Character, Integer> map = new TreeMap<>();
        for (int k = 0; k < chars.length - 1; k++) {
            //getOrDefault
            map.put(chars[k], map.getOrDefault(chars[k], 0) + 1);
            //conventional method
//            if (!map.containsKey(chars[k])) {
//                map.put(chars[k], 1);
//            } else {
//                map.put(chars[k], map.get(chars[k]) + 1);
//            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":-value: " + entry.getValue());
        }
        System.out.println(map.entrySet());
    }
    //[d=1, h=2, k=1, s=1, z=3] -- Treemap
//[s=1, d=1, h=2, z=3, k=1] -- HashMap
//[z=3, k=1, d=1, s=1, h=2] -- LinkedHash
//[s=1, d=1, h=2, z=3, k=1] -- ConcurrentMap
}



