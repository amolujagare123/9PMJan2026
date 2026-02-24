package CollectionsDemo.VectorDemo;

import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        System.out.println("Capacity="+v.capacity()); // 10
        System.out.println("Size="+v.size()); // 0

        v.add("tanishq");
        v.add("srisha");
        v.add("mounika");
        v.add("shubham");
        v.add("amol");
        v.add("tanishq");
        v.add("srisha");
        v.add("mounika");
        v.add("shubham");
        v.add("amol");
        v.add("amol");
        v.add("tanishq");
        v.add("srisha");
        v.add("mounika");
        v.add("shubham");
        v.add("amol");
        v.add("tanishq");
        v.add("srisha");
        v.add("mounika");
        v.add("shubham");
        v.add("amol");
        v.add("amol");

        System.out.println("Capacity="+v.capacity()); // 40
        System.out.println("Size="+v.size()); // 20

        System.out.println(v);
    }
}
