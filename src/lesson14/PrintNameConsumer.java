package lesson14;

import java.util.function.Consumer;

public class PrintNameConsumer implements Consumer<String> {
    @Override
    public void accept(String name) {
        if (new IsContainsJ().test(name)) {
            System.out.println(name + " пропускаю");
        } else {
            System.out.println(name + " не пропускаю");
        }
    }
}

//Consumer<String> printNameConsumer = name -> {
//    if (isContainsJ.test(name)) {
//        System.out.println(name + " пропускаю");
//    } else {
//        System.out.println(name + " не пропускаю");
//    }
//};

//
//for (String name : namesList) {
//        printNameConsumer.accept(name);
//}

//одно и то же


