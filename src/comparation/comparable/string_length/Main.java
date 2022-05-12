package comparation.comparable.string_length;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>() ;
        list.add("Zaur");
        list.add("Ion");
        list.add("Petru");
        list.add("On");
        list.add("Alexandru");
        list.add("Vladimir");
        System.out.println("Vor :"+list);
        Collections.sort(list, new LengthComparator());
        System.out.println("Lungime :"+list);
        Collections.sort(list);
        System.out.println("Alfabetic :"+list);
        Collections.sort(list, new ReversComparator());
        System.out.println("Revers :"+list);


        Collections.sort(list, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }

        });
        System.out.println("alfabetic cu clasa anonima :"+list);


        Comparator<String> byName =
                Comparator.reverseOrder();

        Collections.sort(list, byName );

        System.out.println("alfabetic cu lambda :"+list);

    }
}



class LengthComparator implements Comparator<String> {

    @Override
    public int compare(String str1, String str2) {
        //Metoda1
        if (str1.length() == str2.length()){
            return 0;
        } else if (str1.length()< str2.length()) {
            return -1;
        } else
        {
            return 1;
        }
    }
}


class ReversComparator implements Comparator<String> {

    @Override
    public int compare(String str1, String str2) {

            return str2.compareTo(str1);
        }

}


