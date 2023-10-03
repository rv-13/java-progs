package arrays;

public class rotateArrayKthPosition {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        //Give the position
        int k = 6;//rotate from 4th postion {5,6,7,1,2,3,4}
        int[] res = new int[arr.length];
        rotateArray(arr, k, res);
    }

    static void rotateArray(int[] arr, int k, int[] res) {
        int a = 0;
        for (int i = k; i < arr.length; i++) {
            res[a++] = arr[i];
        }
        for (int i = 0; i < k; i++) {
            res[a++] = arr[i];
        }
        for (int i : res) {
            System.out.println(i);
        }
    }

}

