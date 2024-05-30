package collection.list;

import java.util.ArrayList;

public class ArrayListWithEqualMethod {

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

        ArrayList arrayList2 = new ArrayList();      //initial capacity 10
        arrayList2.add("Anushaka");
        arrayList2.add(100);
        arrayList2.add(null);
        arrayList2.add(true);
        arrayList2.add('c');
        arrayList2.add(100.5f);
        arrayList2.add("Anushaka");
        arrayList2.add(null);

        System.out.println(arrayList1.equals(arrayList2));
    }
}
