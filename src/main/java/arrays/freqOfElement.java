package arrays;

import java.util.HashMap;

public class freqOfElement {
    public static void main(String[] args) {
        int[] arr = {22, 3, 44, 55, 6, 6, 6, 7, 7, 7, 8, 8, 8};
        int x = 5;
        System.out.println(frequencyEle(arr, x));

    }

    static int frequencyEle(int[] arr, int x) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        return (map.containsKey(x)) ? map.get(x) : 0;
    }
}
