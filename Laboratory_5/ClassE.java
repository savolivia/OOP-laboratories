package Laboratory_5;

public class ClassE extends ClassD {
    protected String e;

    public ClassE(String a, String b, String c, String d, String e, X x) {
        super(a, b, c, d, x);
        this.e = e;
    }

    public void printProperty() {
        super.printProperty();
        System.out.println(x.getXName());
        System.out.println(e);
    }
}


