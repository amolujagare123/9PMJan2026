package ClassesNConstructors.Inheritance;
// Parent class
class Bird {
    void fly() {
        System.out.println("Bird can fly");
    }
}

// Child class 1
class Sparrow extends Bird {
    void sparrowColor() {
        System.out.println("Sparrow color is brown");
    }
}

// Child class 2
class Crow extends Bird {
    void crowColor() {
        System.out.println("Crow color is black");
    }
}

// Main class
public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {

        // Bird object
        Bird b = new Bird();
        b.fly();
        // b.sparrowColor(); // ❌ Not allowed
        // b.crowColor();   // ❌ Not allowed

        System.out.println("-----");

        // Sparrow object
        Sparrow s = new Sparrow();
        s.sparrowColor();
        s.fly();

        System.out.println("-----");

        // Crow object
        Crow c = new Crow();
        c.crowColor();
        c.fly();
    }
}

