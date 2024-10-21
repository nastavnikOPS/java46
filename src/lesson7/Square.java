package lesson7;

public class Square {
    private int a;

    public Square(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    public void perimetrSquare(){
        System.out.println(a * 4);
    }
    public void squareS(){
        System.out.println(a * a);
    }
}






