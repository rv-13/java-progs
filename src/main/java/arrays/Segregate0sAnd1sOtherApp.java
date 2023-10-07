package arrays;

public class Segregate0sAnd1sOtherApp {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 0, 1, 1, 1, 1, 1, 0, 0, 0};
        int size = arr.length;
        seg(arr, size);
    }

    static void seg(int[] arr, int size) {
        int left = 0, right = size - 1;
        while (left < right) {
            while (arr[left] == 0 && left < right)
                left++;

            while (arr[right] == 1 && left < right)
                right--;

            /* If left is smaller than right then there is a 1 at left
               and a 0 at right.  Exchange arr[left] and arr[right]*/
            if (left < right) {
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }
        for (int i : arr)
            System.out.println(i);
    }


}
