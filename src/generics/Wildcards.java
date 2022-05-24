package generics;

import javax.print.attribute.standard.NumberUp;
import java.util.ArrayList;
import java.util.List;

public class Wildcards {
    public static void main(String[] args) {
        //asa ceva nu se poate de scris
//        List<Number> list = new ArrayList<Integer>();
//        List<Object> list1 = new ArrayList<Integer>();


        //asa ceva se poate de scris
        List<?> list1 = new ArrayList<Integer>();
        List<?> list2 = new ArrayList<String>();


        List<Double> list_double = new ArrayList<>();
        list_double.add(3.15);
        list_double.add(3.16);
        list_double.add(3.17);
        showListIngo(list_double);

        List<String> list_string = new ArrayList<>();
        list_string.add("string1");
        list_string.add("string2");
        list_string.add("string3");
        showListIngo(list_string);


        //LIITARI
        List<?> list4 = new ArrayList<String>();
//       //nu merge, deoarece compilatorul nu stie tipul list4, in cazul cand folosim weilcard nu putem apela medodele listei
//        list4.add("hallo");


// Asa ceva nu putem folosoi insa puteb folosi baudend wilecard(limitare de sus sau de jos)
        // List<Number> list5 = new ArrayList<Integer>();
        List<? extends Number> list5 = new ArrayList<Integer>();


        ArrayList<Double> ald = new ArrayList<>();
        ald.add(3.15);
        ald.add(3.16);
        ald.add(3.17);
        System.out.println(summ(ald));


        ArrayList<Integer> ald1 = new ArrayList<>();
        ald1.add(3);
        ald1.add(36);
        ald1.add(37);
        System.out.println(summ(ald1));


        // error deoarece Metoda summ nu accepta AL string
//        ArrayList<String> ald3= new ArrayList<>();
//        ald3.add("fgfd");
//        ald3.add("fggggfd");
//        ald3.add("fffgfd");
//        System.out.println( summ(ald3));


        // inca o modalitate mai putin utilizata

        List<? super Number> list7 = new ArrayList<Object>();

    }

    //unde se utilizeaza
    static void showListIngo(List<?> list) {
        System.out.println("moi list soderjit sleduiuschie elementi: " + list);

    }


    //de ce nu putem utiliza  static void showListIngo(List<Object> list) - deoarece in ArrayList trebuie doar Object de transmis


    public static double summ(ArrayList<? extends Number> list) {

        double summ = 0;
        for (Number element : list) {
            summ += element.doubleValue();
        }
        return summ;
    }

}
