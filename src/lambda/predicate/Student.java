package lambda.predicate;

public class Student {
    String nane;
    char sex;
    int age;
    int course;
    double avgGrade;

    public Student(String nane, char sex, int age, int course, double avgGrade) {
        this.nane = nane;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }


    @Override
    public String toString() {
        return "Student{" +
                "nane='" + nane + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }
}
