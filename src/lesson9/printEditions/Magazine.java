package lesson9.printEditions;

public class Magazine extends PrintEdition{
    private int numberOfYear;

    public Magazine() {
    }

    @Override
    public void printInfo() {
        System.out.println("Журнал " + getName() + "кол-во страниц " + getPages());
    }

    public Magazine(String name, String izdatelstvo, int pages, int year, int numberOfYear) {
        super(name, izdatelstvo, pages, year);
        this.numberOfYear = numberOfYear;
    }

    public int getNumberOfYear() {
        return numberOfYear;
    }

    public void setNumberOfYear(int numberOfYear) {
        this.numberOfYear = numberOfYear;
    }
}
