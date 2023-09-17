package arrays;

public class findAPeakInAGivenArray {

    static int findPeak(int[] arr, int n) {
        if (arr.length == 0) return 0;
        if (arr[0] >= arr[1]) return 0;
        if (arr[n - 1] >= arr[n - 2])
            return n - 1;
        for (int i = 1; i < n - 1; i++) {
            // Check if the neighbors are smaller
            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1])
                return i;
        }
        return 0;

    }


    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 1, 0 };
        System.out.println(findPeak(arr, arr.length));
    }
}
