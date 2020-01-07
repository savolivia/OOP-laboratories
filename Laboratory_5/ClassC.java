package Laboratory_5;

public class ClassC extends ClassB {
    protected String c;

    public ClassC(String a, String b, String c, X x) {
        super(a, b, x);
        this.c = c;
    }

    public void printProperty() {
        super.printProperty();
        System.out.println(x.getXName());
        System.out.println(c);
    }
}
