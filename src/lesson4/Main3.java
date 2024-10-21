package lesson4;

public class Main3 {
    public static void main(String[] args) throws InterruptedException {

        // Напишем таймер с максимальным рабочим временем 3 года, если его не выключать
        // Данный таймер должен показать сколько времени прошло от старта

        for(int year = 0; year < 3; year++){ // тело работает 1 год
            for(int months = 0; months < 12; months++){ // тело работает 1 месяц
                for(int day = 0; day < 30; day++){ // тело работает 1 день
                    for(int hour = 0; hour < 24; hour++){ // тело работает 1 час
                        for(int min = 0; min < 60; min++){ // тело работает 1 минуту
                            for(int sec = 0; sec < 60; sec++){ // тело работает 1 секунду
                                Thread.sleep(1000);
                                System.out.printf("Со старта прошло: %d года, %d месяца, %d дней, %d часа, %d минут, %d секунды \n" , year, months,day, hour, min, sec);
                            }

                        }

                    }

                }

            }

        }

    }
}
