package ClassesNConstructors.Inheritance.Abstraction;

public abstract class AbstractClass {

    abstract void start();
    abstract void run();

    void display()
    {
        System.out.println("display");
    }
}

class  ChildAbstract extends AbstractClass
{

    @Override
    void start() {
        System.out.println("start");
    }

    @Override
    void run() {
        System.out.println("run");
    }

    public static void main(String[] args) {

        AbstractClass ob = new ChildAbstract();

        ob.run();
        ob.start();
        ob.display();
    }
}
