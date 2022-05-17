package collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        //1
        ArrayList<String> arrayList = new ArrayList<String>() ;
        arrayList.add("Ion");
        arrayList.add("Petru");
        arrayList.add("Vasile");
        arrayList.add("Ion");



        Iterator<String> iterator = arrayList.iterator();
        while(iterator.hasNext()){
//            System.out.println(iterator.next());
            iterator.next();
            iterator.remove();
        }

        System.out.println("final "+arrayList);
    }
}
