package Arrays.single;

public class CharArrayDemo {

    public static void main(String[] args) {

        char[] ch = {'S', 'u', 'j', 'i', 't'};

        System.out.println("Length of char array: " + ch.length);

        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);
        }

        System.out.println("Below is the array printed with for each loop");

        for (char c : ch )
            System.out.println(c);

    }
}