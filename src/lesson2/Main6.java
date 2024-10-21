package lesson2;

public class Main6 {
    public static void main(String[] args) {
        //У нас есть 100 000 рублей
        //Сколько денег мы снимем с депозита
        //Если положим данные деньги на 7 лет под 17%
        //Капитализация ежемесячная и деньги мы не забираем весь срок

        int money = 100000;
        int year = 7;
        int prosent = 17;

        //7 * 12 раз
        for(int month = 0; month < 12 * year; month++){ //действие каждый месяц
            money = money + ((money/100) * prosent) / 12; //ежемесячное увеличение на 17% в год


        }
        System.out.println(money);
    }
}
