package ClassesNConstructors.Inheritance;

// Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class of Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Child class of Dog (multilevel inheritance)
class BabyDog extends Dog {
    void weep() {
        System.out.println("BabyDog is weeping");
    }
}

// Main class
public class InheritanceDemo {
    public static void main(String[] args) {

        // Animal reference
        Animal a = new Animal();
        a.eat();
        // a.bark();  // ❌ Not allowed

        System.out.println("-----");

        // Dog reference
        Dog d = new Dog();
        d.bark();
        d.eat();

        System.out.println("-----");

        // BabyDog reference
        BabyDog bd = new BabyDog();
        bd.weep();
        bd.bark();
        bd.eat();
    }
}
