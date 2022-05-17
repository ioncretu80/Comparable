package collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMetods5 {
    public static void main(String[] args) {


        //removeall()
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Petru");
        arrayList1.add("Ion");
      //  arrayList1.add("Vasile");
        arrayList1.add("Ana");
        arrayList1.add("Kolya");
        arrayList1.add("Ion");
        arrayList1.add("Andrei");
        arrayList1.add("Sasha");

        System.out.println(arrayList1);


        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Ion");
        arrayList2.add("Marya");
        arrayList2.add("Igor");
        System.out.println(arrayList2);
//        arrayList1.removeAll(arrayList2);
//        arrayList1.retainAll(arrayList2);


        System.out.println(arrayList1);

        ArrayList<String> arrayList3 = new ArrayList<>();
        arrayList3.add("Ion");
        arrayList3.add("Vasile");

//        boolean res = arrayList1.containsAll(arrayList3);
//        System.out.println(res);


        //sublist
        System.out.println(arrayList1);
        List<String> myList = arrayList1.subList(1,4);
        System.out.println(myList);

        myList.add("Fiodor");
        System.out.println(arrayList1);
        System.out.println(myList);


        //toArray
        ArrayList<String> arrayList4 = new ArrayList<>();
        arrayList4.add("Petru");
        arrayList4.add("Ion");
        arrayList4.add("Vasile");
        arrayList4.add("Ana");
        arrayList4.add("Kolya");
        arrayList4.add("Andrei");
        arrayList4.add("Sasha");
        Object[] array = arrayList4.toArray();
        System.out.println(array);

        String [] array2 = arrayList4.toArray(new String[0]);
        for (String s: array2
             ) {
            System.out.println(s);
        }


        //List.Of
        //toArray
        ArrayList<String> arrayList5 = new ArrayList<>();
        arrayList5.add("Petru");
        arrayList5.add("Ion");
        arrayList5.add("Vasile");
        arrayList5.add("Ana");
        arrayList5.add("Kolya");
        arrayList5.add("Andrei");
        arrayList5.add("Sasha");

        List<Integer> list1 = List.of(3,8,12);
        System.out.println(list1);
        //list1.add(100); Exception in thread "main" java.lang.UnsupportedOperationException


        List <String> list2 = List.copyOf(arrayList5);
        System.out.println(list2);




    }


}
