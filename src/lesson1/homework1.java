package lesson1;

public class homework1 {
    public static void main(String[] args) {

       int sum = 1000;
       int priceForSnickers = 35;
       double priceForCandy = 3.5;


       int allSnickers = sum / priceForSnickers;
       System.out.println(allSnickers);

       int change = sum - (priceForSnickers * allSnickers);

       int allCandy = (int)(change / priceForCandy);

       double balans = change - (allCandy * priceForCandy);
       System.out.println(change);
       System.out.println(allCandy);
       System.out.println(balans);














    }








}


