package CollectionsDemo.MapDemo;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo2 {

    public static void main(String[] args) {

        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();
        lhm.put(102,"Amol");
        lhm.put(112,"Rahul");
        lhm.put(122,"Sujit");
        lhm.put(132,"Sarika");
        lhm.put(142,"Srisha");
        lhm.put(152,"Aarsi");

        System.out.println(lhm);

        System.out.println(lhm.get(102));
        lhm.remove(102);
        System.out.println(lhm);

        System.out.println(lhm.containsKey(142)); // true
        System.out.println(lhm.containsValue("dsds")); // false

        Set keys = lhm.keySet();
        System.out.println(keys);

        Collection values = lhm.values();
        System.out.println(values);

        Set entrySet = lhm.entrySet();
        System.out.println(entrySet);
    }
}
