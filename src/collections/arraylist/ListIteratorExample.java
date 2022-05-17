package collections.arraylist;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

    public static void main(String[] args) {
        String s = "madam1";
        List<Character> list = new LinkedList<>();
        for (char ch: s.toCharArray()
             ) {

            list.add(ch);
        }
        System.out.println(list);

        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reversIterator = list.listIterator(list.size());


        boolean isPalindrom = true;
        while (iterator.hasNext() && reversIterator.hasPrevious()){
            if (iterator.next() != reversIterator.previous()){
                isPalindrom = false;
                break;
            }
        }

        if (isPalindrom){
            System.out.println("is Palindrom");
        }else{
            System.out.println("not Palindrom");
        }




    }
}
