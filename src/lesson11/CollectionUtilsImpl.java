package lesson11;

import java.util.*;

public class CollectionUtilsImpl implements CollectionUtils{

    private static void notNull(Collection<Integer> a, Collection<Integer> b) {
        if (a == null || b == null){
            throw new NullPointerException();
        }
    }

    //Объединение двух коллекций с дубликатами
    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        notNull(a, b);
        Collection<Integer> result = new ArrayList<>();
        result.addAll(a);
        result.addAll(b);
        return result;
    }

    //Пересечение двух коллекций с дубликатами
    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        notNull(a, b);
        Collection<Integer> result = new ArrayList<>();
        for (Integer aItem: a){
            if (b.contains(aItem)){
                result.add(aItem);
                result.add(aItem);
            }
        }
        return result;
    }

    //Объединение двух коллекций без дубликатов
    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        notNull(a, b);
        Set<Integer> result = new HashSet<>();
        result.addAll(a);
        result.addAll(b);
        return result;
    }

    //Пересечение двух коллекций без дубликатов
    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        notNull(a, b);
        Set<Integer> result = new HashSet<>();
        for (Integer aItem: a){
            if (b.contains(aItem)){
                result.add(aItem);
            }
        }
        return result;
    }

    //Разность двух коллекций
    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        notNull(a, b);
        Collection<Integer> result1 = new HashSet<>(a);
        result1.removeAll(b);
        Collection<Integer> result2 = new HashSet<>(b);
        result2.removeAll(a);
        Collection<Integer> result = new HashSet<>();
        result.addAll(result1);
        result.addAll(result2);
        return result;
    }
}
