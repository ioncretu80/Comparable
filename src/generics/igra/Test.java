package generics.igra;

public class Test {
    public static void main(String[] args) {

        Schoolar schoolar1 = new Schoolar("Ivan", 13);
        Schoolar schoolar2 = new Schoolar("Mariya", 12);
        Schoolar schoolar3 = new Schoolar("Sergey", 13);
        Schoolar schoolar4 = new Schoolar("Olea", 14);

        Student student1 = new Student("Nikolai", 16);
        Student student2 = new Student("Ksenia", 17);

        Employee employee1 = new Employee("Zaur", 18);
        Employee employee2 = new Employee("Nina", 21);


        Team<Schoolar> schoolarTeam = new Team<Schoolar>("Drakoni");
        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);

        //Problema1 putem adauga si studenti si Employee
//        schoolarTeam.addNewParticipant(student1);
//        schoolarTeam.addNewParticipant(employee1);






        Team<Student> studentTeam = new Team<Student>("Vpered!");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        Team<Employee> employeeTeam = new Team<Employee>("Rabotiagi");
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);


   //     Team<String> stringTeam = new Team<String>("Rabotiagi");

        Team<Schoolar> schoolarTeam2 = new Team<Schoolar>("Mudretsi");
        schoolarTeam.addNewParticipant(schoolar3);
        schoolarTeam.addNewParticipant(schoolar4);


        schoolarTeam.playWith(schoolarTeam2);




    }
}
