package lesson13;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Fridge {
    //String - название продукта
    //Double - вес в граммах
    private Map<String, Double> fridgeMap = new HashMap<String, Double>();

    //Положим продукты в холодильник
    public void putProducts(String productName, double weight) {
        //Уже лежит вес в граммах
        double existWeight = 0;
        if (fridgeMap.containsKey(productName)) {
            existWeight = fridgeMap.get(productName);
        }
        //Кладем текущий вес + новый
        fridgeMap.put(productName, existWeight + weight);
    }
    //Берем продукт из холодильника (не только вывести на консоль, но и списать вес)
    //обработать ситуацию, когда запрошенного веса не достаточно
    public boolean getProduct(String productName, double weight) {
        if (fridgeMap.containsKey(productName)) {
            double weightProduct = fridgeMap.get(productName);
            if (weightProduct >= weight) {
                fridgeMap.put(productName, weightProduct - weight);
                System.out.println(weight + " " + productName + " получено.");
                return true;
            } else {
                System.out.println("Недостаточно " + productName + " для получения.");
                return false;
            }
        }else {
            System.out.println(productName + " не найден.");
            return false;
        }
    }
        public void printAllProducts () {
            for (Map.Entry<String, Double> entry : fridgeMap.entrySet()) {
                System.out.println("Название продукта: " + entry.getKey() + ", количество грамм: " + entry.getValue());
            }
        }
    //Вывести вес всех продуктов в холодильнике (сумма)
    public void printWeightAllProduct(){
        double weightAllProduct = 0;
        for (Double value : fridgeMap.values()) {
            weightAllProduct += value;
        }
        System.out.println("Вес всех продуктов составляет: " + weightAllProduct + " грамм");
    }
    //Вывести вес конкретного продукта в холодильнике
    public void printWeightProduct(String productName){
        if (fridgeMap.containsKey(productName)) {
            System.out.println("Вес продукта составляет " + fridgeMap.get(productName + " грамм"));
        }else {
            System.out.println("Данного продукта нет в холодильнике");
        }
    }
    //Вывести наименование продукта, которого больше всего
    public void printTheMostProductWeight() {
        String printTheMostProductWeight = "";
        double weight = 0;
        for (Map.Entry<String, Double> entry : fridgeMap.entrySet()) {
            if (entry.getValue() > weight) {
                weight = entry.getValue();
                printTheMostProductWeight = entry.getKey();
            }
        }
        System.out.println("Больше всего - " + printTheMostProductWeight);
    }
    //Вывести наименование продукта, который закончится первым
    public void printProductFirstEnd() {
        //Создали две переменные, чтобы хранить наименование продукта с наименьшим весом
        //и его вес в процессе расчетов
        String printProductFirstEnd = "";
        Double weight = null;
        //Работаем с каждой ячейкой внутри цикла
        for (Map.Entry<String, Double> entry : fridgeMap.entrySet()) {
            //Любой первый продукт пишем в weight и printProductFirstEnd
            if (weight == null){
                weight = entry.getValue();
                printProductFirstEnd = entry.getKey();
            }else {
                //Сравниваем каждый следующий продукт и перезаписываем, если его меньше, чем тех, что уже проверяли
                if (entry.getValue() < weight) {
                    weight = entry.getValue();
                    printProductFirstEnd = entry.getKey();
                }
            }
        }
        System.out.println("Меньше всего - " + printProductFirstEnd);
    }
    //Вывести все продукты (название + вес) по алфавиту от А до Я
    public void printProducts() {
        //Сделали TreeMap и реализовали компаратор в анонимном классе
        TreeMap<String, Double> sortedMap = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        //Закинули в нее все элементы из fridgeMap
        sortedMap.putAll(fridgeMap);
        //Вывели все продукты циклом for
        for (Map.Entry<String, Double> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
