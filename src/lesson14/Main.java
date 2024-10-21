package lesson14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        List<String> namesList = new ArrayList<String>();
        namesList.add("John");
        namesList.add("Jane");
        namesList.add("Bob");
        namesList.add("Mary");
        namesList.add("Jack");

        Supplier<String> helloSupplier = () -> "Привет ";
        for (String name : namesList) {
            System.out.println(helloSupplier.get() + name);
        }

 //       Supplier<Integer> randomCountGenerator = () -> new Random().nextInt();
 //               System.out.println(new RandomCountGenerator().get());

 //       Predicate<String> isContainsJ = name -> name.contains("J") || name.contains("j");
 //       Consumer<String> printNameConsumer = name -> System.out.println(name);
 //       if (isContainsJ.test(name)){
 //           System.out.println(name + " пропускаю");
 //       }else {
 //           System.out.println(name + " не пропускаю");
        }
 
 //       for (String name: namesList){
 //           printNameConsumer.accept(name);
            }
 //       } int random = new Random().nextInt();
 //   }
//По сути, это анонимный (без имени) класс или метод. Что это