package strings;

public class ReverseStringExceptFirstWord {


    public static void main(String[] args) {
        String str = "his name is raveendra";
        String[] strArr = str.split(" ");
        String firstString = strArr[0] + " ";
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < strArr.length; i++) {
            sb.append(new StringBuilder(strArr[i]).reverse());
            sb.append(" ");
        }
        System.out.println(firstString.concat(sb.toString()));

    }


//input - his name is raveendra
//output - his eman si ardneevar

}
