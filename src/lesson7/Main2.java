package lesson7;

public class Main2 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(6,8,10);
        triangle.perimetrTriangle();
        triangle.squareT();

        Square square = new Square(16);
        square.perimetrSquare();
        square.squareS();

        Rectangle rectangle = new Rectangle(4,8);
        rectangle.perimetrRectangle();
        rectangle.squareR();

        Circle circle = new Circle(68);
        circle.perimetrCircle();
        circle.squareC();

        Oval oval = new Oval(12.5, 14.5);
        oval.perimetrOval();
        oval.squareO();
    }
}
