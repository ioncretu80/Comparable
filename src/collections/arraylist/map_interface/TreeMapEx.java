package collections.arraylist.map_interface;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();

        Student st1 = new Student("Zaur","Trigulov", 3);
        Student st2 = new Student("Marya","Ivanova", 1);
        Student st3 = new Student("Sergey","Petrov", 4);
        Student st4 = new Student("Igor","Sidorov", 2);
        Student st5 = new Student("Vasiliy","Smirnov", 1);
        Student st6 = new Student("Sasha","Kapustin", 3);
        Student st7 = new Student("Elena","Sidorova", 4);


        treeMap.put(5.8, st1);
        treeMap.put(9.1, st7);
        treeMap.put(6.4, st2);
        treeMap.put(7.5, st4);
        treeMap.put(7.2, st3);
        treeMap.put(8.2, st6);
        treeMap.put(7.9, st5);


        System.out.println(treeMap);

        //get()
        System.out.println("//get()");
        System.out.println(treeMap.get(6.4));
        System.out.println();

        //remove()
        System.out.println("//remove()");
        treeMap.remove(5.8);
        System.out.println(treeMap);

        //descendingMap()
        System.out.println("//descendingMap()");
        System.out.println(treeMap.descendingMap());

        System.out.println();
        //tailMap()
        System.out.println("//tailMap()");
        System.out.println(treeMap.tailMap(7.3));

        System.out.println();
        //headMap()
        System.out.println("//headMap()");
        System.out.println(treeMap.headMap(7.3));
        System.out.println();


        //lastEntry()
        System.out.println("//lastEntry()");
        System.out.println(treeMap.lastEntry());
        System.out.println();

        //firstEntry()
        System.out.println("//firstEntry()");
        System.out.println(treeMap.firstEntry());
        System.out.println();




        //ex2

        TreeMap<Student, Double> treeMap1 = new TreeMap<>();
        TreeMap<Student, Double> treeMap2 = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result=  o1.course-o2.course;
                if(result ==0){
                    result = o1.name.compareTo(o2.name);
                }

                return result;
            }
        });

        Student st11 = new Student("Zaur","Trigulov", 3);
        Student st22 = new Student("Marya","Ivanova", 1);
        Student st33 = new Student("Sergey","Petrov", 4);
        Student st44 = new Student("Igor","Sidorov", 2);
        Student st55 = new Student("Vasiliy","Smirnov", 1);
        Student st66 = new Student("Sasha","Kapustin", 3);
        Student st77 = new Student("Elena","Sidorova", 4);
        Student st88 = new Student("Elena","Sidorova1", 5);


        treeMap1.put(st11,5.8);
        treeMap1.put(st22,6.4);
        treeMap1.put(st44,7.5);
        treeMap1.put(st33,7.2);
        treeMap1.put(st66,8.2);
        treeMap1.put(st55,7.9);
        treeMap1.put(st88,7.9);
        treeMap1.put(st77,9.1);

        System.out.println(treeMap1.size());

        System.out.println(treeMap1);


        treeMap2.put(st11,5.8);
        treeMap2.put(st22,6.4);
        treeMap2.put(st44,7.5);
        treeMap2.put(st33,7.2);
        treeMap2.put(st66,8.2);
        treeMap2.put(st55,7.9);
        treeMap2.put(st88,7.4);
        treeMap2.put(st77,9.1);

        System.out.println(treeMap2);


    }
}
