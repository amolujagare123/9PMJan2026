package StaticNFinal;

public class Student2 {

    public int rno;
    String name;
    public static String college = "ITC";

    public void display() // non-static method
    {
        System.out.println("rno="+rno); // non-static - allowed
        System.out.println("name="+name); // non-static - allowed
        System.out.println("college="+college);//static - allowed
    }

    public static void staticMethod1()
    {
        System.out.println("staticMethod1");
      //  System.out.println("rno="+rno); // non-static - not allowed
     //   System.out.println("name="+name); // non-static -not  allowed
        System.out.println("college="+college);//static - allowed
        staticMethod2();//static - allowed
    //    display(); // non-static -not  allowed
    //    nonStaticMethod1(); // non-static -not  allowed
     //   nonStaticMethod2(); // non-static -not  allowed
    }

    public static void staticMethod2()
    {
        System.out.println("staticMethod2");
    }

    public void nonStaticMethod1()
    {
        System.out.println("nonStaticMethod1");
    }

    public void nonStaticMethod2()
    {
        System.out.println("nonStaticMethod2");
    }

    public static void main(String[] args) {

        Student2 s = new Student2();

        s.staticMethod1();
        s.staticMethod2(); // static method can be called using object

        Student2.staticMethod1(); // static method can be called using Class name
        Student2.staticMethod2();


    }
}
