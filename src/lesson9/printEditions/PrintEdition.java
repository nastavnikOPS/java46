package lesson9.printEditions;

public abstract class PrintEdition {
    private String name;
    private int year;
    private int pages;
    private String izdatelstvo;

    public PrintEdition() {
    }

    public PrintEdition(String name, String izdatelstvo, int pages, int year) {
        this.name = name;
        this.izdatelstvo = izdatelstvo;
        this.pages = pages;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIzdatelstvo() {
        return izdatelstvo;
    }

    public void setIzdatelstvo(String izdatelstvo) {
        this.izdatelstvo = izdatelstvo;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public abstract void printInfo();

}
