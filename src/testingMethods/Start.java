package testingMethods;

/**
 * Created by Иричи on 17.04.2015.
 */
public class Start {

    private int a;
    private int b;

    public Start(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
        Start start1 = new Start(5, 10);

        start1.setA(4);
        start1.setB(6);

        Methods hugeMethod = new Methods();
        output(hugeMethod.sum(start1.getA(), start1.getB()));
        int result2 = hugeMethod.dif(start1.getA(), start1.getB());
        int result3 = hugeMethod.umn(start1.getA(), start1.getB());
        double result4 = hugeMethod.del(start1.getA(), start1.getB());
        double result5 = hugeMethod.pow(start1.getA());
        double result6 = hugeMethod.pow(start1.getB());

    }

    public static void output(int i) {
        System.out.println(i);
    }

    public static void output(double d) {
        System.out.println(d);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
