package lesson6;

public class Homework6 {
    public static void main(String[] args) {
        // Есть текст "Я буду учиться лучше и лучше"

        //1)Напечатать на консоль каждое слово в отдельной строке

        String first = "Я буду учиться лучше и лучше";
        char[] text1 = first.toCharArray();
        for(int i = 0; i < text1.length; i++){
            System.out.println(text1[i]);
        }
        System.out.println();

        //2)Напечатать на консоль предложение полностью наоборот

        String second = "Я буду учиться лучше и лучше";
        char[] text2 = second.toCharArray();
        for(int i = text2.length - 1; i >= 0; i--){
            System.out.print(text2[i]);
        }
        System.out.println();

        //3)Напечатать на консоль количество гласных букв в тексте

        String three = "Я буду учиться лучше и лучше";
        int totalVowels = 0;
        for (char v : three.toLowerCase().toCharArray()){
            if("яуууияуеиуе".indexOf(v) != -1){
                totalVowels++;
            }
        }
        System.out.println(totalVowels);

        //4)Заменить в тексте все гласные на БОЛЬШИЕ гласные и напечатать итоговый текст на консоль

        String vowelsUpper = new String("Я буду учиться лучше и лучше");
        StringBuilder upperV = new StringBuilder();
        for (char v : vowelsUpper.toCharArray()){
            if("яуууияуеиуеЯУУУИЯУЕИУЕ".indexOf(v) != -1){
                upperV.append(Character.toUpperCase(v));
            }else {
                upperV.append(v);
            }
        }
        System.out.println(upperV.toString());
    }
}
