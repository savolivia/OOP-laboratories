package Laboratory_5;

public class ClassI extends ClassH {
    protected String i;

    public ClassI(String a, String b, String c, String d, String e, String f, String g, String h, String i, X x) {
        super(a, b, c, d, e, f, g, h, x);
        this.i = i;
    }

    public void printProperty() {
        super.printProperty();
        System.out.println(x.getXName());
        System.out.println(i);
    }
}
