package ClassesNConstructors;

public class ParameterizedConstructor2 {

    int a;
    double d;
    char c;
    String str;

    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    // Parameterized Constructor with this operator
    ParameterizedConstructor2(int a, double d, char c, String str)
    {
        this.a = a;
        this.d = d;
        this.c = c;
        this.str = str;
    }

    public static void main(String[] args) {
        ParameterizedConstructor2 ob = new ParameterizedConstructor2(12,23.45,'h',"amol");
        ob.display();
    }
}
