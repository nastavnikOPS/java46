package lesson7.shop;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setLevel(15);
        user.setUsername("Пришелец-TG99999");
        user.setPathToImage("C://qwerty//taps.jpg");

        Komment comment = new Komment();
        comment.setUser(user);
        comment.setReiting(4);
        comment.setDostoinstva("Очень тихий фен");
        comment.setNedostatki("Цена не очень");
        comment.setComments("В целом, мне понравился товар");

        System.out.println(comment);
    }
}
