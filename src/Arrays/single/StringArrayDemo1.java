package Arrays.single;

public class StringArrayDemo1 {

    public static void main(String[] args) {

        String[] stArr = new String[5];

        stArr[0] = "Aarav";
        stArr[1] = "Rohit";
        stArr[2] = "Priya";
        stArr[3] = "Ananya";
        stArr[4] = "Suresh";

        System.out.println(stArr[2]);
        System.out.println("length= "+stArr.length);

        System.out.println("Below is the array ");

        for (int i=0 ; i<5 ; i++)
            System.out.println(stArr[i]);
    }
}
