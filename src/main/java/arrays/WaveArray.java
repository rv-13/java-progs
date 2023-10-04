package arrays;

import java.util.Arrays;

public class WaveArray {
    public static void main(String[] args) {
        int arr[] = {10, 90, 49, 2, 1, 5, 23};
        int n = arr.length;
        waveArray(arr, n);
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void waveArray(int[] arr, int n) {
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i += 2) {
            swap(arr, i, i + 1);
        }
        for (int i : arr) {
            System.out.println(i + " ");
        }
    }
}
