package core.oops;

public class Interface implements interface1 {
    public static void main(String[] args) {
        Interface obj = new Interface();
        obj.display();
    }

    public void display() {
        System.out.println("Display Method");
    }
}

interface interface1 {
    final int a = 10;

    void display();
}
