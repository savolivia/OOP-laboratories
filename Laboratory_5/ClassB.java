package Laboratory_5;

public class ClassB extends ClassA {
    protected String b;

    public ClassB(String a, String b, X x) {
        super(a, x);
        this.b = b;
    }

    public void printProperty() {
        super.printProperty();
        System.out.println(x.getXName());
        System.out.println(b);
    }
}