package collection.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListWithGeneric {

    public static void main(String[] args) {

        //Generic
        //Collection Interface
        //Collections Class

        ArrayList<Integer> arrayList1 = new ArrayList<>();      //initial capacity 10

        arrayList1.add(600);
        arrayList1.add(500);
        arrayList1.add(100);
        arrayList1.add(900);
        arrayList1.add(800);
        arrayList1.add(300);
        arrayList1.add(600);
        arrayList1.add(200);

        //Collections.sort(arrayList1);

        Collections.sort(arrayList1, Collections.reverseOrder());

        for (Integer i : arrayList1){
            System.out.println(i);
        }

    }
}
