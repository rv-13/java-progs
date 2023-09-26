package strings;

import java.util.ArrayList;
import java.util.List;

public class ReverseStringPreserveSpace {

    public static void main(String[] args) {
        String input = "My Name is Ironman";
        char[] temparray = input.toCharArray();
        int left, right = 0;
        right = temparray.length - 1;

        for (left = 0; left < right; left++, right--) {
            // Swap values of left and right
            char temp = temparray[left];
            temparray[left] = temparray[right];
            temparray[right] = temp;
        }

        for (char c : temparray)
            System.out.print(c);
        System.out.println();
        /*public static void reverseString ( char[] arr, int left, int right){
            for (left = 0; left < right; left++, right--) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
            List<Character> ls = new ArrayList<>();
            for (char c : arr)
                ls.add(c);
            System.out.println(ls);

        }*/
    }
}
