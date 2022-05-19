package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentInfo {

    void testStudents(ArrayList<Student> al , StudentChecks sc ){
        for (Student st :al
             ) {
            if (sc.check(st)){
                System.out.println(st);
            }

        }

    }

//   void printStudentsOverGrade(ArrayList<Student> al, double grade){
//       for (Student s:al
//            ) {
//           if (s.avgGrade > grade){
//               System.out.println(s);
//           }
//       }
//
//   }
//
//    void printStudentsUnderAge(ArrayList<Student> al, int age){
//
//        for (Student s:al
//        ) {
//            if (s.age < age){
//                System.out.println(s);
//            }
//        }
//
//    }
//
//    void printStudentsMixConditions(ArrayList<Student> al, int age, double grade, char sex){
//
//        for (Student s:al
//        ) {
//            if (s.age > age && s.avgGrade < grade  && s.sex== sex ){
//                System.out.println(s);
//            }
//        }
//
//    }


}


interface StudentChecks{
    boolean check(Student s);
}


class CheckOverGrade implements StudentChecks{

    @Override
    public boolean check(Student s) {
        return s.avgGrade>8;
    }
}



class Test{
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nicolai", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Piotr", 'm', 35, 4, 7.3);
        Student st5 = new Student("Marya", 'f', 22, 3, 8.2);


        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo info = new StudentInfo();

//        info.printStudentsOverGrade(students,8);
//        System.out.println("--------------------------------------");
//        info.printStudentsUnderAge(students,30);
//        System.out.println("--------------------------------------");
//        info.printStudentsMixConditions(students, 20, 9,'f' );


        //folosirea unei clase ce se extinde de la interface
        info.testStudents(students, new CheckOverGrade());
        System.out.println();
        //folosirea lambda
        //folosirea lambda_expresii
        info.testStudents(students,(Student s)->{return s.avgGrade>8;});

        System.out.println("----------------------------------");


        //folosirea anonim classes
        info.testStudents(students, new StudentChecks() {
            @Override
            public boolean check(Student s) {
                return s.age < 30;
            }
        });

        //lambda
        System.out.println("----------------------------------");
        info.testStudents(students, (Student s) -> {
            return s.age < 30;
        });

        System.out.println("-----------------lambda pentru 3 conditii");
        //folosire lambda pentru toate trei conditii
        info.testStudents(students, s -> s.age>20 && s.avgGrade<8.3 && s.sex=='f');




        //inca o methoda
        System.out.println("-----------inca o metoda---------------");
        StudentChecks sc  = s -> s.age>20 && s.avgGrade<8.3 && s.sex=='f';
        info.testStudents(students,sc);


//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.course-o2.course;
//            }
//        });


        System.out.println(students);

        //fara anonimclass
        Collections.sort(students, (Student s1, Student s2) -> s1.course-s2.course);
        System.out.println(students);




    }

}
