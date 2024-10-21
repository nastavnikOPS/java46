package lesson9;

public class Main {
    public static void main(String[] args) {
        Flower flower = new Flower();
        Flower flower2 = new Flower();
        Derevo derevo = new Derevo();
        Derevo derevo2 = new Derevo();

        Rastenie[] sad = new Rastenie[4];
        sad[0] = derevo2;
        sad[1] = derevo;
        sad[2] = flower2;
        sad[3] = flower;

        for (Rastenie r : sad){
            r.printInfo(); //проявление полиморфизма
        }
    }
}
