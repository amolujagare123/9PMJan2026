package ClassesNConstructors.Inheritance.Abstraction;

public interface InterfaceDemo {

     void start();
     void run();

    default void display()
    {
        System.out.println("display");
    }

    private void display2()
    {
        System.out.println("display2");
    }

    static void display3()
    {
        System.out.println("display3");
    }
}

class ChildInterface implements InterfaceDemo
{
    @Override
    public void start() {
        System.out.println("start");
    }

    @Override
    public void run() {
        System.out.println("run");
    }

    public static void main(String[] args) {

        InterfaceDemo ob = new ChildInterface();

        ob.start();
        ob.run();
        ob.display();
      //  ob.display2();
        InterfaceDemo.display3();
    }
}
