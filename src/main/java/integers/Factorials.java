package integers;

public class Factorials {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    static int factorial(int N) {
        int res = 1;
        for (int i = 2; i <= N; i++) {
            res *= i;
        }
        return res;
    }
}
