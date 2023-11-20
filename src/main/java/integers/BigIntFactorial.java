package integers;

import java.math.BigInteger;

public class BigIntFactorial {
    public static void main(String[] args) {
        int n = 40;
        System.out.println(factorial(n));

    }

    static BigInteger factorial(int n) {
        BigInteger big = new BigInteger("1");
        for (int i = 2; i < n; i++) {
            big = big.multiply(BigInteger.valueOf(i));
        }
        return big;
    }
}
