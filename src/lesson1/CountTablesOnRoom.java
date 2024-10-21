package lesson1;

public class CountTablesOnRoom {

    public static void main(String[] args) {
        int shirinaRoom = 251;
        int dlinnaRoom = 400;

        int shirinaTable = 40;
        int dlinnaTable = 50;

        int ploshadRoom = shirinaRoom * dlinnaRoom;
        int ploshadTable = shirinaTable * dlinnaTable;

        // считаем, сколько столов влезет
        double countTablesToInsertToRooms = (double) ploshadRoom / ploshadTable;
        System.out.println(countTablesToInsertToRooms);


    }






}
