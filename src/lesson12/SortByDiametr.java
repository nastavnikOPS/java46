package lesson12;

import java.util.Comparator;

public class SortByDiametr implements Comparator<Coin> {
    @Override
    public int compare(Coin o1, Coin o2) {
        //Сначала сортируем по диаметру от большего к меньшему
        if (o1.getDiametr() != o2.getDiametr()) {
            return Double.compare(o2.getDiametr(), o1.getDiametr());
        }
        //Потом сортируем по номиналу от меньшего к большему
        if (o1.getNominal() != o2.getNominal()) {
            return o1.getNominal() - o2.getNominal();
        }
        //Потом сортируем по году от меньшего к большему
        if (o1.getYear() != o2.getYear()) {
            return o1.getYear() - o2.getYear();
        }
        //Потом сортируем по металлу от A до Z
        if (!o1.getMetalName().equals(o2.getMetalName())) {
            return o1.getMetalName().compareTo(o2.getMetalName());
        }
        return 0;
    }
}

