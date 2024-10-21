package lesson9;

public abstract class Hen {
    private String hen;

    public abstract String getCountry();
    public abstract int getCountOfEggsPerMonth();
    public String getDescription(){
        return "Я курица. ";
    }
}
