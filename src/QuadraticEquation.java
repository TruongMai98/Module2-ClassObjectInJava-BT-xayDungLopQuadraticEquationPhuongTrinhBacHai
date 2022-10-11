public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getter() {
        return "a = " + a + "\n" + "b = " + b + "\n" + "c = " + c;
    }

    public double getDiscriminant() {
        return (this.b * 2) - (4 * this.a * this.c);
    }

    public double getRoot1() {
        return (- this.b + Math.sqrt((Math.pow(this.b,2) - 4 * this.a * this.c))) / 2 * this.a * this.c;
    }
    public double getRoot2() {
        return (- this.b - Math.sqrt((Math.pow(this.b,2) - 4 * this.a * this.c))) / 2 * this.a * this.c;
    }
}
