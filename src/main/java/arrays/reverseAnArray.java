package arrays;

public class reverseAnArray {

    static void reverseArray(int[] arr, int start, int end) {
        int temp = 0;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void printArray(int[] arr, int n) {

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 23, 4556, 6};
        int n = arr.length;
        printArray(arr, n);
        reverseArray(arr, 0, n - 1);
        System.out.println("After Reversal:-");
        printArray(arr, n);
    }
}
