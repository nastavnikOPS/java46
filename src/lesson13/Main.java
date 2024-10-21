package lesson13;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> summerReadMap = new TreeMap<>();
        summerReadMap.put("451 градус по фаренгейту", 350);
        summerReadMap.put("Тихий Дон", 1000);
        summerReadMap.put("Армагедон", 340);

        //Название книги: <название>, количество страниц: ...
        for (Map.Entry<String, Integer> entry : summerReadMap.entrySet()) {
            System.out.println("Название книги: " + entry.getKey() + ", количество страниц: " + entry.getValue());
        }
        for (String key : summerReadMap.keySet()) {
            System.out.println("Название книги: " + key + ", количество страниц: " + summerReadMap.get(key));
        }
        System.out.println(summerReadMap.get("Мертвые души"));
        System.out.println(summerReadMap.getOrDefault("Мертвые души", 0));
    }
}
