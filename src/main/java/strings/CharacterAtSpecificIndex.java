package strings;

public class CharacterAtSpecificIndex {
    public static void main(String[] args) {
        String str = "I am IronNan";
        int index = 9;
        char ch = 'M';
        System.out.println(str.indexOf('N'));
        str = str.substring(0, index) + ch + str.substring(index + 1);
        //str.replace('N','M');
        //str.substring(0, index) + ch + str.substring(index + 1);
        System.out.println(str);
    }

}
