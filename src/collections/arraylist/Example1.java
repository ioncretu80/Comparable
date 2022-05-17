package collections.arraylist;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {

       //1
        ArrayList<String>  arrayList1 = new ArrayList<String>() ;
        arrayList1.add("Ion");
        arrayList1.add("Petru");
        arrayList1.add("Vasile");
        arrayList1.add("Ion");
        System.out.println(arrayList1);

        //2
        ArrayList<String>  arrayList2 = new ArrayList<>() ;
        arrayList1.add("Ion");
        arrayList1.add("Petru");
        arrayList1.add("Vasile");
        arrayList1.add("Ion");
        System.out.println(arrayList2);

        //3
        ArrayList<String>  arrayList3 = new ArrayList<String>(200) ;
        arrayList1.add("Ion");
        arrayList1.add("Petru");
        arrayList1.add("Vasile");
        arrayList1.add("Ion");
        System.out.println(arrayList3);

        //4 Tipul List deoarece ArrayList extinde interfaceul List
        List<String> arryList4 = new ArrayList<>();

        //5
        List<String> arryList5 = new ArrayList<>(arrayList2);





    }
}
