package lesson8;

public class Tour {
    private String country;
    private int days;
    private String transport;
    private int price;
    private Hotel hotel;


    public Tour() {
    }

    public Tour(String country, Hotel hotel, int price, int days, String transport) {
        this.country = country;
        this.hotel = hotel;
        this.price = price;
        this.days = days;
        this.transport = transport;
    }
    public Tour(String country, int price){
        this.country = country;
        this.price = price;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void printTour(){
        System.out.print(" Тур в " + country);
        System.out.print(" Цена: " + price);
        System.out.print(" Транспорт: " + transport);
        System.out.print(" Кол-во дней: " + days);
        System.out.print(" Отель: ");
        hotel.printHotel();
    }
    public void budgetTours(){
        System.out.println("Тур в " + country);
        System.out.println("Цена: " + price);
    }
    String country1;
    String transport1;

    public Tour(String country1, String transport1){
        this.country1 = country1;
        this.transport1 = transport1;
        System.out.println("Транспорт: " + country + transport1);
    }
    int stars;
    public void searchByCountry4(int stars, String country){
        this.stars = stars;
        this.country = country;
        System.out.println("Звезды: ");
        System.out.println("Тур: ");
    }
}

