package collections.arraylist.map_interface;

public class LinkedHashMap {
    public static void main(String[] args) {

        java.util.LinkedHashMap<Double, Student> linkedHashMap =  new java.util.LinkedHashMap<>(16,0.75f, true);

        Student st1 = new Student("Zaur","Trigulov", 3);
        Student st2 = new Student("Marya","Ivanova", 1);
        Student st3 = new Student("Sergey","Petrov", 4);
        Student st4 = new Student("Igor","Sidorov", 2);

        linkedHashMap.put(7.2, st3);
        linkedHashMap.put(7.5, st4);
        linkedHashMap.put(5.8, st1);
        linkedHashMap.put(6.4, st2);
        System.out.println(linkedHashMap);

        System.out.println(linkedHashMap.get(6.4));
        System.out.println(linkedHashMap.get(7.5));

        System.out.println(linkedHashMap);

    }
}
