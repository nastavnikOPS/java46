package lesson3;

public class MatsUtils {
    /**
     * Задача создать метод, который будет считать периметр треугольника по
     * трем сторонам и печатать на консоль результат;
     * модификатор доступа -
     * (один из 4 слов), данное слово определяет область видимости метода;
     * public - доступен всем внутри проекта;
     * protected - видимость внутри пакета и дочерним классам
     * ________ - пакетный (видимость внутри текущего пакета)
     * private - видимость внутри текущего класса;
     *
     * 2 - static (или используется или нет)
     * если метод со словом static - то этот метод вызывается у названия класса;
     *
     * 3 - возвращаемый тип (или слово void если такого нет)
     * 4 - название метода
     * 5 - входящие параметры () через запятую ТИП НАЗВАНИЕ
     * 6 - тело выполнения метода
     */
    public static void printPerimetrTriangle(int a, int b, int c) {
        System.out.println(a + b + c);
    }
     //Создать метод, который будет печатать на консоль только четные(создаем в виде входящих параметров),
    //из того интервала цифр, который мы укажим в виде входящих параметров

    public static void printMultiplesByInterval(int numberFrom, int numberTo, int kratnost){
        // 40 -> numberFrom
        // 60 -> numberTo
        // 3 -> kratnost

        //Напечатать на консоль цифры от 40 до 60, кратные 3
        for(int i = numberFrom; i < numberTo; i++){
            if(i % kratnost == 0){
                System.out.println(i);
            }
        }
    }
}
