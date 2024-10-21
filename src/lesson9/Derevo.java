package lesson9;

public class Derevo extends Rastenie{

    public void spilitDerevo(){
        System.out.println("Пилим дерево");
    }

    @Override
    public void printInfo(){
        System.out.println("Я дерево");
    }
}
