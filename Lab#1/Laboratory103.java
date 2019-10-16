import java.util.ArrayList;
import java.util.List;

class Laboratory103 {
    public static void main(String[] args) {
        addUnivInfo();
    }

    static void addUnivInfo() {
        Student studentClass = new Student();
        University univClass = new University();

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        List<String> listmarks1 = new ArrayList<>();
        List<String> listmarks2 = new ArrayList<>();
        List<String> listmarks3 = new ArrayList<>();


        studentClass.addStudent("Victoria", 20, 8.5);
        list1.add("Victoria");
        listmarks1.add("8.5");
        studentClass.addStudent("Ion", 20, 8.65);
        list1.add("Ion");
        listmarks1.add("8.65");
        studentClass.addStudent("Adelina", 20, 7.75);
        list1.add("Adelina");
        listmarks1.add("7.75");
        univClass.addUniversity("UTM", 1976, list1);

        double[] marksArray = new double[listmarks1.size()];

        double averageMark = 0;
        for (int i = 0; i < listmarks1
                .size(); i++) {
            marksArray[i] = Double.parseDouble(listmarks1
                    .get(i));
            averageMark = averageMark + marksArray[i];
            if (i + 1 == listmarks1
                    .size()) {
                averageMark = averageMark / listmarks1
                        .size();
                System.out.println(averageMark);
            }
        }

        studentClass.addStudent("Alex", 20, 8.4);
        list2.add("Alex");
        listmarks2.add("8.4");
        studentClass.addStudent("Vasile", 20, 8.5);
        list2.add("Victoria");
        listmarks2.add("8.5");
        studentClass.addStudent("Marina", 19, 10);
        list2.add("Marina");
        listmarks2.add("10");
        univClass.addUniversity("ASEM", 1983, list2);

        double[] marksArray2 = new double[listmarks2.size()];

        double averageMark2 = 0;
        for (int i = 0; i < listmarks2
                .size(); i++) {
            marksArray2[i] = Double.parseDouble(listmarks2
                    .get(i));
            averageMark2 = averageMark2 + marksArray2[i];
            if (i + 1 == listmarks2
                    .size()) {
                averageMark2 = averageMark2 / listmarks2
                        .size();
                System.out.println(averageMark2);
            }
        }

        studentClass.addStudent("Olivia", 20, 10);
        list3.add("Olivia");
        listmarks3.add("10");
        studentClass.addStudent("Cristina", 20, 9.75);
        list3.add("Cristina");
        listmarks3.add("9.75");
        studentClass.addStudent("Adriana", 20, 8.25);
        list3.add("Adriana");
        listmarks3.add("8.25");
        univClass.addUniversity("USM", 1995, list3);

        double[] marksArray3 = new double[listmarks3.size()];

        double averageMark3 = 0;
        for (int i = 0; i < listmarks3
                .size(); i++) {
            marksArray3[i] = Double.parseDouble(listmarks3
                    .get(i));
            averageMark3 = averageMark3 + marksArray3[i];
            if (i + 1 == listmarks3
                    .size()) {
                averageMark3 = averageMark3 / listmarks3
                        .size();
                System.out.println(averageMark3);
            }
        }


    }
}
