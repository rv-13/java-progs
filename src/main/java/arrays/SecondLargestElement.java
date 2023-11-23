package arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int second;
        int[] arr = {1, 4, 5, 8, 9, 30, 87};
        int largest = second = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest)
                largest = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != largest && arr[i] > second)
                second = arr[i];
        }
        System.out.print(second);

    }
}
