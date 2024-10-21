package lesson9;

public class Flower extends Rastenie{

    public void tsvesti(){
        System.out.println("Цветок цветет");
    }

    @Override
    public void printInfo(){
        System.out.println("Я цветок");
    }
}
