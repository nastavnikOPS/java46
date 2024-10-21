package lesson8;

public class Hotel {
    private String name;
    private int stars;
    private String typeOfFood;

    public Hotel() {
    }

    public Hotel(String name, String typeOfFood, int stars) {
        this.name = name;
        this.typeOfFood = typeOfFood;
        this.stars = stars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public void printHotel(){
        this.stars = stars;
        System.out.println(" Отель: " + name + " звезд: " + stars + " питание: " + typeOfFood);
    }
}
