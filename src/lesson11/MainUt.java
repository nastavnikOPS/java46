package lesson11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainUt {
    public static void main(String[] args) {
        CollectionUtils collectionUtilsImpl = new CollectionUtilsImpl();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(6);

        System.out.println("Объединение двух коллекций с дубликатами: ");
        System.out.println(collectionUtilsImpl.union(list, set));
        System.out.println("Пересечение двух коллекций с дубликатами: ");
        System.out.println(collectionUtilsImpl.intersection(list, set));
        System.out.println("Объединение двух коллекций без дубликатов: ");
        System.out.println(collectionUtilsImpl.unionWithoutDuplicate(list, set));
        System.out.println("Пересечение двух коллекций без дубликатов: ");
        System.out.println(collectionUtilsImpl.intersectionWithoutDuplicate(list, set));
        System.out.println("Разность двух коллекций: ");
        System.out.println(collectionUtilsImpl.difference(list, set));

    }
}


