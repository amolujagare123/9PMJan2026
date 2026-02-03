package ClassesNConstructors.Inheritance.Polymorphism;

public class Addition {

    int a;
    int b;

    void add()
    {
        int c;
        c = a + b;
        System.out.println("c="+c);
    }

    void add(int x)
    {
        int c;
        c = a + x;
        System.out.println("c="+c);
    }

    void add(int x,int y)
    {
        int c;
        c = y + x;
        System.out.println("c="+c);
    }

    void add(double x,double y)
    {
        double c;
        c = y + x;
        System.out.println("c="+c);
    }

    void add(String x,String y)
    {
        String c;
        c = y + x;
        System.out.println("c="+c);
    }


    void add(int x,int y,int z)
    {
        int c;
        c = y + x + z;
        System.out.println("c="+c);
    }

    public static void main(String[] args) {

        Addition ob = new Addition();
        ob.add();
        ob.add(12);
        ob.add(12,45);
        ob.add(12,45,78);
        ob.add(12.45,56.89);
        ob.add("amol","Ujagare");


    }
}
