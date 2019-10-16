import java.util.List;

class University {
    public String name;
    public int foundationYear;
    public List<String> students;

    void addUniversity(String name, int foundationYear, List<String> students) {
        this.name = name;
        this.foundationYear = foundationYear;
        this.students = students;
        System.out.println(this.name);
        System.out.println(this.foundationYear);
        System.out.println(this.students);

    }

}