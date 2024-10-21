package lesson13;

public class MainFridge {
    public static void main(String[] args) {

        Fridge fridge = new Fridge();
        fridge.putProducts("Морковь", 100);
        fridge.putProducts("Яблоки", 150);
        fridge.putProducts("Картофель", 300);
        fridge.putProducts("Лук", 250);
        fridge.putProducts("Морковь", 500);
        fridge.putProducts("Помидоры", 400);
        fridge.printAllProducts();

        fridge.getProduct("Морковь", 1000);
        fridge.printWeightAllProduct();
    }
}
