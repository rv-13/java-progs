package core.oops;

class PolyDynamic {
    public static void main(String[] args) {
        // Creating object of class 1
        Parent a;

        // Now we will be calling print methods
        // inside main() method

        a = new Subclass1();
        a.print();

        a = new Subclass2();
        a.print();
    }

}

class Parent {

    void print() {
        System.out.println("Parent Method");
    }
}

class Subclass1 extends Parent {
    void print() {
        System.out.println("Subclass1");
    }
}

class Subclass2 extends Parent {
    void print() {
        System.out.println("Subclass2");
    }
}
