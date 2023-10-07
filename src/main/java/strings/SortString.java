package strings;

public class SortString {
    public static void main(String[] args) {
        String str = "jhkdfgsfsjhfks";
        sortString(str);
    }

    static void sortString(String str) {
        int i = 0;
        int j = i + 1;
        char[] arr = str.toCharArray();
        while (i < arr.length) {
            while (j < arr.length) {
                if (arr[j] < arr[i]) {
                    char temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
                j += 1;
            }
            i += 1;
        }
        System.out.println(arr);

    }
}
