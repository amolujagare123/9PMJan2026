package CollectionsDemo.MapDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

    public static void main(String[] args) {

        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();
        lhm.put(102,"Amol");
        lhm.put(112,"Rahul");
        lhm.put(122,"Sujit");
        lhm.put(132,"Sarika");
        lhm.put(142,"Srisha");
        lhm.put(152,"Aarsi");

        System.out.println(lhm);
    }
}
