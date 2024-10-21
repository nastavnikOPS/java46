package lesson9;
public class HenFactory {
    public Hen getHen(String country){
        Hen hen = null;
        switch (country){
            case "Россия":
                return new RussianHen();
            case "Украина":
                return new UkrainianHen();
            case "Беларусь":
                return new BelarusianHen();
            case "Молдова":
                return new MoldovanHen();
        }
        return hen;
    }

    public static void main(String[] args) {
        HenFactory hen = new HenFactory();
        Hen russianHen = hen.getHen("Россия");
        System.out.println(russianHen.getDescription() + "Моя страна - " + russianHen.getCountry() + " - я несу " + russianHen.getCountOfEggsPerMonth() + " яиц в месяц");
        Hen ukrainianHen = hen.getHen("Украина");
        System.out.println(ukrainianHen.getDescription() + "Моя страна - " + ukrainianHen.getCountry() + " - я несу " + ukrainianHen.getCountOfEggsPerMonth() + " яиц в месяц");
        Hen belarusianHen = hen.getHen("Беларусь");
        System.out.println(belarusianHen.getDescription() + "Моя страна - " + belarusianHen.getCountry() + " - я несу " + belarusianHen.getCountOfEggsPerMonth() + " яиц в месяц");
        Hen moldovanHen = hen.getHen("Молдова");
        System.out.println(moldovanHen.getDescription() + "Моя страна - " + moldovanHen.getCountry() + " - я несу " + moldovanHen.getCountOfEggsPerMonth() + " яиц в месяц");
    }
}
