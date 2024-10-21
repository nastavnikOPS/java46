package lesson12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String string1 = "Java";
        String string2 = new String("Java");
        System.out.println(string1 == string2);
        System.out.println(string1.equals(string2));
    }

    private static void printAndDeleteWithIterator(){
        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(3);
        numbersList.add(4);

        Iterator<Integer> iterator = numbersList.iterator();
        while (iterator.hasNext()){
            Integer number = iterator.next();
            System.out.println(number);
            iterator.remove();
        }
    }
    private static void printAndDeleteWithFor(){
        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(3);
        numbersList.add(4);

        for (Integer number: numbersList){
            System.out.println(number);
            numbersList.remove(number);
        }

    }
}
