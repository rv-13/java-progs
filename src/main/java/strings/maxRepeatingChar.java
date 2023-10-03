package strings;

public class maxRepeatingChar {
    public static void main(String[] args) {
        maxRepeat("aabbaaaacc");
    }

    static void maxRepeat(String str) {
        int count = 0;
        char currChar = str.charAt(0);
        for (int i = 0; i < str.length(); i++) {
            int currCount = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) != str.charAt(j))
                    break;
                currCount++;
            }
            if (currCount > count) {
                count = currCount;
                currChar = str.charAt(i);
            }

        }
        System.out.println("count:" + count);
        System.out.println("char:" + currChar);


    }
}
