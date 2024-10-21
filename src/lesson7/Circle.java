package lesson7;

public class Circle {
    private double a;

    public Circle(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
    public void perimetrCircle(){
        System.out.println(Math.PI * a * 2);
    }
    public void squareC(){
        System.out.println(Math.PI * a * a);
    }
}
