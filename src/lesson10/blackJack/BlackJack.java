package lesson10.blackJack;

public class BlackJack {
    private Koloda koloda= new Koloda();
    private Player[] players = new Player[9];



    public BlackJack(){
        koloda.createKoloda();
    }

    public void addPlayerToGame(Player player) {
        for(int i = 0; i < players.length; i++){
            if(players[i] == null){
                players[i] = player;
                break;
            }
        }
    }

    public void dealTwoCardsToAllPlayers(){
        for (Player p: players){
            if(p != null){
                p.addCardToHand(koloda.randomCard());
                p.addCardToHand(koloda.randomCard());
            }
        }
    }

    public void dealRestCardsToAllPlayers() {
        for (Player p: players){
            if (p != null){
                // Узнаем, нужна ли карта и даем ее, если ответ да (пока не скажет нет)
                while (p.needsMoreCard()){ // Метод должен вернуть true или false
                    p.addCardToHand(koloda.randomCard());
                }
            }
        }
    }

    public void printWinner() {
        // 24'  25'  22'  24'   - выиграл крупье (когда у всех перебор)
        // 15   17   16   18   - 18
        // 21   21   21   18   - 3 игрока
        // 18   18   25'  17   - 2 игрока по 18
        // 24'  21   18   20   - 21 выиграл
        // 21   21   21   21   - все выиграли

        // Выключаем игроков, у которых перебор
        for (Player p: players){
            if (p != null && p.countBallsInHand() > 21){
                p.setInGame(false); // выключили игрока, у которого перебор
            }
        }
        // Если у всех перебор - победил Крупье
        if (countPlayersInGame() == 0){
            for (Player p: players){
                if (p != null && p instanceof Croupier){
                    System.out.println("---- ПОБЕДИТЕЛЬ: " + p.getName());
                    p.printHand();
                    return;
                }
            }
        }
        // Если остался один в игре - печатаем его
        if (countPlayersInGame() == 1){
            for (Player p: players){
                if (p != null && p.isInGame()){
                    System.out.println("---- ПОБЕДИТЕЛЬ: " + p.getName());
                    p.printHand();
                    return;
                }
            }
        }
        // Находим балл победителя (ближе к 21)
        int winnerBall = 1;
        for (Player p: players){
            if (p != null && p.isInGame() && p.countBallsInHand() > winnerBall){
                winnerBall = p.countBallsInHand();

            }
        }
        // Печатаем на консоль игроков, у кого балл победителя
        for (Player p: players){
            if (p != null && p.countBallsInHand() == winnerBall){
                System.out.println("---- ПОБЕДИТЕЛЬ: " + p.getName());
                p.printHand();
            }
        }
    }
    private int countPlayersInGame(){
        int count = 0;
        for (Player p: players){
            if (p != null && p.isInGame()){
                count++;
            }
        }
        return count;
    }
}
