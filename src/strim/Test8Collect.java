package strim;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
        System.out.println(students);

//grupare dupa ceva
        Map<Integer, List<Student>> map = students.stream().map(el -> {
            el.setName(el.getName().toUpperCase());
            return el;
        }).collect(Collectors.groupingBy(el -> el.getCourse()));

        for (Map.Entry<Integer, List<Student>> entry: map.entrySet()){
            System.out.println(entry.getKey() + " : "+ entry.getValue().toString());
        }

 //partajare dupa un criteriu
        Map<Boolean, List<Student>> map1 = students.stream().collect(Collectors.partitioningBy(el -> el.getAvgGrade() > 7.0));

        for (Map.Entry<Boolean, List<Student>> entry: map1.entrySet()){
            System.out.println(entry.getKey() + " : "+ entry.getValue().toString());
        }





        //



    }
}
