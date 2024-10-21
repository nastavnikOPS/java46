package lesson15;

import lesson12.Coin;
import lesson12.SortByDiametr;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Coin coin1 = new Coin(50, 1999, "Silver", 2.5);
        Coin coin2 = new Coin(50, 1999, "Platinum", 2.5);
        Coin coin3 = new Coin(30, 1997, "Aurum", 3.5);
        Coin coin4 = new Coin(40, 2000, "Platinum", 4.5);
        Coin coin5 = new Coin(30, 1992, "Silver", 5.5);
        Coin coin6 = new Coin(20, 1959, "Aurum", 3.5);

        List<Coin> coinList = new ArrayList<>();
        coinList.add(coin1);
        coinList.add(coin2);
        coinList.add(coin3);
        coinList.add(coin4);
        coinList.add(coin5);
        coinList.add(coin6);

        coinList
                .stream() //запуск элементов в поток
                .filter(coin -> coin.getYear() < 2000)
                .filter(coin -> coin.getMetalName().equals("Silver")) //фильтрует элементы как нам надо
                .limit(2) //уточняем лимит
                .skip(0) //пропускаем нужное кол-во элементов
                .peek(coin -> System.out.println(coin)) //совершает действие над элементами
                .toList();
    }
}
