package lesson2;

public class  lesson2 {
    public static void main(String[] args) {


        //есть число. вывести на консоль это четное число(true)
        //или нечетное (false)
        //boolean --- true | false

        int number = 123;

        //управляющая конструкция (позволяет выполнить что-то одно)
        //123 % 2 = 1
        if (number % 2 == 0) {
            System.out.println("это четное число");
        } else { // Выполнится, когда не выполнится if
            System.out.println("это не четное число");



        }

    }

}


