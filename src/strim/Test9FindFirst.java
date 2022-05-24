package strim;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test9FindFirst {

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nicolai", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Piotr", 'm', 35, 4, 5.3);
        Student st5 = new Student("Marya", 'f', 22, 3, 8.2);


        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        students.stream().map(element -> {
            element.setName(element.getName().toUpperCase());
        return element;
        })
                .filter(element->element.getSex()== 'f')
                .sorted((x,y)->x.getAge()-y.getAge())
                .forEach(element-> System.out.println(element));


        Student studentFirst = students.stream().map(element -> {
                    element.setName(element.getName().toUpperCase());
                    return element;
                })
                .filter(element -> element.getSex() == 'f')
                .sorted((x, y) -> x.getAge() - y.getAge())
                .findFirst().get();


        System.out.println(studentFirst);
        
        
        
        //min, max

        System.out.println("min");
        Student min = students.stream().min((x, y) -> x.getAge() - y.getAge()).get();
        System.out.println(min);
        System.out.println("max");
        Student max = students.stream().max((x, y) -> x.getAge() - y.getAge()).get();
        System.out.println(max);

        System.out.println("limit");

        students.stream().filter(e ->e.getAge()>20).limit(2).forEach(e-> System.out.println(e));

        System.out.println("skip()"); // propuskaet pervie n element
        students.stream().filter(e ->e.getAge()>20).forEach(e-> System.out.println(e));
        System.out.println("primi 2");
        students.stream().filter(e ->e.getAge()>20).limit(2).forEach(e-> System.out.println(e));
        System.out.println("primii doi exclusi");
        students.stream().filter(e ->e.getAge()>20).skip(2).forEach(e-> System.out.println(e));


        System.out.println();
        System.out.println();
        System.out.println("mapToInt()");
        List<Integer> coursesList = students.stream().mapToInt(e -> e.getCourse()).boxed().collect(Collectors.toList());
        System.out.println(coursesList);

        int sum = students.stream().mapToInt(el-> el.getCourse()).sum();
        Double average = students.stream().mapToInt(el-> el.getCourse()).average().getAsDouble();
        System.out.println("suma");
        System.out.println(sum);
        System.out.println("media");
        System.out.println(average);

        System.out.println("min");
        int min1 = students.stream().mapToInt(el-> el.getCourse()).min().getAsInt();
        System.out.println(min1);

        System.out.println("max");
        int max1 = students.stream().mapToInt(el-> el.getCourse()).max().getAsInt();
        System.out.println(max1);


        System.out.println();
        System.out.println();
        System.out.println("mapToDouble()");
        List<Double> coursesList1 = students.stream().mapToDouble(e -> e.getAvgGrade()).boxed().collect(Collectors.toList());

        System.out.println(coursesList1);







    }
}
