package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo1 {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add("tanishq");
        al.add("srisha");
        al.add("mounika");
        al.add("shubham");
        al.add("amol");


        al.add("rahul");
        System.out.println(al.size());

        System.out.println(al);

        al.remove(2);

        System.out.println(al.size());
        System.out.println(al);

        al.add(34);
        al.add(23.56);
        al.add(true);
        al.add('g');

        System.out.println(al.size());
        System.out.println(al);


    }
}
