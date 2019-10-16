import java.util.ArrayList;
import java.util.List;

public class Laboratory102 {
    public static void main(String[] args) {
        addUnivInfo();
    }

    static void addUnivInfo() {
        Student studentClass = new Student();
        University univClass = new University();

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();


        studentClass.addStudent("Victoria", 20, 8.5);
        list1.add("Victoria");

        studentClass.addStudent("Iuliana", 19, 9.95);
        list1.add("Iuliana");

        studentClass.addStudent("Marina", 19, 8.75);
        list1.add("Marina");

        studentClass.addStudent("Diana", 20, 10);
        list1.add("Diana");

        studentClass.addStudent("Alex", 21, 8.45);
        list1.add("Alex");

        studentClass.addStudent("Vasile", 20, 8.0);
        list1.add("Vasile");

        univClass.addUniversity("UTM", 1976, list1);


        studentClass.addStudent("Dina", 22, 8.65);
        list2.add("Dina");

        studentClass.addStudent("Alexandrina", 21, 9.0);
        list2.add("Alexandrina");

        studentClass.addStudent("Mihai", 20, 8.5);
        list2.add("Mihai");

        studentClass.addStudent("Ecaterina", 21, 7.85);
        list2.add("Ecaterina");

        studentClass.addStudent("Raluca", 21, 8.45);
        list2.add("Raluca");

        studentClass.addStudent("Cristina", 23, 8.3);
        list2.add("Cristina");

        univClass.addUniversity("ASEM", 1983, list2);


    }



}