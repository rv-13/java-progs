package arrays;

public class GetMissingNo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3,5,6};
        int N = arr.length;
        System.out.println(missingNo(arr, N));
    }

    public static int missingNo(int[] arr, int n) {
        int sum = ((n + 1) * (n + 2)) / 2;//total sum of natural no
        for (int i = 0; i < n; i++) {
            sum -= arr[i]; // reducing each element from the total sum
        }
        return sum;
    }

}
