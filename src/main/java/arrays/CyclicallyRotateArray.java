package arrays;

import java.util.Arrays;

public class CyclicallyRotateArray {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5};
        reArrange(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reArrange(int[] arr) {
        int n = arr.length;
        int lastELe = arr[n - 1], i;
        for (i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = lastELe;
    }
}
