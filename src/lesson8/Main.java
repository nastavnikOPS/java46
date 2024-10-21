package lesson8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hotel hotelItaly1 = new Hotel("Венеция отель", "завтраки", 4);
        Hotel hotelItaly2 = new Hotel("Рим отель", "пансион", 5);
        Hotel hotelItaly3 = new Hotel("Портофино отель", "завтраки", 2);
        Hotel hotelFrance1 = new Hotel("Анси отель", "пансион", 3);
        Hotel hotelFrance2 = new Hotel("Париж отель", "полупансион", 5);
        Hotel hotelFrance3 = new Hotel("Лион отель", "завтраки", 4);
        Hotel hotelOAE1 = new Hotel("Дубай отель", "пансион", 2);
        Hotel hotelOAE2 = new Hotel("Абу Даби отель", "завтраки", 3);
        Hotel hotelOAE3 = new Hotel("Аджман отель", "полупансион", 5);
        Hotel hotelFinlyandia = new Hotel("Хельсинки отель", "завтраки", 4);

        Tour france1 = new Tour("Франция", hotelFrance1, 150000, 7, "самолет");
        Tour france2 = new Tour("Франция", hotelFrance1, 266000, 10, "самолет");
        Tour france3 = new Tour("Франция", hotelFrance1, 150000, 6, "поезд");
        Tour italy1 = new Tour("Италия", hotelItaly1, 420000, 9, "самолет");
        Tour italy2 = new Tour("Италия", hotelItaly2, 153000, 11, "корабль");
        Tour italy3 = new Tour("Италия", hotelItaly3, 367000, 7, "самолет");
        Tour oae1 = new Tour("OAE", hotelOAE1, 150000, 5, "поезд");
        Tour oae2 = new Tour("OAE", hotelOAE2, 150000, 3, "корабль");
        Tour oae3 = new Tour("OAE", hotelOAE3, 230000, 4, "самолет");
        Tour finlyandia = new Tour("Финляндия", hotelFinlyandia, 150000, 7, "поезд");

        ToursBaza baza = new ToursBaza();
        baza.addTour(france1);
        baza.addTour(france2);
        baza.addTour(france3);
        baza.addTour(italy1);
        baza.addTour(italy2);
        baza.addTour(italy3);
        baza.addTour(oae1);
        baza.addTour(oae2);
        baza.addTour(oae3);
        baza.addTour(finlyandia);

        baza.searchByCountry();
        baza.searchByCountry2();
        baza.searchByCountry3();
        baza.searchByCountry4();
        baza.searchByCountry5();
        baza.searchByCountry6();













    }
}
