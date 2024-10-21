package lesson9;

public class RussianHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth() {
        return 50;
    }

    @Override
    public String getCountry() {
        return "Россия";
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }
}
