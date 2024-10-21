package lesson9.printEditions;

public class Book extends PrintEdition{
    private String author;

    public Book() {
    }

    @Override
    public void printInfo() {
        System.out.println("Книга " + getName() + "кол-во страниц" + getPages());
    }

    public Book(String name, String izdatelstvo, int pages, int year, String author) {
        super(name, izdatelstvo, pages, year);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
