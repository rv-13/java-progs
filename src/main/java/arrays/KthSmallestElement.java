package arrays;

import java.util.Arrays;

public class KthSmallestElement {
    public static void main(String[] args) {

        int[] arr = {2, 4, 5, 6, 7, 3};
        int k = 3;
        System.out.println();
        System.out.println(kthElement(arr, k));
    }

    static int kthElement(int[] arr, int K) {
        Arrays.sort(arr);
        return arr[K - 1];
    }
}
