package collection.list;

import java.util.ArrayList;

public class AArrayListAddAll {

    public static void main(String[] args) {


        ArrayList arrayList1 = new ArrayList();      //initial capacity 10

        arrayList1.add("Anushaka");
        arrayList1.add(100);
        arrayList1.add(null);
        arrayList1.add(true);
        arrayList1.add('c');
        arrayList1.add(100.5f);
        arrayList1.add("Anushaka");
        arrayList1.add(null);


        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList1);

        System.out.println("Before clear the data....");
        System.out.println(arrayList2);

        arrayList2.clear();

        System.out.println("After clear the data....");
        System.out.println(arrayList2);
    }
}
