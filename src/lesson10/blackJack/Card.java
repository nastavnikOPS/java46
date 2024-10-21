package lesson10.blackJack;

public class Card {
    private String mast;
    private int ball;

    public Card(String mast, int ball) {
        this.mast = mast;
        this.ball = ball;
    }
    public void open(){
        System.out.println(mast);
    }

    public String getMast() {
        return mast;
    }

    public void setMast(String mast) {
        this.mast = mast;
    }

    public int getBall() {
        return ball;
    }

    public void setBall(int ball) {
        this.ball = ball;
    }
}
