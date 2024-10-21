package lesson3;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        //Напишем программу, которая будет у пользователя (у нас)
        //спрашивать, какую фигуру мы хотим посчитать (треугольник, квадрат, овал, круг, прямоугольник)
        //Программа запросит у нас ввести все необходимые данные о фигуре
        //и далее выведет на консоль ПЛОЩАДЬ и ПЕРИМЕТР этих фигур

        System.out.println("Выберите фигуру");
        System.out.println("1 - Треугольник");
        System.out.println("2 - Овал");
        System.out.println("3 - Квадрат");
        System.out.println("4 - Прямоугольник");
        System.out.println("5 - Круг");

        //Scanner - тип, описывает "считыватель" информации с источника
        //Формула создания ЛЮБОГО объекта (все то, что есть не примитивный тип)

        Scanner scanner = new Scanner(System.in);
        int selectFigura = scanner.nextInt();

        // управляющая конструкция (if      swich)

        switch (selectFigura){
            case 1: // если пользователь выбрал Треугольник
                System.out.println("Введите сторону А: ");
                int a = scanner.nextInt();
                System.out.println("Введите сторону B: ");
                int b = scanner.nextInt();
                System.out.println("Введите сторону С: ");
                int c = scanner.nextInt();
                System.out.println("Периметр треугольника: " + (a + b + c));
                break;
            case 2: //если пользователь выбрал Овал
                System.out.println("Введите малый радиус: ");
                int r1 = scanner.nextInt();
                System.out.println("Введите большой радиус: ");
                int r2 = scanner.nextInt();
                double p = 2 * Math.PI * Math.sqrt(((r1 * r1) + (r2 * r2)) / 2);
                System.out.println("Периметр овала: " + p);
                break;
            case 3: //если пользователь выбрал Квадрат
                System.out.println("Введите сторону А: ");
                int side = scanner.nextInt();
                System.out.println("Периметр квадрата: " + (side * 4));
                System.out.println("Площадь квадрата: " + (side * side));
                break;
            case 4: //если пользователь выбрал Прямоугольник
                System.out.println("Введите сторону 1: ");
                int side1 = scanner.nextInt();
                System.out.println("Введите сторону 2: ");
                int side2 = scanner.nextInt();
                System.out.println("Периметр прямоугольника: " + (side1 + side2) * 2);
                System.out.println("Площадь прямоугольника: " + (side1 * side2));
                break;
            case 5: //если пользователь выбрал Круг
                System.out.println("Введите радиус круга: ");
                int r3 = scanner.nextInt();
                double p2 = Math.PI * r3 * 2;
                double s1 = Math.PI * r3 * r3;
                System.out.println("Периметр круга: " + p2);
                System.out.println("Площадь круга: " + s1);
                break;



        }


    }
}
