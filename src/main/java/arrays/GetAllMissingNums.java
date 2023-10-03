package arrays;

public class GetAllMissingNums {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        int diff = arr[0] - 0;
        findAllMissingNums(arr, diff);
    }

    static void findAllMissingNums(int[] arr, int diff) {
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] - i) != diff) {
                while (diff < (arr[i] - i)) {
                    System.out.println((i + diff) + " ");
                    diff++;
                }
            }

        }

    }

}
