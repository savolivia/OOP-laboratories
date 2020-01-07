package Laboratory_5;

public class ClassD extends ClassC {
    protected String d;
    protected X x = new X("xxx");

    public ClassD(String a, String b, String c, String d, X x) {
        super(a, b, c, x);
        this.d = d;
    }

    public void printProperty() {
        super.printProperty();
        System.out.println(x.getXName());
        System.out.println(d);
    }
}
