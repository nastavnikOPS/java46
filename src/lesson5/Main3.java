package lesson5;

public class Main3 {
    public static void main(String[] args) {
        // Вывести на консоль 0 в виде шахматной доски из 2-х мерного массива

        int[][] nums = new int[8][8];

        for (int i = 0; i < nums.length; i++) { //генерируем индекс строки
            for (int j = 0; j < nums[i].length; j++) {
                if ((i + j) % 2 == 0) { //когда мы печатаем ячейку
                    System.out.print(nums[i][j] + " ");
                } else { //печатаем пустые места
                    System.out.print(" " + " ");

                }
            }
            System.out.println();
        }
    }
}