package strings;

public class ReverseStringExceptFirstWord {


    public static void main(String[] args) {
        String str = "his name is Test";
        String[] strA = str.split(" ");
        String First = strA[0] + " ";
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < strA.length; i++) {

            sb.append(new StringBuilder(strA[i]).reverse());
            sb.append(" ");
        }
        System.out.println(First + sb.toString());
    }


//input - his name is Test
//output - his eman si tseT

}
