package Methods;

public class MethodsReturning {

    int myMethod()
    {
        int a = 10;
        return a;
    }

    public static void main(String[] args) {
        MethodsReturning ob  = new MethodsReturning();

        int i ;
        i = 10 ; // i is as good as 10

        System.out.println(i);
        int x = i ;

        System.out.println("ob.myMethod()="+ob.myMethod());

        int y =  ob.myMethod();

        System.out.println("y="+y);


    }
}
