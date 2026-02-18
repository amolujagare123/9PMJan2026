package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo3 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("tanishq");
        al.add("srisha");
        al.add("mounika");
        al.add("shubham");
        al.add("amol");
        al.add("rahul");


        System.out.println(al);
        System.out.println("====> using for loop");
        for (int i = 0 ;i<al.size() ; i++)
            System.out.println(al.get(i));

        System.out.println("====> using for each loop");

        for (String str : al)
            System.out.println(str);


        System.out.println("====> using Iterator Interface");

        Iterator itr = al.iterator();

        while (itr.hasNext())
            System.out.println(itr.next());

    }
}
