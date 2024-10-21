package HomeClass;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Maria");
        arrayList1.add(1,"Misha");
        for (String s: arrayList1){
            System.out.print(s + " ");
        }
//        System.out.println(arrayList1.get(2));
//        ArrayList<Integer> arrayList2 = new ArrayList<>();
//        arrayList2.add(1);
//        for (int i = 0; i < arrayList1.size(); i++){
//            System.out.println(arrayList1.get(i));
//        }
        arrayList1.remove(0);
        System.out.println(arrayList1);




    }
}
