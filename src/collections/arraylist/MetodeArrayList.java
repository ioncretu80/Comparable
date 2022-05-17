package collections.arraylist;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class MetodeArrayList {

    public static void main(String[] args) {

        //add()
        ArrayList<String> arrayList1 = new ArrayList<>() ;
        arrayList1.add("Ion");
        arrayList1.add("Petru");
        arrayList1.add("Vasile");
        arrayList1.add("Ion");
        arrayList1.add(1, "Maria");
  //      arrayList1.add(6, "Maria");        - exceptie deoarece indexul e 6 size e 3
        System.out.println(arrayList1);
//        for (String s: arrayList1
//             ) {
//            System.out.print(s+" ");
//        }
//        System.out.println();

        //get()

//        System.out.println(arrayList1.get(2));
//
//
//        for (int i=0; i<arrayList1.size(); i++){
//            System.out.println(arrayList1.get(i));
//        }


        //set(replace)
        arrayList1.set(1,"Masha");


        //remove

        arrayList1.remove(0);
        System.out.println(arrayList1);






    }
}
