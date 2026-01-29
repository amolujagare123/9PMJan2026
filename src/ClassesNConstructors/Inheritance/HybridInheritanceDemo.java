package ClassesNConstructors.Inheritance;

// Base class
class Animal2 {
    void eat() {
        System.out.println("Animal eats food");
    }
}

// Derived class 1 (Hierarchical)
class Mammal extends Animal2 {
    void walk() {
        System.out.println("Mammal walks");
    }
}

// Derived class 2 (Hierarchical)
class Reptile extends Animal2 {
    void crawl() {
        System.out.println("Reptile crawls");
    }
}

// Derived class of Mammal (Multilevel)
class Tiger extends Mammal {
    void roar() {
        System.out.println("Tiger roars");
    }
}

// Main class
public class HybridInheritanceDemo {
    public static void main(String[] args) {

        // Animal object
        Animal2 a = new Animal2();
        a.eat();

        System.out.println("-----");

        // Mammal object
        Mammal m = new Mammal();
        m.walk();
        m.eat();

        System.out.println("-----");

        // Reptile object
        Reptile r = new Reptile();
        r.crawl();
        r.eat();

        System.out.println("-----");

        // Tiger object
        Tiger t = new Tiger();
        t.roar();
        t.walk();
        t.eat();
    }
}

