package lesson3;

import java.util.StringTokenizer;

public class homework2 {
    public static void main(String[] args) {

        // Только четные числа от -100 до -50

        for (int i = -100; i <= -50; i = i + 2) {
            System.out.println(i);
        }

        // Все числа в обратном порядке от 10 до 30

        for (int i = 30; i >= 10; i--) {
            System.out.println(i);
        }

        // Числа от 50 до 500, которые одновременно кратны на 3 и 5

        int first = 50;
        int second = 500;
        int multiples = 3;
        int multiples2 = 5;

        for (int i = first; i <= second; i++) {
            if (i % multiples == 0 && i % multiples2 == 0)
            System.out.println(i);
        }

        // Посчитать сколько нужно лет, чтобы собрать сумму в 200к, если откладывать ежемесячно по 9500к

        int deferredAmount = 9500;
        int finalAmount = 200000;
        int accumulatedAmount = 0;
        int months = 0;
        int years = 0;

        for (int i = 0; accumulatedAmount < finalAmount; i++) {
            accumulatedAmount += deferredAmount;
            if (months % 12 == 0) ;
            years++;
        }
        System.out.println(years + "лет и " + months + "месяцев");

        //

        for (int i = 20; i <= 60; i++){
            if (i >= 30 && i <= 40){
                continue;
            }
            System.out.println(i);
        }
    }
}