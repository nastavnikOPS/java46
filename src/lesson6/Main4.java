package lesson6;

public class Main4 {
    public static void main(String[] args) {
        // У нас есть email
        // Нужно проверить:
        // 1)должна быть одна @; 2)email не заканчивается на точку;
        // 3)часть после @ содержит точку

        String email = "alex.qwerty@gmail.com";
        // contains - проверка содержания /первый способ (не очень)
        // split - "разрезать" текст по ... ---> String[] /второй способ
        String[] partsOfEmail = email.split("@");
        if (partsOfEmail.length != 2){
            System.out.println("В email нет @ или их больше чем 2");
            return;
        }
        if (email.endsWith(".") || email.startsWith(".")) {
            System.out.println("Email не может заканчиваться на точку!");
            return;
        }
        if (!partsOfEmail[1].contains(".")){
            System.out.println("Часть после @ не содержит точку!");
        }else {
            System.out.println("Email подходит!");
        }
    }
}
