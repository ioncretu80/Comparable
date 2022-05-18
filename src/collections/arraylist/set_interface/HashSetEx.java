package collections.arraylist.set_interface;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Zaur");
        set.add("Oleg");
        set.add("Marina");
        set.add("Igor");
        set.add("Igor");
       // set.add(null);

        for (String s:set){
            System.out.println(s);
        }
        System.out.println();

        set.remove("Zaur");

        for (String s:set){
            System.out.println(s);
        }

        //size()


    }
}
