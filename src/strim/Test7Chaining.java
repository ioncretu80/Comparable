package strim;

import java.util.ArrayList;
import java.util.List;

public class Test7Chaining {
    public static void main(String[] args) {

        /////
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nicolai", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 32, 1, 8.9);
        Student st4 = new Student("Piotr", 'm', 35, 4, 5.3);
        Student st5 = new Student("Marya", 'f', 22, 3, 8.2);

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Applied Mathematics");
        f1.addStudentToFaculty(st1);
        f1.addStudentToFaculty(st2);
        f1.addStudentToFaculty(st3);
        f2.addStudentToFaculty(st4);
        f2.addStudentToFaculty(st5);


        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);


        facultyList.stream()
                .flatMap(faculty -> faculty.getStudendsOnFaculty().stream())
                .forEach(e-> System.out.println(e.getName()));






    }
}

class Faculty{
    String name;
    List<Student> studendsOnFaculty;

    public Faculty(String name) {
        this.name = name;
        this.studendsOnFaculty = new ArrayList<>();
    }

    public List<Student> getStudendsOnFaculty() {
        return studendsOnFaculty;
    }

    public void addStudentToFaculty(Student student){

        studendsOnFaculty.add(student);

    }
}
