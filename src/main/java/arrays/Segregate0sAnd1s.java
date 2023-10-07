package arrays;

public class Segregate0sAnd1s {
    public static void main(String[] args) {
        int arr[] = new int[]{0, 1, 0, 1, 1, 1};
        int n = arr.length;


        //FirstApproach
        int countZeros = 0, countOnes = 0;
        for (int i = 0; i < n; i++)
            if (arr[i] == 0) countZeros++;
        for (int i = 0; i < countZeros; i++)
            arr[i] = 0;
        for (int i = countZeros; i < n; i++)
            arr[i] = 1;

        for(int i:arr)
            System.out.println(i);

    }
}
