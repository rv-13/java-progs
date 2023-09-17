package arrays;

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

    public static void main(String[] args) {
        int[] arr = {9, 8, 3, 21, 333, 44};
        int n = arr.length;
        System.out.println("Min:-" + findMin(arr, n));
        System.out.println("Max:-" + findMax(arr, n));
    }
}
