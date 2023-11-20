package integers;

public class Prime {
    public static void main(String[] args) {

        int i = 2;
        int n = 29;
        boolean flag = false;
        while (i <= n /2) {
            if (n % i == 0) {
                flag = true;
                break;
            }
            ++i;

        }
        if (!flag) {
            System.out.println("No is Prime");
        } else {
            System.out.println("NO isnot Prime");
        }
    }
}
