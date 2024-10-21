package lesson6;

public class Main1 {
    public static void main(String[] args){
        // Есть текст (задаем его сами)
        // Напечатать его на консоль через символ

        String text = "Я учусь на разработчика Java";
        char[] symbol = text.toCharArray(); // ['Я', '' , '' ,'у']
        for (int i = 0; i < symbol.length; i = i + 2){
            System.out.println(symbol[i]);
        }







    }
}
