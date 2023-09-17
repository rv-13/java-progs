package arrays;

import java.util.Arrays;

public class minMaxInAnArray {
    static int findMin(int[] arr, int n) {
        int res = arr[0];
        for (int i = 0; i < n; i++) {
            res = Math.min(res, arr[i]);
        }
        return res;
    }

    static int findMax(int[] arr, int n) {
        int res = arr[0];
        for (int i = 0; i < n; i++) {
            res = Math.max(res, arr[i]);
        }
        return res;
    }

    static int findMinByStream(int[] arr, int n) {
        return Arrays.stream(arr).min().getAsInt();
    }

    static int findMaxByStream(int[] arr, int n) {
        return Arrays.stream(arr).max().getAsInt();

    }

    public static void main(String[] args) {
        int[] arr = {9, 8, 3, 21, -555, 44};
        int n = arr.length;
//        System.out.println("Min:-" + findMin(arr, n));
//        System.out.println("Max:-" + findMax(arr, n));
        System.out.println("Min:-" + findMinByStream(arr, n));
        System.out.println("Max:-" + findMaxByStream(arr, n));
    }
}
