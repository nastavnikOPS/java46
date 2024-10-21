package lesson12;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorTest {
    public static void main(String[] args) {
        Coin coin1 = new Coin(50, 1999, "Silver", 2.5);
        Coin coin2 = new Coin(50, 1999, "Platinum", 2.5);
        Coin coin3 = new Coin(30, 1997, "Aurum", 3.5);
        Coin coin4 = new Coin(40, 2000, "Platinum", 4.5);
        Coin coin5 = new Coin(30, 1992, "Silver", 5.5);
        Coin coin6 = new Coin(20, 1959, "Aurum", 3.5);

        Set<Coin> coinSet = new TreeSet<>(new SortByDiametr());
        coinSet.add(coin1);
        coinSet.add(coin2);
        coinSet.add(coin3);
        coinSet.add(coin4);
        coinSet.add(coin5);
        coinSet.add(coin6);

        Set<Coin> coinSet2 = new TreeSet<>(new Comparator<Coin>() {
            @Override
            public int compare(Coin o1, Coin o2) {
                //Сначала сортируем по диаметру от меньшего к большему
                if (o1.getDiametr() != o2.getDiametr()) {
                    return Double.compare(o1.getDiametr(), o2.getDiametr());
                }
                //Потом сортируем по номиналу от большего к меньшему
                if (o2.getNominal() != o1.getNominal()) {
                    return o2.getNominal() - o1.getNominal();
                }
                //Потом сортируем по металлу от Z до A
                if (!o1.getMetalName().equals(o2.getMetalName())) {
                    return o2.getMetalName().compareTo(o1.getMetalName());
                }
                return 0;
            }
        });
        coinSet2.add(coin1);
        coinSet2.add(coin2);
        coinSet2.add(coin3);
        coinSet2.add(coin4);
        coinSet2.add(coin5);
        coinSet2.add(coin6);

        for (Coin coin: coinSet){
            System.out.println(coin);
        }
        System.out.println("____");
        for (Coin coin: coinSet2){
            System.out.println(coin);
        }
    }
}
