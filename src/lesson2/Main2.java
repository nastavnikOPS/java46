package lesson2;

public class Main2 {
    public static void main(String[] args) {
        //напечатать на консоли какой вид треугольника по трем сторонам


        int a = 13;
        int b = 17;
        int c = 12;

        if (a != b && b != c && a != c) {
            System.out.println("это разносторонний треугольник");
        } else if (a == b && b == c && a == c) {
            System.out.println("это равносторонний треугольник");
        } else {
            System.out.println("это равнобедренный треугольник");


        }
    }
}