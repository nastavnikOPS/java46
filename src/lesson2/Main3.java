package lesson2;

public class Main3 {
    public static void main(String[] args){
        //у нас есть некая оценка от ученика (1 2 3 4 5)
        //напечатать на консоль наш ответ как родителя
        //конструкция SWITCH

        int mark = 4;

        switch (mark) {
            case 1:
                System.out.println("плохо,иди учись!");
                break;
            case 2:
                System.out.println("ничего страшного,в следующий раз получится!");
                break;
            case 3:
                System.out.println("Нормально!");
                break;
            case 4:
                System.out.println("Отлично");
                break;
            case 5:
                System.out.println("Это что за оценка!");
                break;
            default:
            System.out.println("Это что за оценка??");
        }
    }
}
