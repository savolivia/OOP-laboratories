package Laboratory_5;

public class ClassF extends ClassE {
    protected String f;

    public ClassF(String a, String b, String c, String d, String e, String f, X x) {
        super(a, b, c, d, e, x);
        this.f = f;
    }

    public void printProperty() {
        super.printProperty();
        System.out.println(x.getXName());
        System.out.println(f);
    }
}
