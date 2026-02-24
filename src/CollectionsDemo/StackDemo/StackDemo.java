package CollectionsDemo.StackDemo;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        Stack<String> s = new Stack<>();

        s.push("amol");
        s.push("rahul");
        s.push("srisha");
        s.push("aarsi");
        s.push("sarika");
        s.push("nandkumar");

        System.out.println(s);
        s.pop();
        System.out.println(s);
        s.pop();
        System.out.println(s);
    }

}
