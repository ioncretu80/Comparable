package strim;

import java.util.*;
import java.util.stream.Collectors;

public class Test5Chaining {
    public static void main(String[] args) {
        int[] array = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18};
        int result = Arrays.stream(array).
                filter(e -> e % 2 == 1).
                map(e -> {

                    if (e % 3 == 0) {
                        e = e / 3;
                    }

                    return e;
                }).
                reduce((a, e) -> a + e).getAsInt();
        System.out.println(result);


        /////
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


        students.stream()
                .map(element ->
                {
                    element.setName(element.getName().toUpperCase());
                    return element;
                })
                .filter(element -> element.getSex() == 'f')
                .sorted((x, y) -> y.getAge() - x.getAge())
                .forEach(element -> System.out.println(element));

//        System.out.println(students);


    }
}
