package lesson9;

public class UkrainianHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth() {
        return 25;
    }

    @Override
    public String getCountry() {
        return "Украина";
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }
}
