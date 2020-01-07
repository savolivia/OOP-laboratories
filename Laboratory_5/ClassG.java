package Laboratory_5;

public class ClassG extends ClassF {
    protected String g;

    public ClassG(String a, String b, String c, String d, String e, String f, String g, X x) {
        super(a, b, c, d, e, f, x);
        this.g = g;
    }

    public void printProperty() {
        super.printProperty();
        System.out.println(x.getXName());
        System.out.println(g);
    }
}