package Arrays.single;

public class StringAnotherArrayDemo1 {

    public static void main(String[] args) {



        String[] stArr = {"Aarav","Rohit","Priya","Ananya","Suresh" };


        System.out.println("length= "+stArr.length);

        System.out.println("Below is the array ");

        for (int i=0 ; i< stArr.length ; i++)
            System.out.println(stArr[i]);

        System.out.println("Below is the array printed with for each loop");

        for (String str : stArr)
            System.out.println(str);
    }
}
