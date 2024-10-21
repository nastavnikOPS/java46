package lesson6;

public class Main3 {
    public static void main(String[] args) {
        // У нас есть путь картинки
        // Нужно проверить - реально ли это картинка (ее ссылка)

        String pathToImg = "C://qwerty//qwr//q.jpg";

        //this - ссылка на объект pathToImg внутри метода endsWith
        if (pathToImg.endsWith(".jpg") || pathToImg.endsWith(".png")) {
            System.out.println("Это картинка!");
        }else {
            System.out.println("Это не картинка!");
        }
    }
}
