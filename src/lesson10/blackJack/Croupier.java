package lesson10.blackJack;

public class Croupier extends Player{

    public Croupier(){
        super("КРУПЬЕ");
    }

    @Override
    public boolean needsMoreCard() {
        if (countBallsInHand() < 17){
            return true;
        }
        return false;
    }
}
