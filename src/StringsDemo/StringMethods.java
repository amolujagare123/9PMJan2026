package StringsDemo;

public class StringMethods {

    public static void main(String[] args) {

        String str = "my name is Amol";

        System.out.println(str.endsWith("y")); // false

        System.out.println(str.startsWith("My")); // false

        System.out.println(str.contains("me")); //  true
    }
}
