package lesson7;

public class Main {
    public static void main(String[] args) {
        Person vasya = new Person();
        Person petya = new Person();


        vasya.setAge(23);
        petya.setAge(17);
        vasya.setName("Тата");

        System.out.println(vasya.getAge());
        System.out.println(petya.getAge());
        System.out.println(vasya.getName());
    }
}
