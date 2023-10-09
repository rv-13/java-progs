package core.oops;

public class Abstraction {
    public static void main(String[] args) {
        Animal myDog = new Dog("Champ");
        Animal myCat = new Cat("Beggy");
        myDog.makeSound();
        myCat.makeSound();
    }

}

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeSound();

    public String getName() {
        return name;
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println(getName() + " Barks");
    }

}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println(getName() + " meows");
    }
}
