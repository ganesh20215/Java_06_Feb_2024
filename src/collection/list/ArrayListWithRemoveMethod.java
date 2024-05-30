package collection.list;

import java.util.ArrayList;

public class ArrayListWithRemoveMethod {

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

//        arrayList1.remove(4);
        arrayList1.removeAll(arrayList1);

        System.out.println(arrayList1);

    }
}
