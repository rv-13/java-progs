package strings;

import java.util.SortedMap;

public class StringImmutabilityTest {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = s1;
        System.out.println(s1 == s2); // proof that s1 and s2 have same reference
        s1 = "Python";

       /* s1 value changed , how string is immutable??
        well, above new string  "Python" got created in the pool,
        s1 is now referring new String in the pool,
        But original string "Java"  is still unchanged and remains in the pool
        s2 is still referring to the original  String "Java" in the pool.

        */

//      Proof that s2 and s2  have different referrence now,
        System.out.println(s1 == s2);
        System.out.println("s1:-" + s1);
        System.out.println("s2:-" + s2);
        // prints "Java" supporting the fact that original String value is unchanged, hence String is immutable


    }
}
