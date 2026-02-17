package ExceptionHandling;

public class ArrayDemo {

    public static void main(String[] args) {
        int[] a = new int[5];

        a[0] = 23;
        a[1] = 44;
        a[2] = 11;
        a[3] = 18;
        a[4] = 36;
        a[5] = 36;

        for (int i=0 ; i<a.length ; i++)
            System.out.println(a[i]);
    }
}
