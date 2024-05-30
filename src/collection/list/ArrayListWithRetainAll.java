package collection.list;

import java.util.ArrayList;

public class ArrayListWithRetainAll {

    public static void main(String[] args) {

        ArrayList arrayList1 = new ArrayList();
        arrayList1.add("Ashwini1");
        arrayList1.add("Sana");
        arrayList1.add("Shekhar");
        arrayList1.add("Shivam");

        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("Ashwini");
        arrayList2.add("Krishnaveni");
        arrayList2.add("Pooja");
        arrayList2.add("Vishal");


        System.out.println("Before applying retailAll Method");
        System.out.println(arrayList1);
        System.out.println(arrayList2);

        arrayList2.retainAll(arrayList1);
        System.out.println();
        System.out.println();
        System.out.println("After applying retailAll Method");
        System.out.println(arrayList1);
        System.out.println(arrayList2);
    }
}
