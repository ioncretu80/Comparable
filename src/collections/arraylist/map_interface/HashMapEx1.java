package collections.arraylist.map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(1000, "Zaur Trigulov");
        map1.put(3568, "Petru Popa");
        map1.put(4585, "Elena Cretu");
        map1.put(7856, "Ion Cretu");
        map1.put(78578, "Ion Cretu");
        map1.put(null, "Sergei Petrov");
//        map1.put(85215, null);
        map1.putIfAbsent(1000, "Oleg Ivanov");


        System.out.println(map1);

        System.out.println(map1.get(1000));
        System.out.println(map1.get(1001));
        map1.remove(3568);
        System.out.println(map1);

        //containsValue
        System.out.println("//containsValue");
        System.out.println(map1.containsValue("Ion Cretu"));
        System.out.println(map1.containsValue("Ion Cretu1"));

        //containsValue
        System.out.println("//containsKey");
        System.out.println(map1.containsKey(500));
        System.out.println(map1.containsKey(7856));

        //keySet
        System.out.println("----------------------------+\n//keySet");
        System.out.println(map1.keySet());

        //values
        System.out.println("----------------------------+\n//values");
        System.out.println(map1.values());

        Map<String,String> map2 = new HashMap<>();


    }
}
