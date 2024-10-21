package lesson14;

import java.util.function.Predicate;

public class IsContainsJ implements Predicate<String> {
    @Override
    public boolean test(String name) {
        return name.contains("J") || name.contains("j");
    }

    Predicate<String> isContainsJ = name -> name.contains("J") || name.contains("j");

//        Predicate<String> isContainsJ = new Predicate<String>() {
//            @Override
//            public boolean test(String name) {
//                return name.contains("J") || name.contains("j");
//            }
//        };


///Это 3 одинаковых реализации
}








