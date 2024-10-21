package lesson8;

import java.util.Scanner;

public class ToursBaza {
    private Tour[] tours = new Tour[100000];

    public void addTour(Tour tour) {
        //null - пустота
        //ищем первую пустую ячейку в массиве, чтобы положить тур
        for (int i = 0; i < tours.length; i++) {
            if (tours[i] == null) { //если в ячейке пусто
                tours[i] = tour; //сохранение тура
                break; //останавливается, чтобы копия тура не сохранилась во все ячейки

            }
        }
    }

    //Создать метод, который будет печатать на консоль туры в... страну
    public void searchByCountry() {
        System.out.println("Введите страну, в которую хотите поехать: ");
        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine().toLowerCase();
        System.out.println("Туры в " + country);
        for (Tour t : tours) {
            if (t != null && t.getCountry().equalsIgnoreCase(country)) {
                t.printTour();
            }
        }
        System.out.println("______");
    }

    public void searchByCountry2() {
        //Напечатать на консоль туры с бюджетом от___ и до___
        Scanner scanner = new Scanner(System.in);
        System.out.println("Туры с бюджетом: ");
        System.out.println("Минимальная сумма: ");
        int min = scanner.nextInt();
        System.out.println("Максимальная сумма: ");
        int max = scanner.nextInt();
        String country = scanner.nextLine().toLowerCase();
        for (Tour tour : tours) {
            if (tour != null && tour.getPrice() >= min && tour.getPrice() <= max)
                System.out.println("Тур с бюджетом: " + tour.getCountry() + " " + tour.getPrice());
        }
        System.out.println("______");
    }

    public void searchByCountry3() {
        //Напечатать на консоль туры только___ транспортом
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выбранный транспорт: ");
        String transport1 = scanner.next();
        String country = scanner.nextLine().toLowerCase();
        for (Tour tour : tours) {
            if (tour != null && tour.getTransport().equalsIgnoreCase(transport1)) {
                System.out.println("Туры: " + tour.getCountry() + " " + tour.getTransport() + " " + tour.getPrice());
            }
        }
        System.out.println("______");
    }

    public void searchByCountry4() {
        //Напечатать на консоль туры от___ звезд и выше
        Scanner scanner = new Scanner(System.in);
        System.out.println("Кол-во звезд отеля: ");
        int stars = scanner.nextInt();
        String country = scanner.nextLine().toLowerCase();
        for (Tour tour : tours) {
            if (tour != null && tour.getHotel().getStars() >= stars) {
                tour.printTour();
                System.out.println("Туры: " + tour.getCountry() + tour.getHotel().getStars() + tour.getPrice());
            }
        }
        System.out.println("______");
    }

    public void searchByCountry5() {
        //Напечатать на консоль туры ценой менее___ рублей
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите максимальную цену тура: ");
        int maxPrice = scanner.nextInt();
        String country = scanner.nextLine().toLowerCase();
        for (Tour tour : tours) {
            if (tour != null)
                if (tour.getPrice() < maxPrice) {
                    System.out.println("Тур: " + tour.getCountry() + " " + tour.getPrice() + " рублей");
                } else {
                    System.out.println("Тур не найден");
                }
        }
        scanner.close();
        System.out.println("______");
    }

    public void searchByCountry6() {
        //Напечатать на консоль самый дорогой тур
        int maxPrice = 0;
        for (Tour tour : tours) {
            if (tour != null)
                if (tour.getPrice() > maxPrice) {
                    maxPrice = tour.getPrice();
                }
        }
        if (tours != null) {
            System.out.println("Самый дорогой тур: " + maxPrice);
        }
    }
}

