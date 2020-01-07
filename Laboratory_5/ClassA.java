package Laboratory_5;

public class ClassA {
    protected String a;
    protected X x = new X("xxx");

    public ClassA(String a, X x) {
        this.a = a;
        this.x = x;
    }

    public void printProperty() {
        System.out.println(x.getXName());
        System.out.println(a);
    }
}
