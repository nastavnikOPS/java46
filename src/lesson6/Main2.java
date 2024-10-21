package lesson6;

public class Main2 {
    public static void main(String[] args){
        // Нам от пользователя приходит новый пароль
        // 1)Проверяем длину (более 8 символов)
        // 2)Должна быть хоть 1 большая буква
        // 3)Должна быть хоть 1 цифра

        String password = "kasperSky25";
        if (password.length() < 8){
            System.out.println("Пароль меньше 8 символов!");
            return;
        }
        if (!password.contains("0") && !password.contains("1") && !password.contains("2") && !password.contains("3") &&
                !password.contains("4") && !password.contains("5") && !password.contains("6") && !password.contains("7") &&
                !password.contains("8") && !password.contains("9")) {
            System.out.println("Пароль не содержит цифр!");
            return;
        }
        String alphabet = "абвгдежзийклмнопрстуфхцчшщъыьэюяabcdefghijklmnopqrstuvwxyz";
        String alphabetUpper = alphabet.toUpperCase(); //АБВГ....

        int countUpper = 0;

        //генерируем индексы букв внутри пароля
        for (int i = 0; i < password.length(); i++) {
           //берем 1 символ из пароля
           char ch = password.charAt(i);
           if (alphabetUpper.contains(ch + "")){ //проверяем содержание
              countUpper++;
           }
        }
        if (countUpper == 0){
            System.out.println("Пароль не содержит большую букву!");
        }else {
            System.out.println("Ура, пароль подходит!");
        }
    }
}
