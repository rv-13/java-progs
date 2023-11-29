package strings;

public class StringIsPanagram {
    //If String comtains all the a-z characters is a PANAGRAM
    public static void main(String[] args) {
        String str = "Abcdefgijklmnopqrstuvwxyz12";
        str = str.toLowerCase();
        boolean allLetterPresent = true;
        for (char ch = 'a'; ch < 'z'; ch++) {
            if (!str.contains(String.valueOf(ch))) {
                allLetterPresent = false;
                break;
            }
        }
        if (allLetterPresent)
            System.out.println("String is Panagram");
        else
            System.out.println("String is not Panagram");
    }
}
