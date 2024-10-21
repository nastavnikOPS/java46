package lesson4;

public class Massiv1 {
    public static void main(String[] args){

        // Есть массив цифр {3, 5, 8, 3, 55, 4, 1, 65, 36, 98}

        //1) Вывести на консоль через ячейку
        int[] massiv = {3,5,8,3,55,4,1,65,36,98};
        for (int i = 0; i < massiv.length; i = i + 2){
            System.out.print(massiv[i] + " ");
        }
        System.out.println(" ");

        //2) Вывести на консоль массив с обратной стороны и только четные числа
        int[] massiv1 = {3,5,8,3,55,4,1,65,36,98};
        for (int i = massiv1.length - 1; i >= 0; i--){
            if(massiv1[i] % 2 == 0){
                System.out.print(massiv1[i] + " ");
            }
        }
        System.out.println(" ");

        //3) Вывести на консоль весь массив (если число > 10 - выводим, если < 10 - выводим _)
        int[] massiv2 = {3, 5, 8, 3, 55, 4, 1, 65, 36, 98};
        for (int i = 0; i < massiv2.length; i++) {
            if (massiv2[i] > 10) {
                System.out.print(massiv2[i] + " ");
            } else {
                System.out.print("_");
            }
        }
    }
}
