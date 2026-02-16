package Methods;

public class MethodsWithArguments {

    void method1()
    {
        System.out.println("no arguments");
    }

    void method2(int a)
    {
        System.out.println("a="+a);
    }
    void method3(int a,int b,String str)
    {
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("str="+str);
    }
    void printMyArray(int[] ar)
    {
        for (int a:ar)
            System.out.println(a);
    }

    void printMy2DArray(String[][] stArr)
    {
        for(int i=0 ; i< stArr.length;i++) {

            for (int j = 0; j < stArr[0].length; j++) {
                System.out.print(stArr[i][j]+"\t");
            }
            System.out.println();
        }
    }




    public static void main(String[] args) {

        MethodsWithArguments ob = new MethodsWithArguments();

        ob.method1();
        ob.method2(12);
        ob.method3(12,23,"amol");

        int[] a = {11,22,33,44,55,66};

        ob.printMyArray(a);

        String[][] ss = {
                {"Amit", "Rahul", "Suresh"},
                {"Priya", "Neha", "Anjali"},
                {"Rohit", "Vikram", "Kunal"},
                {"Sneha", "Pooja", "Kavita"}
        };

        ob.printMy2DArray(ss);
    }
}
