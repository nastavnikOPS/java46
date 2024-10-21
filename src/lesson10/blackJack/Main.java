package lesson10.blackJack;

public class Main {
    public static void main(String[] args) {
        Croupier croupier = new Croupier();
        BlackJack blackJack = new BlackJack(); // В момент вызова объекта должна создаваться внутри колода карт

        Player vasya = new Player("Василий");
        Player petya = new Player("Петр");
        Player kolya = new Player("Николай");

        blackJack.addPlayerToGame(vasya);
        blackJack.addPlayerToGame(petya);
        blackJack.addPlayerToGame(kolya);
        blackJack.addPlayerToGame(croupier);

        blackJack.dealTwoCardsToAllPlayers(); // Всем по 2 карты
        blackJack.dealRestCardsToAllPlayers(); // Всем оставшиеся карты
        blackJack.printWinner();


    }
}
