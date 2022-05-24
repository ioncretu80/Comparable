package generics;

import java.util.ArrayList;

public class ParameterizedMethod {
}


class GenMethod{

    public static void main(String[] args) {

        ArrayList<Integer> list1  = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);

        int a = GenMethod.getSecondElement(list1);
        System.out.println(a);


        ArrayList<String> list2  = new ArrayList<>();
        list2.add("abc");
        list2.add("fgh");
        list2.add("fds");

        String s = GenMethod.getSecondElement(list2);
        System.out.println(s);

    }







    //parametu un ArrayList<T> cu orisice typ
    // T - tipul care va fi intors
    // <T> - este pentru compilator sa inteleaga ca aceasta este o metoda parametrizata
    /*
    * in cazul cand scrii fara <T> compilatorul da eroare
    * public static  T getSecondElement(ArrayList<T> al){
        return al.get(1);
    }
    * */

    public static  <T> T getSecondElement(ArrayList<T> al){
        return al.get(1);
    }
}