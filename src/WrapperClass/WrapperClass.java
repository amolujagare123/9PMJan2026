package WrapperClass;

public class WrapperClass {

    public static void main(String[] args) {


        int i = 5;

       // Integer ii = new Integer(5); // wrapping /  boxing

        Integer ii1 = 5; // auto wrapping / auto boxing
        Integer ii2 = i;

        System.out.println("i="+i);
        System.out.println("ii1="+ii1);
        System.out.println("ii2="+ii2);

        // unwrapping or unboxing

        int a1 = ii1.intValue();

        System.out.println("a1="+a1);

        // auto unwrapping or auto unboxing
        int a2 = ii1;
        System.out.println("a2="+a2);
    }
}
