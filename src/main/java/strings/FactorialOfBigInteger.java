package strings;

import java.math.BigInteger;

public class FactorialOfBigInteger {
    public static void main(String[] args) {
        int N = 20;
        System.out.print(factorial(N));
    }

    static BigInteger factorial(int n) {
        BigInteger big = new BigInteger("1");
        for (int i = 2; i <= n; i++) {
            big = big.multiply(BigInteger.valueOf(i));
        }
        return big;
    }

}
