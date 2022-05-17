package collections.arraylist;


import java.util.ArrayList;
import java.util.Objects;

public class MetodeArrayList3 {

    public static void main(String[] args) {

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Petru");
        arrayList1.add("Ion");
        arrayList1.add("Vasile");
        arrayList1.add("Ana");
        arrayList1.add("Ion");


        //indexOf, lastindexOf

        int index = arrayList1.indexOf("Vasile");
        System.out.println(index);
        int index1 = arrayList1.lastIndexOf("Ion");
        System.out.println(index1);


        //size()
        System.out.println("size = "+arrayList1.size());

        //isEmpty
        System.out.println("is Empty: "+ arrayList1.isEmpty());
//        arrayList1.clear();

        boolean res = arrayList1.contains("Petru");
        System.out.println("arrayList1 contine Petru: "+ res);
         res = arrayList1.contains("Ala");
        System.out.println("arrayList1 contine Ana: "+ res);

        System.out.println(arrayList1.toString());


    }
}





