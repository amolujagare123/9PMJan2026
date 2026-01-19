package loops;

public class IncDecDemo1 {

    public static void main(String[] args) {

        int i = 10 ;
        System.out.println(i); // 10
        System.out.println(i++); // 10
        System.out.println(i); // 11
        System.out.println(++i); // 12
        System.out.println(i); // 12

        /*
 a++ , a- - : first the statement
  is executed then increment or decrement happens

++a , - - a :  first the increment or decrement happens
then the statement is executed
         */
    }
}
