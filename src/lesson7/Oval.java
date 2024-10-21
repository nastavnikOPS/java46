package lesson7;

public class Oval {
    private double a;
    private double b;

    public Oval(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Oval(double b) {
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    public void perimetrOval(){
        System.out.println(2 * Math.PI * Math.sqrt(((a * a) + (b * b)) / 2));
    }
    public void squareO(){
        System.out.println(Math.PI * a * b);
    }
}
