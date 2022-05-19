package lambda.predicate;

import java.util.List;

public class ForEach {

    public static void main(String[] args) {
        List<String> list  = List.of("Privet", "kak dela?", "normalino", "poka");


        for (String s : list
             ) {
            System.out.println(s);
        }

        System.out.println("lambda");
        list.forEach(str-> System.out.println(str));

        List<Integer> list2  = List.of(1,2,3,4,5,6,7);

        list2.forEach(element-> {
            System.out.println(element);
            element*=2;
            System.out.println(element);
        });


    }
}
