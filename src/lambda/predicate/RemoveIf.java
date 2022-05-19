package lambda.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIf {

    public static void main(String[] args) {
        ArrayList<String> al  =new ArrayList<>();
        al.add("Privet");
        al.add("Poka");
        al.add("Ok");
        al.add("UchimJava");
        al.add("A immeno lambda");
        System.out.println(al);


//      Methoda1
       //  al.removeIf(element-> element.length()>5);


//        Methoda2
        Predicate<String> predicate = element-> {
            return element.length() > 5;
        };
        al.removeIf(predicate);
         System.out.println(al);
    }
}
