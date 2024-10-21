package lesson9;

public class MoldovanHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth() {
        return 65;
    }

    @Override
    public String getCountry() {
        return "Молдова";
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }
}
