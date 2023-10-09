package core.oops;

public class Encapsulation {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Rv");
        person.setAge(28);
        System.out.println(person.getAge());
        System.out.println(person.getName());

    }
}

class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

