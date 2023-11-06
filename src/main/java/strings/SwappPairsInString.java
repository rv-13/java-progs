package strings;

//Remember to check if String is even/odd in length, if Odd last Char will be leftover.
public class SwappPairsInString {
    public static void main(String[] args) {
        String str = "JavaJw";
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length - 1; i += 2) {
            char temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;

        }
        System.out.println(new String(arr));
    }
}
