package lesson9.printEditions;

public class Main {
    public static void main(String[] args) {
        PrintEdition[] lubrary = new PrintEdition[5];
        lubrary[0] = new Magazine("Каспер", "Москва", 25, 1998,5);
        lubrary[1] = new Magazine("Каспер", "Москва", 46, 1999,8);
        lubrary[2] = new Magazine("Каспер", "Москва", 77, 1978,3);
        lubrary[3] = new Book("Война и мир", "Москва", 64, 2003,"Толстой");
        lubrary[4] = new Book("Мастер и Маргарита", "Москва", 1000, 2007,"Толстой");
        lubrary[4] = new Book("Ромео и Джульетта", "Москва", 1500, 2007,"Шекспир");

        PrintEdition theFat = lubrary[0];
        for (PrintEdition pe : lubrary){
            if (theFat.getPages() < pe.getPages()){
                theFat = pe;
            }
        }
        theFat.printInfo();
    }
}
