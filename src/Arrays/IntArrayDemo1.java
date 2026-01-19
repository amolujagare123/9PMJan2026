package Arrays;

public class IntArrayDemo1 {

    public static void main(String[] args) {

        int[] a = new int[5];

        a[0] = 23;
        a[1] = 44;
        a[2] = 11;
        a[3] = 18;
        a[4] = 36;

        System.out.println(a[2]);
        System.out.println("length= "+a.length);

        System.out.println("Below is the array ");

        for (int i=0 ; i<5 ; i++)
            System.out.println(a[i]);


    }
}
