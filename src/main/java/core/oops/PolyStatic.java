package core.oops;

public class PolyStatic {
    public static void main(String[] args) {
        System.out.println(Helper.multiply(2, 3));
        System.out.println(Helper.multiply(2.9, 3.9));
    }

    class Helper {

        static int multiply(int a, int b) {
            System.out.println("Static Binding/Method Overloading");
            return a * b;
        }

        static double multiply(double a, double b) {
            System.out.println("Static Binding/Method Overloading");
            return a * b;
        }
    }
}
