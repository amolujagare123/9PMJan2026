package CollectionsDemo.MapDemo;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreeHashMapDemo {

    public static void main(String[] args) {

        TreeMap<Integer,String> lhm = new TreeMap<>();
        lhm.put(102,"Amol");
        lhm.put(412,"Rahul");
        lhm.put(122,"Sujit");
        lhm.put(532,"Sarika");
        lhm.put(142,"Srisha");
        lhm.put(652,"Aarsi");

        System.out.println(lhm);
    }
}
