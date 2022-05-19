package strim;

import java.util.ArrayList;
import java.util.List;

public class Test8Collect {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nicolai", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 32, 1, 8.9);
        Student st4 = new Student("Piotr", 'm', 35, 4, 5.3);
        Student st5 = new Student("Marya", 'f', 22, 3, 8.2);


        System.out.println("list sort");
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);


        //



    }
}
