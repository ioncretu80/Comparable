package strim;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Privet");
        list.add("kak dela?");
        list.add("ok");
        list.add("poka");

        System.out.println(list);

        //versiunea veche
        for (int i = 0; i <list.size() ; i++) {
            list.set(i, String.valueOf(list.get(i).length()));

        }
        System.out.println(list);


        System.out.println("Metoda cu stream 2");

        List<String> list2 = new ArrayList<>();
        list2.add("Privet");
        list2.add("kak dela?");
        list2.add("ok");
        list2.add("poka");

        System.out.println(list2);


        //6,9,2,4
        List<Integer> list3 = list2.stream().map(element -> element.length()).collect(Collectors.toList());
        System.out.println(list3);

         //Exemplu cu array

        int[] array = {5,9,3,8,1};
        System.out.println(Arrays.toString(array));
        array = Arrays.stream(array).map(element->{

           if (element%3==0){
             element=element/3;
           }


           return element;
        }).toArray();


        System.out.println(Arrays.toString(array));


        System.out.println("=========Set==========");

        Set<String> set = new TreeSet<>();

        set.add("privet");
        set.add("kak dela?");
        set.add("OK");
        set.add("poka");

        System.out.println(set);
        Set<Integer> set2 = set.stream().map(e -> e.length()).collect(Collectors.toSet());
        System.out.println(set2);
        List<Integer> list4= set.stream().map(e -> e.length()).collect(Collectors.toList());
        System.out.println(list4);

    }
}
