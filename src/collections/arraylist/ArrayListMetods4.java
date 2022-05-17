package collections.arraylist;

import java.util.Arrays;
import java.util.List;

public class ArrayListMetods4 {
    public static void main(String[] args) {

        StringBuilder str1 = new StringBuilder("abc");
        StringBuilder str2 = new StringBuilder("efg");
        StringBuilder str3 = new StringBuilder("lfg");
        StringBuilder str4 = new StringBuilder("sdf");

        StringBuilder [] array = {str1, str2, str3, str4};
        List<StringBuilder> list = Arrays.asList(array);
        System.out.println(list);
        array[0].append("!!!");
        System.out.println(list);


        array[0] = new StringBuilder("F");
        System.out.println(list);


        //removeall()




    }


}
