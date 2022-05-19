package lambda.predicate;



import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.function.Function;

public class StudentInfo {

    void testStudents(ArrayList<Student> al , Predicate<Student> predicate ){
        for (Student s :al
             ) {
            if (predicate.test(s)){
                System.out.println(s);
            }

        }

    }

     public double avgOfSmth(ArrayList<Student> list, Function<Student,Double> f){

     double   result = 0;

        for (Student student: list
             ) {

            result+= f.apply(student);;

        }

        result = result/ list.size();
        return result;

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
        info.testStudents(students, (Student p)->{ return p.avgGrade>8; });




        //Interface Function
        Function<Student, Double> f = student ->student.avgGrade;
        double avg =  info.avgOfSmth(students, p->p.avgGrade);
        System.out.println("avg");
        System.out.println(avg);


        //srednii curs
        //Interface Function

        double avgCourse =  info.avgOfSmth(students, p->(double)p.course);
        System.out.println("avg");
        System.out.println(avgCourse);





    }

}
