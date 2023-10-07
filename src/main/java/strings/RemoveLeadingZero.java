package strings;

public class RemoveLeadingZero {
    public static void main(String[] args) {
        String str = "00000123569";
        System.out.println("inpput:" + str);
        System.out.println("output:" + removeZero(str));
    }

    static String removeZero(String str) {

        int i = 0;
        while (i < str.length() && str.charAt(i) == '0')
            i++;
        StringBuffer sb = new StringBuffer(str);
        sb.replace(0, i, "");

        return sb.toString();


    }
}
