package arrays;

public class SubArraySum {
    public static void main(String[] args) {
        int arr[] = {15, 2, 4, 8, 9, 5, 10, 23};
        int n = arr.length;
        int sum = 23;
        subArrSum(arr, n, sum);
    }

    public static void subArrSum(int[] arr, int n, int sum) {
        for (int i = 0; i < n; i++) {
            int currSum = arr[i];
            if (currSum == sum) {
                System.out.println("Sum found at index"
                        + i);
                return;
            } else {
                for (int j = i + 1; j < n; j++) {
                    currSum += arr[j];
                    if (currSum == sum) {
                        System.out.println("Sum found at index"
                                + i + "and" + j);
                        return;
                    }
                }
            }
        }
        System.out.println("No subarray found");
        return;
    }
}
