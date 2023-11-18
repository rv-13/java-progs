package strings;

public class IsPalindrome {
    public static void main(String[] args) {
        Integer n = 123344444;
        String str = "madamm";
        System.out.println(isPalind(str));
    }

    static boolean isPalind(String str) {
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;

        }
        return true;

    }
}
