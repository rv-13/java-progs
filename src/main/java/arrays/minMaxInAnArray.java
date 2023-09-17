package arrays;

import java.util.Arrays;

public class minMaxInAnArray {

    //Approach 1
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

    //Approach 2
    static int findMinByStream(int[] arr, int n) {
        return Arrays.stream(arr).min().getAsInt();
    }

    static int findMaxByStream(int[] arr, int n) {
        return Arrays.stream(arr).max().getAsInt();

    }

    //Approach 3
    static int getMin(int[] arr, int i, int n) {
        return (n == 1) ? arr[i] : Math.min(arr[i], getMin(arr, i + 1, n - 1));
    }

    static int getMax(int[] arr, int i, int n) {
        return (n == 1) ? arr[i] : Math.max(arr[i], getMax(arr, i + 1, n - 1));

    }

    public static void main(String[] args) {
        int[] arr = {9, 8, 3, 21, -555, 44};
        int n = arr.length;
//        System.out.println("Min:-" + findMin(arr, n));
//        System.out.println("Max:-" + findMax(arr, n));
//        System.out.println("Min:-" + findMinByStream(arr, n));
//        System.out.println("Max:-" + findMaxByStream(arr, n));
        System.out.println("Min:-" + getMin(arr, 0, n));
        System.out.println("Max:-" + getMax(arr, 0, n));
    }
}
