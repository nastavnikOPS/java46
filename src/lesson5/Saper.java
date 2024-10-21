package lesson5;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Saper {
    public static void main(String[] args){
        System.out.println("Выберите уровень игры:");
        System.out.println("1 - Новичек");
        System.out.println("2 - Любитель");
        System.out.println("3 - Профессионал");
        System.out.println("4 - Особый");

        Scanner scanner = new Scanner(System.in);
        int level = scanner.nextInt();

        switch (level){
            case 1: //когда выбрали - Новичек
                int[][] field = new int[9][9];
                //наполнить поле минами рандомно
                for(int mine = 0; mine < 10; mine++){
                    //ставим одну мину

                    int i = ThreadLocalRandom.current().nextInt(0, 8 + 1);
                    int j = ThreadLocalRandom.current().nextInt(0, 8 + 1);
                    if(field[i][j] == -1){ //проверяем, есть ли там мина
                        mine--; //добавляем еще один цикл
                    }
                    field[i][j] = -1;
                }
                //печатаем поле на консоль
                for(int i = 0; i < field.length; i++){
                    for(int j = 0; j < field[i].length; j++){
                        System.out.print(field[i][j] + " ");
                    }
                System.out.println();
            }
                break;

            case 2: //когда выбрали - Любитель
                int[][] field2 = new int[16][16];
                for(int mine2 = 0; mine2 < 40; mine2++){

                    int i = ThreadLocalRandom.current().nextInt(0, 16);
                    int j = ThreadLocalRandom.current().nextInt(0, 16);
                    if(field2[i][j] == -1){
                        mine2--;
                    }
                    field2[i][j] = -1;
                }
                for(int i = 0; i < field2.length; i++){
                    for(int j = 0; j < field2[i].length; j++){
                        System.out.print(field2[i][j] + " ");
                    }
                    System.out.println();
                }
                break;

            case 3: //когда выбрали - Профессионал
                int[][] field3 = new int[16][30];
                for(int mine3 = 0; mine3 < 99; mine3++){

                    int i = ThreadLocalRandom.current().nextInt(0, 16);
                    int j = ThreadLocalRandom.current().nextInt(0, 30);
                    if(field3[i][j] == -1){
                        mine3--;
                    }
                    field3[i][j] = -1;
                }
                for(int i = 0; i < field3.length; i++){
                    for(int j = 0; j < field3[i].length; j++){
                        System.out.print(field3[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            case 4: //когда выбрали - Особый
                System.out.println("Ширина: ");
                int width = scanner.nextInt();
                System.out.println("Высота: ");
                int height = scanner.nextInt();
                System.out.println("Мины: ");
                int mines = scanner.nextInt();

                int[][] field4 = new int[width][height];
                for(int mine4 = 0; mine4 < mines; mine4++){

                    int i = ThreadLocalRandom.current().nextInt(0, width);
                    int j = ThreadLocalRandom.current().nextInt(0, height);
                    if(field4[i][j] == -1){
                        mine4--;
                    }
                    field4[i][j] = -1;
                }
                for(int i = 0; i < field4.length; i++){
                    for(int j = 0; j < field4[i].length; j++){
                        System.out.print(field4[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
        }
    }
}
